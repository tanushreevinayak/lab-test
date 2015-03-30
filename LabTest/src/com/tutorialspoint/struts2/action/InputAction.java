package com.tutorialspoint.struts2.action;

import java.io.File;
import java.sql.Blob;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class InputAction extends ActionSupport implements ServletRequestAware
 {

	
	private String StudentName;
	private String ID;
	private String Subject;
	private String Interest;
	private Integer Marks;
	private String picture;
	
	

	private HttpServletRequest servletRequest;
	 
		private static final long serialVersionUID = 1L;
		
	
	 private String studentImageContentType;
	  private String studentImageFileName;
	   // private File Upload;
	  
	  public String getStudentImageContentType() {
		return studentImageContentType;
	}

	public void setStudentImageContentType(String studentImageContentType) {
		this.studentImageContentType = studentImageContentType;
	}

	public String getStudentImageFileName() {
		return studentImageFileName;
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
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}


	
	 private String message;

	
	
	public String execute()  {
		   //System.out.println(StudentName);
		   
		   Connection c;
		   DbConnection con=new DbConnection();
		   try 
			{
			      c=con.createConnection();
			      File image=new File(picture);
			      FileInputStream fin= new FileInputStream(image);
			      	message=null;
String query="insert into student(name,rollno,subject,interest,marks,picture) values(?,?,?,?,?,?)";
			//	ResultSet rs=null;
				
				 java.sql.PreparedStatement preStmt;
				 System.out.println("Name" +StudentName);
				 preStmt = c.prepareStatement(query);
				 preStmt.setString(1, getStudentName());
				 preStmt.setString(2, getID());
				 preStmt.setString(3, getSubject());
				 preStmt.setString(4, getInterest());
				 preStmt.setInt(5, getMarks());
				 preStmt.setBinaryStream(6,fin,image.length());
				 System.out.println(picture);
				 //ileInputStream fis = null;
					
				 
				// System.out.println(Subject);
				// setName(rs.getString(1));
			//	 String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
				/*String filePath="/home/tanushree/workspace/LabTest/WebContent/WEB-INF/assets/photos/";	
				 
				 //String filePath = servletRequest.getSession().getServletContext().getRealPath(“/”);
		            System.out.println("Server path:" + filePath);
		            File fileToCreate = new File(filePath, this.studentImageFileName);
		 
		            FileUtils.copyFile(this.Upload, fileToCreate);

				*/
				 //preStmt.setBlob(4, inputStream);
			      preStmt.executeUpdate();
			    	
			   
			 //  return "NONE";
			      //return "failure";
			   
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "success";
			 
			 
		 }
 
	
		

	public String getStudentName() {
		return StudentName;
	}



	public void setStudentName(String studentName) {
		StudentName = studentName;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getSubject() {
		return Subject;
	}



	public void setSubject(String subject) {
		Subject = subject;
	}



	public String getInterest() {
		return Interest;
	}



	public void setInterest(String interest) {
		Interest = interest;
	}



	public Integer getMarks() {
		return Marks;
	}



	public void setMarks(Integer marks) {
		Marks = marks;
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

	
	
	}