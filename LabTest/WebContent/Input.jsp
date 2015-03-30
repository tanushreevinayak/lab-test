<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
<div class ="Container-fluid">


<div class="jumbotron">

<center><h1>Lab Test 1: Student Info System</h1></center>
<center><h2>Student Name: Tanushree Vinayak    Roll No: MT2014124</h2></center>
</div>

<h2><p class ="text-center">Input Screen</p></h2>

<div class ="row">
<form class="form-horizental" method="post" enctype="multipart/form-data" action="input" autocomplete="off" >
 
   
<div class ="col-sm-6">
<div class="form-group">
<label for="Student Name">Student Name</label>
<input type="text" name="StudentName" class="form-control" id="StudentName"/>
		
		<label >Interest</label>
		
		<select class="form-control" name="Interest">
		<option value="Spandan">Spandan</option>
		<option value="PE">PE</option>
		<option value="RE">RE</option>
		<option value="Android App">Android App</option>
		</select>
		
	
		</div>
		</div>
		
		<div class="col-sm-6">
		<div class="form-group">
<label for="Student ID">ID</label>
<input type="text" name="ID" class="form-control" placeholder="Type Student ID here ...."/>
		</div>
		</div>
		<div class="col-sm-6">
		<div class="form-group">
	<label class="col-lg-2 control-label">Picture</label>
		<s:file class="form-control" id="picture" name="picture" />
		</div>
		
		
		
		</div>
		</div>
		
		
		<div class="row">
		<div class="col-sm-6">
		
		<div class="form-group">
		
		<label>Subject</label>
		<select class="form-control" name="Subject">
		<option value="Maths">Maths</option>
		<option value="Data Modelling">Data Modelling</option>
		<option value="OOAD">OOAD</option>
		<option value="Techno Economics">Techno Economics</option>
		</select>
		
		</div>
		</div>
		
		<div class ="col-sm-6">
		<div class="form-group">
<label for="Marks">Marks </label>
		
		<input type="text"  name="Marks" class="form-control" placeholder="Type Marks here ...."/></br></br>
		</div>
		
		<div class="form-group">
<label for="Submit">Submit </label>
		<input type="submit" align="left" class="btn btn-primary" />
		
		</div>
	
		
		</div>
		</div>
		
		
	</form>	
		
		</div>
		
	
</div>



</body>
</html>