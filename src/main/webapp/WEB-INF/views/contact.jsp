<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Web Page Form </h1> <br>
<h1 style="text-align: center; color:yellow;">${First }</h1>
<div style="margin-left: 530px;">
<h3>${topic }</h3>
<h3 style="color:red;">${info }</h3>

<form action="formsubmit" method="Post" >

Name : <input type="text"  name="name"  placeholder="Enter your Nmae" required="required"> <br> <br>

Email : <input type="email" name="email" placeholder="Enter Your Email"> <br> <br>

Password : <input type="password" name="pass" placeholder="Enter Your Password"> <br> <br>

<button type="submit">Submit</button>


</form>
</div>

</body>
</html>