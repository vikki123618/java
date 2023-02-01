package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.databasecon;
import registration.model.student;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/register")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private databasecon databaseCon=new databasecon();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatchar=request.getRequestDispatcher("/WEB-INF/view/completepage.jsp");
        dispatchar.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String EmailId=request.getParameter("EmailId");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		//create object(import student class)
		student Student=new student();
		Student.setUsername(username);
		Student.setPassword(password);
		Student.setEmailId(EmailId);
		Student.setAddress(address);
		Student.setContact(contact);
		try{
			databaseCon.studentRegister(Student);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		RequestDispatcher dispatchar=request.getRequestDispatcher("/WEB-INF/view/homepage.jsp");
        dispatchar.forward(request, response);
		
	}

}
