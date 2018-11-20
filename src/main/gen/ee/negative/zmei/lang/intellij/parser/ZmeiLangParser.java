// Generated from /Users/aleksandrrudakov/dev/jetbrains-plugin-sample/src/main/antlr/ee/negative/zmei/lang/intellij/grammar/ZmeiLangParser.g4 by ANTLR 4.7
package ee.negative.zmei.lang.intellij.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZmeiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AN_MENU=1, AN_CRUD=2, AN_CRUD_DETAIL=3, AN_CRUD_DELETE=4, AN_CRUD_EDIT=5, 
		AN_CRUD_CREATE=6, AN_CELERY=7, AN_POST=8, AN_ERROR=9, AN_AUTH=10, AN_MARKDOWN=11, 
		AN_REACT=12, AN_HTML=13, AN_TREE=14, AN_DATE_TREE=15, AN_MIXIN=16, AN_M2M_CHANGED=17, 
		AN_POST_DELETE=18, AN_PRE_DELETE=19, AN_POST_SAVE=20, AN_PRE_SAVE=21, 
		AN_CLEAN=22, AN_API=23, AN_REST=24, AN_ORDER=25, AN_SORTABLE=26, AN_LANGS=27, 
		AN_FILER=28, AN_ADMIN=29, AN_SUIT=30, WRITE_MODE=31, BOOL=32, KW_THEME=33, 
		KW_PAGE=34, KW_LINK_SUFFIX=35, KW_URL_PREFIX=36, KW_CAN_EDIT=37, KW_OBJECT_EXPR=38, 
		KW_BLOCK=39, KW_ITEM_NAME=40, KW_PK_PARAM=41, KW_LIST_FIELDS=42, KW_DELETE=43, 
		KW_EDIT=44, KW_CREATE=45, KW_DETAIL=46, KW_SKIP=47, KW_FROM=48, KW_POLY_LIST=49, 
		KW_CSS=50, KW_JS=51, KW_INLINE_TYPE=52, KW_AUTH_TYPE=53, KW_INLINE=54, 
		KW_TYPE=55, KW_USER_FIELD=56, KW_ANNOTATE=57, KW_ON_CREATE=58, KW_QUERY=59, 
		KW_AUTH=60, KW_COUNT=61, KW_I18N=62, KW_EXTRA=63, KW_TABS=64, KW_LIST=65, 
		KW_READ_ONLY=66, KW_LIST_EDITABLE=67, KW_LIST_FILTER=68, KW_LIST_SEARCH=69, 
		KW_FIELDS=70, KW_IMPORT=71, KW_AS=72, COL_FIELD_TYPE_LONGTEXT=73, COL_FIELD_TYPE_HTML=74, 
		COL_FIELD_TYPE_HTML_MEDIA=75, COL_FIELD_TYPE_FLOAT=76, COL_FIELD_TYPE_DECIMAL=77, 
		COL_FIELD_TYPE_DATE=78, COL_FIELD_TYPE_DATETIME=79, COL_FIELD_TYPE_CREATE_TIME=80, 
		COL_FIELD_TYPE_UPDATE_TIME=81, COL_FIELD_TYPE_IMAGE=82, COL_FIELD_TYPE_FILE=83, 
		COL_FIELD_TYPE_FILER_IMAGE=84, COL_FIELD_TYPE_FILER_FILE=85, COL_FIELD_TYPE_FILER_FOLDER=86, 
		COL_FIELD_TYPE_FILER_IMAGE_FOLDER=87, COL_FIELD_TYPE_TEXT=88, COL_FIELD_TYPE_INT=89, 
		COL_FIELD_TYPE_SLUG=90, COL_FIELD_TYPE_BOOL=91, COL_FIELD_TYPE_ONE=92, 
		COL_FIELD_TYPE_ONE2ONE=93, COL_FIELD_TYPE_MANY=94, COL_FIELD_CHOICES=95, 
		NL=96, ID=97, DIGIT=98, SIZE2D=99, LT=100, GT=101, COLON=102, EXCLUDE=103, 
		BRACE_OPEN=104, BRACE_CLOSE=105, SQ_BRACE_OPEN=106, SQ_BRACE_CLOSE=107, 
		QUESTION_MARK=108, UNDERSCORE=109, DASH=110, COMA=111, DOT=112, HASH=113, 
		SLASH=114, EQUALS=115, DOLLAR=116, AMP=117, EXCLAM=118, STAR=119, APPROX=120, 
		PIPE=121, STRING_DQ=122, STRING_SQ=123, COMMENT_LINE=124, COMMENT_BLOCK=125, 
		UNICODE=126, WS=127, COL_FIELD_CALCULATED=128, ASSIGN=129, ASSIGN_STATIC=130, 
		CODE_BLOCK=131, ERRCHAR=132, PYTHON_CODE=133, PYTHON_LINE_ERRCHAR=134, 
		PYTHON_LINE_END=135, PYTHON_EXPR_ERRCHAR=136, PYTHON_LINE_NL=137;
	public static final int
		RULE_col_file = 0, RULE_page_imports = 1, RULE_model_imports = 2, RULE_page_import_statement = 3, 
		RULE_model_import_statement = 4, RULE_import_list = 5, RULE_id_or_kw = 6, 
		RULE_classname = 7, RULE_field_list_expr = 8, RULE_field_list_expr_field = 9, 
		RULE_write_mode_expr = 10, RULE_python_code = 11, RULE_code_line = 12, 
		RULE_code_block = 13, RULE_cs_annotation = 14, RULE_an_filer = 15, RULE_an_langs = 16, 
		RULE_an_langs_list = 17, RULE_an_celery = 18, RULE_an_suit = 19, RULE_an_suit_app_name = 20, 
		RULE_col = 21, RULE_col_str_expr = 22, RULE_col_header = 23, RULE_col_header_line_separator = 24, 
		RULE_col_verbose_name = 25, RULE_verbose_name_part = 26, RULE_col_base_name = 27, 
		RULE_col_name = 28, RULE_col_field = 29, RULE_col_field_expr_or_def = 30, 
		RULE_col_field_custom = 31, RULE_col_field_extend = 32, RULE_col_field_extend_append = 33, 
		RULE_wrong_field_type = 34, RULE_col_field_expr = 35, RULE_col_field_expr_marker = 36, 
		RULE_col_feild_expr_code = 37, RULE_string_or_quoted = 38, RULE_col_field_help_text = 39, 
		RULE_col_field_vrebose_name = 40, RULE_col_field_name = 41, RULE_col_modifier = 42, 
		RULE_col_field_def = 43, RULE_field_longtext = 44, RULE_field_html = 45, 
		RULE_field_html_media = 46, RULE_field_float = 47, RULE_field_decimal = 48, 
		RULE_field_date = 49, RULE_field_datetime = 50, RULE_field_create_time = 51, 
		RULE_field_update_time = 52, RULE_field_file = 53, RULE_field_filer_file = 54, 
		RULE_field_filer_folder = 55, RULE_field_text = 56, RULE_field_text_size = 57, 
		RULE_field_text_choices = 58, RULE_field_text_choice = 59, RULE_field_text_choice_val = 60, 
		RULE_field_text_choice_key = 61, RULE_field_int = 62, RULE_field_int_choices = 63, 
		RULE_field_int_choice = 64, RULE_field_int_choice_val = 65, RULE_field_int_choice_key = 66, 
		RULE_field_slug = 67, RULE_field_slug_ref_field = 68, RULE_field_slug_ref_field_id = 69, 
		RULE_field_bool = 70, RULE_field_bool_default = 71, RULE_field_image = 72, 
		RULE_filer_image_type = 73, RULE_field_image_sizes = 74, RULE_field_image_size = 75, 
		RULE_field_image_size_dimensions = 76, RULE_field_image_size_name = 77, 
		RULE_field_image_filters = 78, RULE_field_image_filter = 79, RULE_field_relation = 80, 
		RULE_field_relation_type = 81, RULE_field_relation_target_ref = 82, RULE_field_relation_target_class = 83, 
		RULE_field_relation_related_name = 84, RULE_model_annotation = 85, RULE_an_sortable = 86, 
		RULE_an_sortable_field_name = 87, RULE_an_order = 88, RULE_an_order_fields = 89, 
		RULE_an_rest = 90, RULE_an_rest_config = 91, RULE_an_rest_main_part = 92, 
		RULE_an_rest_descriptor = 93, RULE_an_rest_i18n = 94, RULE_an_rest_query = 95, 
		RULE_an_rest_on_create = 96, RULE_an_rest_read_only = 97, RULE_an_rest_user_field = 98, 
		RULE_an_rest_fields = 99, RULE_an_rest_fields_write_mode = 100, RULE_an_rest_auth = 101, 
		RULE_an_rest_auth_type = 102, RULE_an_rest_auth_token_model = 103, RULE_an_rest_auth_token_class = 104, 
		RULE_an_rest_annotate = 105, RULE_an_rest_annotate_count = 106, RULE_an_rest_annotate_count_field = 107, 
		RULE_an_rest_annotate_count_alias = 108, RULE_an_rest_inline = 109, RULE_an_rest_inline_decl = 110, 
		RULE_an_rest_inline_name = 111, RULE_an_api = 112, RULE_an_api_all = 113, 
		RULE_an_api_name = 114, RULE_an_clean = 115, RULE_an_pre_save = 116, RULE_an_post_save = 117, 
		RULE_an_pre_delete = 118, RULE_an_post_delete = 119, RULE_an_m2m_changed = 120, 
		RULE_an_mixin = 121, RULE_an_date_tree = 122, RULE_an_date_tree_field = 123, 
		RULE_an_tree = 124, RULE_an_tree_poly = 125, RULE_an_admin = 126, RULE_an_admin_js = 127, 
		RULE_an_admin_css = 128, RULE_an_admin_css_file_name = 129, RULE_an_admin_js_file_name = 130, 
		RULE_an_admin_inlines = 131, RULE_an_admin_inline = 132, RULE_inline_name = 133, 
		RULE_inline_type = 134, RULE_inline_extra = 135, RULE_inline_fields = 136, 
		RULE_an_admin_tabs = 137, RULE_an_admin_tab = 138, RULE_tab_name = 139, 
		RULE_tab_verbose_name = 140, RULE_an_admin_list = 141, RULE_an_admin_read_only = 142, 
		RULE_an_admin_list_editable = 143, RULE_an_admin_list_filter = 144, RULE_an_admin_list_search = 145, 
		RULE_an_admin_fields = 146, RULE_page = 147, RULE_page_header = 148, RULE_page_base = 149, 
		RULE_page_alias = 150, RULE_page_alias_name = 151, RULE_page_template = 152, 
		RULE_template_name = 153, RULE_file_name_part = 154, RULE_page_url = 155, 
		RULE_url_part = 156, RULE_url_param = 157, RULE_url_segment = 158, RULE_url_segments = 159, 
		RULE_page_name = 160, RULE_page_body = 161, RULE_page_code = 162, RULE_page_field = 163, 
		RULE_page_field_name = 164, RULE_page_field_code = 165, RULE_page_annotation = 166, 
		RULE_an_react = 167, RULE_an_react_descriptor = 168, RULE_an_markdown = 169, 
		RULE_an_markdown_descriptor = 170, RULE_an_auth = 171, RULE_an_error = 172, 
		RULE_an_error_code = 173, RULE_an_post = 174, RULE_an_crud_create = 175, 
		RULE_an_crud = 176, RULE_an_crud_params = 177, RULE_an_crud_page_override = 178, 
		RULE_an_crud_descriptor = 179, RULE_an_crud_next_page = 180, RULE_an_crud_next_page_url = 181, 
		RULE_an_crud_next_page_url_val = 182, RULE_an_crud_target_model = 183, 
		RULE_an_crud_target_filter = 184, RULE_an_crud_theme = 185, RULE_an_crud_url_prefix = 186, 
		RULE_an_crud_url_prefix_val = 187, RULE_an_crud_link_suffix = 188, RULE_an_crud_link_suffix_val = 189, 
		RULE_an_crud_item_name = 190, RULE_an_crud_object_expr = 191, RULE_an_crud_can_edit = 192, 
		RULE_an_crud_block = 193, RULE_an_crud_pk_param = 194, RULE_an_crud_skip = 195, 
		RULE_an_crud_skip_values = 196, RULE_an_crud_view_name = 197, RULE_an_crud_fields = 198, 
		RULE_an_crud_fields_expr = 199, RULE_an_crud_field = 200, RULE_an_crud_field_spec = 201, 
		RULE_an_crud_field_filter = 202, RULE_an_crud_list_fields = 203, RULE_an_crud_list_fields_expr = 204, 
		RULE_an_crud_list_field = 205, RULE_an_crud_list_field_spec = 206, RULE_an_crud_edit = 207, 
		RULE_an_crud_delete = 208, RULE_an_crud_detail = 209, RULE_an_menu = 210, 
		RULE_an_menu_descriptor = 211, RULE_an_menu_item = 212, RULE_an_menu_target = 213, 
		RULE_an_menu_item_code = 214, RULE_an_menu_item_args = 215, RULE_an_menu_item_arg = 216, 
		RULE_an_menu_item_arg_key = 217, RULE_an_menu_item_arg_val = 218, RULE_an_menu_item_url = 219, 
		RULE_an_menu_item_page = 220, RULE_an_menu_item_page_ref = 221, RULE_an_menu_label = 222, 
		RULE_an_html = 223, RULE_an_html_descriptor = 224;
	public static final String[] ruleNames = {
		"col_file", "page_imports", "model_imports", "page_import_statement", 
		"model_import_statement", "import_list", "id_or_kw", "classname", "field_list_expr", 
		"field_list_expr_field", "write_mode_expr", "python_code", "code_line", 
		"code_block", "cs_annotation", "an_filer", "an_langs", "an_langs_list", 
		"an_celery", "an_suit", "an_suit_app_name", "col", "col_str_expr", "col_header", 
		"col_header_line_separator", "col_verbose_name", "verbose_name_part", 
		"col_base_name", "col_name", "col_field", "col_field_expr_or_def", "col_field_custom", 
		"col_field_extend", "col_field_extend_append", "wrong_field_type", "col_field_expr", 
		"col_field_expr_marker", "col_feild_expr_code", "string_or_quoted", "col_field_help_text", 
		"col_field_vrebose_name", "col_field_name", "col_modifier", "col_field_def", 
		"field_longtext", "field_html", "field_html_media", "field_float", "field_decimal", 
		"field_date", "field_datetime", "field_create_time", "field_update_time", 
		"field_file", "field_filer_file", "field_filer_folder", "field_text", 
		"field_text_size", "field_text_choices", "field_text_choice", "field_text_choice_val", 
		"field_text_choice_key", "field_int", "field_int_choices", "field_int_choice", 
		"field_int_choice_val", "field_int_choice_key", "field_slug", "field_slug_ref_field", 
		"field_slug_ref_field_id", "field_bool", "field_bool_default", "field_image", 
		"filer_image_type", "field_image_sizes", "field_image_size", "field_image_size_dimensions", 
		"field_image_size_name", "field_image_filters", "field_image_filter", 
		"field_relation", "field_relation_type", "field_relation_target_ref", 
		"field_relation_target_class", "field_relation_related_name", "model_annotation", 
		"an_sortable", "an_sortable_field_name", "an_order", "an_order_fields", 
		"an_rest", "an_rest_config", "an_rest_main_part", "an_rest_descriptor", 
		"an_rest_i18n", "an_rest_query", "an_rest_on_create", "an_rest_read_only", 
		"an_rest_user_field", "an_rest_fields", "an_rest_fields_write_mode", "an_rest_auth", 
		"an_rest_auth_type", "an_rest_auth_token_model", "an_rest_auth_token_class", 
		"an_rest_annotate", "an_rest_annotate_count", "an_rest_annotate_count_field", 
		"an_rest_annotate_count_alias", "an_rest_inline", "an_rest_inline_decl", 
		"an_rest_inline_name", "an_api", "an_api_all", "an_api_name", "an_clean", 
		"an_pre_save", "an_post_save", "an_pre_delete", "an_post_delete", "an_m2m_changed", 
		"an_mixin", "an_date_tree", "an_date_tree_field", "an_tree", "an_tree_poly", 
		"an_admin", "an_admin_js", "an_admin_css", "an_admin_css_file_name", "an_admin_js_file_name", 
		"an_admin_inlines", "an_admin_inline", "inline_name", "inline_type", "inline_extra", 
		"inline_fields", "an_admin_tabs", "an_admin_tab", "tab_name", "tab_verbose_name", 
		"an_admin_list", "an_admin_read_only", "an_admin_list_editable", "an_admin_list_filter", 
		"an_admin_list_search", "an_admin_fields", "page", "page_header", "page_base", 
		"page_alias", "page_alias_name", "page_template", "template_name", "file_name_part", 
		"page_url", "url_part", "url_param", "url_segment", "url_segments", "page_name", 
		"page_body", "page_code", "page_field", "page_field_name", "page_field_code", 
		"page_annotation", "an_react", "an_react_descriptor", "an_markdown", "an_markdown_descriptor", 
		"an_auth", "an_error", "an_error_code", "an_post", "an_crud_create", "an_crud", 
		"an_crud_params", "an_crud_page_override", "an_crud_descriptor", "an_crud_next_page", 
		"an_crud_next_page_url", "an_crud_next_page_url_val", "an_crud_target_model", 
		"an_crud_target_filter", "an_crud_theme", "an_crud_url_prefix", "an_crud_url_prefix_val", 
		"an_crud_link_suffix", "an_crud_link_suffix_val", "an_crud_item_name", 
		"an_crud_object_expr", "an_crud_can_edit", "an_crud_block", "an_crud_pk_param", 
		"an_crud_skip", "an_crud_skip_values", "an_crud_view_name", "an_crud_fields", 
		"an_crud_fields_expr", "an_crud_field", "an_crud_field_spec", "an_crud_field_filter", 
		"an_crud_list_fields", "an_crud_list_fields_expr", "an_crud_list_field", 
		"an_crud_list_field_spec", "an_crud_edit", "an_crud_delete", "an_crud_detail", 
		"an_menu", "an_menu_descriptor", "an_menu_item", "an_menu_target", "an_menu_item_code", 
		"an_menu_item_args", "an_menu_item_arg", "an_menu_item_arg_key", "an_menu_item_arg_val", 
		"an_menu_item_url", "an_menu_item_page", "an_menu_item_page_ref", "an_menu_label", 
		"an_html", "an_html_descriptor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@menu'", "'@crud'", "'@crud_detail'", "'@crud_delete'", "'@crud_edit'", 
		"'@crud_create'", "'@celery'", "'@post'", "'@error'", "'@auth'", "'@markdown'", 
		"'@react'", "'@html'", "'@tree'", "'@date_tree'", "'@mixin'", "'@m2m_changed'", 
		"'@post_delete'", "'@pre_delete'", "'@post_save'", "'@pre_save'", "'@clean'", 
		"'@api'", "'@rest'", "'@order'", "'@sortable'", "'@langs'", "'@filer'", 
		"'@admin'", "'@suit'", null, null, "'theme'", "'page'", "'link_suffix'", 
		"'url_prefix'", "'can_edit'", "'object_expr'", "'block'", "'item_name'", 
		"'pk_param'", "'list_fields'", "'delete'", "'edit'", "'create'", "'detail'", 
		"'skip'", "'from'", "'+polymorphic_list'", "'css'", "'js'", null, null, 
		"'inline'", "'type'", "'user_field'", "'annotate'", "'on_create'", "'query'", 
		"'auth'", "'count'", "'i18n'", "'extra'", "'tabs'", "'list'", "'read_only'", 
		"'list_editable'", "'list_filter'", "'list_search'", "'fields'", "'import'", 
		"'as'", "'text'", "'html'", "'html_media'", "'float'", "'decimal'", "'date'", 
		"'datetime'", "'create_time'", "'update_time'", "'image'", "'file'", "'filer_image'", 
		"'filer_file'", "'filer_folder'", "'filer_image_folder'", "'str'", "'int'", 
		"'slug'", "'bool'", "'one'", "'one2one'", "'many'", "'choices'", null, 
		null, null, null, "'<'", "'>'", "':'", "'^'", "'('", "')'", "'['", "']'", 
		"'?'", "'_'", "'-'", "','", "'.'", "'#'", "'/'", "'='", "'$'", "'&'", 
		"'!'", "'*'", "'~'", "'|'", null, null, null, null, null, "' '", null, 
		null, null, null, null, null, null, "';'", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AN_MENU", "AN_CRUD", "AN_CRUD_DETAIL", "AN_CRUD_DELETE", "AN_CRUD_EDIT", 
		"AN_CRUD_CREATE", "AN_CELERY", "AN_POST", "AN_ERROR", "AN_AUTH", "AN_MARKDOWN", 
		"AN_REACT", "AN_HTML", "AN_TREE", "AN_DATE_TREE", "AN_MIXIN", "AN_M2M_CHANGED", 
		"AN_POST_DELETE", "AN_PRE_DELETE", "AN_POST_SAVE", "AN_PRE_SAVE", "AN_CLEAN", 
		"AN_API", "AN_REST", "AN_ORDER", "AN_SORTABLE", "AN_LANGS", "AN_FILER", 
		"AN_ADMIN", "AN_SUIT", "WRITE_MODE", "BOOL", "KW_THEME", "KW_PAGE", "KW_LINK_SUFFIX", 
		"KW_URL_PREFIX", "KW_CAN_EDIT", "KW_OBJECT_EXPR", "KW_BLOCK", "KW_ITEM_NAME", 
		"KW_PK_PARAM", "KW_LIST_FIELDS", "KW_DELETE", "KW_EDIT", "KW_CREATE", 
		"KW_DETAIL", "KW_SKIP", "KW_FROM", "KW_POLY_LIST", "KW_CSS", "KW_JS", 
		"KW_INLINE_TYPE", "KW_AUTH_TYPE", "KW_INLINE", "KW_TYPE", "KW_USER_FIELD", 
		"KW_ANNOTATE", "KW_ON_CREATE", "KW_QUERY", "KW_AUTH", "KW_COUNT", "KW_I18N", 
		"KW_EXTRA", "KW_TABS", "KW_LIST", "KW_READ_ONLY", "KW_LIST_EDITABLE", 
		"KW_LIST_FILTER", "KW_LIST_SEARCH", "KW_FIELDS", "KW_IMPORT", "KW_AS", 
		"COL_FIELD_TYPE_LONGTEXT", "COL_FIELD_TYPE_HTML", "COL_FIELD_TYPE_HTML_MEDIA", 
		"COL_FIELD_TYPE_FLOAT", "COL_FIELD_TYPE_DECIMAL", "COL_FIELD_TYPE_DATE", 
		"COL_FIELD_TYPE_DATETIME", "COL_FIELD_TYPE_CREATE_TIME", "COL_FIELD_TYPE_UPDATE_TIME", 
		"COL_FIELD_TYPE_IMAGE", "COL_FIELD_TYPE_FILE", "COL_FIELD_TYPE_FILER_IMAGE", 
		"COL_FIELD_TYPE_FILER_FILE", "COL_FIELD_TYPE_FILER_FOLDER", "COL_FIELD_TYPE_FILER_IMAGE_FOLDER", 
		"COL_FIELD_TYPE_TEXT", "COL_FIELD_TYPE_INT", "COL_FIELD_TYPE_SLUG", "COL_FIELD_TYPE_BOOL", 
		"COL_FIELD_TYPE_ONE", "COL_FIELD_TYPE_ONE2ONE", "COL_FIELD_TYPE_MANY", 
		"COL_FIELD_CHOICES", "NL", "ID", "DIGIT", "SIZE2D", "LT", "GT", "COLON", 
		"EXCLUDE", "BRACE_OPEN", "BRACE_CLOSE", "SQ_BRACE_OPEN", "SQ_BRACE_CLOSE", 
		"QUESTION_MARK", "UNDERSCORE", "DASH", "COMA", "DOT", "HASH", "SLASH", 
		"EQUALS", "DOLLAR", "AMP", "EXCLAM", "STAR", "APPROX", "PIPE", "STRING_DQ", 
		"STRING_SQ", "COMMENT_LINE", "COMMENT_BLOCK", "UNICODE", "WS", "COL_FIELD_CALCULATED", 
		"ASSIGN", "ASSIGN_STATIC", "CODE_BLOCK", "ERRCHAR", "PYTHON_CODE", "PYTHON_LINE_ERRCHAR", 
		"PYTHON_LINE_END", "PYTHON_EXPR_ERRCHAR", "PYTHON_LINE_NL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ZmeiLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZmeiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Col_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ZmeiLangParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<Cs_annotationContext> cs_annotation() {
			return getRuleContexts(Cs_annotationContext.class);
		}
		public Cs_annotationContext cs_annotation(int i) {
			return getRuleContext(Cs_annotationContext.class,i);
		}
		public Page_importsContext page_imports() {
			return getRuleContext(Page_importsContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public Model_importsContext model_imports() {
			return getRuleContext(Model_importsContext.class,0);
		}
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public Col_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_file(this);
		}
	}

	public final Col_fileContext col_file() throws RecognitionException {
		Col_fileContext _localctx = new Col_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_col_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					match(NL);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					cs_annotation();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(NL);
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FROM) {
					{
					setState(468);
					page_imports();
					}
				}

				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(471);
					page();
					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SQ_BRACE_OPEN );
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(NL);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FROM || _la==HASH) {
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FROM) {
					{
					setState(484);
					model_imports();
					}
				}

				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					col();
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HASH );
				}
			}

			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(494);
				match(NL);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_importsContext extends ParserRuleContext {
		public List<Page_import_statementContext> page_import_statement() {
			return getRuleContexts(Page_import_statementContext.class);
		}
		public Page_import_statementContext page_import_statement(int i) {
			return getRuleContext(Page_import_statementContext.class,i);
		}
		public Page_importsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_imports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_imports(this);
		}
	}

	public final Page_importsContext page_imports() throws RecognitionException {
		Page_importsContext _localctx = new Page_importsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_page_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				page_import_statement();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_FROM );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_importsContext extends ParserRuleContext {
		public List<Model_import_statementContext> model_import_statement() {
			return getRuleContexts(Model_import_statementContext.class);
		}
		public Model_import_statementContext model_import_statement(int i) {
			return getRuleContext(Model_import_statementContext.class,i);
		}
		public Model_importsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterModel_imports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitModel_imports(this);
		}
	}

	public final Model_importsContext model_imports() throws RecognitionException {
		Model_importsContext _localctx = new Model_importsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_model_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				model_import_statement();
				}
				}
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_FROM );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_import_statementContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(ZmeiLangParser.KW_FROM, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode KW_IMPORT() { return getToken(ZmeiLangParser.KW_IMPORT, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public Page_import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_import_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_import_statement(this);
		}
	}

	public final Page_import_statementContext page_import_statement() throws RecognitionException {
		Page_import_statementContext _localctx = new Page_import_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_page_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(KW_FROM);
			setState(513);
			classname();
			setState(514);
			match(KW_IMPORT);
			setState(515);
			import_list();
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				match(NL);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_import_statementContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(ZmeiLangParser.KW_FROM, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode KW_IMPORT() { return getToken(ZmeiLangParser.KW_IMPORT, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public Model_import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterModel_import_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitModel_import_statement(this);
		}
	}

	public final Model_import_statementContext model_import_statement() throws RecognitionException {
		Model_import_statementContext _localctx = new Model_import_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_model_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(KW_FROM);
			setState(522);
			classname();
			setState(523);
			match(KW_IMPORT);
			setState(524);
			import_list();
			setState(526); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(525);
				match(NL);
				}
				}
				setState(528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_listContext extends ParserRuleContext {
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public Import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterImport_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitImport_list(this);
		}
	}

	public final Import_listContext import_list() throws RecognitionException {
		Import_listContext _localctx = new Import_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			id_or_kw();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(531);
				match(COMA);
				setState(532);
				id_or_kw();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_or_kwContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ZmeiLangParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(ZmeiLangParser.BOOL, 0); }
		public TerminalNode WRITE_MODE() { return getToken(ZmeiLangParser.WRITE_MODE, 0); }
		public TerminalNode KW_THEME() { return getToken(ZmeiLangParser.KW_THEME, 0); }
		public TerminalNode KW_PAGE() { return getToken(ZmeiLangParser.KW_PAGE, 0); }
		public TerminalNode KW_LINK_SUFFIX() { return getToken(ZmeiLangParser.KW_LINK_SUFFIX, 0); }
		public TerminalNode KW_URL_PREFIX() { return getToken(ZmeiLangParser.KW_URL_PREFIX, 0); }
		public TerminalNode KW_CAN_EDIT() { return getToken(ZmeiLangParser.KW_CAN_EDIT, 0); }
		public TerminalNode KW_OBJECT_EXPR() { return getToken(ZmeiLangParser.KW_OBJECT_EXPR, 0); }
		public TerminalNode KW_BLOCK() { return getToken(ZmeiLangParser.KW_BLOCK, 0); }
		public TerminalNode KW_ITEM_NAME() { return getToken(ZmeiLangParser.KW_ITEM_NAME, 0); }
		public TerminalNode KW_PK_PARAM() { return getToken(ZmeiLangParser.KW_PK_PARAM, 0); }
		public TerminalNode KW_LIST_FIELDS() { return getToken(ZmeiLangParser.KW_LIST_FIELDS, 0); }
		public TerminalNode KW_DELETE() { return getToken(ZmeiLangParser.KW_DELETE, 0); }
		public TerminalNode KW_EDIT() { return getToken(ZmeiLangParser.KW_EDIT, 0); }
		public TerminalNode KW_CREATE() { return getToken(ZmeiLangParser.KW_CREATE, 0); }
		public TerminalNode KW_DETAIL() { return getToken(ZmeiLangParser.KW_DETAIL, 0); }
		public TerminalNode KW_SKIP() { return getToken(ZmeiLangParser.KW_SKIP, 0); }
		public TerminalNode KW_FROM() { return getToken(ZmeiLangParser.KW_FROM, 0); }
		public TerminalNode KW_POLY_LIST() { return getToken(ZmeiLangParser.KW_POLY_LIST, 0); }
		public TerminalNode KW_CSS() { return getToken(ZmeiLangParser.KW_CSS, 0); }
		public TerminalNode KW_JS() { return getToken(ZmeiLangParser.KW_JS, 0); }
		public TerminalNode KW_INLINE_TYPE() { return getToken(ZmeiLangParser.KW_INLINE_TYPE, 0); }
		public TerminalNode KW_AUTH_TYPE() { return getToken(ZmeiLangParser.KW_AUTH_TYPE, 0); }
		public TerminalNode KW_INLINE() { return getToken(ZmeiLangParser.KW_INLINE, 0); }
		public TerminalNode KW_TYPE() { return getToken(ZmeiLangParser.KW_TYPE, 0); }
		public TerminalNode KW_USER_FIELD() { return getToken(ZmeiLangParser.KW_USER_FIELD, 0); }
		public TerminalNode KW_ANNOTATE() { return getToken(ZmeiLangParser.KW_ANNOTATE, 0); }
		public TerminalNode KW_ON_CREATE() { return getToken(ZmeiLangParser.KW_ON_CREATE, 0); }
		public TerminalNode KW_QUERY() { return getToken(ZmeiLangParser.KW_QUERY, 0); }
		public TerminalNode KW_AUTH() { return getToken(ZmeiLangParser.KW_AUTH, 0); }
		public TerminalNode KW_COUNT() { return getToken(ZmeiLangParser.KW_COUNT, 0); }
		public TerminalNode KW_I18N() { return getToken(ZmeiLangParser.KW_I18N, 0); }
		public TerminalNode KW_EXTRA() { return getToken(ZmeiLangParser.KW_EXTRA, 0); }
		public TerminalNode KW_TABS() { return getToken(ZmeiLangParser.KW_TABS, 0); }
		public TerminalNode KW_LIST() { return getToken(ZmeiLangParser.KW_LIST, 0); }
		public TerminalNode KW_READ_ONLY() { return getToken(ZmeiLangParser.KW_READ_ONLY, 0); }
		public TerminalNode KW_LIST_EDITABLE() { return getToken(ZmeiLangParser.KW_LIST_EDITABLE, 0); }
		public TerminalNode KW_LIST_FILTER() { return getToken(ZmeiLangParser.KW_LIST_FILTER, 0); }
		public TerminalNode KW_LIST_SEARCH() { return getToken(ZmeiLangParser.KW_LIST_SEARCH, 0); }
		public TerminalNode KW_FIELDS() { return getToken(ZmeiLangParser.KW_FIELDS, 0); }
		public TerminalNode KW_IMPORT() { return getToken(ZmeiLangParser.KW_IMPORT, 0); }
		public TerminalNode KW_AS() { return getToken(ZmeiLangParser.KW_AS, 0); }
		public TerminalNode COL_FIELD_TYPE_LONGTEXT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_LONGTEXT, 0); }
		public TerminalNode COL_FIELD_TYPE_HTML() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_HTML, 0); }
		public TerminalNode COL_FIELD_TYPE_HTML_MEDIA() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_HTML_MEDIA, 0); }
		public TerminalNode COL_FIELD_TYPE_FLOAT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FLOAT, 0); }
		public TerminalNode COL_FIELD_TYPE_DECIMAL() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DECIMAL, 0); }
		public TerminalNode COL_FIELD_TYPE_DATE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DATE, 0); }
		public TerminalNode COL_FIELD_TYPE_DATETIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DATETIME, 0); }
		public TerminalNode COL_FIELD_TYPE_CREATE_TIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_CREATE_TIME, 0); }
		public TerminalNode COL_FIELD_TYPE_UPDATE_TIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_UPDATE_TIME, 0); }
		public TerminalNode COL_FIELD_TYPE_IMAGE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_IMAGE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_IMAGE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_IMAGE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_FILE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_FILE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_FOLDER() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_FOLDER, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_IMAGE_FOLDER() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_IMAGE_FOLDER, 0); }
		public TerminalNode COL_FIELD_TYPE_TEXT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_TEXT, 0); }
		public TerminalNode COL_FIELD_TYPE_INT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_INT, 0); }
		public TerminalNode COL_FIELD_TYPE_SLUG() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_SLUG, 0); }
		public TerminalNode COL_FIELD_TYPE_BOOL() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_BOOL, 0); }
		public TerminalNode COL_FIELD_TYPE_ONE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_ONE, 0); }
		public TerminalNode COL_FIELD_TYPE_ONE2ONE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_ONE2ONE, 0); }
		public TerminalNode COL_FIELD_TYPE_MANY() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_MANY, 0); }
		public TerminalNode COL_FIELD_CHOICES() { return getToken(ZmeiLangParser.COL_FIELD_CHOICES, 0); }
		public Id_or_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_or_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterId_or_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitId_or_kw(this);
		}
	}

	public final Id_or_kwContext id_or_kw() throws RecognitionException {
		Id_or_kwContext _localctx = new Id_or_kwContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_or_kw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE_MODE) | (1L << BOOL) | (1L << KW_THEME) | (1L << KW_PAGE) | (1L << KW_LINK_SUFFIX) | (1L << KW_URL_PREFIX) | (1L << KW_CAN_EDIT) | (1L << KW_OBJECT_EXPR) | (1L << KW_BLOCK) | (1L << KW_ITEM_NAME) | (1L << KW_PK_PARAM) | (1L << KW_LIST_FIELDS) | (1L << KW_DELETE) | (1L << KW_EDIT) | (1L << KW_CREATE) | (1L << KW_DETAIL) | (1L << KW_SKIP) | (1L << KW_FROM) | (1L << KW_POLY_LIST) | (1L << KW_CSS) | (1L << KW_JS) | (1L << KW_INLINE_TYPE) | (1L << KW_AUTH_TYPE) | (1L << KW_INLINE) | (1L << KW_TYPE) | (1L << KW_USER_FIELD) | (1L << KW_ANNOTATE) | (1L << KW_ON_CREATE) | (1L << KW_QUERY) | (1L << KW_AUTH) | (1L << KW_COUNT) | (1L << KW_I18N) | (1L << KW_EXTRA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_TABS - 64)) | (1L << (KW_LIST - 64)) | (1L << (KW_READ_ONLY - 64)) | (1L << (KW_LIST_EDITABLE - 64)) | (1L << (KW_LIST_FILTER - 64)) | (1L << (KW_LIST_SEARCH - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_AS - 64)) | (1L << (COL_FIELD_TYPE_LONGTEXT - 64)) | (1L << (COL_FIELD_TYPE_HTML - 64)) | (1L << (COL_FIELD_TYPE_HTML_MEDIA - 64)) | (1L << (COL_FIELD_TYPE_FLOAT - 64)) | (1L << (COL_FIELD_TYPE_DECIMAL - 64)) | (1L << (COL_FIELD_TYPE_DATE - 64)) | (1L << (COL_FIELD_TYPE_DATETIME - 64)) | (1L << (COL_FIELD_TYPE_CREATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_UPDATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_TEXT - 64)) | (1L << (COL_FIELD_TYPE_INT - 64)) | (1L << (COL_FIELD_TYPE_SLUG - 64)) | (1L << (COL_FIELD_TYPE_BOOL - 64)) | (1L << (COL_FIELD_TYPE_ONE - 64)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 64)) | (1L << (COL_FIELD_TYPE_MANY - 64)) | (1L << (COL_FIELD_CHOICES - 64)) | (1L << (ID - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ZmeiLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ZmeiLangParser.DOT, i);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			id_or_kw();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(541);
				match(DOT);
				setState(542);
				id_or_kw();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_list_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ZmeiLangParser.STAR, 0); }
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public List<TerminalNode> EXCLUDE() { return getTokens(ZmeiLangParser.EXCLUDE); }
		public TerminalNode EXCLUDE(int i) {
			return getToken(ZmeiLangParser.EXCLUDE, i);
		}
		public List<Field_list_expr_fieldContext> field_list_expr_field() {
			return getRuleContexts(Field_list_expr_fieldContext.class);
		}
		public Field_list_expr_fieldContext field_list_expr_field(int i) {
			return getRuleContext(Field_list_expr_fieldContext.class,i);
		}
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Field_list_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_list_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_list_expr(this);
		}
	}

	public final Field_list_exprContext field_list_expr() throws RecognitionException {
		Field_list_exprContext _localctx = new Field_list_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_list_expr);
		int _la;
		try {
			int _alt;
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(548);
					match(DOT);
					}
				}

				setState(551);
				match(STAR);
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(552);
						match(COMA);
						setState(553);
						match(EXCLUDE);
						setState(554);
						field_list_expr_field();
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				id_or_kw();
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						match(COMA);
						setState(563);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EXCLUDE) {
							{
							setState(562);
							match(EXCLUDE);
							}
						}

						setState(565);
						field_list_expr_field();
						}
						} 
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_list_expr_fieldContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public List<TerminalNode> STAR() { return getTokens(ZmeiLangParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(ZmeiLangParser.STAR, i);
		}
		public Field_list_expr_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list_expr_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_list_expr_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_list_expr_field(this);
		}
	}

	public final Field_list_expr_fieldContext field_list_expr_field() throws RecognitionException {
		Field_list_expr_fieldContext _localctx = new Field_list_expr_fieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_list_expr_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(573);
				match(STAR);
				}
			}

			setState(576);
			id_or_kw();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(577);
				match(STAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_mode_exprContext extends ParserRuleContext {
		public TerminalNode SQ_BRACE_OPEN() { return getToken(ZmeiLangParser.SQ_BRACE_OPEN, 0); }
		public TerminalNode WRITE_MODE() { return getToken(ZmeiLangParser.WRITE_MODE, 0); }
		public TerminalNode SQ_BRACE_CLOSE() { return getToken(ZmeiLangParser.SQ_BRACE_CLOSE, 0); }
		public Write_mode_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_mode_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterWrite_mode_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitWrite_mode_expr(this);
		}
	}

	public final Write_mode_exprContext write_mode_expr() throws RecognitionException {
		Write_mode_exprContext _localctx = new Write_mode_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_write_mode_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(SQ_BRACE_OPEN);
			setState(581);
			match(WRITE_MODE);
			setState(582);
			match(SQ_BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_codeContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Code_lineContext code_line() {
			return getRuleContext(Code_lineContext.class,0);
		}
		public Python_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPython_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPython_code(this);
		}
	}

	public final Python_codeContext python_code() throws RecognitionException {
		Python_codeContext _localctx = new Python_codeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_python_code);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				code_block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				code_line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_lineContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ZmeiLangParser.ASSIGN, 0); }
		public TerminalNode PYTHON_CODE() { return getToken(ZmeiLangParser.PYTHON_CODE, 0); }
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Code_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCode_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCode_line(this);
		}
	}

	public final Code_lineContext code_line() throws RecognitionException {
		Code_lineContext _localctx = new Code_lineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_code_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(ASSIGN);
			setState(589);
			match(PYTHON_CODE);
			setState(590);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode CODE_BLOCK() { return getToken(ZmeiLangParser.CODE_BLOCK, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(CODE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_annotationContext extends ParserRuleContext {
		public An_suitContext an_suit() {
			return getRuleContext(An_suitContext.class,0);
		}
		public An_celeryContext an_celery() {
			return getRuleContext(An_celeryContext.class,0);
		}
		public An_langsContext an_langs() {
			return getRuleContext(An_langsContext.class,0);
		}
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Cs_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCs_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCs_annotation(this);
		}
	}

	public final Cs_annotationContext cs_annotation() throws RecognitionException {
		Cs_annotationContext _localctx = new Cs_annotationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cs_annotation);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AN_SUIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				an_suit();
				}
				break;
			case AN_CELERY:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				an_celery();
				}
				break;
			case AN_LANGS:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				an_langs();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_filerContext extends ParserRuleContext {
		public TerminalNode AN_FILER() { return getToken(ZmeiLangParser.AN_FILER, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_filerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_filer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_filer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_filer(this);
		}
	}

	public final An_filerContext an_filer() throws RecognitionException {
		An_filerContext _localctx = new An_filerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_an_filer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(AN_FILER);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(601);
				match(BRACE_OPEN);
				setState(602);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_langsContext extends ParserRuleContext {
		public TerminalNode AN_LANGS() { return getToken(ZmeiLangParser.AN_LANGS, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_langs_listContext an_langs_list() {
			return getRuleContext(An_langs_listContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_langsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_langs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_langs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_langs(this);
		}
	}

	public final An_langsContext an_langs() throws RecognitionException {
		An_langsContext _localctx = new An_langsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_an_langs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(AN_LANGS);
			setState(606);
			match(BRACE_OPEN);
			setState(607);
			an_langs_list();
			setState(608);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_langs_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ZmeiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ZmeiLangParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_langs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_langs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_langs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_langs_list(this);
		}
	}

	public final An_langs_listContext an_langs_list() throws RecognitionException {
		An_langs_listContext _localctx = new An_langs_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_an_langs_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(ID);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(611);
				match(COMA);
				setState(612);
				match(ID);
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_celeryContext extends ParserRuleContext {
		public TerminalNode AN_CELERY() { return getToken(ZmeiLangParser.AN_CELERY, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_celeryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_celery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_celery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_celery(this);
		}
	}

	public final An_celeryContext an_celery() throws RecognitionException {
		An_celeryContext _localctx = new An_celeryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_an_celery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(AN_CELERY);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(619);
				match(BRACE_OPEN);
				setState(620);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_suitContext extends ParserRuleContext {
		public TerminalNode AN_SUIT() { return getToken(ZmeiLangParser.AN_SUIT, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_suit_app_nameContext an_suit_app_name() {
			return getRuleContext(An_suit_app_nameContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_suitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_suit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_suit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_suit(this);
		}
	}

	public final An_suitContext an_suit() throws RecognitionException {
		An_suitContext _localctx = new An_suitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_an_suit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(AN_SUIT);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(624);
				match(BRACE_OPEN);
				setState(625);
				an_suit_app_name();
				setState(626);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_suit_app_nameContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_suit_app_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_suit_app_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_suit_app_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_suit_app_name(this);
		}
	}

	public final An_suit_app_nameContext an_suit_app_name() throws RecognitionException {
		An_suit_app_nameContext _localctx = new An_suit_app_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_an_suit_app_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColContext extends ParserRuleContext {
		public Col_headerContext col_header() {
			return getRuleContext(Col_headerContext.class,0);
		}
		public Col_str_exprContext col_str_expr() {
			return getRuleContext(Col_str_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<Col_fieldContext> col_field() {
			return getRuleContexts(Col_fieldContext.class);
		}
		public Col_fieldContext col_field(int i) {
			return getRuleContext(Col_fieldContext.class,i);
		}
		public List<Model_annotationContext> model_annotation() {
			return getRuleContexts(Model_annotationContext.class);
		}
		public Model_annotationContext model_annotation(int i) {
			return getRuleContext(Model_annotationContext.class,i);
		}
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_col);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			col_header();
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(633);
				col_str_expr();
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(636);
					match(NL);
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE_MODE) | (1L << BOOL) | (1L << KW_THEME) | (1L << KW_PAGE) | (1L << KW_LINK_SUFFIX) | (1L << KW_URL_PREFIX) | (1L << KW_CAN_EDIT) | (1L << KW_OBJECT_EXPR) | (1L << KW_BLOCK) | (1L << KW_ITEM_NAME) | (1L << KW_PK_PARAM) | (1L << KW_LIST_FIELDS) | (1L << KW_DELETE) | (1L << KW_EDIT) | (1L << KW_CREATE) | (1L << KW_DETAIL) | (1L << KW_SKIP) | (1L << KW_FROM) | (1L << KW_POLY_LIST) | (1L << KW_CSS) | (1L << KW_JS) | (1L << KW_INLINE_TYPE) | (1L << KW_AUTH_TYPE) | (1L << KW_INLINE) | (1L << KW_TYPE) | (1L << KW_USER_FIELD) | (1L << KW_ANNOTATE) | (1L << KW_ON_CREATE) | (1L << KW_QUERY) | (1L << KW_AUTH) | (1L << KW_COUNT) | (1L << KW_I18N) | (1L << KW_EXTRA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_TABS - 64)) | (1L << (KW_LIST - 64)) | (1L << (KW_READ_ONLY - 64)) | (1L << (KW_LIST_EDITABLE - 64)) | (1L << (KW_LIST_FILTER - 64)) | (1L << (KW_LIST_SEARCH - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_AS - 64)) | (1L << (COL_FIELD_TYPE_LONGTEXT - 64)) | (1L << (COL_FIELD_TYPE_HTML - 64)) | (1L << (COL_FIELD_TYPE_HTML_MEDIA - 64)) | (1L << (COL_FIELD_TYPE_FLOAT - 64)) | (1L << (COL_FIELD_TYPE_DECIMAL - 64)) | (1L << (COL_FIELD_TYPE_DATE - 64)) | (1L << (COL_FIELD_TYPE_DATETIME - 64)) | (1L << (COL_FIELD_TYPE_CREATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_UPDATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_TEXT - 64)) | (1L << (COL_FIELD_TYPE_INT - 64)) | (1L << (COL_FIELD_TYPE_SLUG - 64)) | (1L << (COL_FIELD_TYPE_BOOL - 64)) | (1L << (COL_FIELD_TYPE_ONE - 64)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 64)) | (1L << (COL_FIELD_TYPE_MANY - 64)) | (1L << (COL_FIELD_CHOICES - 64)) | (1L << (ID - 64)) | (1L << (EQUALS - 64)) | (1L << (DOLLAR - 64)) | (1L << (AMP - 64)) | (1L << (EXCLAM - 64)) | (1L << (STAR - 64)) | (1L << (APPROX - 64)))) != 0)) {
				{
				{
				setState(642);
				col_field();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(648);
					match(NL);
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654);
					model_annotation();
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					match(NL);
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_str_exprContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public TerminalNode EOF() { return getToken(ZmeiLangParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public Col_str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_str_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_str_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_str_expr(this);
		}
	}

	public final Col_str_exprContext col_str_expr() throws RecognitionException {
		Col_str_exprContext _localctx = new Col_str_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_col_str_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(EQUALS);
			setState(667);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				{
				setState(669); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(668);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(671); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(673);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_headerContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ZmeiLangParser.HASH, 0); }
		public Col_nameContext col_name() {
			return getRuleContext(Col_nameContext.class,0);
		}
		public Col_header_line_separatorContext col_header_line_separator() {
			return getRuleContext(Col_header_line_separatorContext.class,0);
		}
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Col_base_nameContext col_base_name() {
			return getRuleContext(Col_base_nameContext.class,0);
		}
		public Col_verbose_nameContext col_verbose_name() {
			return getRuleContext(Col_verbose_nameContext.class,0);
		}
		public Col_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_header(this);
		}
	}

	public final Col_headerContext col_header() throws RecognitionException {
		Col_headerContext _localctx = new Col_headerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_col_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(HASH);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(677);
				col_base_name();
				}
				break;
			}
			setState(680);
			col_name();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(681);
				col_verbose_name();
				}
			}

			setState(684);
			col_header_line_separator();
			setState(685);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_header_line_separatorContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public List<TerminalNode> DASH() { return getTokens(ZmeiLangParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(ZmeiLangParser.DASH, i);
		}
		public Col_header_line_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_header_line_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_header_line_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_header_line_separator(this);
		}
	}

	public final Col_header_line_separatorContext col_header_line_separator() throws RecognitionException {
		Col_header_line_separatorContext _localctx = new Col_header_line_separatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_col_header_line_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(NL);
			setState(688);
			match(DASH);
			setState(689);
			match(DASH);
			setState(691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(690);
				match(DASH);
				}
				}
				setState(693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DASH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_verbose_nameContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<Verbose_name_partContext> verbose_name_part() {
			return getRuleContexts(Verbose_name_partContext.class);
		}
		public Verbose_name_partContext verbose_name_part(int i) {
			return getRuleContext(Verbose_name_partContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ZmeiLangParser.SLASH, 0); }
		public Col_verbose_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_verbose_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_verbose_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_verbose_name(this);
		}
	}

	public final Col_verbose_nameContext col_verbose_name() throws RecognitionException {
		Col_verbose_nameContext _localctx = new Col_verbose_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_col_verbose_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(COLON);
			setState(696);
			verbose_name_part();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(697);
				match(SLASH);
				setState(698);
				verbose_name_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Verbose_name_partContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Verbose_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbose_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterVerbose_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitVerbose_name_part(this);
		}
	}

	public final Verbose_name_partContext verbose_name_part() throws RecognitionException {
		Verbose_name_partContext _localctx = new Verbose_name_partContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_verbose_name_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(701);
				id_or_kw();
				}
				break;
			case STRING_DQ:
				{
				setState(702);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				{
				setState(703);
				match(STRING_SQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_base_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode DASH() { return getToken(ZmeiLangParser.DASH, 0); }
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public TerminalNode APPROX() { return getToken(ZmeiLangParser.APPROX, 0); }
		public Col_base_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_base_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_base_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_base_name(this);
		}
	}

	public final Col_base_nameContext col_base_name() throws RecognitionException {
		Col_base_nameContext _localctx = new Col_base_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_col_base_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			id_or_kw();
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DASH:
				{
				{
				setState(707);
				match(DASH);
				setState(708);
				match(GT);
				}
				}
				break;
			case APPROX:
				{
				{
				setState(709);
				match(APPROX);
				setState(710);
				match(GT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Col_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_name(this);
		}
	}

	public final Col_nameContext col_name() throws RecognitionException {
		Col_nameContext _localctx = new Col_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_col_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_fieldContext extends ParserRuleContext {
		public Col_field_nameContext col_field_name() {
			return getRuleContext(Col_field_nameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ZmeiLangParser.EOF, 0); }
		public List<Col_modifierContext> col_modifier() {
			return getRuleContexts(Col_modifierContext.class);
		}
		public Col_modifierContext col_modifier(int i) {
			return getRuleContext(Col_modifierContext.class,i);
		}
		public Col_field_expr_or_defContext col_field_expr_or_def() {
			return getRuleContext(Col_field_expr_or_defContext.class,0);
		}
		public Col_field_vrebose_nameContext col_field_vrebose_name() {
			return getRuleContext(Col_field_vrebose_nameContext.class,0);
		}
		public Col_field_help_textContext col_field_help_text() {
			return getRuleContext(Col_field_help_textContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public Col_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field(this);
		}
	}

	public final Col_fieldContext col_field() throws RecognitionException {
		Col_fieldContext _localctx = new Col_fieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_col_field);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (EQUALS - 115)) | (1L << (DOLLAR - 115)) | (1L << (AMP - 115)) | (1L << (EXCLAM - 115)) | (1L << (STAR - 115)) | (1L << (APPROX - 115)))) != 0)) {
				{
				{
				setState(715);
				col_modifier();
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			col_field_name();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (COLON - 102)) | (1L << (ASSIGN - 102)) | (1L << (ASSIGN_STATIC - 102)))) != 0)) {
				{
				setState(722);
				col_field_expr_or_def();
				}
			}

			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(725);
				col_field_vrebose_name();
				}
			}

			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK) {
				{
				setState(728);
				col_field_help_text();
				}
			}

			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				{
				setState(732); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(731);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(734); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(736);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_expr_or_defContext extends ParserRuleContext {
		public Col_field_exprContext col_field_expr() {
			return getRuleContext(Col_field_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Col_field_defContext col_field_def() {
			return getRuleContext(Col_field_defContext.class,0);
		}
		public Wrong_field_typeContext wrong_field_type() {
			return getRuleContext(Wrong_field_typeContext.class,0);
		}
		public Col_field_customContext col_field_custom() {
			return getRuleContext(Col_field_customContext.class,0);
		}
		public Col_field_extendContext col_field_extend() {
			return getRuleContext(Col_field_extendContext.class,0);
		}
		public Col_field_expr_or_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_expr_or_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_expr_or_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_expr_or_def(this);
		}
	}

	public final Col_field_expr_or_defContext col_field_expr_or_def() throws RecognitionException {
		Col_field_expr_or_defContext _localctx = new Col_field_expr_or_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_col_field_expr_or_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				{
				setState(739);
				match(COLON);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE_BLOCK) {
					{
					setState(740);
					col_field_custom();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(743);
				match(COLON);
				setState(744);
				col_field_def();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==CODE_BLOCK) {
					{
					setState(745);
					col_field_extend();
					}
				}

				}
				}
				break;
			case 3:
				{
				{
				setState(748);
				match(COLON);
				setState(749);
				wrong_field_type();
				}
				}
				break;
			case 4:
				{
				setState(750);
				col_field_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_customContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Col_field_customContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_custom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_custom(this);
		}
	}

	public final Col_field_customContext col_field_custom() throws RecognitionException {
		Col_field_customContext _localctx = new Col_field_customContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_col_field_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_extendContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Col_field_extend_appendContext col_field_extend_append() {
			return getRuleContext(Col_field_extend_appendContext.class,0);
		}
		public Col_field_extendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_extend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_extend(this);
		}
	}

	public final Col_field_extendContext col_field_extend() throws RecognitionException {
		Col_field_extendContext _localctx = new Col_field_extendContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_col_field_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(755);
				col_field_extend_append();
				}
			}

			setState(758);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_extend_appendContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ZmeiLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ZmeiLangParser.DOT, i);
		}
		public Col_field_extend_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_extend_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_extend_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_extend_append(this);
		}
	}

	public final Col_field_extend_appendContext col_field_extend_append() throws RecognitionException {
		Col_field_extend_appendContext _localctx = new Col_field_extend_appendContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_col_field_extend_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(DOT);
			setState(761);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wrong_field_typeContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Wrong_field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrong_field_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterWrong_field_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitWrong_field_type(this);
		}
	}

	public final Wrong_field_typeContext wrong_field_type() throws RecognitionException {
		Wrong_field_typeContext _localctx = new Wrong_field_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_wrong_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_exprContext extends ParserRuleContext {
		public Col_field_expr_markerContext col_field_expr_marker() {
			return getRuleContext(Col_field_expr_markerContext.class,0);
		}
		public Col_feild_expr_codeContext col_feild_expr_code() {
			return getRuleContext(Col_feild_expr_codeContext.class,0);
		}
		public Col_field_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_expr(this);
		}
	}

	public final Col_field_exprContext col_field_expr() throws RecognitionException {
		Col_field_exprContext _localctx = new Col_field_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_col_field_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			col_field_expr_marker();
			setState(766);
			col_feild_expr_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_expr_markerContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ZmeiLangParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_STATIC() { return getToken(ZmeiLangParser.ASSIGN_STATIC, 0); }
		public Col_field_expr_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_expr_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_expr_marker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_expr_marker(this);
		}
	}

	public final Col_field_expr_markerContext col_field_expr_marker() throws RecognitionException {
		Col_field_expr_markerContext _localctx = new Col_field_expr_markerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_col_field_expr_marker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==ASSIGN_STATIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_feild_expr_codeContext extends ParserRuleContext {
		public TerminalNode PYTHON_CODE() { return getToken(ZmeiLangParser.PYTHON_CODE, 0); }
		public Col_feild_expr_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_feild_expr_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_feild_expr_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_feild_expr_code(this);
		}
	}

	public final Col_feild_expr_codeContext col_feild_expr_code() throws RecognitionException {
		Col_feild_expr_codeContext _localctx = new Col_feild_expr_codeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_col_feild_expr_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(PYTHON_CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_or_quotedContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public String_or_quotedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_or_quoted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterString_or_quoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitString_or_quoted(this);
		}
	}

	public final String_or_quotedContext string_or_quoted() throws RecognitionException {
		String_or_quotedContext _localctx = new String_or_quotedContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_string_or_quoted);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(773); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(772);
					id_or_kw();
					}
					}
					setState(775); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE_MODE) | (1L << BOOL) | (1L << KW_THEME) | (1L << KW_PAGE) | (1L << KW_LINK_SUFFIX) | (1L << KW_URL_PREFIX) | (1L << KW_CAN_EDIT) | (1L << KW_OBJECT_EXPR) | (1L << KW_BLOCK) | (1L << KW_ITEM_NAME) | (1L << KW_PK_PARAM) | (1L << KW_LIST_FIELDS) | (1L << KW_DELETE) | (1L << KW_EDIT) | (1L << KW_CREATE) | (1L << KW_DETAIL) | (1L << KW_SKIP) | (1L << KW_FROM) | (1L << KW_POLY_LIST) | (1L << KW_CSS) | (1L << KW_JS) | (1L << KW_INLINE_TYPE) | (1L << KW_AUTH_TYPE) | (1L << KW_INLINE) | (1L << KW_TYPE) | (1L << KW_USER_FIELD) | (1L << KW_ANNOTATE) | (1L << KW_ON_CREATE) | (1L << KW_QUERY) | (1L << KW_AUTH) | (1L << KW_COUNT) | (1L << KW_I18N) | (1L << KW_EXTRA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_TABS - 64)) | (1L << (KW_LIST - 64)) | (1L << (KW_READ_ONLY - 64)) | (1L << (KW_LIST_EDITABLE - 64)) | (1L << (KW_LIST_FILTER - 64)) | (1L << (KW_LIST_SEARCH - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_AS - 64)) | (1L << (COL_FIELD_TYPE_LONGTEXT - 64)) | (1L << (COL_FIELD_TYPE_HTML - 64)) | (1L << (COL_FIELD_TYPE_HTML_MEDIA - 64)) | (1L << (COL_FIELD_TYPE_FLOAT - 64)) | (1L << (COL_FIELD_TYPE_DECIMAL - 64)) | (1L << (COL_FIELD_TYPE_DATE - 64)) | (1L << (COL_FIELD_TYPE_DATETIME - 64)) | (1L << (COL_FIELD_TYPE_CREATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_UPDATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_TEXT - 64)) | (1L << (COL_FIELD_TYPE_INT - 64)) | (1L << (COL_FIELD_TYPE_SLUG - 64)) | (1L << (COL_FIELD_TYPE_BOOL - 64)) | (1L << (COL_FIELD_TYPE_ONE - 64)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 64)) | (1L << (COL_FIELD_TYPE_MANY - 64)) | (1L << (COL_FIELD_CHOICES - 64)) | (1L << (ID - 64)))) != 0) );
				}
				break;
			case STRING_DQ:
				{
				setState(777);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				{
				setState(778);
				match(STRING_SQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_help_textContext extends ParserRuleContext {
		public TerminalNode QUESTION_MARK() { return getToken(ZmeiLangParser.QUESTION_MARK, 0); }
		public String_or_quotedContext string_or_quoted() {
			return getRuleContext(String_or_quotedContext.class,0);
		}
		public Col_field_help_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_help_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_help_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_help_text(this);
		}
	}

	public final Col_field_help_textContext col_field_help_text() throws RecognitionException {
		Col_field_help_textContext _localctx = new Col_field_help_textContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_col_field_help_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(QUESTION_MARK);
			setState(782);
			string_or_quoted();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_vrebose_nameContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(ZmeiLangParser.SLASH, 0); }
		public String_or_quotedContext string_or_quoted() {
			return getRuleContext(String_or_quotedContext.class,0);
		}
		public Col_field_vrebose_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_vrebose_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_vrebose_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_vrebose_name(this);
		}
	}

	public final Col_field_vrebose_nameContext col_field_vrebose_name() throws RecognitionException {
		Col_field_vrebose_nameContext _localctx = new Col_field_vrebose_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_col_field_vrebose_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(SLASH);
			setState(785);
			string_or_quoted();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Col_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_name(this);
		}
	}

	public final Col_field_nameContext col_field_name() throws RecognitionException {
		Col_field_nameContext _localctx = new Col_field_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_col_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_modifierContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public TerminalNode DOLLAR() { return getToken(ZmeiLangParser.DOLLAR, 0); }
		public TerminalNode AMP() { return getToken(ZmeiLangParser.AMP, 0); }
		public TerminalNode EXCLAM() { return getToken(ZmeiLangParser.EXCLAM, 0); }
		public TerminalNode STAR() { return getToken(ZmeiLangParser.STAR, 0); }
		public TerminalNode APPROX() { return getToken(ZmeiLangParser.APPROX, 0); }
		public Col_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_modifier(this);
		}
	}

	public final Col_modifierContext col_modifier() throws RecognitionException {
		Col_modifierContext _localctx = new Col_modifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_col_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (EQUALS - 115)) | (1L << (DOLLAR - 115)) | (1L << (AMP - 115)) | (1L << (EXCLAM - 115)) | (1L << (STAR - 115)) | (1L << (APPROX - 115)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_field_defContext extends ParserRuleContext {
		public Field_longtextContext field_longtext() {
			return getRuleContext(Field_longtextContext.class,0);
		}
		public Field_html_mediaContext field_html_media() {
			return getRuleContext(Field_html_mediaContext.class,0);
		}
		public Field_htmlContext field_html() {
			return getRuleContext(Field_htmlContext.class,0);
		}
		public Field_floatContext field_float() {
			return getRuleContext(Field_floatContext.class,0);
		}
		public Field_decimalContext field_decimal() {
			return getRuleContext(Field_decimalContext.class,0);
		}
		public Field_dateContext field_date() {
			return getRuleContext(Field_dateContext.class,0);
		}
		public Field_datetimeContext field_datetime() {
			return getRuleContext(Field_datetimeContext.class,0);
		}
		public Field_create_timeContext field_create_time() {
			return getRuleContext(Field_create_timeContext.class,0);
		}
		public Field_update_timeContext field_update_time() {
			return getRuleContext(Field_update_timeContext.class,0);
		}
		public Field_textContext field_text() {
			return getRuleContext(Field_textContext.class,0);
		}
		public Field_intContext field_int() {
			return getRuleContext(Field_intContext.class,0);
		}
		public Field_slugContext field_slug() {
			return getRuleContext(Field_slugContext.class,0);
		}
		public Field_boolContext field_bool() {
			return getRuleContext(Field_boolContext.class,0);
		}
		public Field_relationContext field_relation() {
			return getRuleContext(Field_relationContext.class,0);
		}
		public Field_imageContext field_image() {
			return getRuleContext(Field_imageContext.class,0);
		}
		public Field_fileContext field_file() {
			return getRuleContext(Field_fileContext.class,0);
		}
		public Field_filer_fileContext field_filer_file() {
			return getRuleContext(Field_filer_fileContext.class,0);
		}
		public Field_filer_folderContext field_filer_folder() {
			return getRuleContext(Field_filer_folderContext.class,0);
		}
		public Col_field_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_field_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterCol_field_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitCol_field_def(this);
		}
	}

	public final Col_field_defContext col_field_def() throws RecognitionException {
		Col_field_defContext _localctx = new Col_field_defContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_col_field_def);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COL_FIELD_TYPE_LONGTEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				field_longtext();
				}
				break;
			case COL_FIELD_TYPE_HTML_MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				field_html_media();
				}
				break;
			case COL_FIELD_TYPE_HTML:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				field_html();
				}
				break;
			case COL_FIELD_TYPE_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				field_float();
				}
				break;
			case COL_FIELD_TYPE_DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
				field_decimal();
				}
				break;
			case COL_FIELD_TYPE_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(796);
				field_date();
				}
				break;
			case COL_FIELD_TYPE_DATETIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(797);
				field_datetime();
				}
				break;
			case COL_FIELD_TYPE_CREATE_TIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(798);
				field_create_time();
				}
				break;
			case COL_FIELD_TYPE_UPDATE_TIME:
				enterOuterAlt(_localctx, 9);
				{
				setState(799);
				field_update_time();
				}
				break;
			case COL_FIELD_TYPE_TEXT:
				enterOuterAlt(_localctx, 10);
				{
				setState(800);
				field_text();
				}
				break;
			case COL_FIELD_TYPE_INT:
				enterOuterAlt(_localctx, 11);
				{
				setState(801);
				field_int();
				}
				break;
			case COL_FIELD_TYPE_SLUG:
				enterOuterAlt(_localctx, 12);
				{
				setState(802);
				field_slug();
				}
				break;
			case COL_FIELD_TYPE_BOOL:
				enterOuterAlt(_localctx, 13);
				{
				setState(803);
				field_bool();
				}
				break;
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
				enterOuterAlt(_localctx, 14);
				{
				setState(804);
				field_relation();
				}
				break;
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
				enterOuterAlt(_localctx, 15);
				{
				setState(805);
				field_image();
				}
				break;
			case COL_FIELD_TYPE_FILE:
				enterOuterAlt(_localctx, 16);
				{
				setState(806);
				field_file();
				}
				break;
			case COL_FIELD_TYPE_FILER_FILE:
				enterOuterAlt(_localctx, 17);
				{
				setState(807);
				field_filer_file();
				}
				break;
			case COL_FIELD_TYPE_FILER_FOLDER:
				enterOuterAlt(_localctx, 18);
				{
				setState(808);
				field_filer_folder();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_longtextContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_LONGTEXT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_LONGTEXT, 0); }
		public Field_longtextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_longtext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_longtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_longtext(this);
		}
	}

	public final Field_longtextContext field_longtext() throws RecognitionException {
		Field_longtextContext _localctx = new Field_longtextContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_field_longtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(COL_FIELD_TYPE_LONGTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_htmlContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_HTML() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_HTML, 0); }
		public Field_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_html(this);
		}
	}

	public final Field_htmlContext field_html() throws RecognitionException {
		Field_htmlContext _localctx = new Field_htmlContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_field_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(COL_FIELD_TYPE_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_html_mediaContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_HTML_MEDIA() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_HTML_MEDIA, 0); }
		public Field_html_mediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_html_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_html_media(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_html_media(this);
		}
	}

	public final Field_html_mediaContext field_html_media() throws RecognitionException {
		Field_html_mediaContext _localctx = new Field_html_mediaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_field_html_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(COL_FIELD_TYPE_HTML_MEDIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_floatContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_FLOAT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FLOAT, 0); }
		public Field_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_float(this);
		}
	}

	public final Field_floatContext field_float() throws RecognitionException {
		Field_floatContext _localctx = new Field_floatContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_field_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(COL_FIELD_TYPE_FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_decimalContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_DECIMAL() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DECIMAL, 0); }
		public Field_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_decimal(this);
		}
	}

	public final Field_decimalContext field_decimal() throws RecognitionException {
		Field_decimalContext _localctx = new Field_decimalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_field_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(COL_FIELD_TYPE_DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_dateContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_DATE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DATE, 0); }
		public Field_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_date(this);
		}
	}

	public final Field_dateContext field_date() throws RecognitionException {
		Field_dateContext _localctx = new Field_dateContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_field_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(COL_FIELD_TYPE_DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_datetimeContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_DATETIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_DATETIME, 0); }
		public Field_datetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_datetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_datetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_datetime(this);
		}
	}

	public final Field_datetimeContext field_datetime() throws RecognitionException {
		Field_datetimeContext _localctx = new Field_datetimeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_field_datetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(COL_FIELD_TYPE_DATETIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_create_timeContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_CREATE_TIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_CREATE_TIME, 0); }
		public Field_create_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_create_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_create_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_create_time(this);
		}
	}

	public final Field_create_timeContext field_create_time() throws RecognitionException {
		Field_create_timeContext _localctx = new Field_create_timeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_field_create_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(COL_FIELD_TYPE_CREATE_TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_update_timeContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_UPDATE_TIME() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_UPDATE_TIME, 0); }
		public Field_update_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_update_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_update_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_update_time(this);
		}
	}

	public final Field_update_timeContext field_update_time() throws RecognitionException {
		Field_update_timeContext _localctx = new Field_update_timeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_field_update_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(COL_FIELD_TYPE_UPDATE_TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_fileContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_FILE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILE, 0); }
		public Field_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_file(this);
		}
	}

	public final Field_fileContext field_file() throws RecognitionException {
		Field_fileContext _localctx = new Field_fileContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_field_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(COL_FIELD_TYPE_FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_filer_fileContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_FILER_FILE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_FILE, 0); }
		public Field_filer_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_filer_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_filer_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_filer_file(this);
		}
	}

	public final Field_filer_fileContext field_filer_file() throws RecognitionException {
		Field_filer_fileContext _localctx = new Field_filer_fileContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_field_filer_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(COL_FIELD_TYPE_FILER_FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_filer_folderContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_FILER_FOLDER() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_FOLDER, 0); }
		public Field_filer_folderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_filer_folder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_filer_folder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_filer_folder(this);
		}
	}

	public final Field_filer_folderContext field_filer_folder() throws RecognitionException {
		Field_filer_folderContext _localctx = new Field_filer_folderContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_field_filer_folder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(COL_FIELD_TYPE_FILER_FOLDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_textContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_TEXT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_TEXT, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_text_sizeContext field_text_size() {
			return getRuleContext(Field_text_sizeContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public TerminalNode COMA() { return getToken(ZmeiLangParser.COMA, 0); }
		public Field_text_choicesContext field_text_choices() {
			return getRuleContext(Field_text_choicesContext.class,0);
		}
		public Field_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text(this);
		}
	}

	public final Field_textContext field_text() throws RecognitionException {
		Field_textContext _localctx = new Field_textContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_field_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(COL_FIELD_TYPE_TEXT);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(836);
				match(BRACE_OPEN);
				setState(837);
				field_text_size();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(838);
					match(COMA);
					setState(839);
					field_text_choices();
					}
				}

				setState(842);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_text_sizeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ZmeiLangParser.DIGIT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(ZmeiLangParser.QUESTION_MARK, 0); }
		public Field_text_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text_size(this);
		}
	}

	public final Field_text_sizeContext field_text_size() throws RecognitionException {
		Field_text_sizeContext _localctx = new Field_text_sizeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_field_text_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==QUESTION_MARK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_text_choicesContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_CHOICES() { return getToken(ZmeiLangParser.COL_FIELD_CHOICES, 0); }
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public List<Field_text_choiceContext> field_text_choice() {
			return getRuleContexts(Field_text_choiceContext.class);
		}
		public Field_text_choiceContext field_text_choice(int i) {
			return getRuleContext(Field_text_choiceContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public Field_text_choicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text_choices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text_choices(this);
		}
	}

	public final Field_text_choicesContext field_text_choices() throws RecognitionException {
		Field_text_choicesContext _localctx = new Field_text_choicesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_field_text_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(COL_FIELD_CHOICES);
			setState(849);
			match(EQUALS);
			setState(850);
			field_text_choice();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(851);
				match(COMA);
				setState(852);
				field_text_choice();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_text_choiceContext extends ParserRuleContext {
		public Field_text_choice_valContext field_text_choice_val() {
			return getRuleContext(Field_text_choice_valContext.class,0);
		}
		public Field_text_choice_keyContext field_text_choice_key() {
			return getRuleContext(Field_text_choice_keyContext.class,0);
		}
		public Field_text_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text_choice(this);
		}
	}

	public final Field_text_choiceContext field_text_choice() throws RecognitionException {
		Field_text_choiceContext _localctx = new Field_text_choiceContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_field_text_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(858);
				field_text_choice_key();
				}
				break;
			}
			setState(861);
			field_text_choice_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_text_choice_valContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Field_text_choice_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text_choice_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text_choice_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text_choice_val(this);
		}
	}

	public final Field_text_choice_valContext field_text_choice_val() throws RecognitionException {
		Field_text_choice_valContext _localctx = new Field_text_choice_valContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_field_text_choice_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(863);
				id_or_kw();
				}
				break;
			case STRING_DQ:
				{
				setState(864);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				{
				setState(865);
				match(STRING_SQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_text_choice_keyContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_text_choice_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_text_choice_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_text_choice_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_text_choice_key(this);
		}
	}

	public final Field_text_choice_keyContext field_text_choice_key() throws RecognitionException {
		Field_text_choice_keyContext _localctx = new Field_text_choice_keyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_field_text_choice_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			id_or_kw();
			setState(869);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_intContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_INT() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_INT, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_int_choicesContext field_int_choices() {
			return getRuleContext(Field_int_choicesContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Field_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_int(this);
		}
	}

	public final Field_intContext field_int() throws RecognitionException {
		Field_intContext _localctx = new Field_intContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_field_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(COL_FIELD_TYPE_INT);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(872);
				match(BRACE_OPEN);
				setState(873);
				field_int_choices();
				setState(874);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_int_choicesContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_CHOICES() { return getToken(ZmeiLangParser.COL_FIELD_CHOICES, 0); }
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public List<Field_int_choiceContext> field_int_choice() {
			return getRuleContexts(Field_int_choiceContext.class);
		}
		public Field_int_choiceContext field_int_choice(int i) {
			return getRuleContext(Field_int_choiceContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public Field_int_choicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_int_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_int_choices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_int_choices(this);
		}
	}

	public final Field_int_choicesContext field_int_choices() throws RecognitionException {
		Field_int_choicesContext _localctx = new Field_int_choicesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_field_int_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(COL_FIELD_CHOICES);
			setState(879);
			match(EQUALS);
			setState(880);
			field_int_choice();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(881);
				match(COMA);
				setState(882);
				field_int_choice();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_int_choiceContext extends ParserRuleContext {
		public Field_int_choice_valContext field_int_choice_val() {
			return getRuleContext(Field_int_choice_valContext.class,0);
		}
		public Field_int_choice_keyContext field_int_choice_key() {
			return getRuleContext(Field_int_choice_keyContext.class,0);
		}
		public Field_int_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_int_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_int_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_int_choice(this);
		}
	}

	public final Field_int_choiceContext field_int_choice() throws RecognitionException {
		Field_int_choiceContext _localctx = new Field_int_choiceContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_field_int_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(888);
				field_int_choice_key();
				}
			}

			setState(891);
			field_int_choice_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_int_choice_valContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Field_int_choice_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_int_choice_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_int_choice_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_int_choice_val(this);
		}
	}

	public final Field_int_choice_valContext field_int_choice_val() throws RecognitionException {
		Field_int_choice_valContext _localctx = new Field_int_choice_valContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_field_int_choice_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(893);
				id_or_kw();
				}
				break;
			case STRING_DQ:
				{
				setState(894);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				{
				setState(895);
				match(STRING_SQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_int_choice_keyContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ZmeiLangParser.DIGIT, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_int_choice_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_int_choice_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_int_choice_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_int_choice_key(this);
		}
	}

	public final Field_int_choice_keyContext field_int_choice_key() throws RecognitionException {
		Field_int_choice_keyContext _localctx = new Field_int_choice_keyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_field_int_choice_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(DIGIT);
			setState(899);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_slugContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_SLUG() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_SLUG, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_slug_ref_fieldContext field_slug_ref_field() {
			return getRuleContext(Field_slug_ref_fieldContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Field_slugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_slug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_slug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_slug(this);
		}
	}

	public final Field_slugContext field_slug() throws RecognitionException {
		Field_slugContext _localctx = new Field_slugContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_field_slug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(COL_FIELD_TYPE_SLUG);
			setState(902);
			match(BRACE_OPEN);
			setState(903);
			field_slug_ref_field();
			setState(904);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_slug_ref_fieldContext extends ParserRuleContext {
		public List<Field_slug_ref_field_idContext> field_slug_ref_field_id() {
			return getRuleContexts(Field_slug_ref_field_idContext.class);
		}
		public Field_slug_ref_field_idContext field_slug_ref_field_id(int i) {
			return getRuleContext(Field_slug_ref_field_idContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public Field_slug_ref_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_slug_ref_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_slug_ref_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_slug_ref_field(this);
		}
	}

	public final Field_slug_ref_fieldContext field_slug_ref_field() throws RecognitionException {
		Field_slug_ref_fieldContext _localctx = new Field_slug_ref_fieldContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_field_slug_ref_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			field_slug_ref_field_id();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(907);
				match(COMA);
				setState(908);
				field_slug_ref_field_id();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_slug_ref_field_idContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Field_slug_ref_field_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_slug_ref_field_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_slug_ref_field_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_slug_ref_field_id(this);
		}
	}

	public final Field_slug_ref_field_idContext field_slug_ref_field_id() throws RecognitionException {
		Field_slug_ref_field_idContext _localctx = new Field_slug_ref_field_idContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_field_slug_ref_field_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_boolContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_BOOL() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_BOOL, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_bool_defaultContext field_bool_default() {
			return getRuleContext(Field_bool_defaultContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Field_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_bool(this);
		}
	}

	public final Field_boolContext field_bool() throws RecognitionException {
		Field_boolContext _localctx = new Field_boolContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_field_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(COL_FIELD_TYPE_BOOL);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(917);
				match(BRACE_OPEN);
				setState(918);
				field_bool_default();
				setState(919);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_bool_defaultContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(ZmeiLangParser.BOOL, 0); }
		public Field_bool_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_bool_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_bool_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_bool_default(this);
		}
	}

	public final Field_bool_defaultContext field_bool_default() throws RecognitionException {
		Field_bool_defaultContext _localctx = new Field_bool_defaultContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_field_bool_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_imageContext extends ParserRuleContext {
		public Filer_image_typeContext filer_image_type() {
			return getRuleContext(Filer_image_typeContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_image_sizesContext field_image_sizes() {
			return getRuleContext(Field_image_sizesContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Field_imageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image(this);
		}
	}

	public final Field_imageContext field_image() throws RecognitionException {
		Field_imageContext _localctx = new Field_imageContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_field_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			filer_image_type();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(926);
				match(BRACE_OPEN);
				setState(927);
				field_image_sizes();
				setState(928);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filer_image_typeContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_IMAGE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_IMAGE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_IMAGE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_IMAGE, 0); }
		public TerminalNode COL_FIELD_TYPE_FILER_IMAGE_FOLDER() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_FILER_IMAGE_FOLDER, 0); }
		public Filer_image_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filer_image_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterFiler_image_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitFiler_image_type(this);
		}
	}

	public final Filer_image_typeContext filer_image_type() throws RecognitionException {
		Filer_image_typeContext _localctx = new Filer_image_typeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_filer_image_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (COL_FIELD_TYPE_IMAGE - 82)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 82)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_sizesContext extends ParserRuleContext {
		public List<Field_image_sizeContext> field_image_size() {
			return getRuleContexts(Field_image_sizeContext.class);
		}
		public Field_image_sizeContext field_image_size(int i) {
			return getRuleContext(Field_image_sizeContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public Field_image_sizesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_sizes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_sizes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_sizes(this);
		}
	}

	public final Field_image_sizesContext field_image_sizes() throws RecognitionException {
		Field_image_sizesContext _localctx = new Field_image_sizesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_field_image_sizes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			field_image_size();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(935);
				match(COMA);
				setState(936);
				field_image_size();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_sizeContext extends ParserRuleContext {
		public Field_image_size_nameContext field_image_size_name() {
			return getRuleContext(Field_image_size_nameContext.class,0);
		}
		public Field_image_size_dimensionsContext field_image_size_dimensions() {
			return getRuleContext(Field_image_size_dimensionsContext.class,0);
		}
		public Field_image_filtersContext field_image_filters() {
			return getRuleContext(Field_image_filtersContext.class,0);
		}
		public Field_image_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_size(this);
		}
	}

	public final Field_image_sizeContext field_image_size() throws RecognitionException {
		Field_image_sizeContext _localctx = new Field_image_sizeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_field_image_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			field_image_size_name();
			setState(943);
			field_image_size_dimensions();
			setState(944);
			field_image_filters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_size_dimensionsContext extends ParserRuleContext {
		public TerminalNode SIZE2D() { return getToken(ZmeiLangParser.SIZE2D, 0); }
		public Field_image_size_dimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_size_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_size_dimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_size_dimensions(this);
		}
	}

	public final Field_image_size_dimensionsContext field_image_size_dimensions() throws RecognitionException {
		Field_image_size_dimensionsContext _localctx = new Field_image_size_dimensionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_field_image_size_dimensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(SIZE2D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_size_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public Field_image_size_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_size_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_size_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_size_name(this);
		}
	}

	public final Field_image_size_nameContext field_image_size_name() throws RecognitionException {
		Field_image_size_nameContext _localctx = new Field_image_size_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_field_image_size_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			id_or_kw();
			setState(949);
			match(EQUALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_filtersContext extends ParserRuleContext {
		public List<Field_image_filterContext> field_image_filter() {
			return getRuleContexts(Field_image_filterContext.class);
		}
		public Field_image_filterContext field_image_filter(int i) {
			return getRuleContext(Field_image_filterContext.class,i);
		}
		public Field_image_filtersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_filters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_filters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_filters(this);
		}
	}

	public final Field_image_filtersContext field_image_filters() throws RecognitionException {
		Field_image_filtersContext _localctx = new Field_image_filtersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_field_image_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(951);
				field_image_filter();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_image_filterContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(ZmeiLangParser.PIPE, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Field_image_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_image_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_image_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_image_filter(this);
		}
	}

	public final Field_image_filterContext field_image_filter() throws RecognitionException {
		Field_image_filterContext _localctx = new Field_image_filterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_field_image_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(PIPE);
			setState(958);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_relationContext extends ParserRuleContext {
		public Field_relation_typeContext field_relation_type() {
			return getRuleContext(Field_relation_typeContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Field_relation_target_refContext field_relation_target_ref() {
			return getRuleContext(Field_relation_target_refContext.class,0);
		}
		public Field_relation_target_classContext field_relation_target_class() {
			return getRuleContext(Field_relation_target_classContext.class,0);
		}
		public Field_relation_related_nameContext field_relation_related_name() {
			return getRuleContext(Field_relation_related_nameContext.class,0);
		}
		public Field_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_relation(this);
		}
	}

	public final Field_relationContext field_relation() throws RecognitionException {
		Field_relationContext _localctx = new Field_relationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_field_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			field_relation_type();
			setState(961);
			match(BRACE_OPEN);
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(962);
				field_relation_target_ref();
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(963);
				field_relation_target_class();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(966);
				field_relation_related_name();
				}
			}

			setState(969);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_relation_typeContext extends ParserRuleContext {
		public TerminalNode COL_FIELD_TYPE_ONE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_ONE, 0); }
		public TerminalNode COL_FIELD_TYPE_ONE2ONE() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_ONE2ONE, 0); }
		public TerminalNode COL_FIELD_TYPE_MANY() { return getToken(ZmeiLangParser.COL_FIELD_TYPE_MANY, 0); }
		public Field_relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_relation_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_relation_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_relation_type(this);
		}
	}

	public final Field_relation_typeContext field_relation_type() throws RecognitionException {
		Field_relation_typeContext _localctx = new Field_relation_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_field_relation_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (COL_FIELD_TYPE_ONE - 92)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 92)) | (1L << (COL_FIELD_TYPE_MANY - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_relation_target_refContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ZmeiLangParser.HASH, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Field_relation_target_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_relation_target_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_relation_target_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_relation_target_ref(this);
		}
	}

	public final Field_relation_target_refContext field_relation_target_ref() throws RecognitionException {
		Field_relation_target_refContext _localctx = new Field_relation_target_refContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_field_relation_target_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(HASH);
			setState(974);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_relation_target_classContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public Field_relation_target_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_relation_target_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_relation_target_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_relation_target_class(this);
		}
	}

	public final Field_relation_target_classContext field_relation_target_class() throws RecognitionException {
		Field_relation_target_classContext _localctx = new Field_relation_target_classContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_field_relation_target_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_relation_related_nameContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(ZmeiLangParser.DASH, 0); }
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Field_relation_related_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_relation_related_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterField_relation_related_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitField_relation_related_name(this);
		}
	}

	public final Field_relation_related_nameContext field_relation_related_name() throws RecognitionException {
		Field_relation_related_nameContext _localctx = new Field_relation_related_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_field_relation_related_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(DASH);
			setState(979);
			match(GT);
			setState(980);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_annotationContext extends ParserRuleContext {
		public An_adminContext an_admin() {
			return getRuleContext(An_adminContext.class,0);
		}
		public An_treeContext an_tree() {
			return getRuleContext(An_treeContext.class,0);
		}
		public An_date_treeContext an_date_tree() {
			return getRuleContext(An_date_treeContext.class,0);
		}
		public An_mixinContext an_mixin() {
			return getRuleContext(An_mixinContext.class,0);
		}
		public An_m2m_changedContext an_m2m_changed() {
			return getRuleContext(An_m2m_changedContext.class,0);
		}
		public An_post_deleteContext an_post_delete() {
			return getRuleContext(An_post_deleteContext.class,0);
		}
		public An_pre_deleteContext an_pre_delete() {
			return getRuleContext(An_pre_deleteContext.class,0);
		}
		public An_post_saveContext an_post_save() {
			return getRuleContext(An_post_saveContext.class,0);
		}
		public An_pre_saveContext an_pre_save() {
			return getRuleContext(An_pre_saveContext.class,0);
		}
		public An_cleanContext an_clean() {
			return getRuleContext(An_cleanContext.class,0);
		}
		public An_apiContext an_api() {
			return getRuleContext(An_apiContext.class,0);
		}
		public An_restContext an_rest() {
			return getRuleContext(An_restContext.class,0);
		}
		public An_orderContext an_order() {
			return getRuleContext(An_orderContext.class,0);
		}
		public An_sortableContext an_sortable() {
			return getRuleContext(An_sortableContext.class,0);
		}
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Model_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterModel_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitModel_annotation(this);
		}
	}

	public final Model_annotationContext model_annotation() throws RecognitionException {
		Model_annotationContext _localctx = new Model_annotationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_model_annotation);
		try {
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AN_ADMIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				an_admin();
				}
				break;
			case AN_TREE:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				an_tree();
				}
				break;
			case AN_DATE_TREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				an_date_tree();
				}
				break;
			case AN_MIXIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				an_mixin();
				}
				break;
			case AN_M2M_CHANGED:
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				an_m2m_changed();
				}
				break;
			case AN_POST_DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(987);
				an_post_delete();
				}
				break;
			case AN_PRE_DELETE:
				enterOuterAlt(_localctx, 7);
				{
				setState(988);
				an_pre_delete();
				}
				break;
			case AN_POST_SAVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(989);
				an_post_save();
				}
				break;
			case AN_PRE_SAVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(990);
				an_pre_save();
				}
				break;
			case AN_CLEAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(991);
				an_clean();
				}
				break;
			case AN_API:
				enterOuterAlt(_localctx, 11);
				{
				setState(992);
				an_api();
				}
				break;
			case AN_REST:
				enterOuterAlt(_localctx, 12);
				{
				setState(993);
				an_rest();
				}
				break;
			case AN_ORDER:
				enterOuterAlt(_localctx, 13);
				{
				setState(994);
				an_order();
				}
				break;
			case AN_SORTABLE:
				enterOuterAlt(_localctx, 14);
				{
				setState(995);
				an_sortable();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 15);
				{
				setState(996);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_sortableContext extends ParserRuleContext {
		public TerminalNode AN_SORTABLE() { return getToken(ZmeiLangParser.AN_SORTABLE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_sortable_field_nameContext an_sortable_field_name() {
			return getRuleContext(An_sortable_field_nameContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_sortableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_sortable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_sortable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_sortable(this);
		}
	}

	public final An_sortableContext an_sortable() throws RecognitionException {
		An_sortableContext _localctx = new An_sortableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_an_sortable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(AN_SORTABLE);
			setState(1000);
			match(BRACE_OPEN);
			setState(1001);
			an_sortable_field_name();
			setState(1002);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_sortable_field_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_sortable_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_sortable_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_sortable_field_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_sortable_field_name(this);
		}
	}

	public final An_sortable_field_nameContext an_sortable_field_name() throws RecognitionException {
		An_sortable_field_nameContext _localctx = new An_sortable_field_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_an_sortable_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_orderContext extends ParserRuleContext {
		public TerminalNode AN_ORDER() { return getToken(ZmeiLangParser.AN_ORDER, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_order_fieldsContext an_order_fields() {
			return getRuleContext(An_order_fieldsContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_order(this);
		}
	}

	public final An_orderContext an_order() throws RecognitionException {
		An_orderContext _localctx = new An_orderContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_an_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(AN_ORDER);
			setState(1007);
			match(BRACE_OPEN);
			setState(1008);
			an_order_fields();
			setState(1009);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_order_fieldsContext extends ParserRuleContext {
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_order_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_order_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_order_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_order_fields(this);
		}
	}

	public final An_order_fieldsContext an_order_fields() throws RecognitionException {
		An_order_fieldsContext _localctx = new An_order_fieldsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_an_order_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			id_or_kw();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1012);
				match(COMA);
				setState(1013);
				id_or_kw();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_restContext extends ParserRuleContext {
		public TerminalNode AN_REST() { return getToken(ZmeiLangParser.AN_REST, 0); }
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_rest_descriptorContext an_rest_descriptor() {
			return getRuleContext(An_rest_descriptorContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_rest_configContext an_rest_config() {
			return getRuleContext(An_rest_configContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest(this);
		}
	}

	public final An_restContext an_rest() throws RecognitionException {
		An_restContext _localctx = new An_restContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_an_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(AN_REST);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1020);
				match(DOT);
				setState(1021);
				an_rest_descriptor();
				}
			}

			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1024);
				match(BRACE_OPEN);
				setState(1025);
				an_rest_config();
				setState(1026);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_configContext extends ParserRuleContext {
		public An_rest_main_partContext an_rest_main_part() {
			return getRuleContext(An_rest_main_partContext.class,0);
		}
		public List<An_rest_inlineContext> an_rest_inline() {
			return getRuleContexts(An_rest_inlineContext.class);
		}
		public An_rest_inlineContext an_rest_inline(int i) {
			return getRuleContext(An_rest_inlineContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_rest_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_config(this);
		}
	}

	public final An_rest_configContext an_rest_config() throws RecognitionException {
		An_rest_configContext _localctx = new An_rest_configContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_an_rest_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			an_rest_main_part();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (KW_INLINE - 54)) | (1L << (NL - 54)) | (1L << (COMA - 54)))) != 0)) {
				{
				setState(1034);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_INLINE:
					{
					setState(1031);
					an_rest_inline();
					}
					break;
				case NL:
					{
					setState(1032);
					match(NL);
					}
					break;
				case COMA:
					{
					setState(1033);
					match(COMA);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_main_partContext extends ParserRuleContext {
		public List<An_rest_fieldsContext> an_rest_fields() {
			return getRuleContexts(An_rest_fieldsContext.class);
		}
		public An_rest_fieldsContext an_rest_fields(int i) {
			return getRuleContext(An_rest_fieldsContext.class,i);
		}
		public List<An_rest_i18nContext> an_rest_i18n() {
			return getRuleContexts(An_rest_i18nContext.class);
		}
		public An_rest_i18nContext an_rest_i18n(int i) {
			return getRuleContext(An_rest_i18nContext.class,i);
		}
		public List<An_rest_authContext> an_rest_auth() {
			return getRuleContexts(An_rest_authContext.class);
		}
		public An_rest_authContext an_rest_auth(int i) {
			return getRuleContext(An_rest_authContext.class,i);
		}
		public List<An_rest_queryContext> an_rest_query() {
			return getRuleContexts(An_rest_queryContext.class);
		}
		public An_rest_queryContext an_rest_query(int i) {
			return getRuleContext(An_rest_queryContext.class,i);
		}
		public List<An_rest_on_createContext> an_rest_on_create() {
			return getRuleContexts(An_rest_on_createContext.class);
		}
		public An_rest_on_createContext an_rest_on_create(int i) {
			return getRuleContext(An_rest_on_createContext.class,i);
		}
		public List<An_rest_read_onlyContext> an_rest_read_only() {
			return getRuleContexts(An_rest_read_onlyContext.class);
		}
		public An_rest_read_onlyContext an_rest_read_only(int i) {
			return getRuleContext(An_rest_read_onlyContext.class,i);
		}
		public List<An_rest_user_fieldContext> an_rest_user_field() {
			return getRuleContexts(An_rest_user_fieldContext.class);
		}
		public An_rest_user_fieldContext an_rest_user_field(int i) {
			return getRuleContext(An_rest_user_fieldContext.class,i);
		}
		public List<An_rest_annotateContext> an_rest_annotate() {
			return getRuleContexts(An_rest_annotateContext.class);
		}
		public An_rest_annotateContext an_rest_annotate(int i) {
			return getRuleContext(An_rest_annotateContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_rest_main_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_main_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_main_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_main_part(this);
		}
	}

	public final An_rest_main_partContext an_rest_main_part() throws RecognitionException {
		An_rest_main_partContext _localctx = new An_rest_main_partContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_an_rest_main_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1049);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_FIELDS:
						{
						setState(1039);
						an_rest_fields();
						}
						break;
					case KW_I18N:
						{
						setState(1040);
						an_rest_i18n();
						}
						break;
					case KW_AUTH:
						{
						setState(1041);
						an_rest_auth();
						}
						break;
					case KW_QUERY:
						{
						setState(1042);
						an_rest_query();
						}
						break;
					case KW_ON_CREATE:
						{
						setState(1043);
						an_rest_on_create();
						}
						break;
					case KW_READ_ONLY:
						{
						setState(1044);
						an_rest_read_only();
						}
						break;
					case KW_USER_FIELD:
						{
						setState(1045);
						an_rest_user_field();
						}
						break;
					case KW_ANNOTATE:
						{
						setState(1046);
						an_rest_annotate();
						}
						break;
					case NL:
						{
						setState(1047);
						match(NL);
						}
						break;
					case COMA:
						{
						setState(1048);
						match(COMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_rest_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_descriptor(this);
		}
	}

	public final An_rest_descriptorContext an_rest_descriptor() throws RecognitionException {
		An_rest_descriptorContext _localctx = new An_rest_descriptorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_an_rest_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_i18nContext extends ParserRuleContext {
		public TerminalNode KW_I18N() { return getToken(ZmeiLangParser.KW_I18N, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public TerminalNode BOOL() { return getToken(ZmeiLangParser.BOOL, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_i18nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_i18n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_i18n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_i18n(this);
		}
	}

	public final An_rest_i18nContext an_rest_i18n() throws RecognitionException {
		An_rest_i18nContext _localctx = new An_rest_i18nContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_an_rest_i18n);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(KW_I18N);
			setState(1057);
			match(COLON);
			setState(1058);
			match(BOOL);
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1059);
					match(NL);
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_queryContext extends ParserRuleContext {
		public TerminalNode KW_QUERY() { return getToken(ZmeiLangParser.KW_QUERY, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_query(this);
		}
	}

	public final An_rest_queryContext an_rest_query() throws RecognitionException {
		An_rest_queryContext _localctx = new An_rest_queryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_an_rest_query);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(KW_QUERY);
			setState(1066);
			python_code();
			setState(1070);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1067);
					match(NL);
					}
					} 
				}
				setState(1072);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_on_createContext extends ParserRuleContext {
		public TerminalNode KW_ON_CREATE() { return getToken(ZmeiLangParser.KW_ON_CREATE, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_on_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_on_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_on_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_on_create(this);
		}
	}

	public final An_rest_on_createContext an_rest_on_create() throws RecognitionException {
		An_rest_on_createContext _localctx = new An_rest_on_createContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_an_rest_on_create);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(KW_ON_CREATE);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1074);
				match(COLON);
				}
			}

			setState(1077);
			python_code();
			setState(1081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1078);
					match(NL);
					}
					} 
				}
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_read_onlyContext extends ParserRuleContext {
		public TerminalNode KW_READ_ONLY() { return getToken(ZmeiLangParser.KW_READ_ONLY, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_read_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_read_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_read_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_read_only(this);
		}
	}

	public final An_rest_read_onlyContext an_rest_read_only() throws RecognitionException {
		An_rest_read_onlyContext _localctx = new An_rest_read_onlyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_an_rest_read_only);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(KW_READ_ONLY);
			setState(1085);
			match(COLON);
			setState(1086);
			field_list_expr();
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1087);
					match(NL);
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_user_fieldContext extends ParserRuleContext {
		public TerminalNode KW_USER_FIELD() { return getToken(ZmeiLangParser.KW_USER_FIELD, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_user_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_user_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_user_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_user_field(this);
		}
	}

	public final An_rest_user_fieldContext an_rest_user_field() throws RecognitionException {
		An_rest_user_fieldContext _localctx = new An_rest_user_fieldContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_an_rest_user_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(KW_USER_FIELD);
			setState(1094);
			match(COLON);
			setState(1095);
			id_or_kw();
			setState(1099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1096);
					match(NL);
					}
					} 
				}
				setState(1101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_fieldsContext extends ParserRuleContext {
		public TerminalNode KW_FIELDS() { return getToken(ZmeiLangParser.KW_FIELDS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public An_rest_fields_write_modeContext an_rest_fields_write_mode() {
			return getRuleContext(An_rest_fields_write_modeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_fields(this);
		}
	}

	public final An_rest_fieldsContext an_rest_fields() throws RecognitionException {
		An_rest_fieldsContext _localctx = new An_rest_fieldsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_an_rest_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(KW_FIELDS);
			setState(1103);
			match(COLON);
			setState(1104);
			field_list_expr();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQ_BRACE_OPEN) {
				{
				setState(1105);
				an_rest_fields_write_mode();
				}
			}

			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1108);
					match(NL);
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_fields_write_modeContext extends ParserRuleContext {
		public Write_mode_exprContext write_mode_expr() {
			return getRuleContext(Write_mode_exprContext.class,0);
		}
		public An_rest_fields_write_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_fields_write_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_fields_write_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_fields_write_mode(this);
		}
	}

	public final An_rest_fields_write_modeContext an_rest_fields_write_mode() throws RecognitionException {
		An_rest_fields_write_modeContext _localctx = new An_rest_fields_write_modeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_an_rest_fields_write_mode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			write_mode_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_authContext extends ParserRuleContext {
		public TerminalNode KW_AUTH() { return getToken(ZmeiLangParser.KW_AUTH, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public List<An_rest_auth_typeContext> an_rest_auth_type() {
			return getRuleContexts(An_rest_auth_typeContext.class);
		}
		public An_rest_auth_typeContext an_rest_auth_type(int i) {
			return getRuleContext(An_rest_auth_typeContext.class,i);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_rest_authContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_auth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_auth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_auth(this);
		}
	}

	public final An_rest_authContext an_rest_auth() throws RecognitionException {
		An_rest_authContext _localctx = new An_rest_authContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_an_rest_auth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(KW_AUTH);
			setState(1117);
			match(BRACE_OPEN);
			setState(1118);
			an_rest_auth_type();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1119);
				match(COMA);
				setState(1120);
				an_rest_auth_type();
				}
				}
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1126);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_auth_typeContext extends ParserRuleContext {
		public TerminalNode KW_AUTH_TYPE() { return getToken(ZmeiLangParser.KW_AUTH_TYPE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_rest_auth_token_modelContext an_rest_auth_token_model() {
			return getRuleContext(An_rest_auth_token_modelContext.class,0);
		}
		public An_rest_auth_token_classContext an_rest_auth_token_class() {
			return getRuleContext(An_rest_auth_token_classContext.class,0);
		}
		public An_rest_auth_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_auth_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_auth_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_auth_type(this);
		}
	}

	public final An_rest_auth_typeContext an_rest_auth_type() throws RecognitionException {
		An_rest_auth_typeContext _localctx = new An_rest_auth_typeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_an_rest_auth_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(KW_AUTH_TYPE);
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(1129);
				match(COLON);
				setState(1130);
				an_rest_auth_token_model();
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				{
				setState(1131);
				an_rest_auth_token_class();
				}
				break;
			case BRACE_CLOSE:
			case COMA:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_auth_token_modelContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ZmeiLangParser.HASH, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_rest_auth_token_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_auth_token_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_auth_token_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_auth_token_model(this);
		}
	}

	public final An_rest_auth_token_modelContext an_rest_auth_token_model() throws RecognitionException {
		An_rest_auth_token_modelContext _localctx = new An_rest_auth_token_modelContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_an_rest_auth_token_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(HASH);
			setState(1135);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_auth_token_classContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public An_rest_auth_token_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_auth_token_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_auth_token_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_auth_token_class(this);
		}
	}

	public final An_rest_auth_token_classContext an_rest_auth_token_class() throws RecognitionException {
		An_rest_auth_token_classContext _localctx = new An_rest_auth_token_classContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_an_rest_auth_token_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_annotateContext extends ParserRuleContext {
		public TerminalNode KW_ANNOTATE() { return getToken(ZmeiLangParser.KW_ANNOTATE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_rest_annotate_countContext an_rest_annotate_count() {
			return getRuleContext(An_rest_annotate_countContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_annotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_annotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_annotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_annotate(this);
		}
	}

	public final An_rest_annotateContext an_rest_annotate() throws RecognitionException {
		An_rest_annotateContext _localctx = new An_rest_annotateContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_an_rest_annotate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(KW_ANNOTATE);
			setState(1140);
			match(COLON);
			setState(1141);
			an_rest_annotate_count();
			setState(1145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1142);
					match(NL);
					}
					} 
				}
				setState(1147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_annotate_countContext extends ParserRuleContext {
		public TerminalNode KW_COUNT() { return getToken(ZmeiLangParser.KW_COUNT, 0); }
		public An_rest_annotate_count_fieldContext an_rest_annotate_count_field() {
			return getRuleContext(An_rest_annotate_count_fieldContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(ZmeiLangParser.KW_AS, 0); }
		public An_rest_annotate_count_aliasContext an_rest_annotate_count_alias() {
			return getRuleContext(An_rest_annotate_count_aliasContext.class,0);
		}
		public An_rest_annotate_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_annotate_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_annotate_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_annotate_count(this);
		}
	}

	public final An_rest_annotate_countContext an_rest_annotate_count() throws RecognitionException {
		An_rest_annotate_countContext _localctx = new An_rest_annotate_countContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_an_rest_annotate_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(KW_COUNT);
			setState(1149);
			an_rest_annotate_count_field();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1150);
				match(KW_AS);
				setState(1151);
				an_rest_annotate_count_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_annotate_count_fieldContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_rest_annotate_count_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_annotate_count_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_annotate_count_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_annotate_count_field(this);
		}
	}

	public final An_rest_annotate_count_fieldContext an_rest_annotate_count_field() throws RecognitionException {
		An_rest_annotate_count_fieldContext _localctx = new An_rest_annotate_count_fieldContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_an_rest_annotate_count_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_annotate_count_aliasContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_rest_annotate_count_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_annotate_count_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_annotate_count_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_annotate_count_alias(this);
		}
	}

	public final An_rest_annotate_count_aliasContext an_rest_annotate_count_alias() throws RecognitionException {
		An_rest_annotate_count_aliasContext _localctx = new An_rest_annotate_count_aliasContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_an_rest_annotate_count_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_inlineContext extends ParserRuleContext {
		public TerminalNode KW_INLINE() { return getToken(ZmeiLangParser.KW_INLINE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<An_rest_inline_declContext> an_rest_inline_decl() {
			return getRuleContexts(An_rest_inline_declContext.class);
		}
		public An_rest_inline_declContext an_rest_inline_decl(int i) {
			return getRuleContext(An_rest_inline_declContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_rest_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_inline(this);
		}
	}

	public final An_rest_inlineContext an_rest_inline() throws RecognitionException {
		An_rest_inlineContext _localctx = new An_rest_inlineContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_an_rest_inline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(KW_INLINE);
			setState(1159);
			match(COLON);
			setState(1163); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1163);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WRITE_MODE:
					case BOOL:
					case KW_THEME:
					case KW_PAGE:
					case KW_LINK_SUFFIX:
					case KW_URL_PREFIX:
					case KW_CAN_EDIT:
					case KW_OBJECT_EXPR:
					case KW_BLOCK:
					case KW_ITEM_NAME:
					case KW_PK_PARAM:
					case KW_LIST_FIELDS:
					case KW_DELETE:
					case KW_EDIT:
					case KW_CREATE:
					case KW_DETAIL:
					case KW_SKIP:
					case KW_FROM:
					case KW_POLY_LIST:
					case KW_CSS:
					case KW_JS:
					case KW_INLINE_TYPE:
					case KW_AUTH_TYPE:
					case KW_INLINE:
					case KW_TYPE:
					case KW_USER_FIELD:
					case KW_ANNOTATE:
					case KW_ON_CREATE:
					case KW_QUERY:
					case KW_AUTH:
					case KW_COUNT:
					case KW_I18N:
					case KW_EXTRA:
					case KW_TABS:
					case KW_LIST:
					case KW_READ_ONLY:
					case KW_LIST_EDITABLE:
					case KW_LIST_FILTER:
					case KW_LIST_SEARCH:
					case KW_FIELDS:
					case KW_IMPORT:
					case KW_AS:
					case COL_FIELD_TYPE_LONGTEXT:
					case COL_FIELD_TYPE_HTML:
					case COL_FIELD_TYPE_HTML_MEDIA:
					case COL_FIELD_TYPE_FLOAT:
					case COL_FIELD_TYPE_DECIMAL:
					case COL_FIELD_TYPE_DATE:
					case COL_FIELD_TYPE_DATETIME:
					case COL_FIELD_TYPE_CREATE_TIME:
					case COL_FIELD_TYPE_UPDATE_TIME:
					case COL_FIELD_TYPE_IMAGE:
					case COL_FIELD_TYPE_FILE:
					case COL_FIELD_TYPE_FILER_IMAGE:
					case COL_FIELD_TYPE_FILER_FILE:
					case COL_FIELD_TYPE_FILER_FOLDER:
					case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
					case COL_FIELD_TYPE_TEXT:
					case COL_FIELD_TYPE_INT:
					case COL_FIELD_TYPE_SLUG:
					case COL_FIELD_TYPE_BOOL:
					case COL_FIELD_TYPE_ONE:
					case COL_FIELD_TYPE_ONE2ONE:
					case COL_FIELD_TYPE_MANY:
					case COL_FIELD_CHOICES:
					case ID:
						{
						setState(1160);
						an_rest_inline_decl();
						}
						break;
					case COMA:
						{
						setState(1161);
						match(COMA);
						}
						break;
					case NL:
						{
						setState(1162);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1165); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_inline_declContext extends ParserRuleContext {
		public An_rest_inline_nameContext an_rest_inline_name() {
			return getRuleContext(An_rest_inline_nameContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_rest_configContext an_rest_config() {
			return getRuleContext(An_rest_configContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_rest_inline_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_inline_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_inline_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_inline_decl(this);
		}
	}

	public final An_rest_inline_declContext an_rest_inline_decl() throws RecognitionException {
		An_rest_inline_declContext _localctx = new An_rest_inline_declContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_an_rest_inline_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			an_rest_inline_name();
			setState(1168);
			match(BRACE_OPEN);
			setState(1169);
			an_rest_config();
			setState(1170);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_rest_inline_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_rest_inline_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_rest_inline_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_rest_inline_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_rest_inline_name(this);
		}
	}

	public final An_rest_inline_nameContext an_rest_inline_name() throws RecognitionException {
		An_rest_inline_nameContext _localctx = new An_rest_inline_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_an_rest_inline_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_apiContext extends ParserRuleContext {
		public TerminalNode AN_API() { return getToken(ZmeiLangParser.AN_API, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_api_allContext an_api_all() {
			return getRuleContext(An_api_allContext.class,0);
		}
		public List<An_api_nameContext> an_api_name() {
			return getRuleContexts(An_api_nameContext.class);
		}
		public An_api_nameContext an_api_name(int i) {
			return getRuleContext(An_api_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_apiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_api; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_api(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_api(this);
		}
	}

	public final An_apiContext an_api() throws RecognitionException {
		An_apiContext _localctx = new An_apiContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_an_api);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(AN_API);
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1175);
				match(BRACE_OPEN);
				setState(1185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1176);
					an_api_all();
					}
					break;
				case WRITE_MODE:
				case BOOL:
				case KW_THEME:
				case KW_PAGE:
				case KW_LINK_SUFFIX:
				case KW_URL_PREFIX:
				case KW_CAN_EDIT:
				case KW_OBJECT_EXPR:
				case KW_BLOCK:
				case KW_ITEM_NAME:
				case KW_PK_PARAM:
				case KW_LIST_FIELDS:
				case KW_DELETE:
				case KW_EDIT:
				case KW_CREATE:
				case KW_DETAIL:
				case KW_SKIP:
				case KW_FROM:
				case KW_POLY_LIST:
				case KW_CSS:
				case KW_JS:
				case KW_INLINE_TYPE:
				case KW_AUTH_TYPE:
				case KW_INLINE:
				case KW_TYPE:
				case KW_USER_FIELD:
				case KW_ANNOTATE:
				case KW_ON_CREATE:
				case KW_QUERY:
				case KW_AUTH:
				case KW_COUNT:
				case KW_I18N:
				case KW_EXTRA:
				case KW_TABS:
				case KW_LIST:
				case KW_READ_ONLY:
				case KW_LIST_EDITABLE:
				case KW_LIST_FILTER:
				case KW_LIST_SEARCH:
				case KW_FIELDS:
				case KW_IMPORT:
				case KW_AS:
				case COL_FIELD_TYPE_LONGTEXT:
				case COL_FIELD_TYPE_HTML:
				case COL_FIELD_TYPE_HTML_MEDIA:
				case COL_FIELD_TYPE_FLOAT:
				case COL_FIELD_TYPE_DECIMAL:
				case COL_FIELD_TYPE_DATE:
				case COL_FIELD_TYPE_DATETIME:
				case COL_FIELD_TYPE_CREATE_TIME:
				case COL_FIELD_TYPE_UPDATE_TIME:
				case COL_FIELD_TYPE_IMAGE:
				case COL_FIELD_TYPE_FILE:
				case COL_FIELD_TYPE_FILER_IMAGE:
				case COL_FIELD_TYPE_FILER_FILE:
				case COL_FIELD_TYPE_FILER_FOLDER:
				case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
				case COL_FIELD_TYPE_TEXT:
				case COL_FIELD_TYPE_INT:
				case COL_FIELD_TYPE_SLUG:
				case COL_FIELD_TYPE_BOOL:
				case COL_FIELD_TYPE_ONE:
				case COL_FIELD_TYPE_ONE2ONE:
				case COL_FIELD_TYPE_MANY:
				case COL_FIELD_CHOICES:
				case ID:
					{
					setState(1177);
					an_api_name();
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(1178);
						match(COMA);
						setState(1179);
						an_api_name();
						}
						}
						setState(1184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1187);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_api_allContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ZmeiLangParser.STAR, 0); }
		public An_api_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_api_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_api_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_api_all(this);
		}
	}

	public final An_api_allContext an_api_all() throws RecognitionException {
		An_api_allContext _localctx = new An_api_allContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_an_api_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_api_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_api_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_api_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_api_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_api_name(this);
		}
	}

	public final An_api_nameContext an_api_name() throws RecognitionException {
		An_api_nameContext _localctx = new An_api_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_an_api_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_cleanContext extends ParserRuleContext {
		public TerminalNode AN_CLEAN() { return getToken(ZmeiLangParser.AN_CLEAN, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_cleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_clean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_clean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_clean(this);
		}
	}

	public final An_cleanContext an_clean() throws RecognitionException {
		An_cleanContext _localctx = new An_cleanContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_an_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(AN_CLEAN);
			setState(1196);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_pre_saveContext extends ParserRuleContext {
		public TerminalNode AN_PRE_SAVE() { return getToken(ZmeiLangParser.AN_PRE_SAVE, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_pre_saveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_pre_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_pre_save(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_pre_save(this);
		}
	}

	public final An_pre_saveContext an_pre_save() throws RecognitionException {
		An_pre_saveContext _localctx = new An_pre_saveContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_an_pre_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(AN_PRE_SAVE);
			setState(1199);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_post_saveContext extends ParserRuleContext {
		public TerminalNode AN_POST_SAVE() { return getToken(ZmeiLangParser.AN_POST_SAVE, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_post_saveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_post_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_post_save(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_post_save(this);
		}
	}

	public final An_post_saveContext an_post_save() throws RecognitionException {
		An_post_saveContext _localctx = new An_post_saveContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_an_post_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(AN_POST_SAVE);
			setState(1202);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_pre_deleteContext extends ParserRuleContext {
		public TerminalNode AN_PRE_DELETE() { return getToken(ZmeiLangParser.AN_PRE_DELETE, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_pre_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_pre_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_pre_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_pre_delete(this);
		}
	}

	public final An_pre_deleteContext an_pre_delete() throws RecognitionException {
		An_pre_deleteContext _localctx = new An_pre_deleteContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_an_pre_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(AN_PRE_DELETE);
			setState(1205);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_post_deleteContext extends ParserRuleContext {
		public TerminalNode AN_POST_DELETE() { return getToken(ZmeiLangParser.AN_POST_DELETE, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_post_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_post_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_post_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_post_delete(this);
		}
	}

	public final An_post_deleteContext an_post_delete() throws RecognitionException {
		An_post_deleteContext _localctx = new An_post_deleteContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_an_post_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(AN_POST_DELETE);
			setState(1208);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_m2m_changedContext extends ParserRuleContext {
		public TerminalNode AN_M2M_CHANGED() { return getToken(ZmeiLangParser.AN_M2M_CHANGED, 0); }
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public An_m2m_changedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_m2m_changed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_m2m_changed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_m2m_changed(this);
		}
	}

	public final An_m2m_changedContext an_m2m_changed() throws RecognitionException {
		An_m2m_changedContext _localctx = new An_m2m_changedContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_an_m2m_changed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(AN_M2M_CHANGED);
			setState(1211);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_mixinContext extends ParserRuleContext {
		public TerminalNode AN_MIXIN() { return getToken(ZmeiLangParser.AN_MIXIN, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_mixinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_mixin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_mixin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_mixin(this);
		}
	}

	public final An_mixinContext an_mixin() throws RecognitionException {
		An_mixinContext _localctx = new An_mixinContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_an_mixin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(AN_MIXIN);
			{
			setState(1214);
			match(BRACE_OPEN);
			setState(1215);
			classname();
			setState(1216);
			match(BRACE_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_date_treeContext extends ParserRuleContext {
		public TerminalNode AN_DATE_TREE() { return getToken(ZmeiLangParser.AN_DATE_TREE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_date_tree_fieldContext an_date_tree_field() {
			return getRuleContext(An_date_tree_fieldContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_date_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_date_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_date_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_date_tree(this);
		}
	}

	public final An_date_treeContext an_date_tree() throws RecognitionException {
		An_date_treeContext _localctx = new An_date_treeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_an_date_tree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(AN_DATE_TREE);
			{
			setState(1219);
			match(BRACE_OPEN);
			setState(1220);
			an_date_tree_field();
			setState(1221);
			match(BRACE_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_date_tree_fieldContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_date_tree_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_date_tree_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_date_tree_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_date_tree_field(this);
		}
	}

	public final An_date_tree_fieldContext an_date_tree_field() throws RecognitionException {
		An_date_tree_fieldContext _localctx = new An_date_tree_fieldContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_an_date_tree_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_treeContext extends ParserRuleContext {
		public TerminalNode AN_TREE() { return getToken(ZmeiLangParser.AN_TREE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_tree_polyContext an_tree_poly() {
			return getRuleContext(An_tree_polyContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_tree(this);
		}
	}

	public final An_treeContext an_tree() throws RecognitionException {
		An_treeContext _localctx = new An_treeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_an_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(AN_TREE);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1226);
				match(BRACE_OPEN);
				setState(1227);
				an_tree_poly();
				setState(1228);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_tree_polyContext extends ParserRuleContext {
		public TerminalNode KW_POLY_LIST() { return getToken(ZmeiLangParser.KW_POLY_LIST, 0); }
		public An_tree_polyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_tree_poly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_tree_poly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_tree_poly(this);
		}
	}

	public final An_tree_polyContext an_tree_poly() throws RecognitionException {
		An_tree_polyContext _localctx = new An_tree_polyContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_an_tree_poly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(KW_POLY_LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_adminContext extends ParserRuleContext {
		public TerminalNode AN_ADMIN() { return getToken(ZmeiLangParser.AN_ADMIN, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<An_admin_listContext> an_admin_list() {
			return getRuleContexts(An_admin_listContext.class);
		}
		public An_admin_listContext an_admin_list(int i) {
			return getRuleContext(An_admin_listContext.class,i);
		}
		public List<An_admin_read_onlyContext> an_admin_read_only() {
			return getRuleContexts(An_admin_read_onlyContext.class);
		}
		public An_admin_read_onlyContext an_admin_read_only(int i) {
			return getRuleContext(An_admin_read_onlyContext.class,i);
		}
		public List<An_admin_list_editableContext> an_admin_list_editable() {
			return getRuleContexts(An_admin_list_editableContext.class);
		}
		public An_admin_list_editableContext an_admin_list_editable(int i) {
			return getRuleContext(An_admin_list_editableContext.class,i);
		}
		public List<An_admin_list_filterContext> an_admin_list_filter() {
			return getRuleContexts(An_admin_list_filterContext.class);
		}
		public An_admin_list_filterContext an_admin_list_filter(int i) {
			return getRuleContext(An_admin_list_filterContext.class,i);
		}
		public List<An_admin_list_searchContext> an_admin_list_search() {
			return getRuleContexts(An_admin_list_searchContext.class);
		}
		public An_admin_list_searchContext an_admin_list_search(int i) {
			return getRuleContext(An_admin_list_searchContext.class,i);
		}
		public List<An_admin_fieldsContext> an_admin_fields() {
			return getRuleContexts(An_admin_fieldsContext.class);
		}
		public An_admin_fieldsContext an_admin_fields(int i) {
			return getRuleContext(An_admin_fieldsContext.class,i);
		}
		public List<An_admin_tabsContext> an_admin_tabs() {
			return getRuleContexts(An_admin_tabsContext.class);
		}
		public An_admin_tabsContext an_admin_tabs(int i) {
			return getRuleContext(An_admin_tabsContext.class,i);
		}
		public List<An_admin_inlinesContext> an_admin_inlines() {
			return getRuleContexts(An_admin_inlinesContext.class);
		}
		public An_admin_inlinesContext an_admin_inlines(int i) {
			return getRuleContext(An_admin_inlinesContext.class,i);
		}
		public List<An_admin_cssContext> an_admin_css() {
			return getRuleContexts(An_admin_cssContext.class);
		}
		public An_admin_cssContext an_admin_css(int i) {
			return getRuleContext(An_admin_cssContext.class,i);
		}
		public List<An_admin_jsContext> an_admin_js() {
			return getRuleContexts(An_admin_jsContext.class);
		}
		public An_admin_jsContext an_admin_js(int i) {
			return getRuleContext(An_admin_jsContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_adminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin(this);
		}
	}

	public final An_adminContext an_admin() throws RecognitionException {
		An_adminContext _localctx = new An_adminContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_an_admin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(AN_ADMIN);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1235);
				match(BRACE_OPEN);
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1248);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_LIST:
							{
							setState(1236);
							an_admin_list();
							}
							break;
						case KW_READ_ONLY:
							{
							setState(1237);
							an_admin_read_only();
							}
							break;
						case KW_LIST_EDITABLE:
							{
							setState(1238);
							an_admin_list_editable();
							}
							break;
						case KW_LIST_FILTER:
							{
							setState(1239);
							an_admin_list_filter();
							}
							break;
						case KW_LIST_SEARCH:
							{
							setState(1240);
							an_admin_list_search();
							}
							break;
						case KW_FIELDS:
							{
							setState(1241);
							an_admin_fields();
							}
							break;
						case KW_TABS:
							{
							setState(1242);
							an_admin_tabs();
							}
							break;
						case KW_INLINE:
							{
							setState(1243);
							an_admin_inlines();
							}
							break;
						case KW_CSS:
							{
							setState(1244);
							an_admin_css();
							}
							break;
						case KW_JS:
							{
							setState(1245);
							an_admin_js();
							}
							break;
						case NL:
							{
							setState(1246);
							match(NL);
							}
							break;
						case COMA:
							{
							setState(1247);
							match(COMA);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1253);
					match(NL);
					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1259);
				match(BRACE_CLOSE);
				}
			}

			setState(1265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1262);
					match(NL);
					}
					} 
				}
				setState(1267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_jsContext extends ParserRuleContext {
		public TerminalNode KW_JS() { return getToken(ZmeiLangParser.KW_JS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<An_admin_js_file_nameContext> an_admin_js_file_name() {
			return getRuleContexts(An_admin_js_file_nameContext.class);
		}
		public An_admin_js_file_nameContext an_admin_js_file_name(int i) {
			return getRuleContext(An_admin_js_file_nameContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_admin_jsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_js; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_js(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_js(this);
		}
	}

	public final An_admin_jsContext an_admin_js() throws RecognitionException {
		An_admin_jsContext _localctx = new An_admin_jsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_an_admin_js);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(KW_JS);
			setState(1269);
			match(COLON);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1270);
				match(NL);
				}
				}
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1276);
			an_admin_js_file_name();
			setState(1287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1277);
					match(COMA);
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1278);
						match(NL);
						}
						}
						setState(1283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1284);
					an_admin_js_file_name();
					}
					} 
				}
				setState(1289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_cssContext extends ParserRuleContext {
		public TerminalNode KW_CSS() { return getToken(ZmeiLangParser.KW_CSS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<An_admin_css_file_nameContext> an_admin_css_file_name() {
			return getRuleContexts(An_admin_css_file_nameContext.class);
		}
		public An_admin_css_file_nameContext an_admin_css_file_name(int i) {
			return getRuleContext(An_admin_css_file_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_admin_cssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_css(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_css(this);
		}
	}

	public final An_admin_cssContext an_admin_css() throws RecognitionException {
		An_admin_cssContext _localctx = new An_admin_cssContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_an_admin_css);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(KW_CSS);
			setState(1291);
			match(COLON);
			setState(1292);
			an_admin_css_file_name();
			setState(1297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1293);
					match(COMA);
					setState(1294);
					an_admin_css_file_name();
					}
					} 
				}
				setState(1299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_css_file_nameContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_admin_css_file_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_css_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_css_file_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_css_file_name(this);
		}
	}

	public final An_admin_css_file_nameContext an_admin_css_file_name() throws RecognitionException {
		An_admin_css_file_nameContext _localctx = new An_admin_css_file_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_an_admin_css_file_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_js_file_nameContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_admin_js_file_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_js_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_js_file_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_js_file_name(this);
		}
	}

	public final An_admin_js_file_nameContext an_admin_js_file_name() throws RecognitionException {
		An_admin_js_file_nameContext _localctx = new An_admin_js_file_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_an_admin_js_file_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_inlinesContext extends ParserRuleContext {
		public TerminalNode KW_INLINE() { return getToken(ZmeiLangParser.KW_INLINE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<An_admin_inlineContext> an_admin_inline() {
			return getRuleContexts(An_admin_inlineContext.class);
		}
		public An_admin_inlineContext an_admin_inline(int i) {
			return getRuleContext(An_admin_inlineContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_admin_inlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_inlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_inlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_inlines(this);
		}
	}

	public final An_admin_inlinesContext an_admin_inlines() throws RecognitionException {
		An_admin_inlinesContext _localctx = new An_admin_inlinesContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_an_admin_inlines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(KW_INLINE);
			setState(1305);
			match(COLON);
			setState(1306);
			an_admin_inline();
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1307);
					match(COMA);
					setState(1308);
					an_admin_inline();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_inlineContext extends ParserRuleContext {
		public Inline_nameContext inline_name() {
			return getRuleContext(Inline_nameContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public List<Inline_typeContext> inline_type() {
			return getRuleContexts(Inline_typeContext.class);
		}
		public Inline_typeContext inline_type(int i) {
			return getRuleContext(Inline_typeContext.class,i);
		}
		public List<Inline_extraContext> inline_extra() {
			return getRuleContexts(Inline_extraContext.class);
		}
		public Inline_extraContext inline_extra(int i) {
			return getRuleContext(Inline_extraContext.class,i);
		}
		public List<Inline_fieldsContext> inline_fields() {
			return getRuleContexts(Inline_fieldsContext.class);
		}
		public Inline_fieldsContext inline_fields(int i) {
			return getRuleContext(Inline_fieldsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_admin_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_inline(this);
		}
	}

	public final An_admin_inlineContext an_admin_inline() throws RecognitionException {
		An_admin_inlineContext _localctx = new An_admin_inlineContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_an_admin_inline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			inline_name();
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1315);
				match(BRACE_OPEN);
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (KW_TYPE - 55)) | (1L << (KW_EXTRA - 55)) | (1L << (KW_FIELDS - 55)) | (1L << (NL - 55)) | (1L << (COMA - 55)))) != 0)) {
					{
					setState(1321);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_TYPE:
						{
						setState(1316);
						inline_type();
						}
						break;
					case KW_EXTRA:
						{
						setState(1317);
						inline_extra();
						}
						break;
					case KW_FIELDS:
						{
						setState(1318);
						inline_fields();
						}
						break;
					case NL:
						{
						setState(1319);
						match(NL);
						}
						break;
					case COMA:
						{
						setState(1320);
						match(COMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1326);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Inline_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterInline_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitInline_name(this);
		}
	}

	public final Inline_nameContext inline_name() throws RecognitionException {
		Inline_nameContext _localctx = new Inline_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_inline_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_typeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(ZmeiLangParser.KW_TYPE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public TerminalNode KW_INLINE_TYPE() { return getToken(ZmeiLangParser.KW_INLINE_TYPE, 0); }
		public Inline_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterInline_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitInline_type(this);
		}
	}

	public final Inline_typeContext inline_type() throws RecognitionException {
		Inline_typeContext _localctx = new Inline_typeContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_inline_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(KW_TYPE);
			setState(1332);
			match(COLON);
			setState(1333);
			match(KW_INLINE_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_extraContext extends ParserRuleContext {
		public TerminalNode KW_EXTRA() { return getToken(ZmeiLangParser.KW_EXTRA, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public TerminalNode DIGIT() { return getToken(ZmeiLangParser.DIGIT, 0); }
		public Inline_extraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterInline_extra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitInline_extra(this);
		}
	}

	public final Inline_extraContext inline_extra() throws RecognitionException {
		Inline_extraContext _localctx = new Inline_extraContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_inline_extra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(KW_EXTRA);
			setState(1336);
			match(COLON);
			setState(1337);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_fieldsContext extends ParserRuleContext {
		public TerminalNode KW_FIELDS() { return getToken(ZmeiLangParser.KW_FIELDS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public Inline_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterInline_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitInline_fields(this);
		}
	}

	public final Inline_fieldsContext inline_fields() throws RecognitionException {
		Inline_fieldsContext _localctx = new Inline_fieldsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_inline_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(KW_FIELDS);
			setState(1340);
			match(COLON);
			setState(1341);
			field_list_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_tabsContext extends ParserRuleContext {
		public TerminalNode KW_TABS() { return getToken(ZmeiLangParser.KW_TABS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public List<An_admin_tabContext> an_admin_tab() {
			return getRuleContexts(An_admin_tabContext.class);
		}
		public An_admin_tabContext an_admin_tab(int i) {
			return getRuleContext(An_admin_tabContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_admin_tabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_tabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_tabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_tabs(this);
		}
	}

	public final An_admin_tabsContext an_admin_tabs() throws RecognitionException {
		An_admin_tabsContext _localctx = new An_admin_tabsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_an_admin_tabs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(KW_TABS);
			setState(1344);
			match(COLON);
			setState(1345);
			an_admin_tab();
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1346);
					match(COMA);
					setState(1347);
					an_admin_tab();
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_tabContext extends ParserRuleContext {
		public Tab_nameContext tab_name() {
			return getRuleContext(Tab_nameContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public Tab_verbose_nameContext tab_verbose_name() {
			return getRuleContext(Tab_verbose_nameContext.class,0);
		}
		public An_admin_tabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_tab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_tab(this);
		}
	}

	public final An_admin_tabContext an_admin_tab() throws RecognitionException {
		An_admin_tabContext _localctx = new An_admin_tabContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_an_admin_tab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			tab_name();
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_DQ || _la==STRING_SQ) {
				{
				setState(1354);
				tab_verbose_name();
				}
			}

			setState(1357);
			match(BRACE_OPEN);
			setState(1358);
			field_list_expr();
			setState(1359);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tab_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Tab_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterTab_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitTab_name(this);
		}
	}

	public final Tab_nameContext tab_name() throws RecognitionException {
		Tab_nameContext _localctx = new Tab_nameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_tab_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tab_verbose_nameContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Tab_verbose_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_verbose_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterTab_verbose_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitTab_verbose_name(this);
		}
	}

	public final Tab_verbose_nameContext tab_verbose_name() throws RecognitionException {
		Tab_verbose_nameContext _localctx = new Tab_verbose_nameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_tab_verbose_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_listContext extends ParserRuleContext {
		public TerminalNode KW_LIST() { return getToken(ZmeiLangParser.KW_LIST, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_list(this);
		}
	}

	public final An_admin_listContext an_admin_list() throws RecognitionException {
		An_admin_listContext _localctx = new An_admin_listContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_an_admin_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(KW_LIST);
			setState(1366);
			match(COLON);
			setState(1367);
			field_list_expr();
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1368);
					match(NL);
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_read_onlyContext extends ParserRuleContext {
		public TerminalNode KW_READ_ONLY() { return getToken(ZmeiLangParser.KW_READ_ONLY, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_read_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_read_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_read_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_read_only(this);
		}
	}

	public final An_admin_read_onlyContext an_admin_read_only() throws RecognitionException {
		An_admin_read_onlyContext _localctx = new An_admin_read_onlyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_an_admin_read_only);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(KW_READ_ONLY);
			setState(1375);
			match(COLON);
			setState(1376);
			field_list_expr();
			setState(1380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1377);
					match(NL);
					}
					} 
				}
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_list_editableContext extends ParserRuleContext {
		public TerminalNode KW_LIST_EDITABLE() { return getToken(ZmeiLangParser.KW_LIST_EDITABLE, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_list_editableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_list_editable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_list_editable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_list_editable(this);
		}
	}

	public final An_admin_list_editableContext an_admin_list_editable() throws RecognitionException {
		An_admin_list_editableContext _localctx = new An_admin_list_editableContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_an_admin_list_editable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(KW_LIST_EDITABLE);
			setState(1384);
			match(COLON);
			setState(1385);
			field_list_expr();
			setState(1389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1386);
					match(NL);
					}
					} 
				}
				setState(1391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_list_filterContext extends ParserRuleContext {
		public TerminalNode KW_LIST_FILTER() { return getToken(ZmeiLangParser.KW_LIST_FILTER, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_list_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_list_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_list_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_list_filter(this);
		}
	}

	public final An_admin_list_filterContext an_admin_list_filter() throws RecognitionException {
		An_admin_list_filterContext _localctx = new An_admin_list_filterContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_an_admin_list_filter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(KW_LIST_FILTER);
			setState(1393);
			match(COLON);
			setState(1394);
			field_list_expr();
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1395);
					match(NL);
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_list_searchContext extends ParserRuleContext {
		public TerminalNode KW_LIST_SEARCH() { return getToken(ZmeiLangParser.KW_LIST_SEARCH, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_list_searchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_list_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_list_search(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_list_search(this);
		}
	}

	public final An_admin_list_searchContext an_admin_list_search() throws RecognitionException {
		An_admin_list_searchContext _localctx = new An_admin_list_searchContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_an_admin_list_search);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(KW_LIST_SEARCH);
			setState(1402);
			match(COLON);
			setState(1403);
			field_list_expr();
			setState(1407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1404);
					match(NL);
					}
					} 
				}
				setState(1409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_admin_fieldsContext extends ParserRuleContext {
		public TerminalNode KW_FIELDS() { return getToken(ZmeiLangParser.KW_FIELDS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Field_list_exprContext field_list_expr() {
			return getRuleContext(Field_list_exprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_admin_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_admin_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_admin_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_admin_fields(this);
		}
	}

	public final An_admin_fieldsContext an_admin_fields() throws RecognitionException {
		An_admin_fieldsContext _localctx = new An_admin_fieldsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_an_admin_fields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(KW_FIELDS);
			setState(1411);
			match(COLON);
			setState(1412);
			field_list_expr();
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1413);
					match(NL);
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContext extends ParserRuleContext {
		public Page_headerContext page_header() {
			return getRuleContext(Page_headerContext.class,0);
		}
		public Page_bodyContext page_body() {
			return getRuleContext(Page_bodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_page);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			page_header();
			setState(1423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1420);
					match(NL);
					}
					} 
				}
				setState(1425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1426);
			page_body();
			setState(1430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1427);
					match(NL);
					}
					} 
				}
				setState(1432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_headerContext extends ParserRuleContext {
		public TerminalNode SQ_BRACE_OPEN() { return getToken(ZmeiLangParser.SQ_BRACE_OPEN, 0); }
		public Page_nameContext page_name() {
			return getRuleContext(Page_nameContext.class,0);
		}
		public TerminalNode SQ_BRACE_CLOSE() { return getToken(ZmeiLangParser.SQ_BRACE_CLOSE, 0); }
		public Page_baseContext page_base() {
			return getRuleContext(Page_baseContext.class,0);
		}
		public Page_aliasContext page_alias() {
			return getRuleContext(Page_aliasContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(ZmeiLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ZmeiLangParser.COLON, i);
		}
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Page_urlContext page_url() {
			return getRuleContext(Page_urlContext.class,0);
		}
		public Page_templateContext page_template() {
			return getRuleContext(Page_templateContext.class,0);
		}
		public Page_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_header(this);
		}
	}

	public final Page_headerContext page_header() throws RecognitionException {
		Page_headerContext _localctx = new Page_headerContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_page_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(SQ_BRACE_OPEN);
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1434);
				page_base();
				}
				break;
			}
			setState(1437);
			page_name();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1438);
				page_alias();
				}
			}

			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1441);
				match(COLON);
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==SLASH) {
					{
					setState(1442);
					page_url();
					}
				}

				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1445);
					match(COLON);
					setState(1446);
					page_template();
					}
				}

				}
			}

			setState(1451);
			match(SQ_BRACE_CLOSE);
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1452);
				match(NL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_baseContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode DASH() { return getToken(ZmeiLangParser.DASH, 0); }
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public Page_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_base(this);
		}
	}

	public final Page_baseContext page_base() throws RecognitionException {
		Page_baseContext _localctx = new Page_baseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_page_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			id_or_kw();
			setState(1456);
			match(DASH);
			setState(1457);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_aliasContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(ZmeiLangParser.KW_AS, 0); }
		public Page_alias_nameContext page_alias_name() {
			return getRuleContext(Page_alias_nameContext.class,0);
		}
		public Page_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_alias(this);
		}
	}

	public final Page_aliasContext page_alias() throws RecognitionException {
		Page_aliasContext _localctx = new Page_aliasContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_page_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(KW_AS);
			setState(1460);
			page_alias_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_alias_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Page_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_alias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_alias_name(this);
		}
	}

	public final Page_alias_nameContext page_alias_name() throws RecognitionException {
		Page_alias_nameContext _localctx = new Page_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_page_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_templateContext extends ParserRuleContext {
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public Page_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_template(this);
		}
	}

	public final Page_templateContext page_template() throws RecognitionException {
		Page_templateContext _localctx = new Page_templateContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_page_template);
		try {
			setState(1466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
			case DIGIT:
			case UNDERSCORE:
			case DASH:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1464);
				template_name();
				}
				break;
			case ASSIGN:
			case CODE_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				python_code();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_nameContext extends ParserRuleContext {
		public List<File_name_partContext> file_name_part() {
			return getRuleContexts(File_name_partContext.class);
		}
		public File_name_partContext file_name_part(int i) {
			return getRuleContext(File_name_partContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ZmeiLangParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ZmeiLangParser.SLASH, i);
		}
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitTemplate_name(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_template_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			file_name_part();
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(1469);
				match(SLASH);
				setState(1470);
				file_name_part();
				}
				}
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_name_partContext extends ParserRuleContext {
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ZmeiLangParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ZmeiLangParser.DIGIT, i);
		}
		public List<TerminalNode> DASH() { return getTokens(ZmeiLangParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(ZmeiLangParser.DASH, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(ZmeiLangParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(ZmeiLangParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ZmeiLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ZmeiLangParser.DOT, i);
		}
		public File_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterFile_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitFile_name_part(this);
		}
	}

	public final File_name_partContext file_name_part() throws RecognitionException {
		File_name_partContext _localctx = new File_name_partContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_file_name_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WRITE_MODE:
				case BOOL:
				case KW_THEME:
				case KW_PAGE:
				case KW_LINK_SUFFIX:
				case KW_URL_PREFIX:
				case KW_CAN_EDIT:
				case KW_OBJECT_EXPR:
				case KW_BLOCK:
				case KW_ITEM_NAME:
				case KW_PK_PARAM:
				case KW_LIST_FIELDS:
				case KW_DELETE:
				case KW_EDIT:
				case KW_CREATE:
				case KW_DETAIL:
				case KW_SKIP:
				case KW_FROM:
				case KW_POLY_LIST:
				case KW_CSS:
				case KW_JS:
				case KW_INLINE_TYPE:
				case KW_AUTH_TYPE:
				case KW_INLINE:
				case KW_TYPE:
				case KW_USER_FIELD:
				case KW_ANNOTATE:
				case KW_ON_CREATE:
				case KW_QUERY:
				case KW_AUTH:
				case KW_COUNT:
				case KW_I18N:
				case KW_EXTRA:
				case KW_TABS:
				case KW_LIST:
				case KW_READ_ONLY:
				case KW_LIST_EDITABLE:
				case KW_LIST_FILTER:
				case KW_LIST_SEARCH:
				case KW_FIELDS:
				case KW_IMPORT:
				case KW_AS:
				case COL_FIELD_TYPE_LONGTEXT:
				case COL_FIELD_TYPE_HTML:
				case COL_FIELD_TYPE_HTML_MEDIA:
				case COL_FIELD_TYPE_FLOAT:
				case COL_FIELD_TYPE_DECIMAL:
				case COL_FIELD_TYPE_DATE:
				case COL_FIELD_TYPE_DATETIME:
				case COL_FIELD_TYPE_CREATE_TIME:
				case COL_FIELD_TYPE_UPDATE_TIME:
				case COL_FIELD_TYPE_IMAGE:
				case COL_FIELD_TYPE_FILE:
				case COL_FIELD_TYPE_FILER_IMAGE:
				case COL_FIELD_TYPE_FILER_FILE:
				case COL_FIELD_TYPE_FILER_FOLDER:
				case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
				case COL_FIELD_TYPE_TEXT:
				case COL_FIELD_TYPE_INT:
				case COL_FIELD_TYPE_SLUG:
				case COL_FIELD_TYPE_BOOL:
				case COL_FIELD_TYPE_ONE:
				case COL_FIELD_TYPE_ONE2ONE:
				case COL_FIELD_TYPE_MANY:
				case COL_FIELD_CHOICES:
				case ID:
					{
					setState(1476);
					id_or_kw();
					}
					break;
				case DIGIT:
					{
					setState(1477);
					match(DIGIT);
					}
					break;
				case DASH:
					{
					setState(1478);
					match(DASH);
					}
					break;
				case UNDERSCORE:
					{
					setState(1479);
					match(UNDERSCORE);
					}
					break;
				case DOT:
					{
					setState(1480);
					match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE_MODE) | (1L << BOOL) | (1L << KW_THEME) | (1L << KW_PAGE) | (1L << KW_LINK_SUFFIX) | (1L << KW_URL_PREFIX) | (1L << KW_CAN_EDIT) | (1L << KW_OBJECT_EXPR) | (1L << KW_BLOCK) | (1L << KW_ITEM_NAME) | (1L << KW_PK_PARAM) | (1L << KW_LIST_FIELDS) | (1L << KW_DELETE) | (1L << KW_EDIT) | (1L << KW_CREATE) | (1L << KW_DETAIL) | (1L << KW_SKIP) | (1L << KW_FROM) | (1L << KW_POLY_LIST) | (1L << KW_CSS) | (1L << KW_JS) | (1L << KW_INLINE_TYPE) | (1L << KW_AUTH_TYPE) | (1L << KW_INLINE) | (1L << KW_TYPE) | (1L << KW_USER_FIELD) | (1L << KW_ANNOTATE) | (1L << KW_ON_CREATE) | (1L << KW_QUERY) | (1L << KW_AUTH) | (1L << KW_COUNT) | (1L << KW_I18N) | (1L << KW_EXTRA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_TABS - 64)) | (1L << (KW_LIST - 64)) | (1L << (KW_READ_ONLY - 64)) | (1L << (KW_LIST_EDITABLE - 64)) | (1L << (KW_LIST_FILTER - 64)) | (1L << (KW_LIST_SEARCH - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_AS - 64)) | (1L << (COL_FIELD_TYPE_LONGTEXT - 64)) | (1L << (COL_FIELD_TYPE_HTML - 64)) | (1L << (COL_FIELD_TYPE_HTML_MEDIA - 64)) | (1L << (COL_FIELD_TYPE_FLOAT - 64)) | (1L << (COL_FIELD_TYPE_DECIMAL - 64)) | (1L << (COL_FIELD_TYPE_DATE - 64)) | (1L << (COL_FIELD_TYPE_DATETIME - 64)) | (1L << (COL_FIELD_TYPE_CREATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_UPDATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_TEXT - 64)) | (1L << (COL_FIELD_TYPE_INT - 64)) | (1L << (COL_FIELD_TYPE_SLUG - 64)) | (1L << (COL_FIELD_TYPE_BOOL - 64)) | (1L << (COL_FIELD_TYPE_ONE - 64)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 64)) | (1L << (COL_FIELD_TYPE_MANY - 64)) | (1L << (COL_FIELD_CHOICES - 64)) | (1L << (ID - 64)) | (1L << (DIGIT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (DASH - 64)) | (1L << (DOT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_urlContext extends ParserRuleContext {
		public Url_segmentsContext url_segments() {
			return getRuleContext(Url_segmentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public Page_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_url(this);
		}
	}

	public final Page_urlContext page_url() throws RecognitionException {
		Page_urlContext _localctx = new Page_urlContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_page_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1485);
				match(DOT);
				}
			}

			setState(1488);
			url_segments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Url_partContext extends ParserRuleContext {
		public List<Id_or_kwContext> id_or_kw() {
			return getRuleContexts(Id_or_kwContext.class);
		}
		public Id_or_kwContext id_or_kw(int i) {
			return getRuleContext(Id_or_kwContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(ZmeiLangParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(ZmeiLangParser.DASH, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ZmeiLangParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ZmeiLangParser.DIGIT, i);
		}
		public Url_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterUrl_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitUrl_part(this);
		}
	}

	public final Url_partContext url_part() throws RecognitionException {
		Url_partContext _localctx = new Url_partContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_url_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1493);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WRITE_MODE:
				case BOOL:
				case KW_THEME:
				case KW_PAGE:
				case KW_LINK_SUFFIX:
				case KW_URL_PREFIX:
				case KW_CAN_EDIT:
				case KW_OBJECT_EXPR:
				case KW_BLOCK:
				case KW_ITEM_NAME:
				case KW_PK_PARAM:
				case KW_LIST_FIELDS:
				case KW_DELETE:
				case KW_EDIT:
				case KW_CREATE:
				case KW_DETAIL:
				case KW_SKIP:
				case KW_FROM:
				case KW_POLY_LIST:
				case KW_CSS:
				case KW_JS:
				case KW_INLINE_TYPE:
				case KW_AUTH_TYPE:
				case KW_INLINE:
				case KW_TYPE:
				case KW_USER_FIELD:
				case KW_ANNOTATE:
				case KW_ON_CREATE:
				case KW_QUERY:
				case KW_AUTH:
				case KW_COUNT:
				case KW_I18N:
				case KW_EXTRA:
				case KW_TABS:
				case KW_LIST:
				case KW_READ_ONLY:
				case KW_LIST_EDITABLE:
				case KW_LIST_FILTER:
				case KW_LIST_SEARCH:
				case KW_FIELDS:
				case KW_IMPORT:
				case KW_AS:
				case COL_FIELD_TYPE_LONGTEXT:
				case COL_FIELD_TYPE_HTML:
				case COL_FIELD_TYPE_HTML_MEDIA:
				case COL_FIELD_TYPE_FLOAT:
				case COL_FIELD_TYPE_DECIMAL:
				case COL_FIELD_TYPE_DATE:
				case COL_FIELD_TYPE_DATETIME:
				case COL_FIELD_TYPE_CREATE_TIME:
				case COL_FIELD_TYPE_UPDATE_TIME:
				case COL_FIELD_TYPE_IMAGE:
				case COL_FIELD_TYPE_FILE:
				case COL_FIELD_TYPE_FILER_IMAGE:
				case COL_FIELD_TYPE_FILER_FILE:
				case COL_FIELD_TYPE_FILER_FOLDER:
				case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
				case COL_FIELD_TYPE_TEXT:
				case COL_FIELD_TYPE_INT:
				case COL_FIELD_TYPE_SLUG:
				case COL_FIELD_TYPE_BOOL:
				case COL_FIELD_TYPE_ONE:
				case COL_FIELD_TYPE_ONE2ONE:
				case COL_FIELD_TYPE_MANY:
				case COL_FIELD_CHOICES:
				case ID:
					{
					setState(1490);
					id_or_kw();
					}
					break;
				case DASH:
					{
					setState(1491);
					match(DASH);
					}
					break;
				case DIGIT:
					{
					setState(1492);
					match(DIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE_MODE) | (1L << BOOL) | (1L << KW_THEME) | (1L << KW_PAGE) | (1L << KW_LINK_SUFFIX) | (1L << KW_URL_PREFIX) | (1L << KW_CAN_EDIT) | (1L << KW_OBJECT_EXPR) | (1L << KW_BLOCK) | (1L << KW_ITEM_NAME) | (1L << KW_PK_PARAM) | (1L << KW_LIST_FIELDS) | (1L << KW_DELETE) | (1L << KW_EDIT) | (1L << KW_CREATE) | (1L << KW_DETAIL) | (1L << KW_SKIP) | (1L << KW_FROM) | (1L << KW_POLY_LIST) | (1L << KW_CSS) | (1L << KW_JS) | (1L << KW_INLINE_TYPE) | (1L << KW_AUTH_TYPE) | (1L << KW_INLINE) | (1L << KW_TYPE) | (1L << KW_USER_FIELD) | (1L << KW_ANNOTATE) | (1L << KW_ON_CREATE) | (1L << KW_QUERY) | (1L << KW_AUTH) | (1L << KW_COUNT) | (1L << KW_I18N) | (1L << KW_EXTRA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_TABS - 64)) | (1L << (KW_LIST - 64)) | (1L << (KW_READ_ONLY - 64)) | (1L << (KW_LIST_EDITABLE - 64)) | (1L << (KW_LIST_FILTER - 64)) | (1L << (KW_LIST_SEARCH - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_AS - 64)) | (1L << (COL_FIELD_TYPE_LONGTEXT - 64)) | (1L << (COL_FIELD_TYPE_HTML - 64)) | (1L << (COL_FIELD_TYPE_HTML_MEDIA - 64)) | (1L << (COL_FIELD_TYPE_FLOAT - 64)) | (1L << (COL_FIELD_TYPE_DECIMAL - 64)) | (1L << (COL_FIELD_TYPE_DATE - 64)) | (1L << (COL_FIELD_TYPE_DATETIME - 64)) | (1L << (COL_FIELD_TYPE_CREATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_UPDATE_TIME - 64)) | (1L << (COL_FIELD_TYPE_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FILE - 64)) | (1L << (COL_FIELD_TYPE_FILER_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_FILER_IMAGE_FOLDER - 64)) | (1L << (COL_FIELD_TYPE_TEXT - 64)) | (1L << (COL_FIELD_TYPE_INT - 64)) | (1L << (COL_FIELD_TYPE_SLUG - 64)) | (1L << (COL_FIELD_TYPE_BOOL - 64)) | (1L << (COL_FIELD_TYPE_ONE - 64)) | (1L << (COL_FIELD_TYPE_ONE2ONE - 64)) | (1L << (COL_FIELD_TYPE_MANY - 64)) | (1L << (COL_FIELD_CHOICES - 64)) | (1L << (ID - 64)) | (1L << (DIGIT - 64)) | (1L << (DASH - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Url_paramContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ZmeiLangParser.LT, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public Url_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterUrl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitUrl_param(this);
		}
	}

	public final Url_paramContext url_param() throws RecognitionException {
		Url_paramContext _localctx = new Url_paramContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_url_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(LT);
			setState(1498);
			id_or_kw();
			setState(1499);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Url_segmentContext extends ParserRuleContext {
		public Url_partContext url_part() {
			return getRuleContext(Url_partContext.class,0);
		}
		public Url_paramContext url_param() {
			return getRuleContext(Url_paramContext.class,0);
		}
		public Url_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterUrl_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitUrl_segment(this);
		}
	}

	public final Url_segmentContext url_segment() throws RecognitionException {
		Url_segmentContext _localctx = new Url_segmentContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_url_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
			case DIGIT:
			case DASH:
				{
				setState(1501);
				url_part();
				}
				break;
			case LT:
				{
				setState(1502);
				url_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Url_segmentsContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(ZmeiLangParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ZmeiLangParser.SLASH, i);
		}
		public List<Url_segmentContext> url_segment() {
			return getRuleContexts(Url_segmentContext.class);
		}
		public Url_segmentContext url_segment(int i) {
			return getRuleContext(Url_segmentContext.class,i);
		}
		public Url_segmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_segments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterUrl_segments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitUrl_segments(this);
		}
	}

	public final Url_segmentsContext url_segments() throws RecognitionException {
		Url_segmentsContext _localctx = new Url_segmentsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_url_segments);
		int _la;
		try {
			int _alt;
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				match(SLASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1506);
						match(SLASH);
						setState(1507);
						url_segment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1510); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(1512);
					match(SLASH);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Page_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_name(this);
		}
	}

	public final Page_nameContext page_name() throws RecognitionException {
		Page_nameContext _localctx = new Page_nameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_bodyContext extends ParserRuleContext {
		public List<Page_fieldContext> page_field() {
			return getRuleContexts(Page_fieldContext.class);
		}
		public Page_fieldContext page_field(int i) {
			return getRuleContext(Page_fieldContext.class,i);
		}
		public Page_codeContext page_code() {
			return getRuleContext(Page_codeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<Page_annotationContext> page_annotation() {
			return getRuleContexts(Page_annotationContext.class);
		}
		public Page_annotationContext page_annotation(int i) {
			return getRuleContext(Page_annotationContext.class,i);
		}
		public Page_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_body(this);
		}
	}

	public final Page_bodyContext page_body() throws RecognitionException {
		Page_bodyContext _localctx = new Page_bodyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_page_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1519);
					page_field();
					}
					} 
				}
				setState(1524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==CODE_BLOCK) {
				{
				setState(1525);
				page_code();
				}
			}

			setState(1531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1528);
					match(NL);
					}
					} 
				}
				setState(1533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1534);
					page_annotation();
					}
					} 
				}
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_codeContext extends ParserRuleContext {
		public Python_codeContext python_code() {
			return getRuleContext(Python_codeContext.class,0);
		}
		public Page_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_code(this);
		}
	}

	public final Page_codeContext page_code() throws RecognitionException {
		Page_codeContext _localctx = new Page_codeContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_page_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			python_code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_fieldContext extends ParserRuleContext {
		public Page_field_nameContext page_field_name() {
			return getRuleContext(Page_field_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ZmeiLangParser.ASSIGN, 0); }
		public Page_field_codeContext page_field_code() {
			return getRuleContext(Page_field_codeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ZmeiLangParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public Page_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_field(this);
		}
	}

	public final Page_fieldContext page_field() throws RecognitionException {
		Page_fieldContext _localctx = new Page_fieldContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_page_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			page_field_name();
			setState(1543);
			match(ASSIGN);
			setState(1544);
			page_field_code();
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				{
				setState(1546); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1545);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(1550);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_field_nameContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public Page_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_field_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_field_name(this);
		}
	}

	public final Page_field_nameContext page_field_name() throws RecognitionException {
		Page_field_nameContext _localctx = new Page_field_nameContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_page_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_field_codeContext extends ParserRuleContext {
		public TerminalNode PYTHON_CODE() { return getToken(ZmeiLangParser.PYTHON_CODE, 0); }
		public Page_field_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_field_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_field_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_field_code(this);
		}
	}

	public final Page_field_codeContext page_field_code() throws RecognitionException {
		Page_field_codeContext _localctx = new Page_field_codeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_page_field_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(PYTHON_CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Page_annotationContext extends ParserRuleContext {
		public An_htmlContext an_html() {
			return getRuleContext(An_htmlContext.class,0);
		}
		public An_reactContext an_react() {
			return getRuleContext(An_reactContext.class,0);
		}
		public An_menuContext an_menu() {
			return getRuleContext(An_menuContext.class,0);
		}
		public An_crudContext an_crud() {
			return getRuleContext(An_crudContext.class,0);
		}
		public An_crud_detailContext an_crud_detail() {
			return getRuleContext(An_crud_detailContext.class,0);
		}
		public An_crud_deleteContext an_crud_delete() {
			return getRuleContext(An_crud_deleteContext.class,0);
		}
		public An_crud_editContext an_crud_edit() {
			return getRuleContext(An_crud_editContext.class,0);
		}
		public An_crud_createContext an_crud_create() {
			return getRuleContext(An_crud_createContext.class,0);
		}
		public An_postContext an_post() {
			return getRuleContext(An_postContext.class,0);
		}
		public An_errorContext an_error() {
			return getRuleContext(An_errorContext.class,0);
		}
		public An_authContext an_auth() {
			return getRuleContext(An_authContext.class,0);
		}
		public An_markdownContext an_markdown() {
			return getRuleContext(An_markdownContext.class,0);
		}
		public TerminalNode NL() { return getToken(ZmeiLangParser.NL, 0); }
		public Page_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterPage_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitPage_annotation(this);
		}
	}

	public final Page_annotationContext page_annotation() throws RecognitionException {
		Page_annotationContext _localctx = new Page_annotationContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_page_annotation);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AN_HTML:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				an_html();
				}
				break;
			case AN_REACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1558);
				an_react();
				}
				break;
			case AN_MENU:
				enterOuterAlt(_localctx, 3);
				{
				setState(1559);
				an_menu();
				}
				break;
			case AN_CRUD:
				enterOuterAlt(_localctx, 4);
				{
				setState(1560);
				an_crud();
				}
				break;
			case AN_CRUD_DETAIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1561);
				an_crud_detail();
				}
				break;
			case AN_CRUD_DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1562);
				an_crud_delete();
				}
				break;
			case AN_CRUD_EDIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1563);
				an_crud_edit();
				}
				break;
			case AN_CRUD_CREATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1564);
				an_crud_create();
				}
				break;
			case AN_POST:
				enterOuterAlt(_localctx, 9);
				{
				setState(1565);
				an_post();
				}
				break;
			case AN_ERROR:
				enterOuterAlt(_localctx, 10);
				{
				setState(1566);
				an_error();
				}
				break;
			case AN_AUTH:
				enterOuterAlt(_localctx, 11);
				{
				setState(1567);
				an_auth();
				}
				break;
			case AN_MARKDOWN:
				enterOuterAlt(_localctx, 12);
				{
				setState(1568);
				an_markdown();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 13);
				{
				setState(1569);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_reactContext extends ParserRuleContext {
		public TerminalNode AN_REACT() { return getToken(ZmeiLangParser.AN_REACT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_react_descriptorContext an_react_descriptor() {
			return getRuleContext(An_react_descriptorContext.class,0);
		}
		public An_reactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_react; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_react(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_react(this);
		}
	}

	public final An_reactContext an_react() throws RecognitionException {
		An_reactContext _localctx = new An_reactContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_an_react);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(AN_REACT);
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1573);
				match(DOT);
				setState(1574);
				an_react_descriptor();
				}
			}

			setState(1577);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_react_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_react_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_react_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_react_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_react_descriptor(this);
		}
	}

	public final An_react_descriptorContext an_react_descriptor() throws RecognitionException {
		An_react_descriptorContext _localctx = new An_react_descriptorContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_an_react_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_markdownContext extends ParserRuleContext {
		public TerminalNode AN_MARKDOWN() { return getToken(ZmeiLangParser.AN_MARKDOWN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_markdown_descriptorContext an_markdown_descriptor() {
			return getRuleContext(An_markdown_descriptorContext.class,0);
		}
		public An_markdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_markdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_markdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_markdown(this);
		}
	}

	public final An_markdownContext an_markdown() throws RecognitionException {
		An_markdownContext _localctx = new An_markdownContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_an_markdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(AN_MARKDOWN);
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1582);
				match(DOT);
				setState(1583);
				an_markdown_descriptor();
				}
			}

			setState(1586);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_markdown_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_markdown_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_markdown_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_markdown_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_markdown_descriptor(this);
		}
	}

	public final An_markdown_descriptorContext an_markdown_descriptor() throws RecognitionException {
		An_markdown_descriptorContext _localctx = new An_markdown_descriptorContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_an_markdown_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_authContext extends ParserRuleContext {
		public TerminalNode AN_AUTH() { return getToken(ZmeiLangParser.AN_AUTH, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_authContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_auth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_auth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_auth(this);
		}
	}

	public final An_authContext an_auth() throws RecognitionException {
		An_authContext _localctx = new An_authContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_an_auth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(AN_AUTH);
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_BLOCK) {
				{
				setState(1591);
				code_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_errorContext extends ParserRuleContext {
		public TerminalNode AN_ERROR() { return getToken(ZmeiLangParser.AN_ERROR, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_error_codeContext an_error_code() {
			return getRuleContext(An_error_codeContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_error(this);
		}
	}

	public final An_errorContext an_error() throws RecognitionException {
		An_errorContext _localctx = new An_errorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_an_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(AN_ERROR);
			setState(1595);
			match(BRACE_OPEN);
			setState(1596);
			an_error_code();
			setState(1597);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_error_codeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ZmeiLangParser.DIGIT, 0); }
		public An_error_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_error_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_error_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_error_code(this);
		}
	}

	public final An_error_codeContext an_error_code() throws RecognitionException {
		An_error_codeContext _localctx = new An_error_codeContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_an_error_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_postContext extends ParserRuleContext {
		public TerminalNode AN_POST() { return getToken(ZmeiLangParser.AN_POST, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_post(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_post(this);
		}
	}

	public final An_postContext an_post() throws RecognitionException {
		An_postContext _localctx = new An_postContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_an_post);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(AN_POST);
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1602);
				match(BRACE_OPEN);
				setState(1603);
				match(BRACE_CLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_createContext extends ParserRuleContext {
		public TerminalNode AN_CRUD_CREATE() { return getToken(ZmeiLangParser.AN_CRUD_CREATE, 0); }
		public An_crud_paramsContext an_crud_params() {
			return getRuleContext(An_crud_paramsContext.class,0);
		}
		public An_crud_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_create(this);
		}
	}

	public final An_crud_createContext an_crud_create() throws RecognitionException {
		An_crud_createContext _localctx = new An_crud_createContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_an_crud_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(AN_CRUD_CREATE);
			setState(1607);
			an_crud_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crudContext extends ParserRuleContext {
		public TerminalNode AN_CRUD() { return getToken(ZmeiLangParser.AN_CRUD, 0); }
		public An_crud_paramsContext an_crud_params() {
			return getRuleContext(An_crud_paramsContext.class,0);
		}
		public An_crudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud(this);
		}
	}

	public final An_crudContext an_crud() throws RecognitionException {
		An_crudContext _localctx = new An_crudContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_an_crud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(AN_CRUD);
			setState(1610);
			an_crud_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_paramsContext extends ParserRuleContext {
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_crud_target_modelContext an_crud_target_model() {
			return getRuleContext(An_crud_target_modelContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_crud_descriptorContext an_crud_descriptor() {
			return getRuleContext(An_crud_descriptorContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_crud_target_filterContext an_crud_target_filter() {
			return getRuleContext(An_crud_target_filterContext.class,0);
		}
		public List<An_crud_themeContext> an_crud_theme() {
			return getRuleContexts(An_crud_themeContext.class);
		}
		public An_crud_themeContext an_crud_theme(int i) {
			return getRuleContext(An_crud_themeContext.class,i);
		}
		public List<An_crud_skipContext> an_crud_skip() {
			return getRuleContexts(An_crud_skipContext.class);
		}
		public An_crud_skipContext an_crud_skip(int i) {
			return getRuleContext(An_crud_skipContext.class,i);
		}
		public List<An_crud_fieldsContext> an_crud_fields() {
			return getRuleContexts(An_crud_fieldsContext.class);
		}
		public An_crud_fieldsContext an_crud_fields(int i) {
			return getRuleContext(An_crud_fieldsContext.class,i);
		}
		public List<An_crud_list_fieldsContext> an_crud_list_fields() {
			return getRuleContexts(An_crud_list_fieldsContext.class);
		}
		public An_crud_list_fieldsContext an_crud_list_fields(int i) {
			return getRuleContext(An_crud_list_fieldsContext.class,i);
		}
		public List<An_crud_pk_paramContext> an_crud_pk_param() {
			return getRuleContexts(An_crud_pk_paramContext.class);
		}
		public An_crud_pk_paramContext an_crud_pk_param(int i) {
			return getRuleContext(An_crud_pk_paramContext.class,i);
		}
		public List<An_crud_item_nameContext> an_crud_item_name() {
			return getRuleContexts(An_crud_item_nameContext.class);
		}
		public An_crud_item_nameContext an_crud_item_name(int i) {
			return getRuleContext(An_crud_item_nameContext.class,i);
		}
		public List<An_crud_blockContext> an_crud_block() {
			return getRuleContexts(An_crud_blockContext.class);
		}
		public An_crud_blockContext an_crud_block(int i) {
			return getRuleContext(An_crud_blockContext.class,i);
		}
		public List<An_crud_object_exprContext> an_crud_object_expr() {
			return getRuleContexts(An_crud_object_exprContext.class);
		}
		public An_crud_object_exprContext an_crud_object_expr(int i) {
			return getRuleContext(An_crud_object_exprContext.class,i);
		}
		public List<An_crud_can_editContext> an_crud_can_edit() {
			return getRuleContexts(An_crud_can_editContext.class);
		}
		public An_crud_can_editContext an_crud_can_edit(int i) {
			return getRuleContext(An_crud_can_editContext.class,i);
		}
		public List<An_crud_url_prefixContext> an_crud_url_prefix() {
			return getRuleContexts(An_crud_url_prefixContext.class);
		}
		public An_crud_url_prefixContext an_crud_url_prefix(int i) {
			return getRuleContext(An_crud_url_prefixContext.class,i);
		}
		public List<An_crud_link_suffixContext> an_crud_link_suffix() {
			return getRuleContexts(An_crud_link_suffixContext.class);
		}
		public An_crud_link_suffixContext an_crud_link_suffix(int i) {
			return getRuleContext(An_crud_link_suffixContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_crud_next_pageContext an_crud_next_page() {
			return getRuleContext(An_crud_next_pageContext.class,0);
		}
		public An_crud_next_page_urlContext an_crud_next_page_url() {
			return getRuleContext(An_crud_next_page_urlContext.class,0);
		}
		public List<An_crud_page_overrideContext> an_crud_page_override() {
			return getRuleContexts(An_crud_page_overrideContext.class);
		}
		public An_crud_page_overrideContext an_crud_page_override(int i) {
			return getRuleContext(An_crud_page_overrideContext.class,i);
		}
		public An_crud_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_params(this);
		}
	}

	public final An_crud_paramsContext an_crud_params() throws RecognitionException {
		An_crud_paramsContext _localctx = new An_crud_paramsContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_an_crud_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1612);
				match(DOT);
				setState(1613);
				an_crud_descriptor();
				}
			}

			setState(1616);
			match(BRACE_OPEN);
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1617);
				match(NL);
				}
				}
				setState(1622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1623);
			an_crud_target_model();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_BLOCK) {
				{
				setState(1624);
				an_crud_target_filter();
				}
			}

			setState(1642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1640);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_THEME:
						{
						setState(1627);
						an_crud_theme();
						}
						break;
					case KW_SKIP:
						{
						setState(1628);
						an_crud_skip();
						}
						break;
					case KW_FIELDS:
						{
						setState(1629);
						an_crud_fields();
						}
						break;
					case KW_LIST_FIELDS:
						{
						setState(1630);
						an_crud_list_fields();
						}
						break;
					case KW_PK_PARAM:
						{
						setState(1631);
						an_crud_pk_param();
						}
						break;
					case KW_ITEM_NAME:
						{
						setState(1632);
						an_crud_item_name();
						}
						break;
					case KW_BLOCK:
						{
						setState(1633);
						an_crud_block();
						}
						break;
					case KW_OBJECT_EXPR:
						{
						setState(1634);
						an_crud_object_expr();
						}
						break;
					case KW_CAN_EDIT:
						{
						setState(1635);
						an_crud_can_edit();
						}
						break;
					case KW_URL_PREFIX:
						{
						setState(1636);
						an_crud_url_prefix();
						}
						break;
					case KW_LINK_SUFFIX:
						{
						setState(1637);
						an_crud_link_suffix();
						}
						break;
					case NL:
						{
						setState(1638);
						match(NL);
						}
						break;
					case COMA:
						{
						setState(1639);
						match(COMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1645);
					match(NL);
					}
					} 
				}
				setState(1650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1651);
				an_crud_next_page();
				}
				break;
			case 2:
				{
				setState(1652);
				an_crud_next_page_url();
				}
				break;
			}
			setState(1658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					match(NL);
					}
					} 
				}
				setState(1660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KW_DELETE - 43)) | (1L << (KW_EDIT - 43)) | (1L << (KW_CREATE - 43)) | (1L << (KW_DETAIL - 43)) | (1L << (KW_LIST - 43)))) != 0)) {
				{
				{
				setState(1661);
				an_crud_page_override();
				}
				}
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1667);
				match(NL);
				}
				}
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1673);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_page_overrideContext extends ParserRuleContext {
		public An_crud_view_nameContext an_crud_view_name() {
			return getRuleContext(An_crud_view_nameContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public Page_bodyContext page_body() {
			return getRuleContext(Page_bodyContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_crud_page_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_page_override; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_page_override(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_page_override(this);
		}
	}

	public final An_crud_page_overrideContext an_crud_page_override() throws RecognitionException {
		An_crud_page_overrideContext _localctx = new An_crud_page_overrideContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_an_crud_page_override);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			an_crud_view_name();
			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1676);
				match(NL);
				}
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1682);
			match(BRACE_OPEN);
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					match(NL);
					}
					} 
				}
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			setState(1689);
			page_body();
			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1690);
				match(NL);
				}
				}
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1696);
			match(BRACE_CLOSE);
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1697);
					match(NL);
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_crud_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_descriptor(this);
		}
	}

	public final An_crud_descriptorContext an_crud_descriptor() throws RecognitionException {
		An_crud_descriptorContext _localctx = new An_crud_descriptorContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_an_crud_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_next_pageContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_crud_next_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_next_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_next_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_next_page(this);
		}
	}

	public final An_crud_next_pageContext an_crud_next_page() throws RecognitionException {
		An_crud_next_pageContext _localctx = new An_crud_next_pageContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_an_crud_next_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(EQUALS);
			setState(1706);
			match(GT);
			setState(1707);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_next_page_urlContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public TerminalNode GT() { return getToken(ZmeiLangParser.GT, 0); }
		public An_crud_next_page_url_valContext an_crud_next_page_url_val() {
			return getRuleContext(An_crud_next_page_url_valContext.class,0);
		}
		public An_crud_next_page_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_next_page_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_next_page_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_next_page_url(this);
		}
	}

	public final An_crud_next_page_urlContext an_crud_next_page_url() throws RecognitionException {
		An_crud_next_page_urlContext _localctx = new An_crud_next_page_urlContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_an_crud_next_page_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(EQUALS);
			setState(1710);
			match(GT);
			setState(1711);
			an_crud_next_page_url_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_next_page_url_valContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_crud_next_page_url_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_next_page_url_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_next_page_url_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_next_page_url_val(this);
		}
	}

	public final An_crud_next_page_url_valContext an_crud_next_page_url_val() throws RecognitionException {
		An_crud_next_page_url_valContext _localctx = new An_crud_next_page_url_valContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_an_crud_next_page_url_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_target_modelContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ZmeiLangParser.HASH, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public An_crud_target_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_target_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_target_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_target_model(this);
		}
	}

	public final An_crud_target_modelContext an_crud_target_model() throws RecognitionException {
		An_crud_target_modelContext _localctx = new An_crud_target_modelContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_an_crud_target_model);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1715);
				match(HASH);
				setState(1716);
				id_or_kw();
				}
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1717);
				classname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_target_filterContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_crud_target_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_target_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_target_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_target_filter(this);
		}
	}

	public final An_crud_target_filterContext an_crud_target_filter() throws RecognitionException {
		An_crud_target_filterContext _localctx = new An_crud_target_filterContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_an_crud_target_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_themeContext extends ParserRuleContext {
		public TerminalNode KW_THEME() { return getToken(ZmeiLangParser.KW_THEME, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_crud_themeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_theme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_theme(this);
		}
	}

	public final An_crud_themeContext an_crud_theme() throws RecognitionException {
		An_crud_themeContext _localctx = new An_crud_themeContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_an_crud_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(KW_THEME);
			setState(1723);
			match(COLON);
			setState(1724);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_url_prefixContext extends ParserRuleContext {
		public TerminalNode KW_URL_PREFIX() { return getToken(ZmeiLangParser.KW_URL_PREFIX, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_crud_url_prefix_valContext an_crud_url_prefix_val() {
			return getRuleContext(An_crud_url_prefix_valContext.class,0);
		}
		public An_crud_url_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_url_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_url_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_url_prefix(this);
		}
	}

	public final An_crud_url_prefixContext an_crud_url_prefix() throws RecognitionException {
		An_crud_url_prefixContext _localctx = new An_crud_url_prefixContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_an_crud_url_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(KW_URL_PREFIX);
			setState(1727);
			match(COLON);
			setState(1728);
			an_crud_url_prefix_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_url_prefix_valContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_crud_url_prefix_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_url_prefix_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_url_prefix_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_url_prefix_val(this);
		}
	}

	public final An_crud_url_prefix_valContext an_crud_url_prefix_val() throws RecognitionException {
		An_crud_url_prefix_valContext _localctx = new An_crud_url_prefix_valContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_an_crud_url_prefix_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_link_suffixContext extends ParserRuleContext {
		public TerminalNode KW_LINK_SUFFIX() { return getToken(ZmeiLangParser.KW_LINK_SUFFIX, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_crud_link_suffix_valContext an_crud_link_suffix_val() {
			return getRuleContext(An_crud_link_suffix_valContext.class,0);
		}
		public An_crud_link_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_link_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_link_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_link_suffix(this);
		}
	}

	public final An_crud_link_suffixContext an_crud_link_suffix() throws RecognitionException {
		An_crud_link_suffixContext _localctx = new An_crud_link_suffixContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_an_crud_link_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(KW_LINK_SUFFIX);
			setState(1733);
			match(COLON);
			setState(1734);
			an_crud_link_suffix_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_link_suffix_valContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_crud_link_suffix_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_link_suffix_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_link_suffix_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_link_suffix_val(this);
		}
	}

	public final An_crud_link_suffix_valContext an_crud_link_suffix_val() throws RecognitionException {
		An_crud_link_suffix_valContext _localctx = new An_crud_link_suffix_valContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_an_crud_link_suffix_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_item_nameContext extends ParserRuleContext {
		public TerminalNode KW_ITEM_NAME() { return getToken(ZmeiLangParser.KW_ITEM_NAME, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_crud_item_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_item_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_item_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_item_name(this);
		}
	}

	public final An_crud_item_nameContext an_crud_item_name() throws RecognitionException {
		An_crud_item_nameContext _localctx = new An_crud_item_nameContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_an_crud_item_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(KW_ITEM_NAME);
			setState(1739);
			match(COLON);
			setState(1740);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_object_exprContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT_EXPR() { return getToken(ZmeiLangParser.KW_OBJECT_EXPR, 0); }
		public Code_lineContext code_line() {
			return getRuleContext(Code_lineContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_crud_object_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_object_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_object_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_object_expr(this);
		}
	}

	public final An_crud_object_exprContext an_crud_object_expr() throws RecognitionException {
		An_crud_object_exprContext _localctx = new An_crud_object_exprContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_an_crud_object_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(KW_OBJECT_EXPR);
			setState(1746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1743);
				code_line();
				}
				break;
			case COLON:
				{
				setState(1744);
				match(COLON);
				setState(1745);
				code_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_can_editContext extends ParserRuleContext {
		public TerminalNode KW_CAN_EDIT() { return getToken(ZmeiLangParser.KW_CAN_EDIT, 0); }
		public Code_lineContext code_line() {
			return getRuleContext(Code_lineContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_crud_can_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_can_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_can_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_can_edit(this);
		}
	}

	public final An_crud_can_editContext an_crud_can_edit() throws RecognitionException {
		An_crud_can_editContext _localctx = new An_crud_can_editContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_an_crud_can_edit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(KW_CAN_EDIT);
			setState(1752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1749);
				code_line();
				}
				break;
			case COLON:
				{
				setState(1750);
				match(COLON);
				setState(1751);
				code_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_blockContext extends ParserRuleContext {
		public TerminalNode KW_BLOCK() { return getToken(ZmeiLangParser.KW_BLOCK, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_crud_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_block(this);
		}
	}

	public final An_crud_blockContext an_crud_block() throws RecognitionException {
		An_crud_blockContext _localctx = new An_crud_blockContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_an_crud_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(KW_BLOCK);
			setState(1755);
			match(COLON);
			setState(1756);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_pk_paramContext extends ParserRuleContext {
		public TerminalNode KW_PK_PARAM() { return getToken(ZmeiLangParser.KW_PK_PARAM, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_crud_pk_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_pk_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_pk_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_pk_param(this);
		}
	}

	public final An_crud_pk_paramContext an_crud_pk_param() throws RecognitionException {
		An_crud_pk_paramContext _localctx = new An_crud_pk_paramContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_an_crud_pk_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(KW_PK_PARAM);
			setState(1759);
			match(COLON);
			setState(1760);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_skipContext extends ParserRuleContext {
		public TerminalNode KW_SKIP() { return getToken(ZmeiLangParser.KW_SKIP, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_crud_skip_valuesContext an_crud_skip_values() {
			return getRuleContext(An_crud_skip_valuesContext.class,0);
		}
		public An_crud_skipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_skip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_skip(this);
		}
	}

	public final An_crud_skipContext an_crud_skip() throws RecognitionException {
		An_crud_skipContext _localctx = new An_crud_skipContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_an_crud_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(KW_SKIP);
			setState(1763);
			match(COLON);
			setState(1764);
			an_crud_skip_values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_skip_valuesContext extends ParserRuleContext {
		public List<An_crud_view_nameContext> an_crud_view_name() {
			return getRuleContexts(An_crud_view_nameContext.class);
		}
		public An_crud_view_nameContext an_crud_view_name(int i) {
			return getRuleContext(An_crud_view_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_crud_skip_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_skip_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_skip_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_skip_values(this);
		}
	}

	public final An_crud_skip_valuesContext an_crud_skip_values() throws RecognitionException {
		An_crud_skip_valuesContext _localctx = new An_crud_skip_valuesContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_an_crud_skip_values);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			an_crud_view_name();
			setState(1771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1767);
					match(COMA);
					setState(1768);
					an_crud_view_name();
					}
					} 
				}
				setState(1773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_view_nameContext extends ParserRuleContext {
		public TerminalNode KW_DELETE() { return getToken(ZmeiLangParser.KW_DELETE, 0); }
		public TerminalNode KW_LIST() { return getToken(ZmeiLangParser.KW_LIST, 0); }
		public TerminalNode KW_CREATE() { return getToken(ZmeiLangParser.KW_CREATE, 0); }
		public TerminalNode KW_EDIT() { return getToken(ZmeiLangParser.KW_EDIT, 0); }
		public TerminalNode KW_DETAIL() { return getToken(ZmeiLangParser.KW_DETAIL, 0); }
		public An_crud_view_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_view_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_view_name(this);
		}
	}

	public final An_crud_view_nameContext an_crud_view_name() throws RecognitionException {
		An_crud_view_nameContext _localctx = new An_crud_view_nameContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_an_crud_view_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_la = _input.LA(1);
			if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KW_DELETE - 43)) | (1L << (KW_EDIT - 43)) | (1L << (KW_CREATE - 43)) | (1L << (KW_DETAIL - 43)) | (1L << (KW_LIST - 43)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_fieldsContext extends ParserRuleContext {
		public TerminalNode KW_FIELDS() { return getToken(ZmeiLangParser.KW_FIELDS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_crud_fields_exprContext an_crud_fields_expr() {
			return getRuleContext(An_crud_fields_exprContext.class,0);
		}
		public An_crud_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_fields(this);
		}
	}

	public final An_crud_fieldsContext an_crud_fields() throws RecognitionException {
		An_crud_fieldsContext _localctx = new An_crud_fieldsContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_an_crud_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(KW_FIELDS);
			setState(1777);
			match(COLON);
			setState(1778);
			an_crud_fields_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_fields_exprContext extends ParserRuleContext {
		public List<An_crud_fieldContext> an_crud_field() {
			return getRuleContexts(An_crud_fieldContext.class);
		}
		public An_crud_fieldContext an_crud_field(int i) {
			return getRuleContext(An_crud_fieldContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_crud_fields_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_fields_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_fields_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_fields_expr(this);
		}
	}

	public final An_crud_fields_exprContext an_crud_fields_expr() throws RecognitionException {
		An_crud_fields_exprContext _localctx = new An_crud_fields_exprContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_an_crud_fields_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			an_crud_field();
			setState(1785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1781);
					match(COMA);
					setState(1782);
					an_crud_field();
					}
					} 
				}
				setState(1787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_fieldContext extends ParserRuleContext {
		public An_crud_field_specContext an_crud_field_spec() {
			return getRuleContext(An_crud_field_specContext.class,0);
		}
		public An_crud_field_filterContext an_crud_field_filter() {
			return getRuleContext(An_crud_field_filterContext.class,0);
		}
		public An_crud_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_field(this);
		}
	}

	public final An_crud_fieldContext an_crud_field() throws RecognitionException {
		An_crud_fieldContext _localctx = new An_crud_fieldContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_an_crud_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			an_crud_field_spec();
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_BLOCK) {
				{
				setState(1789);
				an_crud_field_filter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_field_specContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ZmeiLangParser.STAR, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode EXCLUDE() { return getToken(ZmeiLangParser.EXCLUDE, 0); }
		public An_crud_field_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_field_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_field_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_field_spec(this);
		}
	}

	public final An_crud_field_specContext an_crud_field_spec() throws RecognitionException {
		An_crud_field_specContext _localctx = new An_crud_field_specContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_an_crud_field_spec);
		int _la;
		try {
			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				match(STAR);
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
			case EXCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLUDE) {
					{
					setState(1793);
					match(EXCLUDE);
					}
				}

				setState(1796);
				id_or_kw();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_field_filterContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public An_crud_field_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_field_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_field_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_field_filter(this);
		}
	}

	public final An_crud_field_filterContext an_crud_field_filter() throws RecognitionException {
		An_crud_field_filterContext _localctx = new An_crud_field_filterContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_an_crud_field_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_list_fieldsContext extends ParserRuleContext {
		public TerminalNode KW_LIST_FIELDS() { return getToken(ZmeiLangParser.KW_LIST_FIELDS, 0); }
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_crud_list_fields_exprContext an_crud_list_fields_expr() {
			return getRuleContext(An_crud_list_fields_exprContext.class,0);
		}
		public An_crud_list_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_list_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_list_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_list_fields(this);
		}
	}

	public final An_crud_list_fieldsContext an_crud_list_fields() throws RecognitionException {
		An_crud_list_fieldsContext _localctx = new An_crud_list_fieldsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_an_crud_list_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(KW_LIST_FIELDS);
			setState(1802);
			match(COLON);
			setState(1803);
			an_crud_list_fields_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_list_fields_exprContext extends ParserRuleContext {
		public List<An_crud_list_fieldContext> an_crud_list_field() {
			return getRuleContexts(An_crud_list_fieldContext.class);
		}
		public An_crud_list_fieldContext an_crud_list_field(int i) {
			return getRuleContext(An_crud_list_fieldContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_crud_list_fields_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_list_fields_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_list_fields_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_list_fields_expr(this);
		}
	}

	public final An_crud_list_fields_exprContext an_crud_list_fields_expr() throws RecognitionException {
		An_crud_list_fields_exprContext _localctx = new An_crud_list_fields_exprContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_an_crud_list_fields_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			an_crud_list_field();
			setState(1810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1806);
					match(COMA);
					setState(1807);
					an_crud_list_field();
					}
					} 
				}
				setState(1812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_list_fieldContext extends ParserRuleContext {
		public An_crud_list_field_specContext an_crud_list_field_spec() {
			return getRuleContext(An_crud_list_field_specContext.class,0);
		}
		public An_crud_list_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_list_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_list_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_list_field(this);
		}
	}

	public final An_crud_list_fieldContext an_crud_list_field() throws RecognitionException {
		An_crud_list_fieldContext _localctx = new An_crud_list_fieldContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_an_crud_list_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			an_crud_list_field_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_list_field_specContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ZmeiLangParser.STAR, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public TerminalNode EXCLUDE() { return getToken(ZmeiLangParser.EXCLUDE, 0); }
		public An_crud_list_field_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_list_field_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_list_field_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_list_field_spec(this);
		}
	}

	public final An_crud_list_field_specContext an_crud_list_field_spec() throws RecognitionException {
		An_crud_list_field_specContext _localctx = new An_crud_list_field_specContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_an_crud_list_field_spec);
		int _la;
		try {
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1815);
				match(STAR);
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
			case EXCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLUDE) {
					{
					setState(1816);
					match(EXCLUDE);
					}
				}

				setState(1819);
				id_or_kw();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_editContext extends ParserRuleContext {
		public TerminalNode AN_CRUD_EDIT() { return getToken(ZmeiLangParser.AN_CRUD_EDIT, 0); }
		public An_crud_paramsContext an_crud_params() {
			return getRuleContext(An_crud_paramsContext.class,0);
		}
		public An_crud_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_edit(this);
		}
	}

	public final An_crud_editContext an_crud_edit() throws RecognitionException {
		An_crud_editContext _localctx = new An_crud_editContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_an_crud_edit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			match(AN_CRUD_EDIT);
			setState(1823);
			an_crud_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_deleteContext extends ParserRuleContext {
		public TerminalNode AN_CRUD_DELETE() { return getToken(ZmeiLangParser.AN_CRUD_DELETE, 0); }
		public An_crud_paramsContext an_crud_params() {
			return getRuleContext(An_crud_paramsContext.class,0);
		}
		public An_crud_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_delete(this);
		}
	}

	public final An_crud_deleteContext an_crud_delete() throws RecognitionException {
		An_crud_deleteContext _localctx = new An_crud_deleteContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_an_crud_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(AN_CRUD_DELETE);
			setState(1826);
			an_crud_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_crud_detailContext extends ParserRuleContext {
		public TerminalNode AN_CRUD_DETAIL() { return getToken(ZmeiLangParser.AN_CRUD_DETAIL, 0); }
		public An_crud_paramsContext an_crud_params() {
			return getRuleContext(An_crud_paramsContext.class,0);
		}
		public An_crud_detailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_crud_detail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_crud_detail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_crud_detail(this);
		}
	}

	public final An_crud_detailContext an_crud_detail() throws RecognitionException {
		An_crud_detailContext _localctx = new An_crud_detailContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_an_crud_detail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(AN_CRUD_DETAIL);
			setState(1829);
			an_crud_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menuContext extends ParserRuleContext {
		public TerminalNode AN_MENU() { return getToken(ZmeiLangParser.AN_MENU, 0); }
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_menu_descriptorContext an_menu_descriptor() {
			return getRuleContext(An_menu_descriptorContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public List<An_menu_itemContext> an_menu_item() {
			return getRuleContexts(An_menu_itemContext.class);
		}
		public An_menu_itemContext an_menu_item(int i) {
			return getRuleContext(An_menu_itemContext.class,i);
		}
		public An_menuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu(this);
		}
	}

	public final An_menuContext an_menu() throws RecognitionException {
		An_menuContext _localctx = new An_menuContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_an_menu);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(AN_MENU);
			setState(1832);
			match(DOT);
			setState(1833);
			an_menu_descriptor();
			setState(1834);
			match(BRACE_OPEN);
			setState(1838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1835);
					match(NL);
					}
					} 
				}
				setState(1840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1842); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1841);
					an_menu_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1844); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1846);
				match(NL);
				}
				}
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1852);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_menu_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_descriptor(this);
		}
	}

	public final An_menu_descriptorContext an_menu_descriptor() throws RecognitionException {
		An_menu_descriptorContext _localctx = new An_menu_descriptorContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_an_menu_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_itemContext extends ParserRuleContext {
		public An_menu_labelContext an_menu_label() {
			return getRuleContext(An_menu_labelContext.class,0);
		}
		public An_menu_item_codeContext an_menu_item_code() {
			return getRuleContext(An_menu_item_codeContext.class,0);
		}
		public An_menu_targetContext an_menu_target() {
			return getRuleContext(An_menu_targetContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ZmeiLangParser.COMA, 0); }
		public List<TerminalNode> NL() { return getTokens(ZmeiLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ZmeiLangParser.NL, i);
		}
		public An_menu_item_argsContext an_menu_item_args() {
			return getRuleContext(An_menu_item_argsContext.class,0);
		}
		public An_menu_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item(this);
		}
	}

	public final An_menu_itemContext an_menu_item() throws RecognitionException {
		An_menu_itemContext _localctx = new An_menu_itemContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_an_menu_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(1856);
				match(COMA);
				}
			}

			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1859);
				match(NL);
				}
				}
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQ_BRACE_OPEN) {
				{
				setState(1865);
				an_menu_item_args();
				}
			}

			setState(1868);
			an_menu_label();
			setState(1871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1869);
				an_menu_item_code();
				}
				break;
			case COLON:
				{
				setState(1870);
				an_menu_target();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1873);
					match(NL);
					}
					} 
				}
				setState(1878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_targetContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ZmeiLangParser.COLON, 0); }
		public An_menu_item_pageContext an_menu_item_page() {
			return getRuleContext(An_menu_item_pageContext.class,0);
		}
		public An_menu_item_urlContext an_menu_item_url() {
			return getRuleContext(An_menu_item_urlContext.class,0);
		}
		public An_menu_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_target(this);
		}
	}

	public final An_menu_targetContext an_menu_target() throws RecognitionException {
		An_menu_targetContext _localctx = new An_menu_targetContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_an_menu_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(COLON);
			setState(1882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PAGE:
				{
				setState(1880);
				an_menu_item_page();
				}
				break;
			case STRING_DQ:
			case STRING_SQ:
				{
				setState(1881);
				an_menu_item_url();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_codeContext extends ParserRuleContext {
		public Code_lineContext code_line() {
			return getRuleContext(Code_lineContext.class,0);
		}
		public An_menu_item_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_code(this);
		}
	}

	public final An_menu_item_codeContext an_menu_item_code() throws RecognitionException {
		An_menu_item_codeContext _localctx = new An_menu_item_codeContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_an_menu_item_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			code_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_argsContext extends ParserRuleContext {
		public TerminalNode SQ_BRACE_OPEN() { return getToken(ZmeiLangParser.SQ_BRACE_OPEN, 0); }
		public List<An_menu_item_argContext> an_menu_item_arg() {
			return getRuleContexts(An_menu_item_argContext.class);
		}
		public An_menu_item_argContext an_menu_item_arg(int i) {
			return getRuleContext(An_menu_item_argContext.class,i);
		}
		public TerminalNode SQ_BRACE_CLOSE() { return getToken(ZmeiLangParser.SQ_BRACE_CLOSE, 0); }
		public List<TerminalNode> COMA() { return getTokens(ZmeiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ZmeiLangParser.COMA, i);
		}
		public An_menu_item_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_args(this);
		}
	}

	public final An_menu_item_argsContext an_menu_item_args() throws RecognitionException {
		An_menu_item_argsContext _localctx = new An_menu_item_argsContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_an_menu_item_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(SQ_BRACE_OPEN);
			setState(1887);
			an_menu_item_arg();
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1888);
				match(COMA);
				setState(1889);
				an_menu_item_arg();
				}
				}
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1895);
			match(SQ_BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_argContext extends ParserRuleContext {
		public An_menu_item_arg_keyContext an_menu_item_arg_key() {
			return getRuleContext(An_menu_item_arg_keyContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ZmeiLangParser.EQUALS, 0); }
		public An_menu_item_arg_valContext an_menu_item_arg_val() {
			return getRuleContext(An_menu_item_arg_valContext.class,0);
		}
		public An_menu_item_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_arg(this);
		}
	}

	public final An_menu_item_argContext an_menu_item_arg() throws RecognitionException {
		An_menu_item_argContext _localctx = new An_menu_item_argContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_an_menu_item_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			an_menu_item_arg_key();
			setState(1898);
			match(EQUALS);
			setState(1899);
			an_menu_item_arg_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_arg_keyContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_menu_item_arg_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_arg_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_arg_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_arg_key(this);
		}
	}

	public final An_menu_item_arg_keyContext an_menu_item_arg_key() throws RecognitionException {
		An_menu_item_arg_keyContext _localctx = new An_menu_item_arg_keyContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_an_menu_item_arg_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_arg_valContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_menu_item_arg_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_arg_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_arg_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_arg_val(this);
		}
	}

	public final An_menu_item_arg_valContext an_menu_item_arg_val() throws RecognitionException {
		An_menu_item_arg_valContext _localctx = new An_menu_item_arg_valContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_an_menu_item_arg_val);
		try {
			setState(1906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_DQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				match(STRING_SQ);
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				id_or_kw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_urlContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public An_menu_item_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_url(this);
		}
	}

	public final An_menu_item_urlContext an_menu_item_url() throws RecognitionException {
		An_menu_item_urlContext _localctx = new An_menu_item_urlContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_an_menu_item_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			_la = _input.LA(1);
			if ( !(_la==STRING_DQ || _la==STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_pageContext extends ParserRuleContext {
		public TerminalNode KW_PAGE() { return getToken(ZmeiLangParser.KW_PAGE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ZmeiLangParser.BRACE_OPEN, 0); }
		public An_menu_item_page_refContext an_menu_item_page_ref() {
			return getRuleContext(An_menu_item_page_refContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ZmeiLangParser.BRACE_CLOSE, 0); }
		public An_menu_item_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_page(this);
		}
	}

	public final An_menu_item_pageContext an_menu_item_page() throws RecognitionException {
		An_menu_item_pageContext _localctx = new An_menu_item_pageContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_an_menu_item_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(KW_PAGE);
			setState(1911);
			match(BRACE_OPEN);
			setState(1912);
			an_menu_item_page_ref();
			setState(1913);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_item_page_refContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_menu_item_page_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_item_page_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_item_page_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_item_page_ref(this);
		}
	}

	public final An_menu_item_page_refContext an_menu_item_page_ref() throws RecognitionException {
		An_menu_item_page_refContext _localctx = new An_menu_item_page_refContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_an_menu_item_page_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_menu_labelContext extends ParserRuleContext {
		public TerminalNode STRING_DQ() { return getToken(ZmeiLangParser.STRING_DQ, 0); }
		public TerminalNode STRING_SQ() { return getToken(ZmeiLangParser.STRING_SQ, 0); }
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_menu_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_menu_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_menu_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_menu_label(this);
		}
	}

	public final An_menu_labelContext an_menu_label() throws RecognitionException {
		An_menu_labelContext _localctx = new An_menu_labelContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_an_menu_label);
		try {
			setState(1920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_DQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1917);
				match(STRING_DQ);
				}
				break;
			case STRING_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1918);
				match(STRING_SQ);
				}
				break;
			case WRITE_MODE:
			case BOOL:
			case KW_THEME:
			case KW_PAGE:
			case KW_LINK_SUFFIX:
			case KW_URL_PREFIX:
			case KW_CAN_EDIT:
			case KW_OBJECT_EXPR:
			case KW_BLOCK:
			case KW_ITEM_NAME:
			case KW_PK_PARAM:
			case KW_LIST_FIELDS:
			case KW_DELETE:
			case KW_EDIT:
			case KW_CREATE:
			case KW_DETAIL:
			case KW_SKIP:
			case KW_FROM:
			case KW_POLY_LIST:
			case KW_CSS:
			case KW_JS:
			case KW_INLINE_TYPE:
			case KW_AUTH_TYPE:
			case KW_INLINE:
			case KW_TYPE:
			case KW_USER_FIELD:
			case KW_ANNOTATE:
			case KW_ON_CREATE:
			case KW_QUERY:
			case KW_AUTH:
			case KW_COUNT:
			case KW_I18N:
			case KW_EXTRA:
			case KW_TABS:
			case KW_LIST:
			case KW_READ_ONLY:
			case KW_LIST_EDITABLE:
			case KW_LIST_FILTER:
			case KW_LIST_SEARCH:
			case KW_FIELDS:
			case KW_IMPORT:
			case KW_AS:
			case COL_FIELD_TYPE_LONGTEXT:
			case COL_FIELD_TYPE_HTML:
			case COL_FIELD_TYPE_HTML_MEDIA:
			case COL_FIELD_TYPE_FLOAT:
			case COL_FIELD_TYPE_DECIMAL:
			case COL_FIELD_TYPE_DATE:
			case COL_FIELD_TYPE_DATETIME:
			case COL_FIELD_TYPE_CREATE_TIME:
			case COL_FIELD_TYPE_UPDATE_TIME:
			case COL_FIELD_TYPE_IMAGE:
			case COL_FIELD_TYPE_FILE:
			case COL_FIELD_TYPE_FILER_IMAGE:
			case COL_FIELD_TYPE_FILER_FILE:
			case COL_FIELD_TYPE_FILER_FOLDER:
			case COL_FIELD_TYPE_FILER_IMAGE_FOLDER:
			case COL_FIELD_TYPE_TEXT:
			case COL_FIELD_TYPE_INT:
			case COL_FIELD_TYPE_SLUG:
			case COL_FIELD_TYPE_BOOL:
			case COL_FIELD_TYPE_ONE:
			case COL_FIELD_TYPE_ONE2ONE:
			case COL_FIELD_TYPE_MANY:
			case COL_FIELD_CHOICES:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				id_or_kw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_htmlContext extends ParserRuleContext {
		public TerminalNode AN_HTML() { return getToken(ZmeiLangParser.AN_HTML, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ZmeiLangParser.DOT, 0); }
		public An_html_descriptorContext an_html_descriptor() {
			return getRuleContext(An_html_descriptorContext.class,0);
		}
		public An_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_html(this);
		}
	}

	public final An_htmlContext an_html() throws RecognitionException {
		An_htmlContext _localctx = new An_htmlContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_an_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			match(AN_HTML);
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1923);
				match(DOT);
				setState(1924);
				an_html_descriptor();
				}
			}

			setState(1927);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class An_html_descriptorContext extends ParserRuleContext {
		public Id_or_kwContext id_or_kw() {
			return getRuleContext(Id_or_kwContext.class,0);
		}
		public An_html_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_html_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).enterAn_html_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZmeiLangParserListener ) ((ZmeiLangParserListener)listener).exitAn_html_descriptor(this);
		}
	}

	public final An_html_descriptorContext an_html_descriptor() throws RecognitionException {
		An_html_descriptorContext _localctx = new An_html_descriptorContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_an_html_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			id_or_kw();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008b\u078e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\3\2\7\2\u01c6"+
		"\n\2\f\2\16\2\u01c9\13\2\3\2\7\2\u01cc\n\2\f\2\16\2\u01cf\13\2\3\2\7\2"+
		"\u01d2\n\2\f\2\16\2\u01d5\13\2\3\2\5\2\u01d8\n\2\3\2\6\2\u01db\n\2\r\2"+
		"\16\2\u01dc\5\2\u01df\n\2\3\2\7\2\u01e2\n\2\f\2\16\2\u01e5\13\2\3\2\5"+
		"\2\u01e8\n\2\3\2\6\2\u01eb\n\2\r\2\16\2\u01ec\5\2\u01ef\n\2\3\2\7\2\u01f2"+
		"\n\2\f\2\16\2\u01f5\13\2\3\2\3\2\3\3\6\3\u01fa\n\3\r\3\16\3\u01fb\3\4"+
		"\6\4\u01ff\n\4\r\4\16\4\u0200\3\5\3\5\3\5\3\5\3\5\6\5\u0208\n\5\r\5\16"+
		"\5\u0209\3\6\3\6\3\6\3\6\3\6\6\6\u0211\n\6\r\6\16\6\u0212\3\7\3\7\3\7"+
		"\7\7\u0218\n\7\f\7\16\7\u021b\13\7\3\b\3\b\3\t\3\t\3\t\7\t\u0222\n\t\f"+
		"\t\16\t\u0225\13\t\3\n\5\n\u0228\n\n\3\n\3\n\3\n\3\n\7\n\u022e\n\n\f\n"+
		"\16\n\u0231\13\n\3\n\3\n\3\n\5\n\u0236\n\n\3\n\7\n\u0239\n\n\f\n\16\n"+
		"\u023c\13\n\5\n\u023e\n\n\3\13\5\13\u0241\n\13\3\13\3\13\5\13\u0245\n"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u024d\n\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20\u0259\n\20\3\21\3\21\3\21\5\21\u025e\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0268\n\23\f\23\16\23\u026b"+
		"\13\23\3\24\3\24\3\24\5\24\u0270\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0277"+
		"\n\25\3\26\3\26\3\27\3\27\5\27\u027d\n\27\3\27\7\27\u0280\n\27\f\27\16"+
		"\27\u0283\13\27\3\27\7\27\u0286\n\27\f\27\16\27\u0289\13\27\3\27\7\27"+
		"\u028c\n\27\f\27\16\27\u028f\13\27\3\27\7\27\u0292\n\27\f\27\16\27\u0295"+
		"\13\27\3\27\7\27\u0298\n\27\f\27\16\27\u029b\13\27\3\30\3\30\3\30\6\30"+
		"\u02a0\n\30\r\30\16\30\u02a1\3\30\5\30\u02a5\n\30\3\31\3\31\5\31\u02a9"+
		"\n\31\3\31\3\31\5\31\u02ad\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\6\32"+
		"\u02b6\n\32\r\32\16\32\u02b7\3\33\3\33\3\33\3\33\5\33\u02be\n\33\3\34"+
		"\3\34\3\34\5\34\u02c3\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u02ca\n\35\3"+
		"\36\3\36\3\37\7\37\u02cf\n\37\f\37\16\37\u02d2\13\37\3\37\3\37\5\37\u02d6"+
		"\n\37\3\37\5\37\u02d9\n\37\3\37\5\37\u02dc\n\37\3\37\6\37\u02df\n\37\r"+
		"\37\16\37\u02e0\3\37\5\37\u02e4\n\37\3 \3 \5 \u02e8\n \3 \3 \3 \5 \u02ed"+
		"\n \3 \3 \3 \5 \u02f2\n \3!\3!\3\"\5\"\u02f7\n\"\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\6(\u0308\n(\r(\16(\u0309\3(\3(\5(\u030e\n"+
		"(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u032c\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		":\3:\3:\5:\u034b\n:\3:\3:\5:\u034f\n:\3;\3;\3<\3<\3<\3<\3<\7<\u0358\n"+
		"<\f<\16<\u035b\13<\3=\5=\u035e\n=\3=\3=\3>\3>\3>\5>\u0365\n>\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\5@\u036f\n@\3A\3A\3A\3A\3A\7A\u0376\nA\fA\16A\u0379\13"+
		"A\3B\5B\u037c\nB\3B\3B\3C\3C\3C\5C\u0383\nC\3D\3D\3D\3E\3E\3E\3E\3E\3"+
		"F\3F\3F\7F\u0390\nF\fF\16F\u0393\13F\3G\3G\3H\3H\3H\3H\3H\5H\u039c\nH"+
		"\3I\3I\3J\3J\3J\3J\3J\5J\u03a5\nJ\3K\3K\3L\3L\3L\7L\u03ac\nL\fL\16L\u03af"+
		"\13L\3M\3M\3M\3M\3N\3N\3O\3O\3O\3P\7P\u03bb\nP\fP\16P\u03be\13P\3Q\3Q"+
		"\3Q\3R\3R\3R\3R\5R\u03c7\nR\3R\5R\u03ca\nR\3R\3R\3S\3S\3T\3T\3T\3U\3U"+
		"\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03e8\nW"+
		"\3X\3X\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u03f9\n[\f[\16[\u03fc"+
		"\13[\3\\\3\\\3\\\5\\\u0401\n\\\3\\\3\\\3\\\3\\\5\\\u0407\n\\\3]\3]\3]"+
		"\3]\7]\u040d\n]\f]\16]\u0410\13]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u041c"+
		"\n^\f^\16^\u041f\13^\3_\3_\3`\3`\3`\3`\7`\u0427\n`\f`\16`\u042a\13`\3"+
		"a\3a\3a\7a\u042f\na\fa\16a\u0432\13a\3b\3b\5b\u0436\nb\3b\3b\7b\u043a"+
		"\nb\fb\16b\u043d\13b\3c\3c\3c\3c\7c\u0443\nc\fc\16c\u0446\13c\3d\3d\3"+
		"d\3d\7d\u044c\nd\fd\16d\u044f\13d\3e\3e\3e\3e\5e\u0455\ne\3e\7e\u0458"+
		"\ne\fe\16e\u045b\13e\3f\3f\3g\3g\3g\3g\3g\7g\u0464\ng\fg\16g\u0467\13"+
		"g\3g\3g\3h\3h\3h\3h\5h\u046f\nh\3i\3i\3i\3j\3j\3k\3k\3k\3k\7k\u047a\n"+
		"k\fk\16k\u047d\13k\3l\3l\3l\3l\5l\u0483\nl\3m\3m\3n\3n\3o\3o\3o\3o\3o"+
		"\6o\u048e\no\ro\16o\u048f\3p\3p\3p\3p\3p\3q\3q\3r\3r\3r\3r\3r\3r\7r\u049f"+
		"\nr\fr\16r\u04a2\13r\5r\u04a4\nr\3r\3r\5r\u04a8\nr\3s\3s\3t\3t\3u\3u\3"+
		"u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3{\3{\3|\3|\3"+
		"|\3|\3|\3}\3}\3~\3~\3~\3~\3~\5~\u04d1\n~\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\7\u0080\u04e3\n\u0080\f\u0080\16\u0080\u04e6"+
		"\13\u0080\3\u0080\7\u0080\u04e9\n\u0080\f\u0080\16\u0080\u04ec\13\u0080"+
		"\3\u0080\5\u0080\u04ef\n\u0080\3\u0080\7\u0080\u04f2\n\u0080\f\u0080\16"+
		"\u0080\u04f5\13\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u04fa\n\u0081\f"+
		"\u0081\16\u0081\u04fd\13\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0502\n"+
		"\u0081\f\u0081\16\u0081\u0505\13\u0081\3\u0081\7\u0081\u0508\n\u0081\f"+
		"\u0081\16\u0081\u050b\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\7\u0082\u0512\n\u0082\f\u0082\16\u0082\u0515\13\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0520"+
		"\n\u0085\f\u0085\16\u0085\u0523\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u052c\n\u0086\f\u0086\16\u0086\u052f"+
		"\13\u0086\3\u0086\5\u0086\u0532\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0547\n\u008b"+
		"\f\u008b\16\u008b\u054a\13\u008b\3\u008c\3\u008c\5\u008c\u054e\n\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\7\u008f\u055c\n\u008f\f\u008f\16\u008f\u055f"+
		"\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0565\n\u0090\f\u0090"+
		"\16\u0090\u0568\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u056e"+
		"\n\u0091\f\u0091\16\u0091\u0571\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u0577\n\u0092\f\u0092\16\u0092\u057a\13\u0092\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\7\u0093\u0580\n\u0093\f\u0093\16\u0093\u0583\13\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0589\n\u0094\f\u0094\16\u0094"+
		"\u058c\13\u0094\3\u0095\3\u0095\7\u0095\u0590\n\u0095\f\u0095\16\u0095"+
		"\u0593\13\u0095\3\u0095\3\u0095\7\u0095\u0597\n\u0095\f\u0095\16\u0095"+
		"\u059a\13\u0095\3\u0096\3\u0096\5\u0096\u059e\n\u0096\3\u0096\3\u0096"+
		"\5\u0096\u05a2\n\u0096\3\u0096\3\u0096\5\u0096\u05a6\n\u0096\3\u0096\3"+
		"\u0096\5\u0096\u05aa\n\u0096\5\u0096\u05ac\n\u0096\3\u0096\3\u0096\5\u0096"+
		"\u05b0\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u05bd\n\u009a\3\u009b\3\u009b"+
		"\3\u009b\7\u009b\u05c2\n\u009b\f\u009b\16\u009b\u05c5\13\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\6\u009c\u05cc\n\u009c\r\u009c\16\u009c"+
		"\u05cd\3\u009d\5\u009d\u05d1\n\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3"+
		"\u009e\6\u009e\u05d8\n\u009e\r\u009e\16\u009e\u05d9\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u05e2\n\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\6\u00a1\u05e7\n\u00a1\r\u00a1\16\u00a1\u05e8\3\u00a1\5\u00a1\u05ec"+
		"\n\u00a1\5\u00a1\u05ee\n\u00a1\3\u00a2\3\u00a2\3\u00a3\7\u00a3\u05f3\n"+
		"\u00a3\f\u00a3\16\u00a3\u05f6\13\u00a3\3\u00a3\5\u00a3\u05f9\n\u00a3\3"+
		"\u00a3\7\u00a3\u05fc\n\u00a3\f\u00a3\16\u00a3\u05ff\13\u00a3\3\u00a3\7"+
		"\u00a3\u0602\n\u00a3\f\u00a3\16\u00a3\u0605\13\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\6\u00a5\u060d\n\u00a5\r\u00a5\16\u00a5"+
		"\u060e\3\u00a5\5\u00a5\u0612\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0625\n\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u062a\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u0633\n\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\5\u00ad\u063b\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0647\n\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3"+
		"\u0651\n\u00b3\3\u00b3\3\u00b3\7\u00b3\u0655\n\u00b3\f\u00b3\16\u00b3"+
		"\u0658\13\u00b3\3\u00b3\3\u00b3\5\u00b3\u065c\n\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\7\u00b3\u066b\n\u00b3\f\u00b3\16\u00b3\u066e\13\u00b3"+
		"\3\u00b3\7\u00b3\u0671\n\u00b3\f\u00b3\16\u00b3\u0674\13\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u0678\n\u00b3\3\u00b3\7\u00b3\u067b\n\u00b3\f\u00b3\16"+
		"\u00b3\u067e\13\u00b3\3\u00b3\7\u00b3\u0681\n\u00b3\f\u00b3\16\u00b3\u0684"+
		"\13\u00b3\3\u00b3\7\u00b3\u0687\n\u00b3\f\u00b3\16\u00b3\u068a\13\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\7\u00b4\u0690\n\u00b4\f\u00b4\16\u00b4"+
		"\u0693\13\u00b4\3\u00b4\3\u00b4\7\u00b4\u0697\n\u00b4\f\u00b4\16\u00b4"+
		"\u069a\13\u00b4\3\u00b4\3\u00b4\7\u00b4\u069e\n\u00b4\f\u00b4\16\u00b4"+
		"\u06a1\13\u00b4\3\u00b4\3\u00b4\7\u00b4\u06a5\n\u00b4\f\u00b4\16\u00b4"+
		"\u06a8\13\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u06b9\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u06d5\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u06db\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\7\u00c6"+
		"\u06ec\n\u00c6\f\u00c6\16\u00c6\u06ef\13\u00c6\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u06fa\n\u00c9"+
		"\f\u00c9\16\u00c9\u06fd\13\u00c9\3\u00ca\3\u00ca\5\u00ca\u0701\n\u00ca"+
		"\3\u00cb\3\u00cb\5\u00cb\u0705\n\u00cb\3\u00cb\5\u00cb\u0708\n\u00cb\3"+
		"\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\7\u00ce\u0713\n\u00ce\f\u00ce\16\u00ce\u0716\13\u00ce\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\5\u00d0\u071c\n\u00d0\3\u00d0\5\u00d0\u071f\n\u00d0\3"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u072f\n\u00d4\f\u00d4"+
		"\16\u00d4\u0732\13\u00d4\3\u00d4\6\u00d4\u0735\n\u00d4\r\u00d4\16\u00d4"+
		"\u0736\3\u00d4\7\u00d4\u073a\n\u00d4\f\u00d4\16\u00d4\u073d\13\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\5\u00d6\u0744\n\u00d6\3\u00d6\7"+
		"\u00d6\u0747\n\u00d6\f\u00d6\16\u00d6\u074a\13\u00d6\3\u00d6\5\u00d6\u074d"+
		"\n\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0752\n\u00d6\3\u00d6\7\u00d6"+
		"\u0755\n\u00d6\f\u00d6\16\u00d6\u0758\13\u00d6\3\u00d7\3\u00d7\3\u00d7"+
		"\5\u00d7\u075d\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\7\u00d9\u0765\n\u00d9\f\u00d9\16\u00d9\u0768\13\u00d9\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\5\u00dc\u0775\n\u00dc\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0783\n\u00e0"+
		"\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0788\n\u00e1\3\u00e1\3\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e2\2\2\u00e3\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\2\n\4\2!acc\3\2|}\3\2\u0083\u0084\3\2uz\4\2ddnn\5\2"+
		"TTVVYY\3\2^`\4\2-\60CC\2\u07c2\2\u01c7\3\2\2\2\4\u01f9\3\2\2\2\6\u01fe"+
		"\3\2\2\2\b\u0202\3\2\2\2\n\u020b\3\2\2\2\f\u0214\3\2\2\2\16\u021c\3\2"+
		"\2\2\20\u021e\3\2\2\2\22\u023d\3\2\2\2\24\u0240\3\2\2\2\26\u0246\3\2\2"+
		"\2\30\u024c\3\2\2\2\32\u024e\3\2\2\2\34\u0252\3\2\2\2\36\u0258\3\2\2\2"+
		" \u025a\3\2\2\2\"\u025f\3\2\2\2$\u0264\3\2\2\2&\u026c\3\2\2\2(\u0271\3"+
		"\2\2\2*\u0278\3\2\2\2,\u027a\3\2\2\2.\u029c\3\2\2\2\60\u02a6\3\2\2\2\62"+
		"\u02b1\3\2\2\2\64\u02b9\3\2\2\2\66\u02c2\3\2\2\28\u02c4\3\2\2\2:\u02cb"+
		"\3\2\2\2<\u02d0\3\2\2\2>\u02f1\3\2\2\2@\u02f3\3\2\2\2B\u02f6\3\2\2\2D"+
		"\u02fa\3\2\2\2F\u02fd\3\2\2\2H\u02ff\3\2\2\2J\u0302\3\2\2\2L\u0304\3\2"+
		"\2\2N\u030d\3\2\2\2P\u030f\3\2\2\2R\u0312\3\2\2\2T\u0315\3\2\2\2V\u0317"+
		"\3\2\2\2X\u032b\3\2\2\2Z\u032d\3\2\2\2\\\u032f\3\2\2\2^\u0331\3\2\2\2"+
		"`\u0333\3\2\2\2b\u0335\3\2\2\2d\u0337\3\2\2\2f\u0339\3\2\2\2h\u033b\3"+
		"\2\2\2j\u033d\3\2\2\2l\u033f\3\2\2\2n\u0341\3\2\2\2p\u0343\3\2\2\2r\u0345"+
		"\3\2\2\2t\u0350\3\2\2\2v\u0352\3\2\2\2x\u035d\3\2\2\2z\u0364\3\2\2\2|"+
		"\u0366\3\2\2\2~\u0369\3\2\2\2\u0080\u0370\3\2\2\2\u0082\u037b\3\2\2\2"+
		"\u0084\u0382\3\2\2\2\u0086\u0384\3\2\2\2\u0088\u0387\3\2\2\2\u008a\u038c"+
		"\3\2\2\2\u008c\u0394\3\2\2\2\u008e\u0396\3\2\2\2\u0090\u039d\3\2\2\2\u0092"+
		"\u039f\3\2\2\2\u0094\u03a6\3\2\2\2\u0096\u03a8\3\2\2\2\u0098\u03b0\3\2"+
		"\2\2\u009a\u03b4\3\2\2\2\u009c\u03b6\3\2\2\2\u009e\u03bc\3\2\2\2\u00a0"+
		"\u03bf\3\2\2\2\u00a2\u03c2\3\2\2\2\u00a4\u03cd\3\2\2\2\u00a6\u03cf\3\2"+
		"\2\2\u00a8\u03d2\3\2\2\2\u00aa\u03d4\3\2\2\2\u00ac\u03e7\3\2\2\2\u00ae"+
		"\u03e9\3\2\2\2\u00b0\u03ee\3\2\2\2\u00b2\u03f0\3\2\2\2\u00b4\u03f5\3\2"+
		"\2\2\u00b6\u03fd\3\2\2\2\u00b8\u0408\3\2\2\2\u00ba\u041d\3\2\2\2\u00bc"+
		"\u0420\3\2\2\2\u00be\u0422\3\2\2\2\u00c0\u042b\3\2\2\2\u00c2\u0433\3\2"+
		"\2\2\u00c4\u043e\3\2\2\2\u00c6\u0447\3\2\2\2\u00c8\u0450\3\2\2\2\u00ca"+
		"\u045c\3\2\2\2\u00cc\u045e\3\2\2\2\u00ce\u046a\3\2\2\2\u00d0\u0470\3\2"+
		"\2\2\u00d2\u0473\3\2\2\2\u00d4\u0475\3\2\2\2\u00d6\u047e\3\2\2\2\u00d8"+
		"\u0484\3\2\2\2\u00da\u0486\3\2\2\2\u00dc\u0488\3\2\2\2\u00de\u0491\3\2"+
		"\2\2\u00e0\u0496\3\2\2\2\u00e2\u0498\3\2\2\2\u00e4\u04a9\3\2\2\2\u00e6"+
		"\u04ab\3\2\2\2\u00e8\u04ad\3\2\2\2\u00ea\u04b0\3\2\2\2\u00ec\u04b3\3\2"+
		"\2\2\u00ee\u04b6\3\2\2\2\u00f0\u04b9\3\2\2\2\u00f2\u04bc\3\2\2\2\u00f4"+
		"\u04bf\3\2\2\2\u00f6\u04c4\3\2\2\2\u00f8\u04c9\3\2\2\2\u00fa\u04cb\3\2"+
		"\2\2\u00fc\u04d2\3\2\2\2\u00fe\u04d4\3\2\2\2\u0100\u04f6\3\2\2\2\u0102"+
		"\u050c\3\2\2\2\u0104\u0516\3\2\2\2\u0106\u0518\3\2\2\2\u0108\u051a\3\2"+
		"\2\2\u010a\u0524\3\2\2\2\u010c\u0533\3\2\2\2\u010e\u0535\3\2\2\2\u0110"+
		"\u0539\3\2\2\2\u0112\u053d\3\2\2\2\u0114\u0541\3\2\2\2\u0116\u054b\3\2"+
		"\2\2\u0118\u0553\3\2\2\2\u011a\u0555\3\2\2\2\u011c\u0557\3\2\2\2\u011e"+
		"\u0560\3\2\2\2\u0120\u0569\3\2\2\2\u0122\u0572\3\2\2\2\u0124\u057b\3\2"+
		"\2\2\u0126\u0584\3\2\2\2\u0128\u058d\3\2\2\2\u012a\u059b\3\2\2\2\u012c"+
		"\u05b1\3\2\2\2\u012e\u05b5\3\2\2\2\u0130\u05b8\3\2\2\2\u0132\u05bc\3\2"+
		"\2\2\u0134\u05be\3\2\2\2\u0136\u05cb\3\2\2\2\u0138\u05d0\3\2\2\2\u013a"+
		"\u05d7\3\2\2\2\u013c\u05db\3\2\2\2\u013e\u05e1\3\2\2\2\u0140\u05ed\3\2"+
		"\2\2\u0142\u05ef\3\2\2\2\u0144\u05f4\3\2\2\2\u0146\u0606\3\2\2\2\u0148"+
		"\u0608\3\2\2\2\u014a\u0613\3\2\2\2\u014c\u0615\3\2\2\2\u014e\u0624\3\2"+
		"\2\2\u0150\u0626\3\2\2\2\u0152\u062d\3\2\2\2\u0154\u062f\3\2\2\2\u0156"+
		"\u0636\3\2\2\2\u0158\u0638\3\2\2\2\u015a\u063c\3\2\2\2\u015c\u0641\3\2"+
		"\2\2\u015e\u0643\3\2\2\2\u0160\u0648\3\2\2\2\u0162\u064b\3\2\2\2\u0164"+
		"\u0650\3\2\2\2\u0166\u068d\3\2\2\2\u0168\u06a9\3\2\2\2\u016a\u06ab\3\2"+
		"\2\2\u016c\u06af\3\2\2\2\u016e\u06b3\3\2\2\2\u0170\u06b8\3\2\2\2\u0172"+
		"\u06ba\3\2\2\2\u0174\u06bc\3\2\2\2\u0176\u06c0\3\2\2\2\u0178\u06c4\3\2"+
		"\2\2\u017a\u06c6\3\2\2\2\u017c\u06ca\3\2\2\2\u017e\u06cc\3\2\2\2\u0180"+
		"\u06d0\3\2\2\2\u0182\u06d6\3\2\2\2\u0184\u06dc\3\2\2\2\u0186\u06e0\3\2"+
		"\2\2\u0188\u06e4\3\2\2\2\u018a\u06e8\3\2\2\2\u018c\u06f0\3\2\2\2\u018e"+
		"\u06f2\3\2\2\2\u0190\u06f6\3\2\2\2\u0192\u06fe\3\2\2\2\u0194\u0707\3\2"+
		"\2\2\u0196\u0709\3\2\2\2\u0198\u070b\3\2\2\2\u019a\u070f\3\2\2\2\u019c"+
		"\u0717\3\2\2\2\u019e\u071e\3\2\2\2\u01a0\u0720\3\2\2\2\u01a2\u0723\3\2"+
		"\2\2\u01a4\u0726\3\2\2\2\u01a6\u0729\3\2\2\2\u01a8\u0740\3\2\2\2\u01aa"+
		"\u0743\3\2\2\2\u01ac\u0759\3\2\2\2\u01ae\u075e\3\2\2\2\u01b0\u0760\3\2"+
		"\2\2\u01b2\u076b\3\2\2\2\u01b4\u076f\3\2\2\2\u01b6\u0774\3\2\2\2\u01b8"+
		"\u0776\3\2\2\2\u01ba\u0778\3\2\2\2\u01bc\u077d\3\2\2\2\u01be\u0782\3\2"+
		"\2\2\u01c0\u0784\3\2\2\2\u01c2\u078b\3\2\2\2\u01c4\u01c6\7b\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01cd\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\5\36\20\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\7b\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01de\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\5\4\3\2\u01d7"+
		"\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01db\5\u0128"+
		"\u0095\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01d7\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e2\7b\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ee\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\5\6\4\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01eb\5,\27\2\u01ea\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\3\2"+
		"\2\2\u01f0\u01f2\7b\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6\u01f7\7\2\2\3\u01f7\3\3\2\2\2\u01f8\u01fa\5\b\5\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\5\3\2\2\2\u01fd\u01ff\5\n\6\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\7\3\2\2\2\u0202\u0203\7"+
		"\62\2\2\u0203\u0204\5\20\t\2\u0204\u0205\7I\2\2\u0205\u0207\5\f\7\2\u0206"+
		"\u0208\7b\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\t\3\2\2\2\u020b\u020c\7\62\2\2\u020c\u020d"+
		"\5\20\t\2\u020d\u020e\7I\2\2\u020e\u0210\5\f\7\2\u020f\u0211\7b\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\13\3\2\2\2\u0214\u0219\5\16\b\2\u0215\u0216\7q\2\2\u0216\u0218"+
		"\5\16\b\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\r\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\t"+
		"\2\2\2\u021d\17\3\2\2\2\u021e\u0223\5\16\b\2\u021f\u0220\7r\2\2\u0220"+
		"\u0222\5\16\b\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3"+
		"\2\2\2\u0223\u0224\3\2\2\2\u0224\21\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\7r\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022f\7y\2\2\u022a\u022b\7q\2\2\u022b\u022c\7i\2\2\u022c\u022e"+
		"\5\24\13\2\u022d\u022a\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2"+
		"\u022f\u0230\3\2\2\2\u0230\u023e\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u023a"+
		"\5\16\b\2\u0233\u0235\7q\2\2\u0234\u0236\7i\2\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\5\24\13\2\u0238\u0233\3"+
		"\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0227\3\2\2\2\u023d\u0232\3\2"+
		"\2\2\u023e\23\3\2\2\2\u023f\u0241\7y\2\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\5\16\b\2\u0243\u0245\7y\2\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\25\3\2\2\2\u0246\u0247\7l\2\2"+
		"\u0247\u0248\7!\2\2\u0248\u0249\7m\2\2\u0249\27\3\2\2\2\u024a\u024d\5"+
		"\34\17\2\u024b\u024d\5\32\16\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2"+
		"\u024d\31\3\2\2\2\u024e\u024f\7\u0083\2\2\u024f\u0250\7\u0087\2\2\u0250"+
		"\u0251\7b\2\2\u0251\33\3\2\2\2\u0252\u0253\7\u0085\2\2\u0253\35\3\2\2"+
		"\2\u0254\u0259\5(\25\2\u0255\u0259\5&\24\2\u0256\u0259\5\"\22\2\u0257"+
		"\u0259\7b\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0257\3\2\2\2\u0259\37\3\2\2\2\u025a\u025d\7\36\2\2\u025b\u025c"+
		"\7j\2\2\u025c\u025e\7k\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"!\3\2\2\2\u025f\u0260\7\35\2\2\u0260\u0261\7j\2\2\u0261\u0262\5$\23\2"+
		"\u0262\u0263\7k\2\2\u0263#\3\2\2\2\u0264\u0269\7c\2\2\u0265\u0266\7q\2"+
		"\2\u0266\u0268\7c\2\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a%\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026f\7\t\2\2\u026d\u026e\7j\2\2\u026e\u0270\7k\2\2\u026f\u026d\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\'\3\2\2\2\u0271\u0276\7 \2\2\u0272\u0273"+
		"\7j\2\2\u0273\u0274\5*\26\2\u0274\u0275\7k\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0272\3\2\2\2\u0276\u0277\3\2\2\2\u0277)\3\2\2\2\u0278\u0279\t\3\2\2"+
		"\u0279+\3\2\2\2\u027a\u027c\5\60\31\2\u027b\u027d\5.\30\2\u027c\u027b"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u0280\7b\2\2\u027f"+
		"\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0287\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\5<\37\2\u0285"+
		"\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028d\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028c\7b\2\2\u028b"+
		"\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0293\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\5\u00acW\2\u0291"+
		"\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7b\2\2\u0297"+
		"\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a-\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7u\2\2\u029d\u02a4"+
		"\t\3\2\2\u029e\u02a0\7b\2\2\u029f\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a5\7\2"+
		"\2\3\u02a4\u029f\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5/\3\2\2\2\u02a6\u02a8"+
		"\7s\2\2\u02a7\u02a9\58\35\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ac\5:\36\2\u02ab\u02ad\5\64\33\2\u02ac\u02ab\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\5\62\32\2\u02af"+
		"\u02b0\7b\2\2\u02b0\61\3\2\2\2\u02b1\u02b2\7b\2\2\u02b2\u02b3\7p\2\2\u02b3"+
		"\u02b5\7p\2\2\u02b4\u02b6\7p\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2"+
		"\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\63\3\2\2\2\u02b9\u02ba"+
		"\7h\2\2\u02ba\u02bd\5\66\34\2\u02bb\u02bc\7t\2\2\u02bc\u02be\5\66\34\2"+
		"\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\65\3\2\2\2\u02bf\u02c3"+
		"\5\16\b\2\u02c0\u02c3\7|\2\2\u02c1\u02c3\7}\2\2\u02c2\u02bf\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\67\3\2\2\2\u02c4\u02c9\5\16\b"+
		"\2\u02c5\u02c6\7p\2\2\u02c6\u02ca\7g\2\2\u02c7\u02c8\7z\2\2\u02c8\u02ca"+
		"\7g\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca9\3\2\2\2\u02cb\u02cc"+
		"\5\16\b\2\u02cc;\3\2\2\2\u02cd\u02cf\5V,\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d5\5T+\2\u02d4\u02d6\5> \2\u02d5\u02d4\3\2\2\2"+
		"\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d9\5R*\2\u02d8\u02d7"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02dc\5P)\2\u02db"+
		"\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02e3\3\2\2\2\u02dd\u02df\7b"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e4\7\2\2\3\u02e3\u02de\3\2"+
		"\2\2\u02e3\u02e2\3\2\2\2\u02e4=\3\2\2\2\u02e5\u02e7\7h\2\2\u02e6\u02e8"+
		"\5@!\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02f2\3\2\2\2\u02e9"+
		"\u02ea\7h\2\2\u02ea\u02ec\5X-\2\u02eb\u02ed\5B\"\2\u02ec\u02eb\3\2\2\2"+
		"\u02ec\u02ed\3\2\2\2\u02ed\u02f2\3\2\2\2\u02ee\u02ef\7h\2\2\u02ef\u02f2"+
		"\5F$\2\u02f0\u02f2\5H%\2\u02f1\u02e5\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1"+
		"\u02ee\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2?\3\2\2\2\u02f3\u02f4\5\34\17"+
		"\2\u02f4A\3\2\2\2\u02f5\u02f7\5D#\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\5\34\17\2\u02f9C\3\2\2\2\u02fa"+
		"\u02fb\7r\2\2\u02fb\u02fc\7r\2\2\u02fcE\3\2\2\2\u02fd\u02fe\5\16\b\2\u02fe"+
		"G\3\2\2\2\u02ff\u0300\5J&\2\u0300\u0301\5L\'\2\u0301I\3\2\2\2\u0302\u0303"+
		"\t\4\2\2\u0303K\3\2\2\2\u0304\u0305\7\u0087\2\2\u0305M\3\2\2\2\u0306\u0308"+
		"\5\16\b\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2"+
		"\u0309\u030a\3\2\2\2\u030a\u030e\3\2\2\2\u030b\u030e\7|\2\2\u030c\u030e"+
		"\7}\2\2\u030d\u0307\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"O\3\2\2\2\u030f\u0310\7n\2\2\u0310\u0311\5N(\2\u0311Q\3\2\2\2\u0312\u0313"+
		"\7t\2\2\u0313\u0314\5N(\2\u0314S\3\2\2\2\u0315\u0316\5\16\b\2\u0316U\3"+
		"\2\2\2\u0317\u0318\t\5\2\2\u0318W\3\2\2\2\u0319\u032c\5Z.\2\u031a\u032c"+
		"\5^\60\2\u031b\u032c\5\\/\2\u031c\u032c\5`\61\2\u031d\u032c\5b\62\2\u031e"+
		"\u032c\5d\63\2\u031f\u032c\5f\64\2\u0320\u032c\5h\65\2\u0321\u032c\5j"+
		"\66\2\u0322\u032c\5r:\2\u0323\u032c\5~@\2\u0324\u032c\5\u0088E\2\u0325"+
		"\u032c\5\u008eH\2\u0326\u032c\5\u00a2R\2\u0327\u032c\5\u0092J\2\u0328"+
		"\u032c\5l\67\2\u0329\u032c\5n8\2\u032a\u032c\5p9\2\u032b\u0319\3\2\2\2"+
		"\u032b\u031a\3\2\2\2\u032b\u031b\3\2\2\2\u032b\u031c\3\2\2\2\u032b\u031d"+
		"\3\2\2\2\u032b\u031e\3\2\2\2\u032b\u031f\3\2\2\2\u032b\u0320\3\2\2\2\u032b"+
		"\u0321\3\2\2\2\u032b\u0322\3\2\2\2\u032b\u0323\3\2\2\2\u032b\u0324\3\2"+
		"\2\2\u032b\u0325\3\2\2\2\u032b\u0326\3\2\2\2\u032b\u0327\3\2\2\2\u032b"+
		"\u0328\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032cY\3\2\2\2"+
		"\u032d\u032e\7K\2\2\u032e[\3\2\2\2\u032f\u0330\7L\2\2\u0330]\3\2\2\2\u0331"+
		"\u0332\7M\2\2\u0332_\3\2\2\2\u0333\u0334\7N\2\2\u0334a\3\2\2\2\u0335\u0336"+
		"\7O\2\2\u0336c\3\2\2\2\u0337\u0338\7P\2\2\u0338e\3\2\2\2\u0339\u033a\7"+
		"Q\2\2\u033ag\3\2\2\2\u033b\u033c\7R\2\2\u033ci\3\2\2\2\u033d\u033e\7S"+
		"\2\2\u033ek\3\2\2\2\u033f\u0340\7U\2\2\u0340m\3\2\2\2\u0341\u0342\7W\2"+
		"\2\u0342o\3\2\2\2\u0343\u0344\7X\2\2\u0344q\3\2\2\2\u0345\u034e\7Z\2\2"+
		"\u0346\u0347\7j\2\2\u0347\u034a\5t;\2\u0348\u0349\7q\2\2\u0349\u034b\5"+
		"v<\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034d\7k\2\2\u034d\u034f\3\2\2\2\u034e\u0346\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034fs\3\2\2\2\u0350\u0351\t\6\2\2\u0351u\3\2\2\2\u0352\u0353\7a"+
		"\2\2\u0353\u0354\7u\2\2\u0354\u0359\5x=\2\u0355\u0356\7q\2\2\u0356\u0358"+
		"\5x=\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035aw\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035e\5|?\2\u035d"+
		"\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\5z"+
		">\2\u0360y\3\2\2\2\u0361\u0365\5\16\b\2\u0362\u0365\7|\2\2\u0363\u0365"+
		"\7}\2\2\u0364\u0361\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0363\3\2\2\2\u0365"+
		"{\3\2\2\2\u0366\u0367\5\16\b\2\u0367\u0368\7h\2\2\u0368}\3\2\2\2\u0369"+
		"\u036e\7[\2\2\u036a\u036b\7j\2\2\u036b\u036c\5\u0080A\2\u036c\u036d\7"+
		"k\2\2\u036d\u036f\3\2\2\2\u036e\u036a\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\177\3\2\2\2\u0370\u0371\7a\2\2\u0371\u0372\7u\2\2\u0372\u0377\5\u0082"+
		"B\2\u0373\u0374\7q\2\2\u0374\u0376\5\u0082B\2\u0375\u0373\3\2\2\2\u0376"+
		"\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0081\3\2"+
		"\2\2\u0379\u0377\3\2\2\2\u037a\u037c\5\u0086D\2\u037b\u037a\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\5\u0084C\2\u037e\u0083"+
		"\3\2\2\2\u037f\u0383\5\16\b\2\u0380\u0383\7|\2\2\u0381\u0383\7}\2\2\u0382"+
		"\u037f\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u0085\3\2"+
		"\2\2\u0384\u0385\7d\2\2\u0385\u0386\7h\2\2\u0386\u0087\3\2\2\2\u0387\u0388"+
		"\7\\\2\2\u0388\u0389\7j\2\2\u0389\u038a\5\u008aF\2\u038a\u038b\7k\2\2"+
		"\u038b\u0089\3\2\2\2\u038c\u0391\5\u008cG\2\u038d\u038e\7q\2\2\u038e\u0390"+
		"\5\u008cG\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u008b\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0395"+
		"\5\16\b\2\u0395\u008d\3\2\2\2\u0396\u039b\7]\2\2\u0397\u0398\7j\2\2\u0398"+
		"\u0399\5\u0090I\2\u0399\u039a\7k\2\2\u039a\u039c\3\2\2\2\u039b\u0397\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c\u008f\3\2\2\2\u039d\u039e\7\"\2\2\u039e"+
		"\u0091\3\2\2\2\u039f\u03a4\5\u0094K\2\u03a0\u03a1\7j\2\2\u03a1\u03a2\5"+
		"\u0096L\2\u03a2\u03a3\7k\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u0093\3\2\2\2\u03a6\u03a7\t\7\2\2\u03a7\u0095\3\2"+
		"\2\2\u03a8\u03ad\5\u0098M\2\u03a9\u03aa\7q\2\2\u03aa\u03ac\5\u0098M\2"+
		"\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u0097\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\5\u009cO"+
		"\2\u03b1\u03b2\5\u009aN\2\u03b2\u03b3\5\u009eP\2\u03b3\u0099\3\2\2\2\u03b4"+
		"\u03b5\7e\2\2\u03b5\u009b\3\2\2\2\u03b6\u03b7\5\16\b\2\u03b7\u03b8\7u"+
		"\2\2\u03b8\u009d\3\2\2\2\u03b9\u03bb\5\u00a0Q\2\u03ba\u03b9\3\2\2\2\u03bb"+
		"\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u009f\3\2"+
		"\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c0\7{\2\2\u03c0\u03c1\5\16\b\2\u03c1"+
		"\u00a1\3\2\2\2\u03c2\u03c3\5\u00a4S\2\u03c3\u03c6\7j\2\2\u03c4\u03c7\5"+
		"\u00a6T\2\u03c5\u03c7\5\u00a8U\2\u03c6\u03c4\3\2\2\2\u03c6\u03c5\3\2\2"+
		"\2\u03c7\u03c9\3\2\2\2\u03c8\u03ca\5\u00aaV\2\u03c9\u03c8\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\7k\2\2\u03cc\u00a3\3\2"+
		"\2\2\u03cd\u03ce\t\b\2\2\u03ce\u00a5\3\2\2\2\u03cf\u03d0\7s\2\2\u03d0"+
		"\u03d1\5\16\b\2\u03d1\u00a7\3\2\2\2\u03d2\u03d3\5\20\t\2\u03d3\u00a9\3"+
		"\2\2\2\u03d4\u03d5\7p\2\2\u03d5\u03d6\7g\2\2\u03d6\u03d7\5\16\b\2\u03d7"+
		"\u00ab\3\2\2\2\u03d8\u03e8\5\u00fe\u0080\2\u03d9\u03e8\5\u00fa~\2\u03da"+
		"\u03e8\5\u00f6|\2\u03db\u03e8\5\u00f4{\2\u03dc\u03e8\5\u00f2z\2\u03dd"+
		"\u03e8\5\u00f0y\2\u03de\u03e8\5\u00eex\2\u03df\u03e8\5\u00ecw\2\u03e0"+
		"\u03e8\5\u00eav\2\u03e1\u03e8\5\u00e8u\2\u03e2\u03e8\5\u00e2r\2\u03e3"+
		"\u03e8\5\u00b6\\\2\u03e4\u03e8\5\u00b2Z\2\u03e5\u03e8\5\u00aeX\2\u03e6"+
		"\u03e8\7b\2\2\u03e7\u03d8\3\2\2\2\u03e7\u03d9\3\2\2\2\u03e7\u03da\3\2"+
		"\2\2\u03e7\u03db\3\2\2\2\u03e7\u03dc\3\2\2\2\u03e7\u03dd\3\2\2\2\u03e7"+
		"\u03de\3\2\2\2\u03e7\u03df\3\2\2\2\u03e7\u03e0\3\2\2\2\u03e7\u03e1\3\2"+
		"\2\2\u03e7\u03e2\3\2\2\2\u03e7\u03e3\3\2\2\2\u03e7\u03e4\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e6\3\2\2\2\u03e8\u00ad\3\2\2\2\u03e9\u03ea\7\34"+
		"\2\2\u03ea\u03eb\7j\2\2\u03eb\u03ec\5\u00b0Y\2\u03ec\u03ed\7k\2\2\u03ed"+
		"\u00af\3\2\2\2\u03ee\u03ef\5\16\b\2\u03ef\u00b1\3\2\2\2\u03f0\u03f1\7"+
		"\33\2\2\u03f1\u03f2\7j\2\2\u03f2\u03f3\5\u00b4[\2\u03f3\u03f4\7k\2\2\u03f4"+
		"\u00b3\3\2\2\2\u03f5\u03fa\5\16\b\2\u03f6\u03f7\7q\2\2\u03f7\u03f9\5\16"+
		"\b\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u00b5\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0400\7\32"+
		"\2\2\u03fe\u03ff\7r\2\2\u03ff\u0401\5\u00bc_\2\u0400\u03fe\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0406\3\2\2\2\u0402\u0403\7j\2\2\u0403\u0404\5\u00b8"+
		"]\2\u0404\u0405\7k\2\2\u0405\u0407\3\2\2\2\u0406\u0402\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u00b7\3\2\2\2\u0408\u040e\5\u00ba^\2\u0409\u040d\5\u00dc"+
		"o\2\u040a\u040d\7b\2\2\u040b\u040d\7q\2\2\u040c\u0409\3\2\2\2\u040c\u040a"+
		"\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u00b9\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u041c\5\u00c8"+
		"e\2\u0412\u041c\5\u00be`\2\u0413\u041c\5\u00ccg\2\u0414\u041c\5\u00c0"+
		"a\2\u0415\u041c\5\u00c2b\2\u0416\u041c\5\u00c4c\2\u0417\u041c\5\u00c6"+
		"d\2\u0418\u041c\5\u00d4k\2\u0419\u041c\7b\2\2\u041a\u041c\7q\2\2\u041b"+
		"\u0411\3\2\2\2\u041b\u0412\3\2\2\2\u041b\u0413\3\2\2\2\u041b\u0414\3\2"+
		"\2\2\u041b\u0415\3\2\2\2\u041b\u0416\3\2\2\2\u041b\u0417\3\2\2\2\u041b"+
		"\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u00bb\3\2\2\2\u041f"+
		"\u041d\3\2\2\2\u0420\u0421\5\16\b\2\u0421\u00bd\3\2\2\2\u0422\u0423\7"+
		"@\2\2\u0423\u0424\7h\2\2\u0424\u0428\7\"\2\2\u0425\u0427\7b\2\2\u0426"+
		"\u0425\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u00bf\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\7=\2\2\u042c"+
		"\u0430\5\30\r\2\u042d\u042f\7b\2\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2"+
		"\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u00c1\3\2\2\2\u0432"+
		"\u0430\3\2\2\2\u0433\u0435\7<\2\2\u0434\u0436\7h\2\2\u0435\u0434\3\2\2"+
		"\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u043b\5\30\r\2\u0438"+
		"\u043a\7b\2\2\u0439\u0438\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2"+
		"\2\2\u043b\u043c\3\2\2\2\u043c\u00c3\3\2\2\2\u043d\u043b\3\2\2\2\u043e"+
		"\u043f\7D\2\2\u043f\u0440\7h\2\2\u0440\u0444\5\22\n\2\u0441\u0443\7b\2"+
		"\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u00c5\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\7:\2\2\u0448"+
		"\u0449\7h\2\2\u0449\u044d\5\16\b\2\u044a\u044c\7b\2\2\u044b\u044a\3\2"+
		"\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u00c7\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451\7H\2\2\u0451\u0452\7h\2"+
		"\2\u0452\u0454\5\22\n\2\u0453\u0455\5\u00caf\2\u0454\u0453\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0459\3\2\2\2\u0456\u0458\7b\2\2\u0457\u0456\3\2"+
		"\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u00c9\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\5\26\f\2\u045d\u00cb\3"+
		"\2\2\2\u045e\u045f\7>\2\2\u045f\u0460\7j\2\2\u0460\u0465\5\u00ceh\2\u0461"+
		"\u0462\7q\2\2\u0462\u0464\5\u00ceh\2\u0463\u0461\3\2\2\2\u0464\u0467\3"+
		"\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0468\u0469\7k\2\2\u0469\u00cd\3\2\2\2\u046a\u046e\7\67"+
		"\2\2\u046b\u046c\7h\2\2\u046c\u046f\5\u00d0i\2\u046d\u046f\5\u00d2j\2"+
		"\u046e\u046b\3\2\2\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u00cf"+
		"\3\2\2\2\u0470\u0471\7s\2\2\u0471\u0472\5\16\b\2\u0472\u00d1\3\2\2\2\u0473"+
		"\u0474\5\20\t\2\u0474\u00d3\3\2\2\2\u0475\u0476\7;\2\2\u0476\u0477\7h"+
		"\2\2\u0477\u047b\5\u00d6l\2\u0478\u047a\7b\2\2\u0479\u0478\3\2\2\2\u047a"+
		"\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u00d5\3\2"+
		"\2\2\u047d\u047b\3\2\2\2\u047e\u047f\7?\2\2\u047f\u0482\5\u00d8m\2\u0480"+
		"\u0481\7J\2\2\u0481\u0483\5\u00dan\2\u0482\u0480\3\2\2\2\u0482\u0483\3"+
		"\2\2\2\u0483\u00d7\3\2\2\2\u0484\u0485\5\16\b\2\u0485\u00d9\3\2\2\2\u0486"+
		"\u0487\5\16\b\2\u0487\u00db\3\2\2\2\u0488\u0489\78\2\2\u0489\u048d\7h"+
		"\2\2\u048a\u048e\5\u00dep\2\u048b\u048e\7q\2\2\u048c\u048e\7b\2\2\u048d"+
		"\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048c\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u00dd\3\2\2\2\u0491"+
		"\u0492\5\u00e0q\2\u0492\u0493\7j\2\2\u0493\u0494\5\u00b8]\2\u0494\u0495"+
		"\7k\2\2\u0495\u00df\3\2\2\2\u0496\u0497\5\16\b\2\u0497\u00e1\3\2\2\2\u0498"+
		"\u04a7\7\31\2\2\u0499\u04a3\7j\2\2\u049a\u04a4\5\u00e4s\2\u049b\u04a0"+
		"\5\u00e6t\2\u049c\u049d\7q\2\2\u049d\u049f\5\u00e6t\2\u049e\u049c\3\2"+
		"\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u049a\3\2\2\2\u04a3\u049b\3\2"+
		"\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7k\2\2\u04a6\u04a8\3\2\2\2\u04a7"+
		"\u0499\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00e3\3\2\2\2\u04a9\u04aa\7y"+
		"\2\2\u04aa\u00e5\3\2\2\2\u04ab\u04ac\5\16\b\2\u04ac\u00e7\3\2\2\2\u04ad"+
		"\u04ae\7\30\2\2\u04ae\u04af\5\30\r\2\u04af\u00e9\3\2\2\2\u04b0\u04b1\7"+
		"\27\2\2\u04b1\u04b2\5\30\r\2\u04b2\u00eb\3\2\2\2\u04b3\u04b4\7\26\2\2"+
		"\u04b4\u04b5\5\30\r\2\u04b5\u00ed\3\2\2\2\u04b6\u04b7\7\25\2\2\u04b7\u04b8"+
		"\5\30\r\2\u04b8\u00ef\3\2\2\2\u04b9\u04ba\7\24\2\2\u04ba\u04bb\5\30\r"+
		"\2\u04bb\u00f1\3\2\2\2\u04bc\u04bd\7\23\2\2\u04bd\u04be\5\30\r\2\u04be"+
		"\u00f3\3\2\2\2\u04bf\u04c0\7\22\2\2\u04c0\u04c1\7j\2\2\u04c1\u04c2\5\20"+
		"\t\2\u04c2\u04c3\7k\2\2\u04c3\u00f5\3\2\2\2\u04c4\u04c5\7\21\2\2\u04c5"+
		"\u04c6\7j\2\2\u04c6\u04c7\5\u00f8}\2\u04c7\u04c8\7k\2\2\u04c8\u00f7\3"+
		"\2\2\2\u04c9\u04ca\5\16\b\2\u04ca\u00f9\3\2\2\2\u04cb\u04d0\7\20\2\2\u04cc"+
		"\u04cd\7j\2\2\u04cd\u04ce\5\u00fc\177\2\u04ce\u04cf\7k\2\2\u04cf\u04d1"+
		"\3\2\2\2\u04d0\u04cc\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u00fb\3\2\2\2\u04d2"+
		"\u04d3\7\63\2\2\u04d3\u00fd\3\2\2\2\u04d4\u04ee\7\37\2\2\u04d5\u04e4\7"+
		"j\2\2\u04d6\u04e3\5\u011c\u008f\2\u04d7\u04e3\5\u011e\u0090\2\u04d8\u04e3"+
		"\5\u0120\u0091\2\u04d9\u04e3\5\u0122\u0092\2\u04da\u04e3\5\u0124\u0093"+
		"\2\u04db\u04e3\5\u0126\u0094\2\u04dc\u04e3\5\u0114\u008b\2\u04dd\u04e3"+
		"\5\u0108\u0085\2\u04de\u04e3\5\u0102\u0082\2\u04df\u04e3\5\u0100\u0081"+
		"\2\u04e0\u04e3\7b\2\2\u04e1\u04e3\7q\2\2\u04e2\u04d6\3\2\2\2\u04e2\u04d7"+
		"\3\2\2\2\u04e2\u04d8\3\2\2\2\u04e2\u04d9\3\2\2\2\u04e2\u04da\3\2\2\2\u04e2"+
		"\u04db\3\2\2\2\u04e2\u04dc\3\2\2\2\u04e2\u04dd\3\2\2\2\u04e2\u04de\3\2"+
		"\2\2\u04e2\u04df\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3"+
		"\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04ea\3\2"+
		"\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e9\7b\2\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ef\7k\2\2\u04ee\u04d5\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f3\3\2\2\2\u04f0\u04f2\7b\2\2\u04f1\u04f0\3\2"+
		"\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u00ff\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6\u04f7\7\65\2\2\u04f7\u04fb\7"+
		"h\2\2\u04f8\u04fa\7b\2\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fe\u0509\5\u0106\u0084\2\u04ff\u0503\7q\2\2\u0500\u0502\7b\2\2"+
		"\u0501\u0500\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u0508\5\u0106\u0084"+
		"\2\u0507\u04ff\3\2\2\2\u0508\u050b\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a"+
		"\3\2\2\2\u050a\u0101\3\2\2\2\u050b\u0509\3\2\2\2\u050c\u050d\7\64\2\2"+
		"\u050d\u050e\7h\2\2\u050e\u0513\5\u0104\u0083\2\u050f\u0510\7q\2\2\u0510"+
		"\u0512\5\u0104\u0083\2\u0511\u050f\3\2\2\2\u0512\u0515\3\2\2\2\u0513\u0511"+
		"\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0103\3\2\2\2\u0515\u0513\3\2\2\2\u0516"+
		"\u0517\t\3\2\2\u0517\u0105\3\2\2\2\u0518\u0519\t\3\2\2\u0519\u0107\3\2"+
		"\2\2\u051a\u051b\78\2\2\u051b\u051c\7h\2\2\u051c\u0521\5\u010a\u0086\2"+
		"\u051d\u051e\7q\2\2\u051e\u0520\5\u010a\u0086\2\u051f\u051d\3\2\2\2\u0520"+
		"\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0109\3\2"+
		"\2\2\u0523\u0521\3\2\2\2\u0524\u0531\5\u010c\u0087\2\u0525\u052d\7j\2"+
		"\2\u0526\u052c\5\u010e\u0088\2\u0527\u052c\5\u0110\u0089\2\u0528\u052c"+
		"\5\u0112\u008a\2\u0529\u052c\7b\2\2\u052a\u052c\7q\2\2\u052b\u0526\3\2"+
		"\2\2\u052b\u0527\3\2\2\2\u052b\u0528\3\2\2\2\u052b\u0529\3\2\2\2\u052b"+
		"\u052a\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052e\3\2"+
		"\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0532\7k\2\2\u0531"+
		"\u0525\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u010b\3\2\2\2\u0533\u0534\5\16"+
		"\b\2\u0534\u010d\3\2\2\2\u0535\u0536\79\2\2\u0536\u0537\7h\2\2\u0537\u0538"+
		"\7\66\2\2\u0538\u010f\3\2\2\2\u0539\u053a\7A\2\2\u053a\u053b\7h\2\2\u053b"+
		"\u053c\7d\2\2\u053c\u0111\3\2\2\2\u053d\u053e\7H\2\2\u053e\u053f\7h\2"+
		"\2\u053f\u0540\5\22\n\2\u0540\u0113\3\2\2\2\u0541\u0542\7B\2\2\u0542\u0543"+
		"\7h\2\2\u0543\u0548\5\u0116\u008c\2\u0544\u0545\7q\2\2\u0545\u0547\5\u0116"+
		"\u008c\2\u0546\u0544\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u0115\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u054d\5\u0118"+
		"\u008d\2\u054c\u054e\5\u011a\u008e\2\u054d\u054c\3\2\2\2\u054d\u054e\3"+
		"\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7j\2\2\u0550\u0551\5\22\n\2\u0551"+
		"\u0552\7k\2\2\u0552\u0117\3\2\2\2\u0553\u0554\5\16\b\2\u0554\u0119\3\2"+
		"\2\2\u0555\u0556\t\3\2\2\u0556\u011b\3\2\2\2\u0557\u0558\7C\2\2\u0558"+
		"\u0559\7h\2\2\u0559\u055d\5\22\n\2\u055a\u055c\7b\2\2\u055b\u055a\3\2"+
		"\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u011d\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0561\7D\2\2\u0561\u0562\7h\2"+
		"\2\u0562\u0566\5\22\n\2\u0563\u0565\7b\2\2\u0564\u0563\3\2\2\2\u0565\u0568"+
		"\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u011f\3\2\2\2\u0568"+
		"\u0566\3\2\2\2\u0569\u056a\7E\2\2\u056a\u056b\7h\2\2\u056b\u056f\5\22"+
		"\n\2\u056c\u056e\7b\2\2\u056d\u056c\3\2\2\2\u056e\u0571\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0121\3\2\2\2\u0571\u056f\3\2"+
		"\2\2\u0572\u0573\7F\2\2\u0573\u0574\7h\2\2\u0574\u0578\5\22\n\2\u0575"+
		"\u0577\7b\2\2\u0576\u0575\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2"+
		"\2\2\u0578\u0579\3\2\2\2\u0579\u0123\3\2\2\2\u057a\u0578\3\2\2\2\u057b"+
		"\u057c\7G\2\2\u057c\u057d\7h\2\2\u057d\u0581\5\22\n\2\u057e\u0580\7b\2"+
		"\2\u057f\u057e\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582"+
		"\3\2\2\2\u0582\u0125\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u0585\7H\2\2\u0585"+
		"\u0586\7h\2\2\u0586\u058a\5\22\n\2\u0587\u0589\7b\2\2\u0588\u0587\3\2"+
		"\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u0127\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u0591\5\u012a\u0096\2\u058e\u0590"+
		"\7b\2\2\u058f\u058e\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u0598\5\u0144"+
		"\u00a3\2\u0595\u0597\7b\2\2\u0596\u0595\3\2\2\2\u0597\u059a\3\2\2\2\u0598"+
		"\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u0129\3\2\2\2\u059a\u0598\3\2"+
		"\2\2\u059b\u059d\7l\2\2\u059c\u059e\5\u012c\u0097\2\u059d\u059c\3\2\2"+
		"\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\5\u0142\u00a2\2"+
		"\u05a0\u05a2\5\u012e\u0098\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2"+
		"\u05ab\3\2\2\2\u05a3\u05a5\7h\2\2\u05a4\u05a6\5\u0138\u009d\2\u05a5\u05a4"+
		"\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a8\7h\2\2\u05a8"+
		"\u05aa\5\u0132\u009a\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac"+
		"\3\2\2\2\u05ab\u05a3\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05af\7m\2\2\u05ae\u05b0\7b\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2"+
		"\2\u05b0\u012b\3\2\2\2\u05b1\u05b2\5\16\b\2\u05b2\u05b3\7p\2\2\u05b3\u05b4"+
		"\7g\2\2\u05b4\u012d\3\2\2\2\u05b5\u05b6\7J\2\2\u05b6\u05b7\5\u0130\u0099"+
		"\2\u05b7\u012f\3\2\2\2\u05b8\u05b9\5\16\b\2\u05b9\u0131\3\2\2\2\u05ba"+
		"\u05bd\5\u0134\u009b\2\u05bb\u05bd\5\30\r\2\u05bc\u05ba\3\2\2\2\u05bc"+
		"\u05bb\3\2\2\2\u05bd\u0133\3\2\2\2\u05be\u05c3\5\u0136\u009c\2\u05bf\u05c0"+
		"\7t\2\2\u05c0\u05c2\5\u0136\u009c\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3"+
		"\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u0135\3\2\2\2\u05c5"+
		"\u05c3\3\2\2\2\u05c6\u05cc\5\16\b\2\u05c7\u05cc\7d\2\2\u05c8\u05cc\7p"+
		"\2\2\u05c9\u05cc\7o\2\2\u05ca\u05cc\7r\2\2\u05cb\u05c6\3\2\2\2\u05cb\u05c7"+
		"\3\2\2\2\u05cb\u05c8\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u0137\3\2"+
		"\2\2\u05cf\u05d1\7r\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d3\5\u0140\u00a1\2\u05d3\u0139\3\2\2\2\u05d4\u05d8"+
		"\5\16\b\2\u05d5\u05d8\7p\2\2\u05d6\u05d8\7d\2\2\u05d7\u05d4\3\2\2\2\u05d7"+
		"\u05d5\3\2\2\2\u05d7\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05d7\3\2"+
		"\2\2\u05d9\u05da\3\2\2\2\u05da\u013b\3\2\2\2\u05db\u05dc\7f\2\2\u05dc"+
		"\u05dd\5\16\b\2\u05dd\u05de\7g\2\2\u05de\u013d\3\2\2\2\u05df\u05e2\5\u013a"+
		"\u009e\2\u05e0\u05e2\5\u013c\u009f\2\u05e1\u05df\3\2\2\2\u05e1\u05e0\3"+
		"\2\2\2\u05e2\u013f\3\2\2\2\u05e3\u05ee\7t\2\2\u05e4\u05e5\7t\2\2\u05e5"+
		"\u05e7\5\u013e\u00a0\2\u05e6\u05e4\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e6"+
		"\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05ec\7t\2\2\u05eb"+
		"\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05e3\3\2"+
		"\2\2\u05ed\u05e6\3\2\2\2\u05ee\u0141\3\2\2\2\u05ef\u05f0\5\16\b\2\u05f0"+
		"\u0143\3\2\2\2\u05f1\u05f3\5\u0148\u00a5\2\u05f2\u05f1\3\2\2\2\u05f3\u05f6"+
		"\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6"+
		"\u05f4\3\2\2\2\u05f7\u05f9\5\u0146\u00a4\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fd\3\2\2\2\u05fa\u05fc\7b\2\2\u05fb\u05fa\3\2\2\2\u05fc"+
		"\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0603\3\2"+
		"\2\2\u05ff\u05fd\3\2\2\2\u0600\u0602\5\u014e\u00a8\2\u0601\u0600\3\2\2"+
		"\2\u0602\u0605\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0145"+
		"\3\2\2\2\u0605\u0603\3\2\2\2\u0606\u0607\5\30\r\2\u0607\u0147\3\2\2\2"+
		"\u0608\u0609\5\u014a\u00a6\2\u0609\u060a\7\u0083\2\2\u060a\u0611\5\u014c"+
		"\u00a7\2\u060b\u060d\7b\2\2\u060c\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e"+
		"\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u0612\7\2"+
		"\2\3\u0611\u060c\3\2\2\2\u0611\u0610\3\2\2\2\u0612\u0149\3\2\2\2\u0613"+
		"\u0614\5\16\b\2\u0614\u014b\3\2\2\2\u0615\u0616\7\u0087\2\2\u0616\u014d"+
		"\3\2\2\2\u0617\u0625\5\u01c0\u00e1\2\u0618\u0625\5\u0150\u00a9\2\u0619"+
		"\u0625\5\u01a6\u00d4\2\u061a\u0625\5\u0162\u00b2\2\u061b\u0625\5\u01a4"+
		"\u00d3\2\u061c\u0625\5\u01a2\u00d2\2\u061d\u0625\5\u01a0\u00d1\2\u061e"+
		"\u0625\5\u0160\u00b1\2\u061f\u0625\5\u015e\u00b0\2\u0620\u0625\5\u015a"+
		"\u00ae\2\u0621\u0625\5\u0158\u00ad\2\u0622\u0625\5\u0154\u00ab\2\u0623"+
		"\u0625\7b\2\2\u0624\u0617\3\2\2\2\u0624\u0618\3\2\2\2\u0624\u0619\3\2"+
		"\2\2\u0624\u061a\3\2\2\2\u0624\u061b\3\2\2\2\u0624\u061c\3\2\2\2\u0624"+
		"\u061d\3\2\2\2\u0624\u061e\3\2\2\2\u0624\u061f\3\2\2\2\u0624\u0620\3\2"+
		"\2\2\u0624\u0621\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0623\3\2\2\2\u0625"+
		"\u014f\3\2\2\2\u0626\u0629\7\16\2\2\u0627\u0628\7r\2\2\u0628\u062a\5\u0152"+
		"\u00aa\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062c\5\34\17\2\u062c\u0151\3\2\2\2\u062d\u062e\5\16\b\2\u062e\u0153"+
		"\3\2\2\2\u062f\u0632\7\r\2\2\u0630\u0631\7r\2\2\u0631\u0633\5\u0156\u00ac"+
		"\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635"+
		"\5\34\17\2\u0635\u0155\3\2\2\2\u0636\u0637\5\16\b\2\u0637\u0157\3\2\2"+
		"\2\u0638\u063a\7\f\2\2\u0639\u063b\5\34\17\2\u063a\u0639\3\2\2\2\u063a"+
		"\u063b\3\2\2\2\u063b\u0159\3\2\2\2\u063c\u063d\7\13\2\2\u063d\u063e\7"+
		"j\2\2\u063e\u063f\5\u015c\u00af\2\u063f\u0640\7k\2\2\u0640\u015b\3\2\2"+
		"\2\u0641\u0642\7d\2\2\u0642\u015d\3\2\2\2\u0643\u0646\7\n\2\2\u0644\u0645"+
		"\7j\2\2\u0645\u0647\7k\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u015f\3\2\2\2\u0648\u0649\7\b\2\2\u0649\u064a\5\u0164\u00b3\2\u064a\u0161"+
		"\3\2\2\2\u064b\u064c\7\4\2\2\u064c\u064d\5\u0164\u00b3\2\u064d\u0163\3"+
		"\2\2\2\u064e\u064f\7r\2\2\u064f\u0651\5\u0168\u00b5\2\u0650\u064e\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0656\7j\2\2\u0653"+
		"\u0655\7b\2\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2"+
		"\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u065b\5\u0170\u00b9\2\u065a\u065c\5\u0172\u00ba\2\u065b\u065a\3\2\2\2"+
		"\u065b\u065c\3\2\2\2\u065c\u066c\3\2\2\2\u065d\u066b\5\u0174\u00bb\2\u065e"+
		"\u066b\5\u0188\u00c5\2\u065f\u066b\5\u018e\u00c8\2\u0660\u066b\5\u0198"+
		"\u00cd\2\u0661\u066b\5\u0186\u00c4\2\u0662\u066b\5\u017e\u00c0\2\u0663"+
		"\u066b\5\u0184\u00c3\2\u0664\u066b\5\u0180\u00c1\2\u0665\u066b\5\u0182"+
		"\u00c2\2\u0666\u066b\5\u0176\u00bc\2\u0667\u066b\5\u017a\u00be\2\u0668"+
		"\u066b\7b\2\2\u0669\u066b\7q\2\2\u066a\u065d\3\2\2\2\u066a\u065e\3\2\2"+
		"\2\u066a\u065f\3\2\2\2\u066a\u0660\3\2\2\2\u066a\u0661\3\2\2\2\u066a\u0662"+
		"\3\2\2\2\u066a\u0663\3\2\2\2\u066a\u0664\3\2\2\2\u066a\u0665\3\2\2\2\u066a"+
		"\u0666\3\2\2\2\u066a\u0667\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u0669\3\2"+
		"\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d"+
		"\u0672\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0671\7b\2\2\u0670\u066f\3\2"+
		"\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0677\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0678\5\u016a\u00b6\2\u0676\u0678"+
		"\5\u016c\u00b7\2\u0677\u0675\3\2\2\2\u0677\u0676\3\2\2\2\u0677\u0678\3"+
		"\2\2\2\u0678\u067c\3\2\2\2\u0679\u067b\7b\2\2\u067a\u0679\3\2\2\2\u067b"+
		"\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u0682\3\2"+
		"\2\2\u067e\u067c\3\2\2\2\u067f\u0681\5\u0166\u00b4\2\u0680\u067f\3\2\2"+
		"\2\u0681\u0684\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0688"+
		"\3\2\2\2\u0684\u0682\3\2\2\2\u0685\u0687\7b\2\2\u0686\u0685\3\2\2\2\u0687"+
		"\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2"+
		"\2\2\u068a\u0688\3\2\2\2\u068b\u068c\7k\2\2\u068c\u0165\3\2\2\2\u068d"+
		"\u0691\5\u018c\u00c7\2\u068e\u0690\7b\2\2\u068f\u068e\3\2\2\2\u0690\u0693"+
		"\3\2\2\2\u0691\u068f\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694\3\2\2\2\u0693"+
		"\u0691\3\2\2\2\u0694\u0698\7j\2\2\u0695\u0697\7b\2\2\u0696\u0695\3\2\2"+
		"\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b"+
		"\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069f\5\u0144\u00a3\2\u069c\u069e\7"+
		"b\2\2\u069d\u069c\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u069f\3\2\2\2\u06a2\u06a6\7k"+
		"\2\2\u06a3\u06a5\7b\2\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6"+
		"\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u0167\3\2\2\2\u06a8\u06a6\3\2"+
		"\2\2\u06a9\u06aa\5\16\b\2\u06aa\u0169\3\2\2\2\u06ab\u06ac\7u\2\2\u06ac"+
		"\u06ad\7g\2\2\u06ad\u06ae\5\34\17\2\u06ae\u016b\3\2\2\2\u06af\u06b0\7"+
		"u\2\2\u06b0\u06b1\7g\2\2\u06b1\u06b2\5\u016e\u00b8\2\u06b2\u016d\3\2\2"+
		"\2\u06b3\u06b4\t\3\2\2\u06b4\u016f\3\2\2\2\u06b5\u06b6\7s\2\2\u06b6\u06b9"+
		"\5\16\b\2\u06b7\u06b9\5\20\t\2\u06b8\u06b5\3\2\2\2\u06b8\u06b7\3\2\2\2"+
		"\u06b9\u0171\3\2\2\2\u06ba\u06bb\5\34\17\2\u06bb\u0173\3\2\2\2\u06bc\u06bd"+
		"\7#\2\2\u06bd\u06be\7h\2\2\u06be\u06bf\5\16\b\2\u06bf\u0175\3\2\2\2\u06c0"+
		"\u06c1\7&\2\2\u06c1\u06c2\7h\2\2\u06c2\u06c3\5\u0178\u00bd\2\u06c3\u0177"+
		"\3\2\2\2\u06c4\u06c5\t\3\2\2\u06c5\u0179\3\2\2\2\u06c6\u06c7\7%\2\2\u06c7"+
		"\u06c8\7h\2\2\u06c8\u06c9\5\u017c\u00bf\2\u06c9\u017b\3\2\2\2\u06ca\u06cb"+
		"\t\3\2\2\u06cb\u017d\3\2\2\2\u06cc\u06cd\7*\2\2\u06cd\u06ce\7h\2\2\u06ce"+
		"\u06cf\5\16\b\2\u06cf\u017f\3\2\2\2\u06d0\u06d4\7(\2\2\u06d1\u06d5\5\32"+
		"\16\2\u06d2\u06d3\7h\2\2\u06d3\u06d5\5\34\17\2\u06d4\u06d1\3\2\2\2\u06d4"+
		"\u06d2\3\2\2\2\u06d5\u0181\3\2\2\2\u06d6\u06da\7\'\2\2\u06d7\u06db\5\32"+
		"\16\2\u06d8\u06d9\7h\2\2\u06d9\u06db\5\34\17\2\u06da\u06d7\3\2\2\2\u06da"+
		"\u06d8\3\2\2\2\u06db\u0183\3\2\2\2\u06dc\u06dd\7)\2\2\u06dd\u06de\7h\2"+
		"\2\u06de\u06df\5\16\b\2\u06df\u0185\3\2\2\2\u06e0\u06e1\7+\2\2\u06e1\u06e2"+
		"\7h\2\2\u06e2\u06e3\5\16\b\2\u06e3\u0187\3\2\2\2\u06e4\u06e5\7\61\2\2"+
		"\u06e5\u06e6\7h\2\2\u06e6\u06e7\5\u018a\u00c6\2\u06e7\u0189\3\2\2\2\u06e8"+
		"\u06ed\5\u018c\u00c7\2\u06e9\u06ea\7q\2\2\u06ea\u06ec\5\u018c\u00c7\2"+
		"\u06eb\u06e9\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee"+
		"\3\2\2\2\u06ee\u018b\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\t\t\2\2\u06f1"+
		"\u018d\3\2\2\2\u06f2\u06f3\7H\2\2\u06f3\u06f4\7h\2\2\u06f4\u06f5\5\u0190"+
		"\u00c9\2\u06f5\u018f\3\2\2\2\u06f6\u06fb\5\u0192\u00ca\2\u06f7\u06f8\7"+
		"q\2\2\u06f8\u06fa\5\u0192\u00ca\2\u06f9\u06f7\3\2\2\2\u06fa\u06fd\3\2"+
		"\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u0191\3\2\2\2\u06fd"+
		"\u06fb\3\2\2\2\u06fe\u0700\5\u0194\u00cb\2\u06ff\u0701\5\u0196\u00cc\2"+
		"\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0193\3\2\2\2\u0702\u0708"+
		"\7y\2\2\u0703\u0705\7i\2\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0706\3\2\2\2\u0706\u0708\5\16\b\2\u0707\u0702\3\2\2\2\u0707\u0704\3"+
		"\2\2\2\u0708\u0195\3\2\2\2\u0709\u070a\5\34\17\2\u070a\u0197\3\2\2\2\u070b"+
		"\u070c\7,\2\2\u070c\u070d\7h\2\2\u070d\u070e\5\u019a\u00ce\2\u070e\u0199"+
		"\3\2\2\2\u070f\u0714\5\u019c\u00cf\2\u0710\u0711\7q\2\2\u0711\u0713\5"+
		"\u019c\u00cf\2\u0712\u0710\3\2\2\2\u0713\u0716\3\2\2\2\u0714\u0712\3\2"+
		"\2\2\u0714\u0715\3\2\2\2\u0715\u019b\3\2\2\2\u0716\u0714\3\2\2\2\u0717"+
		"\u0718\5\u019e\u00d0\2\u0718\u019d\3\2\2\2\u0719\u071f\7y\2\2\u071a\u071c"+
		"\7i\2\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u071f\5\16\b\2\u071e\u0719\3\2\2\2\u071e\u071b\3\2\2\2\u071f\u019f\3"+
		"\2\2\2\u0720\u0721\7\7\2\2\u0721\u0722\5\u0164\u00b3\2\u0722\u01a1\3\2"+
		"\2\2\u0723\u0724\7\6\2\2\u0724\u0725\5\u0164\u00b3\2\u0725\u01a3\3\2\2"+
		"\2\u0726\u0727\7\5\2\2\u0727\u0728\5\u0164\u00b3\2\u0728\u01a5\3\2\2\2"+
		"\u0729\u072a\7\3\2\2\u072a\u072b\7r\2\2\u072b\u072c\5\u01a8\u00d5\2\u072c"+
		"\u0730\7j\2\2\u072d\u072f\7b\2\2\u072e\u072d\3\2\2\2\u072f\u0732\3\2\2"+
		"\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730"+
		"\3\2\2\2\u0733\u0735\5\u01aa\u00d6\2\u0734\u0733\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u0734\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u073b\3\2\2\2\u0738"+
		"\u073a\7b\2\2\u0739\u0738\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739\3\2"+
		"\2\2\u073b\u073c\3\2\2\2\u073c\u073e\3\2\2\2\u073d\u073b\3\2\2\2\u073e"+
		"\u073f\7k\2\2\u073f\u01a7\3\2\2\2\u0740\u0741\5\16\b\2\u0741\u01a9\3\2"+
		"\2\2\u0742\u0744\7q\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744"+
		"\u0748\3\2\2\2\u0745\u0747\7b\2\2\u0746\u0745\3\2\2\2\u0747\u074a\3\2"+
		"\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074c\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074b\u074d\5\u01b0\u00d9\2\u074c\u074b\3\2\2\2\u074c\u074d"+
		"\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0751\5\u01be\u00e0\2\u074f\u0752\5"+
		"\u01ae\u00d8\2\u0750\u0752\5\u01ac\u00d7\2\u0751\u074f\3\2\2\2\u0751\u0750"+
		"\3\2\2\2\u0752\u0756\3\2\2\2\u0753\u0755\7b\2\2\u0754\u0753\3\2\2\2\u0755"+
		"\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u01ab\3\2"+
		"\2\2\u0758\u0756\3\2\2\2\u0759\u075c\7h\2\2\u075a\u075d\5\u01ba\u00de"+
		"\2\u075b\u075d\5\u01b8\u00dd\2\u075c\u075a\3\2\2\2\u075c\u075b\3\2\2\2"+
		"\u075d\u01ad\3\2\2\2\u075e\u075f\5\32\16\2\u075f\u01af\3\2\2\2\u0760\u0761"+
		"\7l\2\2\u0761\u0766\5\u01b2\u00da\2\u0762\u0763\7q\2\2\u0763\u0765\5\u01b2"+
		"\u00da\2\u0764\u0762\3\2\2\2\u0765\u0768\3\2\2\2\u0766\u0764\3\2\2\2\u0766"+
		"\u0767\3\2\2\2\u0767\u0769\3\2\2\2\u0768\u0766\3\2\2\2\u0769\u076a\7m"+
		"\2\2\u076a\u01b1\3\2\2\2\u076b\u076c\5\u01b4\u00db\2\u076c\u076d\7u\2"+
		"\2\u076d\u076e\5\u01b6\u00dc\2\u076e\u01b3\3\2\2\2\u076f\u0770\5\16\b"+
		"\2\u0770\u01b5\3\2\2\2\u0771\u0775\7|\2\2\u0772\u0775\7}\2\2\u0773\u0775"+
		"\5\16\b\2\u0774\u0771\3\2\2\2\u0774\u0772\3\2\2\2\u0774\u0773\3\2\2\2"+
		"\u0775\u01b7\3\2\2\2\u0776\u0777\t\3\2\2\u0777\u01b9\3\2\2\2\u0778\u0779"+
		"\7$\2\2\u0779\u077a\7j\2\2\u077a\u077b\5\u01bc\u00df\2\u077b\u077c\7k"+
		"\2\2\u077c\u01bb\3\2\2\2\u077d\u077e\5\16\b\2\u077e\u01bd\3\2\2\2\u077f"+
		"\u0783\7|\2\2\u0780\u0783\7}\2\2\u0781\u0783\5\16\b\2\u0782\u077f\3\2"+
		"\2\2\u0782\u0780\3\2\2\2\u0782\u0781\3\2\2\2\u0783\u01bf\3\2\2\2\u0784"+
		"\u0787\7\17\2\2\u0785\u0786\7r\2\2\u0786\u0788\5\u01c2\u00e2\2\u0787\u0785"+
		"\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078a\5\34\17\2"+
		"\u078a\u01c1\3\2\2\2\u078b\u078c\5\16\b\2\u078c\u01c3\3\2\2\2\u00be\u01c7"+
		"\u01cd\u01d3\u01d7\u01dc\u01de\u01e3\u01e7\u01ec\u01ee\u01f3\u01fb\u0200"+
		"\u0209\u0212\u0219\u0223\u0227\u022f\u0235\u023a\u023d\u0240\u0244\u024c"+
		"\u0258\u025d\u0269\u026f\u0276\u027c\u0281\u0287\u028d\u0293\u0299\u02a1"+
		"\u02a4\u02a8\u02ac\u02b7\u02bd\u02c2\u02c9\u02d0\u02d5\u02d8\u02db\u02e0"+
		"\u02e3\u02e7\u02ec\u02f1\u02f6\u0309\u030d\u032b\u034a\u034e\u0359\u035d"+
		"\u0364\u036e\u0377\u037b\u0382\u0391\u039b\u03a4\u03ad\u03bc\u03c6\u03c9"+
		"\u03e7\u03fa\u0400\u0406\u040c\u040e\u041b\u041d\u0428\u0430\u0435\u043b"+
		"\u0444\u044d\u0454\u0459\u0465\u046e\u047b\u0482\u048d\u048f\u04a0\u04a3"+
		"\u04a7\u04d0\u04e2\u04e4\u04ea\u04ee\u04f3\u04fb\u0503\u0509\u0513\u0521"+
		"\u052b\u052d\u0531\u0548\u054d\u055d\u0566\u056f\u0578\u0581\u058a\u0591"+
		"\u0598\u059d\u05a1\u05a5\u05a9\u05ab\u05af\u05bc\u05c3\u05cb\u05cd\u05d0"+
		"\u05d7\u05d9\u05e1\u05e8\u05eb\u05ed\u05f4\u05f8\u05fd\u0603\u060e\u0611"+
		"\u0624\u0629\u0632\u063a\u0646\u0650\u0656\u065b\u066a\u066c\u0672\u0677"+
		"\u067c\u0682\u0688\u0691\u0698\u069f\u06a6\u06b8\u06d4\u06da\u06ed\u06fb"+
		"\u0700\u0704\u0707\u0714\u071b\u071e\u0730\u0736\u073b\u0743\u0748\u074c"+
		"\u0751\u0756\u075c\u0766\u0774\u0782\u0787";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}