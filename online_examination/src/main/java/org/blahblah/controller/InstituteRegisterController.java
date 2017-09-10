
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
import org.blahblah.dao.InstituteDAO;
import org.blahblah.daoimplementation.InstituteDAOImplementation;
import org.blahblah.model.Institute;


/**
 *      
 * 		Servlet implementation class InstituteRegisterController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
@WebServlet("/InstituteRegisterController")

public class InstituteRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InstituteDAO dao = new InstituteDAOImplementation();
		Institute institute = new Institute();
		PrintWriter out = response.getWriter();


		institute.setInstituteName(request.getParameter("institutename"));
		institute.setEmailId(request.getParameter("institutemail"));
		institute.setPassword(request.getParameter("institutepassword"));
		institute.setContactNumber(request.getParameter("institutephone"));

		String result= dao.registerInstitute(institute);
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
