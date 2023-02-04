package Registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Registration.dao.EmployeeDeo;
import Registration.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//ctrate object (class name "EmployeeDeo") ---->before pg
	private EmployeeDeo employeedeo=new EmployeeDeo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/view/employeeregister.jsp");
	    dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String EmailId=request.getParameter("EmailId");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		 //create new object(import Employee package)
		Employee employee =new Employee();
		employee.setfirstName(firstName);
		employee.setlastName(lastName);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setEmailId(EmailId);
		employee.setAddress(address);
		employee.setContact(contact);
		try {
			//above create object using reference
			//calling to registerEmployee method
			employeedeo.registerEmployee(employee);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		RequestDispatcher dispatcher1=request.getRequestDispatcher("/WEB-INF/view/employeedetails.jsp");
	    dispatcher1.forward(request,response);
		
	}

}