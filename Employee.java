package Registration.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String address;
	private String contact;
  public String getfirstName(){
	  return firstName;
  }
  public void setfirstName(String firstName){
	  this.firstName=firstName;
  }
  public String getlastName(){
	  return lastName;
  }
  public void setlastName(String lastName){
	  this.lastName=lastName;
  }
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
  
}

