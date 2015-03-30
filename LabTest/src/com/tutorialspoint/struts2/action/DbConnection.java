package com.tutorialspoint.struts2.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {
		public Connection createConnection() throws ClassNotFoundException
		{
			String url;
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			url="jdbc:mysql://localhost:3306/sis";
			try 
			{
				con=DriverManager.getConnection(url,"root","sriradhe");
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return con;
			
		}
		public void closeConnection(Connection con)
		{
			try 
			{
				con.close();
			}
			catch (SQLException e)
			{
			
				e.printStackTrace();
			}
		}
	}

	

