
package org.blahblah.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blahblah.constants.Constants;
import org.blahblah.dao.StudentDAO;
import org.blahblah.daoimplementation.StudentDAOImplementation;
import org.blahblah.model.Student;

/**
 *      
 * 		Servlet implementation class StudentRegisterController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
@WebServlet("/StudentRegisterController")

public class StudentRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String forward = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		StudentDAO dao = new StudentDAOImplementation();
		Student student = new Student();
		PrintWriter out = response.getWriter();

		student.setStudentName(request.getParameter("username"));
		student.setEmailId(request.getParameter("email"));
		student.setPassword(request.getParameter("password"));
		student.setDateOfBirth(request.getParameter("dob"));
		student.setGender(request.getParameter("dropdown"));
		student.setContactNumber(request.getParameter("mobile"));


		String result= dao.registerStudent(student);

		out.print(result);  

		RequestDispatcher view = request.getRequestDispatcher(Constants.LOGIN);  
		view.include(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
