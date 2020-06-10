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
 * ?��?��미터 로깅 �? 로그?�� ?���? ???��.
 * 
 * <p>
 * Server.DEBUG �? true ?�� 경우 request ?�� ?���? ?��?��미터값을 출력
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
			// request 마다 ?��?��?�� ?��?���? 발급?��?�� "?1234567890" ?��?���?
			// request?�� attribute�? 추�??��?�� JSP(header.include)?��?�� ?��?��?��?���? ?��?��.
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
	 * Controller ?��?�� ?�� View �? ?��출하�? ?��?�� ?��출된?��.
	 * modelAndView ?��?��미터?�� 컨트롤러�? ?��?���? ?��보로 컨트롤러 ?��?�� 결과�? 참조?��거나 조작?�� ?�� ?��?��
	 */
	@Override
	public void postHandle (HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView) throws Exception
	{
	}

	/**
	 * View ?��?�� 최종 결과�? ?��?��?��?�� ?��?�� 모든 ?��?��?�� ?��료된 ?�� ?��?��?��?��.
	 * ?���?처리 중에 ?��?��?�� 리소?���? 반환?��주기?�� ?��?��?�� 메소?��?��
	 */
	@Override
	public void afterCompletion (HttpServletRequest req, HttpServletResponse res, Object handler, Exception e) throws Exception
	{
	}
}
