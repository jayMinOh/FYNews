package com.gnp.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gnp.common.annotation.LoginRequired;

/**
 * LoginRequired ê°? ? ?š©?œ ì»¨íŠ¸ë¡¤ëŸ¬?˜ ë©”ì†Œ?“œ?— ???•´ ë¡œê·¸?¸ ?—¬ë¶? ì²´í¬.
 * 
 * @author	osm077
 * @since	2020-01-06
 */
public class LoginRequiredInterceptor extends AnnotationHandlerInterceptorAdapter<LoginRequired> {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger (LoginRequiredInterceptor.class);
	
	public LoginRequiredInterceptor()
	{
		super (LoginRequired.class);
	}
}
