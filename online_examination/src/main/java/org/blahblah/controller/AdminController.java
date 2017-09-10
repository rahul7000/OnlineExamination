
package org.blahblah.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blahblah.constants.Constants;
import org.blahblah.dao.AdminDAO;
import org.blahblah.daoimplementation.AdminDAOImplementation;


/**
 *      
 * 		Servlet implementation class AdminController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */

@WebServlet("/AdminController")

public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AdminDAO dao = new AdminDAOImplementation();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter( "action" );

		if( action.equalsIgnoreCase( "selectStud" ) ) 
		{
			forward = Constants.ADMIN_PAGE;
			request.setAttribute("studentList", dao.getAllStudents() );
		}

		if( action.equalsIgnoreCase( "selectInst" ) )
		{
			forward = Constants.ADMIN_PAGE;
			request.setAttribute("institutes", dao.getAllInstitutes());
		}

		if( action.equalsIgnoreCase( "deleteStud" ) ) 
		{
			forward = Constants.ADMIN_PAGE;
			String studentId = request.getParameter("studentId");
			dao.deleteStudent(studentId);
			request.setAttribute("students", dao.getAllStudents() );
		}

		if( action.equalsIgnoreCase( "deleteInst" ) ) 
		{
			forward = Constants.ADMIN_PAGE;
			String instituteId = request.getParameter("instituteId");
			dao.deleteInstitute(instituteId);
			request.setAttribute("institutes", dao.getAllInstitutes() );
		}


		RequestDispatcher view = request.getRequestDispatcher( forward );
		view.forward(request, response);

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
