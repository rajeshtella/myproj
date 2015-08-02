package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
	
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GEA", "password");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

	public static void releaseConnection(Connection con)
	{
		if ( con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
