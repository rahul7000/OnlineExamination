
package org.blahblah.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.blahblah.constants.Constants;
import org.blahblah.dao.InstituteDAO;
import org.blahblah.daoimplementation.InstituteDAOImplementation;
import org.blahblah.model.Exam;
import org.blahblah.model.Login;
import org.blahblah.model.QuestionPaper;


/**
 *      
 * 		Servlet implementation of InstituteController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
@WebServlet("/InstituteController")

public class InstituteController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	static int count=1;
	static ArrayList<Exam> result;
	Exam exam = new Exam();
	QuestionPaper question =new QuestionPaper();

	private InstituteDAO dao = new InstituteDAOImplementation();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String forward = "";
		String action = request.getParameter( "action" );
		boolean flag=true;

		HttpSession session = request.getSession();
		Login currentInstitute = (Login)(session.getAttribute("currentSessionUser"));
		String instituteMailId = currentInstitute.getUserName();

		if( action.equalsIgnoreCase( "selectStudent" ) ) 
		{
			forward = Constants.INSTITUTE_STUDENT_LIST;
			request.setAttribute("studentList", dao.getAllStudents(instituteMailId) );

		}

		if( action.equalsIgnoreCase( "selectExam" ) )
		{
			forward = Constants.INSTITUTE_EXAM_LIST;
			request.setAttribute("examList", dao.getAllExams(instituteMailId));
		}

		if( action.equalsIgnoreCase( "deleteExam" ) ) 
		{
			forward = Constants.INSTITUTE_EXAM_LIST;
			String examId = request.getParameter("examId");
			dao.deleteExam(examId);
			request.setAttribute("examList", dao.getAllExams(instituteMailId) );
		}

		if(action.equalsIgnoreCase("register"))
		{
			forward = Constants.INSTITUTE_UPLOAD_EXAM;

			exam.setExamId(request.getParameter("examid"));
			exam.setExamName(request.getParameter("examname"));
			exam.setDate(request.getParameter("examdate"));
			exam.setTime(request.getParameter("examtime"));
			exam.setMarks(request.getParameter("exammarks"));
			exam.setInstituteId(request.getParameter("instituteid"));

			result=dao.uploadExam(exam);	
		}

		if(action.equalsIgnoreCase("question")){
			for(Exam e:result) 
			{
				if(e.getExamId().equals(request.getParameter("examid"))) 
				{
					question.setQuestionNo(request.getParameter("qno"));
					question.setQuestion(request.getParameter("Qname"));
					question.setOptionA(request.getParameter("optA"));	
					question.setOptionB(request.getParameter("optB"));	
					question.setOptionC(request.getParameter("optC"));	
					question.setOptionD(request.getParameter("optD"));	
					question.setCorrectAnswer(request.getParameter("correct"));	
					question.setExamId(request.getParameter("examid"));	
					question.setQuestionId(++Constants.QUESTION_ID_GENERATOR);
					
					String resultqstn= dao.uploadQuestion(question);

					out.print(resultqstn);  
					flag=false;
				}
			}	
			if(flag==false) 
			{
				if(count<5) 
				{
					forward = Constants.INSTITUTE_UPLOAD_EXAM;
					count++;
				} 
			} else 
			{
				forward = Constants.INSTITUTE_EXAM_LIST;
			}
		}       

		RequestDispatcher view = request.getRequestDispatcher( forward );
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





