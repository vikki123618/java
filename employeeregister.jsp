<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register page</title>
</head>
<body>
 <div align="center">
   <h1>Employee Register Form</h1>
     <form action="<%= request.getContextPath() %>/register" method="post">
      <table>
        <tr>
           <td>First Name :</td>
           <td><input type="text" name="firstName"/></td>
        </tr>
        <tr>
           <td>Last Name : </td>
           <td><input type="text" name="lastName"/></td>
        </tr>
        <tr>
          <td>User name : </td>
          <td><input type="text" name="username"/></td>
        </tr>
        <tr>
           <td>Password : </td>
           <td><input type="password" name="password"/></td>
       </tr>
       <tr>
           <td>Address : </td>
           <td><input type="text" name="address"/></td>
        </tr>
        <tr>
           <td>Contact No : </td>
           <td><input type="text" name="contact"/></td>
        </tr>
     </table>
       <input type="submit" value="submit" />
   </form>
</div>
</body>
</html>