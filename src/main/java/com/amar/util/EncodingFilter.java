/* 
 * @(#)EncodingFilter.java	1.0 2010-09-15 
 * 
 * Copyright 2010 Beijing SUN GROUND interactive entertainment Co.,Ltd. All rights reserved.
 */
package com.amar.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class EncodingFilter extends HttpServlet implements Filter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2895948233409664165L;
	protected String encoding = null;
	protected FilterConfig filterConfig = null;
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (request.getCharacterEncoding() == null) {
			String encoding = this.encoding;
			if (encoding != null) {
				request.setCharacterEncoding(encoding);
				response.setCharacterEncoding(encoding);
			}
		}
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");
		
	}
	public void destroy() {
		this.encoding = null;
		this.filterConfig = null;
	}
}
