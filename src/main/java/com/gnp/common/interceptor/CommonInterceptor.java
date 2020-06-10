package com.gnp.common.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gnp.common.constant.Server;

/**
 * ?ŒŒ?¼ë¯¸í„° ë¡œê¹… ë°? ë¡œê·¸?¸ ? •ë³? ???¥.
 * 
 * <p>
 * Server.DEBUG ê°? true ?¼ ê²½ìš° request ?— ?‹´ê¸? ?ŒŒ?¼ë¯¸í„°ê°’ì„ ì¶œë ¥
 * </p>
 * 
 * @author osm077
 * @since 2020-01-06
 */
public class CommonInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		
		String module = req.getRequestURI().split("/")[1];
		
		if (Server.NOCACHE) {
			// request ë§ˆë‹¤ ?œ?¤?•œ ?ˆ«?ë¥? ë°œê¸‰?•˜?—¬ "?1234567890" ?˜•?ƒœë¡?
			// request?˜ attributeë¡? ì¶”ê??•˜?—¬ JSP(header.include)?—?„œ ?‚¬?š©?•˜?„ë¡? ?•œ?‹¤.
			req.setAttribute(Server.CACHE_ID, "?" + System.currentTimeMillis());
		}
		return true;
	}

	private void print(HttpServletRequest req) {
		logger.info("requestURI : " + req.getRequestURI());
		logger.info("==[+]==========================================================================================");
		logger.info("requestURL  = {}", req.getRequestURL());
		logger.info("remoteAddr  = {}", req.getRemoteAddr());

		for (Enumeration<String> parameterNames = req.getParameterNames(); parameterNames.hasMoreElements();) {
			String name = parameterNames.nextElement();
			String[] values = req.getParameterValues(name);

			if (values.length > 1) {
				for (int i = 0; i < values.length; i++) {
					logger.info("{}[{}] = {}", name, i, values[i]);
				}
			} else {
				logger.info("{} = {}", name, values[0]);
			}
		}

		logger.info("===[-]=========================================================================================");
	}

	/**
	 * Controller ?ˆ˜?–‰ ?›„ View ë¥? ?˜¸ì¶œí•˜ê¸? ? „?— ?˜¸ì¶œëœ?‹¤.
	 * modelAndView ?ŒŒ?¼ë¯¸í„°?Š” ì»¨íŠ¸ë¡¤ëŸ¬ê°? ?Œ? ¤ì¤? ? •ë³´ë¡œ ì»¨íŠ¸ë¡¤ëŸ¬ ?‘?—… ê²°ê³¼ë¥? ì°¸ì¡°?•˜ê±°ë‚˜ ì¡°ì‘?•  ?ˆ˜ ?ˆ?‹¤
	 */
	@Override
	public void postHandle (HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView) throws Exception
	{
	}

	/**
	 * View ?—?„œ ìµœì¢… ê²°ê³¼ë¥? ?ƒ?„±?•˜?Š” ?“±?˜ ëª¨ë“  ?‘?—…?´ ?™„ë£Œëœ ?›„ ?‹¤?–‰?œ?‹¤.
	 * ?š”ì²?ì²˜ë¦¬ ì¤‘ì— ?‚¬?š©?•œ ë¦¬ì†Œ?Š¤ë¥? ë°˜í™˜?•´ì£¼ê¸°?— ? ?‹¹?•œ ë©”ì†Œ?“œ?‹¤
	 */
	@Override
	public void afterCompletion (HttpServletRequest req, HttpServletResponse res, Object handler, Exception e) throws Exception
	{
	}
}
