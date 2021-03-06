package com.gnp.common.constant;
/**
 * 
 *  λͺ¨λ°?Ό, web κ³΅ν΅ ? ?© 
 *  ? ?­λ³?? ? ? 
 *	@author osm077
 *	@since 2020-01-06
 * 
 * */
public class Server {

	/**
	 * ??±?.
	 */
	public Server()
	{
		super();
	}
	
	/** ?λ²? ?μΉ? ("LOCAL", "DEV", "RELEASE" */
	public static String			LOCATION;
	
	/** ?λ²κΉ ?¬λΆ? */
	public static boolean			DEBUG						= false;

	/** HttpServletRequest.getContextPath() */
	public static String			PATH_CONTEXT;

	/** Context Resl Path */
	public static String			PATH_CONTEXT_REAL;

	/** css, js ?±? ??Ό? ???  cache ?¬?© */
	public static boolean			NOCACHE						= false;

	/** CACHE ID */
	public static String			CACHE_ID					= "noCache";
	
	//#########################################################################
	// μΏ ν€
	//#########################################################################
	
	/** μΏ ν€:?λ©μΈ (?Όλ°μ¬?©?) */
	public static String			COOKIE_DOMAIN_WEB;
	
	/** μΏ ν€:?λ©μΈ (λͺ¨λ°?Ό?¬?©?) */
	public static String			COOKIE_DOMAIN_MO;
	
	/** ?Όλ°μ¬?©? μΏ ν€?΄λ¦? */
	public static String			COOKIE_NAME_WEB;
	
	/** λͺ¨λ°?Ό μΏ ν€?΄λ¦? */
	public static String			COOKIE_NAME_MO;
	/** μΏ ν€:κ²½λ‘ */
	public static final String		COOKIE_PATH					= "/";

	/** μΏ ν€:λ³΄μ */
	public static boolean			COOKIE_SECURE;

	/** μΏ ν€:??Έ??€ (?Όλ°μ¬?©?) */
	public static String			COOKIE_KEY_WEB;

	/** μΏ ν€:??Έ??€ (λͺ¨λ°?Ό?¬?©?) */
	public static String			COOKIE_KEY_MO;
	//#########################################################################
	// κ°?? κ΄?? ¨
	//#########################################################################

	/** ? ?λ©΄μ λ³΄μ¬μ€? κ²μλ¬? ?( default ) */
	public static final int			COUNT_ARTICLE				= 5;
	
	/** ? ?λ©΄μ λ³΄μ¬μ€? ??΄μ§? ?( default ) */
	public static final int			COUNT_PAGING				= 5;
	
	public static final int			DEFAULT_PAGE_SIZE			= 10;

	public final static int NO_PAGING = -1;
	
	public final static int NoPaging() {
		return NO_PAGING;
	}

	/** ?΄λ―Έμ? ?? ? λ¦? URL */
	public static String			IMAGE_URL						= "/images";

	
	//#########################################################################
	// ?€ (?Όλ°μ ?Έ κ²λ§ ? ??κ³? ?λ¨Έμ?? ??μ½λ©)
	//#########################################################################

	/** λ‘κ·Έ?Έ? λ³΄λ?? ?΄? key (request ?λ§λ€ ?Έ??λ―?λ‘? κ΄?λ¦¬μ,?¬?©? κ³΅ν΅ ?¬?©) */
	public static final String		KEY_LOGIN			= "login";

	/** ResultVO λ₯? ?΄? key */
	public static final String		KEY_RESULT			= "result";
	
	/** λͺ©λ‘? ?΄? key */
	public static final String		KEY_LIST			= "list";
	
	/** viewName */
	public static final String		KEY_VIEWNAME		="viewName";

	/** ?λ°μ€?¬λ¦½νΈλͺμ ?΄? key */
	public static final String		KEY_JS				= "js";
	
	/** ?λ°μ€?¬λ¦½νΈ ??Ό λͺ©λ‘? ?΄? key */
	public static final String 		KEY_JS_LIST = "jsList";

	//#########################################################################
	// tiles ?¬?© ??₯?
	//#########################################################################

	/** ?¬?©? ? ?΄?? */
	public static final	String		TILES_USER			= ".web";
	
	/** λͺ¨λ°?Ό ? ?΄?? */
	public static final	String		TILES_M				= ".mo";
	
	/** λ‘κ·Έ?Έ ? ?¨ ?κ°? (10λΆ?) */
	public static long expireTimes = 30 * 60 * 1000;
	
}
