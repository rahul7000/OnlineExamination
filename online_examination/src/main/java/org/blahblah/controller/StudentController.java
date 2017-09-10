
package org.blahblah.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.blahblah.constants.Constants;
import org.blahblah.dao.InstituteDAO;
import org.blahblah.dao.StudentDAO;
import org.blahblah.daoimplementation.InstituteDAOImplementation;
import org.blahblah.daoimplementation.StudentDAOImplementation;
import org.blahblah.model.Login;

/**
 *      
 * 		Servlet implementation class StudentController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
@WebServlet("/StudentController")

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDAO dao = new StudentDAOImplementation();
	private InstituteDAO dao2 = new InstituteDAOImplementation();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter( "action" );

		HttpSession session = request.getSession();
		Login currentStudent = (Login)(session.getAttribute("currentSessionUser"));
		String studentMailId = currentStudent.getUserName();


		if( action.equalsIgnoreCase( "listInstitute" ) )
		{
			forward = Constants.INSTITUTE_LIST;
			request.setAttribute("instituteList", dao.getAllInstitutes(studentMailId) );
		}

		if( action.equalsIgnoreCase( "selectInstitute" ) )
		{
			forward = Constants.STUDENT_EXAM_LIST;
			String instituteId = request.getParameter("instituteId");
			request.setAttribute("examList", dao.getAllExams(instituteId,studentMailId));
		}

		if( action.equalsIgnoreCase( "giveExam" ) )
		{
			forward = Constants.GIVE_EXAM;
			String examId = request.getParameter("examId");
			request.setAttribute("questionList", dao.getAllQuestions(examId));
		}

		if( action.equalsIgnoreCase( "getResult" ) )
		{
			forward = Constants.GET_RESULT;
			String ans1 = request.getParameter("answer1");
			String ans2 = request.getParameter("answer2");
			String ans3 = request.getParameter("answer3");
			String ans4 = request.getParameter("answer4");
			String ans5 = request.getParameter("answer5");
			request.setAttribute("result",  dao2.calculateResult(ans1, ans2, ans3, ans4, ans5, studentMailId));
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
