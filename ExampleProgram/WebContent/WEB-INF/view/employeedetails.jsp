<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
<div align="center">
   <h1>Registration Form</h1>
   <form action="<%= request.getContextPath() %>/register" method="post">
   <table>
   <tr>
   <td>Enter UserName : </td>
   <td><input type="text" name=username /></td>
   </tr>
   <tr>
   <td>Enter Password : </td>
   <td><input type="password" name=password /></td>
   </tr>
   </table>
   <input type="submit" value="submit"/>
   </form>
</div>
</body>
</html>