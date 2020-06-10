package com.gnp.common.constant;
/**
 * 
 *  모바?��, web 공통 ?��?�� 
 *  ?��?���??�� ?��?�� 
 *	@author osm077
 *	@since 2020-01-06
 * 
 * */
public class Server {

	/**
	 * ?��?��?��.
	 */
	public Server()
	{
		super();
	}
	
	/** ?���? ?���? ("LOCAL", "DEV", "RELEASE" */
	public static String			LOCATION;
	
	/** ?��버깅 ?���? */
	public static boolean			DEBUG						= false;

	/** HttpServletRequest.getContextPath() */
	public static String			PATH_CONTEXT;

	/** Context Resl Path */
	public static String			PATH_CONTEXT_REAL;

	/** css, js ?��?�� ?��?��?�� ???��  cache ?��?�� */
	public static boolean			NOCACHE						= false;

	/** CACHE ID */
	public static String			CACHE_ID					= "noCache";
	
	//#########################################################################
	// 쿠키
	//#########################################################################
	
	/** 쿠키:?��메인 (?��반사?��?��) */
	public static String			COOKIE_DOMAIN_WEB;
	
	/** 쿠키:?��메인 (모바?��?��?��?��) */
	public static String			COOKIE_DOMAIN_MO;
	
	/** ?��반사?��?�� 쿠키?���? */
	public static String			COOKIE_NAME_WEB;
	
	/** 모바?�� 쿠키?���? */
	public static String			COOKIE_NAME_MO;
	/** 쿠키:경로 */
	public static final String		COOKIE_PATH					= "/";

	/** 쿠키:보안 */
	public static boolean			COOKIE_SECURE;

	/** 쿠키:?��?��?��?�� (?��반사?��?��) */
	public static String			COOKIE_KEY_WEB;

	/** 쿠키:?��?��?��?�� (모바?��?��?��?��) */
	public static String			COOKIE_KEY_MO;
	//#########################################################################
	// �??�� �??��
	//#########################################################################

	/** ?�� ?��면에 보여�? 게시�? ?��( default ) */
	public static final int			COUNT_ARTICLE				= 5;
	
	/** ?�� ?��면에 보여�? ?��?���? ?��( default ) */
	public static final int			COUNT_PAGING				= 5;
	
	public static final int			DEFAULT_PAGE_SIZE			= 10;

	public final static int NO_PAGING = -1;
	
	public final static int NoPaging() {
		return NO_PAGING;
	}

	/** ?��미�? ?��?��?���? URL */
	public static String			IMAGE_URL						= "/images";

	
	//#########################################################################
	// ?�� (?��반적?�� 것만 ?��?��?���? ?��머�??�� ?��?��코딩)
	//#########################################################################

	/** 로그?��?��보�?? ?��?�� key (request ?��마다 ?��?��?���?�? �?리자,?��?��?�� 공통 ?��?��) */
	public static final String		KEY_LOGIN			= "login";

	/** ResultVO �? ?��?�� key */
	public static final String		KEY_RESULT			= "result";
	
	/** 목록?�� ?��?�� key */
	public static final String		KEY_LIST			= "list";
	
	/** viewName */
	public static final String		KEY_VIEWNAME		="viewName";

	/** ?��바스?��립트명을 ?��?�� key */
	public static final String		KEY_JS				= "js";
	
	/** ?��바스?��립트 ?��?�� 목록?�� ?��?�� key */
	public static final String 		KEY_JS_LIST = "jsList";

	//#########################################################################
	// tiles ?��?�� ?��?��?��
	//#########################################################################

	/** ?��?��?�� ?��?��?��?�� */
	public static final	String		TILES_USER			= ".web";
	
	/** 모바?�� ?��?��?��?�� */
	public static final	String		TILES_M				= ".mo";
	
	/** 로그?�� ?��?�� ?���? (10�?) */
	public static long expireTimes = 30 * 60 * 1000;
	
}
