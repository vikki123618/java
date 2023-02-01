package Registration.dao;
//step 1 import the package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Registration.model.Employee;


public class EmployeeDeo {
	//Employee is class name
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		// write the query
		String INSERT_USER_SQL="INSERT INTO employees"+
	    "(id,firstName,lastName,username,password,address,contact) VALUES "+
		"(?,?,?,?,?,?,?);";
		int result=0;
		
		//step 2 load and register the diver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 3 create object
		try(Connection connection=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
				//step 4 : create statement using connection object
				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL)){
			  preparedStatement.setInt(1,1);
			  preparedStatement.setString(2, employee.getfirstName());
			  preparedStatement.setString(3, employee.getlastName());
			  preparedStatement.setString(4, employee.getUsername());
			  preparedStatement.setString(5, employee.getPassword());
			  preparedStatement.setString(6, employee.getAddress());
			  preparedStatement.setString(7, employee.getContact());
			  
			  System.out.println(preparedStatement);
			  
			  //step 5 : Execute the query or update query
			  result=preparedStatement.executeUpdate();
			  
			
		} catch(SQLException e){
			//process sql exception
			e.printStackTrace();
		}
		return result;
		
	}
	

}
