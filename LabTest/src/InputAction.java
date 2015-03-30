

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSetMetaData;

/**
 * Servlet implementation class InputAction
 */
@WebServlet("/InputAction")
public class InputAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String rollno,msg,name,subject,interest;
       int marks;
     	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  response.setContentType("text/html");
			 PrintWriter out = response.getWriter(); 
		
		Connection c;
		DbConnection con=new DbConnection();
		
		try{
			
			c=con.createConnection();
			msg=null;
			name=request.getParameter("name");
			rollno=request.getParameter("ID");
			subject=request.getParameter("Subject");
		interest=request.getParameter("Interest");
		interest=request.getParameter("Marks");
		
		String query="insert into student(name,rollno,subject,interest,marks) values (?,?,?,?,?)";
		PreparedStatement stmt=c.prepareStatement(query);
		
		stmt.setString(1, name);
		stmt.setString(2,rollno);
		stmt.setString(3, subject);
		stmt.setString(4, interest);
		stmt.setInt(5, marks);
		int flag;
		
		
		
		flag=stmt.executeUpdate();
		
		if(flag!=0)
		{		
				//request.setAttribute("first", "signin");
			    
		msg="Registered  Successfully";
		}
		else
			msg="Unsuccessful";
		request.setAttribute("Message", msg);
		RequestDispatcher rd=request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
			
		}
		catch(Exception e) 
	 
		{
			
			e.printStackTrace();
		}
		
		}
	}


