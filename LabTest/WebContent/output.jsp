<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information System</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
 <link rel="stylesheet" href="bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
  <div class="navbar navbar-inverse">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="index.html">Lab Test</a>
  </div>
  <!-- For Mobile Display -->
  <div class="navbar-collapse collapse navbar-responsive-collapse">
     <ul class="nav navbar-nav navbar-right">
      <li><a href="input.jsp">Input</a></li>
      <li><a href="<%=request.getContextPath() %>/viewdetails">Output</a></li>
   	  
    </ul>
  </div>
</div>
  <div class="row">
 		<div class="col-md-2"></div>
 		 <div class="col-md-8">
 		 	<div class="panel panel-primary">
 		 		  <div class="panel-heading" align="center"><h5>LabTest1 : Student Information System</h5></div>
  				<div class="panel-body">
  					<h4 align="left" class="col-lg-4 control-label"> Student Name : Tanushree Vinayak</h4>
  					<h4 align="right" class="col-lg-8 control-label">Roll No : MT2014124</h4>
  					
  				</div>
  			</div>
  		</div>	
  	</div>	
  	<div class="row">
 		 <div class="col-md-2"></div>
 		 <div class="col-md-8">
 		 	<div class="panel panel-success">
 		 		  <div class="panel-heading" align="center"><h5>Registration Form</h5></div>
  				<div class="panel-body">
  				<div class="col-md-4">
  				 				
  				<label class="control-label"> Student Name :<s:property value="StudentName"/> </label><br><br><br>
  				<label class="control-label"> ID :<s:property value="ID"/> </label>
  				
  				
  				</div>
  				
  				<div class="col-md-4">
  				
  				<label class=" control-label"> Marks : <s:property value="Marks"/></label><br><br>
  				 <label class="control-label"> OOAD :</label><br><br>
  				<label class="control-label"> Data Modelling :</label>
  				<label class="control-label"> Maths :</label><br><br>
  				<br><br>
  				<label class="control-label"> Total :<s:property value="Marks"/></label><br>
  				<label class="control-label"> Percentage :</label><br><br>
  				<label class="control-label"> Interest :<s:property value="Interest"/></label><br><br>
  				</div>
  				<div class="col-md-4">
  				
  				<label class=" control-label"> Image :<img alt="" src="<s:property value="b"/>"></label>
  				
  				</div>
  				
 				 </div>
			</div>		 
 		 </div>
 		 <div class="col-md-8"></div>
	</div>
  	
  	
  	
  	
  		
</body>
</html>