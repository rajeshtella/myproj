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

public class AddGoalServlet extends HttpServlet {
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("inside service");
		
		String pname=req.getParameter("pname");
		String goal=req.getParameter("goal");
		
		
		String sql = "insert into goals (project_name, goal_name) values (?, ?)";
		
		Connection con = null;
		
		PreparedStatement psmt = null;
		
		try {
			con = DAOFactory.getConnection();
			psmt = con.prepareCall(sql);
		
		psmt.setString(1, pname);
		psmt.setString(2, goal);
		
		psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DAOFactory.releaseConnection(con);
		}
		String jsp = "/addGoals.jsp";
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
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