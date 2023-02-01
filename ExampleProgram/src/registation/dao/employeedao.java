package registation.dao;
//step 1 import package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//create before package access
import registration.model.employeemodel;


public class employeedao {
	//employeemodel before "class name"
	public int employeeRegister(employeemodel employee) throws ClassNotFoundException{
		String INSERT_USER_SQL="INSERT INTO emp"+"(username,password) VALUES"+"(?,?);";
		int result=0;
		//step 2 load and registration dreiver
				Class.forName("com.mysql.jdbc.Driver");
				
		//step 3 create object 
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/employee1","root","root");
		
		//step 4 using statement create object
		PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL)){
			//employee already create object
			preparedStatement.setString(1, employee.getUsername());
			preparedStatement.setString(2,employee.getPassword());
			
			System.out.println(preparedStatement);
		}
			
			//execute query
			catch(SQLException e){
				//process exception
				e.printStackTrace();
			
			
		}
		
		return result;
	
		}	
		
		
	}


