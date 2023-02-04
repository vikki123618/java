<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script>
  function validation(){
	  var firstName;
	  var lastName;
	  var username;
	  var password;
	  var EmailId;
	  var address;
	  var contact;
	   firstName=document.forms["myform"]["firstName"];
	   lastName=document.forms["myform"]["lastName"];
	   username=document.forms["myform"]["username"];
	   password=document.forms["myform"]["password"];
	   EmailId=document.forms["myform"]["EmailId"];
	   address=document.forms["myform"]["address"];
	   contact=document.forms["myform"]["contact"];
	   //firstName validation
	   //firstName should be allowed only alphabet 
	   var fn=/^[A-Za-z]+$/;
	  if(firstName.value==null||firstName.value== ""||!(firstName.value.match(fn))){
		  alert("please enter the firstname");
		  return false;
	  }
	  //firstName should be allowed only alphabet 
	  else if(firstName.value.length<5){
			  alert("please enter at least 5 cheracters firstname");
			  return false;
	  }
	  //lastName validation
	   //lastName should be allowed only alphabet 
	  var ln=/^[A-Za-z]+$/;
	  if(lastName.value==null||lastName.value==""||!(lastName.value.match(ln))){
		  alert("please enter the lastname");
		  return false;
	  }
	//lastName should be allowed only alphabet 
	  else if(lastName.value.length<5){
			  alert("please enter at least 5 cheracters lastname");
			  return false;
	  }
	  //else  if(username.value==toUpperCase()){
		  //alert("please enter only lowercase in username");
		  //return false;
	  //}(in progresss)
	  
	  //username validation
	  //username should be less than 5
	  if(username.value.length<5){
			  alert("please enter at least 5 cheracters username");
			  return false;
	  } 
	  //username should be allowed alphanumeric
	  if(username.value==""){
		  alert("please enter the username");
		  return false;
	  }
	  //password validation 
	  // password should be entered
	   if(password.value==""){
		  alert("please enter the password.");
		 return false;
	  }
	  //password must be less than 6
	   else if(password.value.length>6){
		   alert("please enter the password at least 6 digite ");
		   return false;
	   }
	 // if(password.value.match(/^[A-Za-z]\w{7,14}$/)){
		//  alert("enter the password at least one lowercase.");
		 // return false;
	 // } not working(in progress)
	// else if(password.value.length<0 && password.value.length<8){
		  // alert("please enter the password at least 6 digite ");
		  //return false;
	//}(in progrss)
	
	
	
	//emailid validation
	//if you enter emailid "@ and . compulsory required.
	var rev = /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
	if(EmailId.value==""|| !(EmailId.value.match(rev))){
	alert("enter the emailId invalid");
	return false;
	}
	
	//address validation
	if(address.value==""){
		alert("please enter the address");
		return false;
	}
	//address should be enter less than 6 cheracters
	else if(address.value>6){
		alert("please enter the address below 6 alphanumeric");
		return false;
	}
	
	//contact validation
	//contact no must be 10 number allowed
	if(contact.value.length!=10){
		alert("please enter the contact no 10 number");
		return false;
	}
	
	  else{
	  return true;
	}
	  
		 }
	  
	  
</script>
<body>
  <div align="center" ">
   <h1>Employee Register Form</h1>
     <form action="<%= request.getContextPath() %>/register" method="post" onsubmit="return validation()" name="myform">
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
           <td><input type="password" name="password" /></td>
       </tr>
       <tr>
           <td>EmailId : </td>
           <td><input type="emailid" name="EmailId" onsubmit="return validationemail()"/></td>
       </tr>
       <tr>
           <td>Address : </td>
           <td><input type="text" name="address"/></td>
        </tr>
        <tr>
           <td>Contact : </td>
           <td><input type="text" name="contact"/></td>
        </tr>
     </table>
       <input type="submit" value="submit" />
   </form>
   </div>
</body>
</html>