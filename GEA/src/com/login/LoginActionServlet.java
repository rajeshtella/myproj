package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginActionServlet extends HttpServlet {
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("inside service");
		
		String uname=req.getParameter("uname");
		
		String password=req.getParameter("pass");
		
		
		Connection con = DAOFactory.getConnection();
		PreparedStatement psmt = null;
		
		String sql="select password from goal_users where loginname=?";
		boolean isValidUser =false;
		try
		{
		psmt = con.prepareStatement(sql);
		psmt.setString(1, uname);
		ResultSet rs = psmt.executeQuery();
		if(rs.next())
		{
			if(password.equalsIgnoreCase(rs.getString(1)))
				{
					isValidUser = true;
				}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(null != psmt)
			{
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		String jsp = null;
		if(isValidUser)
			jsp="/home.jsp";
		else
		{
			jsp="/login.jsp";
			req.setAttribute("showError","Y");
		}		
		RequestDispatcher dispatcher = req.getRequestDispatcher(jsp);
		try {
			dispatcher.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}