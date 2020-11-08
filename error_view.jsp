<%@ page import="java.util.*" %>

<html>

<head>

<title>The product</title>

<style>

.maincontainer{
	background-color:grey;
	border-style:solid;
	float:left;
	width:90%;
}

</style>

</head>

<body>

<h2>Attention!</h2>

<p>The product you entered already exists in database</p>

<div class = "maincontainer">

<%

String barcode = (String)request.getParameter("barcode");
String color = (String)request.getParameter("color");
String name = (String)request.getParameter("name");

%>

<ul>

<li><%out.print("Barcode: " + barcode);%></li>
<li><%out.print("Color: " + color);%></li>
<li><%out.print("Name: " + name);%></li>

</ul>

</div>

</body>

</html>
