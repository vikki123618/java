package registration.dao;
//step 1 add import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import student class package
import registration.model.student;

public class databasecon {
	public int studentRegister(student Student) throws ClassNotFoundException{
		//student is database table name
		String INSERT_USER_SQL="INSERT INTO student(username,password,EmailId,address,contact) VALUES(?,?,?,?,?)";
	     
		int result=0;
		// load and registration driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//object create database
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/stud10","root","root");
			
				//statement using crrate object
				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL)){
				preparedStatement.setString(1, Student.getUsername());
				preparedStatement.setString(2, Student.getPassword());
				preparedStatement.setString(3, Student.getEmailId());
				preparedStatement.setString(4, Student.getAddress());
				preparedStatement.setString(5, Student.getContact());
				System.out.println(preparedStatement);
				result=preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	return result;
	}

	
}
