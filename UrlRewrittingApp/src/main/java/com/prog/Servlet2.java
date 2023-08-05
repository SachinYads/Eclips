package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=req.getParameter("username");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>Name="+username+"</h1>");
		//us4e for url rewritting
		out.print("<a href='servlet2?username='"+username+">Servlet2</a>");

	}

}
