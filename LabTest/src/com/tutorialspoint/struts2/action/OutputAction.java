package com.tutorialspoint.struts2.action;
import java.io.*;
import java.sql.Blob;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tutorialspoint.struts2.action.DbConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.tutorialspoint.struts2.action.DbConnection;
import java.io.*;
public class OutputAction extends ActionSupport implements ServletRequestAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String StudentName;
	private String ID;
	private String Subject;
	private String Interest;
	private Integer Marks;
	private String message;
	private String image;
	private String grade;
	
	  private String studentImageContentType;
	  private String studentImageFileName;
	  public String getStudentImageContentType() {
		return studentImageContentType;
	}

	public void setStudentImageContentType(String studentImageContentType) {
		this.studentImageContentType = studentImageContentType;
	}

	public String getStudentImageFileName() {
		return studentImageFileName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		this.ID = id;
	}

	public void setStudentImageFileName(String studentImageFileName) {
		this.studentImageFileName = studentImageFileName;
	}

	private  File studentImage;
	  public File getStudentImage() {
		return studentImage;
	}

	public void setStudentImage(File studentImage) {
		this.studentImage = studentImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private HttpServletRequest servletRequest;
	 
	 public String execute(){
		 
		 Connection c;
		 DbConnection con=new DbConnection();
			 try {
				c=con.createConnection();
		 
			 message=null;
		
			String query="select * from student";
			 ResultSet rs=null;
				Statement stmt=null;
				// c=con.createConnection();
					stmt=c.createStatement();
				
				rs=stmt.executeQuery(query);
				
				//System.out.println(" TEST TEST");
				while(rs.next())
				{
				    	 if(ID.equals(rs.getString(2)))
				    		//System.out.println("Test Name "+ rs.getString(2));
				    	 {	 StudentName=rs.getString("name");
				    	 ID=rs.getString("rollno");
				    	 Subject=rs.getString("Subject");
				    	 Interest=rs.getString("Interest");
				    	 Marks=rs.getInt("Marks");
				    	 String filepath="/home/tanushree/workspace/LabTest/WebContent/"+ID+".jpg";
				    	 Blob blob=rs.getBlob("picture");
				    	 InputStream inputStream = blob.getBinaryStream();
				    	 OutputStream outputStream= new FileOutputStream(filepath);
				    	 
				    	 int bytesRead=-1;
				    	 byte[] buffer=new byte[4096];
				    	 while((bytesRead=inputStream.read(buffer)) !=-1){
				    		 outputStream.write(buffer,0,bytesRead);
				    	 }
				    	 inputStream.close();
				    	 outputStream.close();
				    	 System.out.println("file save");
				    	if(Marks>=80)
				    	{
				    		setGrade("A");
				    	}
				    	else if(Marks>=60 & Marks<80)
				    	{
				    		setGrade("B");
				    	}
				    	else if(Marks>=40 & Marks<60)
				    	{
				    		setGrade("C");
				    	}
				    	else
				    	{
				    		setGrade("D");
				    	}
				    	 }
				    /*	 else
				    	 {
				    		 message="Login failed";
				    		 return "failed";
				    	 }*/
				     
				     		}
				/*	else
				{
					message="Login Failed";
					return "failed";
				}*/
				}
			 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 return "success";
				
	 
	 }
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentname) {
		this.StudentName = studentname;
	}

	
	public String getInterest() {
		return Interest;
	}

	public void setInterest(String Interest) {
		this.Interest = Interest;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}

	public Integer getMarks() {
		return Marks;
	}

	public void setMarks(Integer Marks) {
		this.Marks = Marks;
	}


	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	}