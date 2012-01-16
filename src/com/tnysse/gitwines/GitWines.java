package com.tnysse.gitwines;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GitWines extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>GitWInES</title>");
		out.println("</head>");
		out.println("<body>GitWInES Servlet</body>");
		out.println("</html>");
	}
}
