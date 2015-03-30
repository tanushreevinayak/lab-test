<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<title>outputpage</title>
</head>
<body>

<div class ="Container">
<div align="center">
<div class = "row">
<div class="jumbotron">
<center><h1>Lab Test 1: Student Info System</h1></center>
<center><h2>Student Name: Tanushree Vinayak    Roll No: MT2014124</h2></center>
</div>
</div>

<center><h2>Output Screen</h2></center>
<form class="form-horizental" method="post" enctype="multipart/form-data" action="output" >

<div class="row">
<div class="form-group">
<label for="Student ID">ID</label>
<input type="text" name="ID" class="form-control" placeholder="Type Student ID here ...."/>

<label for="Submit">Submit </label>
		<input type="submit" align="left" class="btn btn-primary" />

</div></div>

</form>

<div class="row">
Student Name : <s:property value="StudentName"/>
</div>
<div class="row">
Roll No : <s:property value="ID"/>
</div>
<div class="row">
Subject : <s:property value="Subject"/>
</div>
<div class="row">
Interest : <s:property value="Interest"/>
</div>
<div class="row">
Marks : <s:property value="Marks"/>

</div>
<div class="row">
Grade : <s:property value="grade"/>
</div>

<div class="row">
Image :<img src="<s:property value="ID"/>.jpg" class="img-circle" width="304" height="236">
</div>

</div>
</div>

<!--  
<div class ="Container-fluid">

<div class = "row">
<div class="jumbotron">
<center><h1>Lab Test 1: Student Info System</h1></center>
<center><h2>Student Name: Tanushree Vinayak    Roll No: MT2014124</h2></center>
</div>
</div>

<center><h2>Output Screen</h2></center>
<center><h2>Marks</h2></center>

		 
<div class="row">

<form class="form-horizental" method="post" enctype="multipart/form-data" action="output" >

<div class="col-sm-4">
<div class="form-group">
<label for="STUDENT">STUDENT : </label>
<input type="text" name="ID" class="form-control" placeholder="Type Student ID here ...."/><br/></br>
</div>
</div>

<div class="col-sm-4">
<div class="form-group">
<label for="OOAD">OOAD</label>
<input type="number" name="ooad" class="form-control" id="ooad"/>
</div>

<div class="form-group">
<label  for="Maths">Maths</label>
<input type="number" name="maths" class="form-control" id="maths"/>
</div>


<div class="form-group">
<label for="Data Modelling">Data Modelling</label>
<input type="number" name="Data Modelling" class="form-control" id="Data Modelling"/>
</div>

	
<div class="form-group">
<label  for="Techno Economics">Techno Economics</label>
<input type="number" name="Techno Economics" class="form-control" id="Techno Economics"/>
</div>

<div class="form-group">
<label for="Total">Total</label>
<input type="number" name="Total" class="form-control" id="Total"/>
</div>


<div class="form-group">	
<label for="%age">%age</label>
<input type="number" name="%age" class="form-control" id="%age"/>
</div>
</div>


	
				 	
		           <div class ="col-sm-4">
				 	<div class="form-group">
					<label align="center" for="Grade">Grade</label>
					<input type="text" name="Grade" class="form-control" id="Grade"/>
					</div>
					</div>
					
					</form>
					</div>
				 	
<div class="row">
<div class="col-sm-6">
		 <div class="form-group">
		 <label  for="interest">INTEREST : </label>
		<input type="text"  name="Interest" class="form-control" placeholder="Type Interests here ...."/><br/>
		</div></div>

<div class="col-sm-6">
		 <div class="form-group">
		 
		<input type="submit" align="left" class="btn btn-primary" />
		</div></div>
		
		</div>						 	
				 	
</div>
-->

</body>
</html>