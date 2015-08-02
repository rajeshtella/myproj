package com.login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("inside service");
	}

}
