<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>


<h1 style="text-align: center;">This is home Page</h1> <br>
<h1 style="text-align: center; color: green;">${First }</h1>

<div style="margin-left: 510px;">

<h1 >Welcome ${user.name } Nice to meet You ${user.name }</h1>
<h3 style="color:red;">${info }</h3>

<h2>Kindly confirm your credentials : <br> <br>
Email :${user.email } <br> <br>
Password :${user.pass }
<br> <br><br> <br>
<a href="/Handling_form_with_ModelAttribute_anotations/contact"><button type="submit">Edit</button></a>

&nbsp; &nbsp; &nbsp; <button type="button">OK</button>
</h2>
 

</div>
</body>
</html>