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

public class AddUsecaseServlet extends HttpServlet {
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String pname=req.getParameter("pname");
		String usecase=req.getParameter("usecase");
		
		
		String sql = "insert into usecases (project_name, usecase_name) values (?, ?)";
		
		Connection con = null;
		
		PreparedStatement psmt = null;
		
		try {
			con = DAOFactory.getConnection();
			psmt = con.prepareCall(sql);
		
		psmt.setString(1, pname);
		psmt.setString(2, usecase);
		
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
		String jsp = "/content/addusecases.jsp";
		
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