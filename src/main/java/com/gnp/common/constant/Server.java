package com.gnp.common.constant;
/**
 * 
 *  ëª¨ë°”?¼, web ê³µí†µ ? ?š© 
 *  ? „?—­ë³??ˆ˜ ? •?˜ 
 *	@author osm077
 *	@since 2020-01-06
 * 
 * */
public class Server {

	/**
	 * ?ƒ?„±?.
	 */
	public Server()
	{
		super();
	}
	
	/** ?„œë²? ?œ„ì¹? ("LOCAL", "DEV", "RELEASE" */
	public static String			LOCATION;
	
	/** ?””ë²„ê¹… ?—¬ë¶? */
	public static boolean			DEBUG						= false;

	/** HttpServletRequest.getContextPath() */
	public static String			PATH_CONTEXT;

	/** Context Resl Path */
	public static String			PATH_CONTEXT_REAL;

	/** css, js ?“±?˜ ?ŒŒ?¼?— ???•œ  cache ?‚¬?š© */
	public static boolean			NOCACHE						= false;

	/** CACHE ID */
	public static String			CACHE_ID					= "noCache";
	
	//#########################################################################
	// ì¿ í‚¤
	//#########################################################################
	
	/** ì¿ í‚¤:?„ë©”ì¸ (?¼ë°˜ì‚¬?š©?) */
	public static String			COOKIE_DOMAIN_WEB;
	
	/** ì¿ í‚¤:?„ë©”ì¸ (ëª¨ë°”?¼?‚¬?š©?) */
	public static String			COOKIE_DOMAIN_MO;
	
	/** ?¼ë°˜ì‚¬?š©? ì¿ í‚¤?´ë¦? */
	public static String			COOKIE_NAME_WEB;
	
	/** ëª¨ë°”?¼ ì¿ í‚¤?´ë¦? */
	public static String			COOKIE_NAME_MO;
	/** ì¿ í‚¤:ê²½ë¡œ */
	public static final String		COOKIE_PATH					= "/";

	/** ì¿ í‚¤:ë³´ì•ˆ */
	public static boolean			COOKIE_SECURE;

	/** ì¿ í‚¤:?•”?˜¸?™”?‚¤ (?¼ë°˜ì‚¬?š©?) */
	public static String			COOKIE_KEY_WEB;

	/** ì¿ í‚¤:?•”?˜¸?™”?‚¤ (ëª¨ë°”?¼?‚¬?š©?) */
	public static String			COOKIE_KEY_MO;
	//#########################################################################
	// ê°??ˆ˜ ê´?? ¨
	//#########################################################################

	/** ?•œ ?™”ë©´ì— ë³´ì—¬ì¤? ê²Œì‹œë¬? ?ˆ˜( default ) */
	public static final int			COUNT_ARTICLE				= 5;
	
	/** ?•œ ?™”ë©´ì— ë³´ì—¬ì¤? ?˜?´ì§? ?ˆ˜( default ) */
	public static final int			COUNT_PAGING				= 5;
	
	public static final int			DEFAULT_PAGE_SIZE			= 10;

	public final static int NO_PAGING = -1;
	
	public final static int NoPaging() {
		return NO_PAGING;
	}

	/** ?´ë¯¸ì? ?””? ‰?† ë¦? URL */
	public static String			IMAGE_URL						= "/images";

	
	//#########################################################################
	// ?‚¤ (?¼ë°˜ì ?¸ ê²ƒë§Œ ? •?˜?•˜ê³? ?‚˜ë¨¸ì??Š” ?•˜?“œì½”ë”©)
	//#########################################################################

	/** ë¡œê·¸?¸? •ë³´ë?? ?‹´?„ key (request ?‹œë§ˆë‹¤ ?„¸?Œ…?•˜ë¯?ë¡? ê´?ë¦¬ì,?‚¬?š©? ê³µí†µ ?‚¬?š©) */
	public static final String		KEY_LOGIN			= "login";

	/** ResultVO ë¥? ?‹´?„ key */
	public static final String		KEY_RESULT			= "result";
	
	/** ëª©ë¡?„ ?‹´?„ key */
	public static final String		KEY_LIST			= "list";
	
	/** viewName */
	public static final String		KEY_VIEWNAME		="viewName";

	/** ?ë°”ìŠ¤?¬ë¦½íŠ¸ëª…ì„ ?‹´?„ key */
	public static final String		KEY_JS				= "js";
	
	/** ?ë°”ìŠ¤?¬ë¦½íŠ¸ ?ŒŒ?¼ ëª©ë¡?„ ?‹´?„ key */
	public static final String 		KEY_JS_LIST = "jsList";

	//#########################################################################
	// tiles ?‚¬?š© ?™•?¥?
	//#########################################################################

	/** ?‚¬?š©? ? ˆ?´?•„?›ƒ */
	public static final	String		TILES_USER			= ".web";
	
	/** ëª¨ë°”?¼ ? ˆ?´?•„?›ƒ */
	public static final	String		TILES_M				= ".mo";
	
	/** ë¡œê·¸?¸ ?œ ?š¨ ?‹œê°? (10ë¶?) */
	public static long expireTimes = 30 * 60 * 1000;
	
}
