package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("inside service"+ req.getParameter("uname"));
		
		String uname=req.getParameter("uname");
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String password=req.getParameter("pass1");
		String confirmpassword=req.getParameter("pass2");
		String email=req.getParameter("email");
		
		
		Connection con = DAOFactory.getConnection();
		
		try {
			PreparedStatement psmt = con.prepareStatement("insert into goal_users (LOGINNAME,FIRSTNAME,LASTNAME,PASSWORD,EMAIL) "
					+ "values (?, ?, ?, ?, ?)");
			psmt.setString(1, uname);
			psmt.setString(2, fname);
			psmt.setString(3, lname);
			psmt.setString(4, password);
			psmt.setString(5, email);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(con != null)
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String nextJSP = "/registersuccess.jsp";
		RequestDispatcher dispatcher =req.getRequestDispatcher(nextJSP);
		try {
			dispatcher.forward(req,res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

