package com.gnp.mo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Î™®Î∞î?ùº ?ö© ?ù∏?Ñ∞?Öâ?Ñ∞
 * ?Ñ∏?Öò?ì±?ùÑ Ï≤¥ÌÅ¨?ï† ?ö©?èÑ.
 * 
 * @author osm077
 * @since 2020-01-06
 * */
public class GnpMoInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle (HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception
	{
		String uri = req.getRequestURI();
		System.out.println(uri);
//		LoginVO login = LoginVO.of(LoginManager.getFC(req));  
//		ValidateTool.isTrue(login.isLogined(), new LoginRequiredException());
//		ValidateTool.isTrue(login.isFranchiseHqOrStaff() == true || login.isAdminGlobal() == true, new AuthenticationException());
		
		// Ïø†ÌÇ§ Í∞±Ïã†
//		LoginManager.setFC(res, login);
		// top.jsp?óê?Ñú ?Ç¨?ö©. menu 
//		req.setAttribute (Server.KEY_LOGIN, null);	
			
		return true;
	}
	
}
