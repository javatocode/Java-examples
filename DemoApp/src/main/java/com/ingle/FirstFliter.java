package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FirstFliter
 */
@WebFilter("/ff")
public class FirstFliter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// pass the request along the filter chain
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int num1 = Integer.parseInt(req.getParameter("num1"));
		if(num1 > 2) {
			chain.doFilter(request, response);
		}
		else {
			out.print("invalid num1 ");
		}
		}
		

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
