package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registation.dao.employeedao;
import registration.model.employeemodel;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/register")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//create object employeedao class name
	private employeedao employeeDao=new employeedao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatchar=request.getRequestDispatcher("/WEB-INF/view/employeedetails.jsp");
		dispatchar.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//create object(employeemodel)
		employeemodel employee=new employeemodel();
		employee.setUsername(username);
		employee.setPassword(password);
		try{
			//create object for above reference and employeedao 
			employeeDao.employeeRegister(employee);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		
	}
		RequestDispatcher dispatchar=request.getRequestDispatcher("/WEB-INF/view/employeeregister.jsp");
		dispatchar.forward(request, response);

	}
}