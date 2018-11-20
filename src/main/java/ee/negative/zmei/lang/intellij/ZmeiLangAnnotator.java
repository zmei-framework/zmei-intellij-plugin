package ee.negative.zmei.lang.intellij;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.psi.PsiNode;
import ee.negative.zmei.lang.intellij.psi.RootNode;
import org.jetbrains.annotations.NotNull;

public class ZmeiLangAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof PsiNode)) return;

        PsiNode root = (PsiNode) element;

        TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey(
                "ZMEI_ANNOT.KEYWORD",
                DefaultLanguageHighlighterColors.KEYWORD
        );

        TextAttributesKey ENTITY_HEADER = TextAttributesKey.createTextAttributesKey(
                "ZMEI_ANNOT.ENTITY_HEADER",
                DefaultLanguageHighlighterColors.METADATA
        );

        TextAttributesKey VARIABLE = TextAttributesKey.createTextAttributesKey(
                "ZMEI_ANNOT.VARIABLE",
                DefaultLanguageHighlighterColors.INSTANCE_FIELD
        );

        TextAttributesKey CODE = TextAttributesKey.createTextAttributesKey(
                "ZMEI_ANNOT.CODE",
                DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP
        );

        TextAttributesKey REFERENCE = TextAttributesKey.createTextAttributesKey(
                "ZMEI_ANNOT.REFERENCE",
                DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT_HIGHLIGHTED
        );

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_page_header)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(ENTITY_HEADER);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_col_header)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(ENTITY_HEADER);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_col_field_name)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(VARIABLE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_page_field_name)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(VARIABLE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_page_name)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(KEYWORD);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_col_name)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(KEYWORD);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_code_block)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(CODE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_code_line)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(CODE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_page_imports)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(CODE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_model_imports)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(CODE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_page_field_code)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(CODE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_field_relation_target_ref)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(REFERENCE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_field_relation_target_class)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(REFERENCE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_an_crud_target_model)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(REFERENCE);
        }

        for (PsiNode header : root.getAllRuleNodes(ZmeiLangParser.RULE_an_menu_item_page_ref)) {

            Annotation annotation = holder.createInfoAnnotation(header, "");
            annotation.setTextAttributes(REFERENCE);
        }

//        for (PsiNode psiNode : root.getAllRuleNodes(ZmeiLangParser.RULE_cs_annotation)) {
//
//            Annotation annotation = holder.createInfoAnnotation(psiNode, "");
//            annotation.setTextAttributes(ANNOT);
//        }

        for (PsiNode psiNode : root.getAllRuleNodes(ZmeiLangParser.RULE_wrong_field_type)) {
            Annotation annotation = holder.createErrorAnnotation(psiNode, "Unknown field type");
        }
    }
}
