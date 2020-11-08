<%@ page import ="java.util.*" %>

<html>

<head>

<title>Added Product</title>

<style>

.maincontainer{
	background-color:grey;
	border-style:solid;
	width:90%;
	float:left;
}

</style>

</head>

<body>

<p>Added product in database successfully!</p>
<div class = "maincontainer"
>
<h3>Details: </h3>

<br>
<%

String barcode = (String)request.getParameter("barcode");
out.println("Unique barcode for the program you entered: " + barcode);

%>
</div>

</body>

</html>
