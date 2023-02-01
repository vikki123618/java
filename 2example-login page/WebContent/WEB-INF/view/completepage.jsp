<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div align="center">
     <h1>LOGIN FORM</h1>
        <form action="<%= request.getContextPath() %>/register" method="post">
           <table>
                <tr>
                  <td>UserName :</td>
                  <td><input type="text" name=username></td>
                </tr>
                <tr>
                  <td>Password :</td>
                  <td><input type="password" name=password></td>
                </tr>
                <tr>
                  <td>EmailId :</td>
                  <td><input type="text" name=EmailId></td>
                </tr>
                <tr>
                  <td>address :</td>
                  <td><input type="email" name=address></td>
                </tr>
                <tr>
                  <td>Contact No :</td>
                  <td><input type="text" name=contact></td>
                </tr>
           </table>
           <input type="submit" value=submit>
        </form>
   </div>
</body>
</html>