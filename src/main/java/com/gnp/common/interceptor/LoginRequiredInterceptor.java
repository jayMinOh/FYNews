package com.gnp.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gnp.common.annotation.LoginRequired;

/**
 * LoginRequired �? ?��?��?�� 컨트롤러?�� 메소?��?�� ???�� 로그?�� ?���? 체크.
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
