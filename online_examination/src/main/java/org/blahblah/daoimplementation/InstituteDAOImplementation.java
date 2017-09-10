
package org.blahblah.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.blahblah.constants.Constants;
import org.blahblah.dao.InstituteDAO;
import org.blahblah.model.Exam;
import org.blahblah.model.Institute;
import org.blahblah.model.QuestionPaper;
import org.blahblah.model.Report;
import org.blahblah.model.Student;
import org.blahblah.utility.DBUtility;

/**
 *      
 * 		Have the definition of all methods related to institute 
 *      @see InstituteDAO
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 25-June-2017
 */
public class InstituteDAOImplementation implements InstituteDAO{

	private static Connection currentConnection = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	static String selectQuery;
	static String insertQuery;
	static String deleteQuery;
	static String updateQuery;

	/**
	 * InstituteDAOImplementation constructor without parameters 	
	 */
	public InstituteDAOImplementation() {
		currentConnection = DBUtility.getConnection();
	}

	/**
	 *	Method to register the institute
	 *	@return description : String
	 *	@see registerInstitute
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public String registerInstitute(Institute institute) {
		try
		{
		String query = "insert into institute (INSTITUTEID, INSTITUTENAME, INSTITUTEMAIL, INSTITUTEPASSWORD, INSTITUTEPHONE) values (?,?,?,?,?)";

		String instituteId = "INS"+ Constants.INSTITUTE_ID_GENERATOR;
		++Constants.INSTITUTE_ID_GENERATOR;

		institute.setInstituteId(instituteId);

		preparedStatement = currentConnection.prepareStatement(query);

		preparedStatement.setString(1, institute.getInstituteId());
		preparedStatement.setString(2, institute.getInstituteName());
		preparedStatement.setString(3, institute.getEmailId());
		preparedStatement.setString(4, institute.getPassword());
		preparedStatement.setString(5, institute.getContactNumber());
		System.out.println("institute");
		preparedStatement.executeUpdate();
		System.out.println("institute");

		String query2 = "insert into login(LOGINID, PASSWORD, TYPE) values (?,?,?)";

		preparedStatement = currentConnection.prepareStatement(query2);

		preparedStatement.setString( 1, institute.getEmailId());
		preparedStatement.setString( 2, institute.getPassword());
		preparedStatement.setString( 3, "institute");

		System.out.println(institute);
		preparedStatement.executeUpdate();

		return "SUCCESS";

		}catch(SQLException e)
		{
			e.getMessage();
		}
		return "Oops.. Something went wrong there..!";

	}


	/**
	 *	Method to get all student list
	 *	@return description : List<Student>
	 *	@see getAllStudents
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Student> getAllStudents(String instituteMailId) {
		List<Student> studentList = new ArrayList<Student>();
		String instituteId = null;

		try {
			selectQuery = "select * from institute where INSTITUTEMAIL = ?";
			preparedStatement = currentConnection.prepareStatement(selectQuery);
			preparedStatement.setString(1, instituteMailId);

			resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				instituteId = resultSet.getString(1);
			}

			String selectQuery2 = "select * from student where INSTITUTEId = ?" ;
			preparedStatement = currentConnection.prepareStatement(selectQuery2);
			preparedStatement.setString(1, instituteId);

			resultSet = preparedStatement.executeQuery();

			while( resultSet.next() ) {
				Student student = new Student();

				student.setStudentId( resultSet.getString(1) );
				student.setStudentName( resultSet.getString(2) );
				student.setEmailId(resultSet.getString(3) );
				student.setPassword(resultSet.getString(4) );
				student.setGender(resultSet.getString(5));
				student.setDateOfBirth(resultSet.getString(6));
				student.setContactNumber(resultSet.getString(7) );	
				student.setInstituteId(resultSet.getString(8));

				studentList.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	/**
	 *	Method to get all exam list
	 *	@return description : List<Exam>
	 *	@see getAllExams
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Exam> getAllExams(String instituteMailId) {
		List<Exam> exams = new ArrayList<Exam>();
		String instituteId = null;
		try {
			selectQuery = "select * from institute where INSTITUTEMAIL = ?";

			PreparedStatement preparedStatement = currentConnection.prepareStatement(selectQuery);
			preparedStatement.setString(1, instituteMailId);

			resultSet = preparedStatement.executeQuery();

			while(resultSet.next())
			{
				instituteId = resultSet.getString(1);
			}

			String selectQuery2 = "select * from exam where INSTITUTEID = ?" ;
			preparedStatement = currentConnection.prepareStatement(selectQuery2);
			preparedStatement.setString(1, instituteId);

			resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				Exam exam = new Exam();

				exam.setExamId(resultSet.getString(1) );
				exam.setExamName(resultSet.getString(2) );
				exam.setDate(resultSet.getString(3) );
				exam.setTime(resultSet.getString(4) );
				exam.setMarks(resultSet.getString(5));
				exams.add(exam);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exams;
	}

	/**
	 *	Method to delete exam
	 *	@return description : void
	 *	@see deleteExam
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public void deleteExam(String examId ) {
		try {
			deleteQuery = "delete from questionare where EXAMID = ?";

			PreparedStatement preparedStatement = currentConnection.prepareStatement(deleteQuery);
			preparedStatement.setString(1, examId);
			preparedStatement.executeUpdate();


			String deleteQuery1 = "delete from exam where EXAMID = ?";

			preparedStatement = currentConnection.prepareStatement(deleteQuery1);
			preparedStatement.setString(1, examId);
			preparedStatement.executeUpdate();


		} catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

	/**
	 *	Method to calculate result 
	 *	@return description : Report
	 *	@see calculateResult
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public Report calculateResult(String ans1, String ans2, String ans3, String ans4, String ans5,
			String studentMailId) {
		
		QuestionPaper question = new QuestionPaper();
		Report result = new Report();
		int correct = 0;
		int incorrect = 0;
		int score = 0;
		int count = 0;

		try {

			selectQuery = "select * from questionare ";
			PreparedStatement preparestatement = currentConnection.prepareStatement(selectQuery);

			resultSet = preparestatement.executeQuery();

			while( resultSet.next() ) {
				count++;
				if(count<=5)
				{
					if(resultSet.getInt(9) == 1){
						question.setCorrectAnswer(resultSet.getString(7));

						if(question.getCorrectAnswer().equalsIgnoreCase(ans1)){
							++correct;

							score += 5;	}else{
								++incorrect;
							}
					}else if(resultSet.getInt(9) == 2){
						question.setCorrectAnswer(resultSet.getString(7));

						if(question.getCorrectAnswer().equalsIgnoreCase(ans2)){
							++correct;

							score += 5;
						}else{
							++incorrect;
						}
					}else if(resultSet.getInt(9) == 3){
						question.setCorrectAnswer(resultSet.getString(7));

						if(question.getCorrectAnswer().equalsIgnoreCase(ans3))	{
							++correct;

							score += 5;
						}else{
							++incorrect;
						}
					}else if(resultSet.getInt(9) == 4){
						question.setCorrectAnswer(resultSet.getString(7));

						if(question.getCorrectAnswer().equalsIgnoreCase(ans4)){
							++correct;

							score += 5;
						}else{
							++incorrect;
						}
					}else if(resultSet.getInt(9) == 5){
						question.setCorrectAnswer(resultSet.getString(7));

						if(question.getCorrectAnswer().equalsIgnoreCase(ans5)){
							++correct;

							score += 5;
						}else{
							++incorrect;
						}
					}

				}
			}


			result.setStudentMailId(studentMailId);
			result.setCorrectAnswers(correct);
			result.setIncorrectAnswers(incorrect);
			result.setScore(score);


			insertQuery = "insert into RESULT values(?, ?, ?, ?)";
			preparestatement = currentConnection.prepareStatement(insertQuery);
			preparestatement.setString(1, result.getStudentMailId());
			preparestatement.setInt(2, result.getCorrectAnswers());
			preparestatement.setInt(3, result.getIncorrectAnswers());
			preparestatement.setInt(4, result.getScore());
			preparestatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 *	Method to get all Exam list
	 *	@return description : ArrayList<Exam>
	 *	@see uploadExam
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public ArrayList<Exam> uploadExam(Exam exam) {
		ArrayList<Exam> examList= new ArrayList<Exam>();

		try {
			insertQuery = "insert into exam(EXAMID, EXAMNAME, EXAMDATE, EXAMTIME,EXAMMARKS,INSTITUTEID) values (?,?,?,?,?,?)";

			String examId = "EX"+ Constants. EXAM_ID_GENERATOR;
			++Constants. EXAM_ID_GENERATOR;

			exam.setExamId(examId);

			preparedStatement = currentConnection.prepareStatement(insertQuery);

			preparedStatement.setString(1, exam.getExamId());
			preparedStatement.setString(2, exam.getExamName());
			preparedStatement.setString(3, exam.getDate());
			preparedStatement.setString(4, exam.getTime());
			preparedStatement.setString(5, exam.getMarks());
			preparedStatement.setString(6,exam.getInstituteId());
			preparedStatement.executeUpdate();

			selectQuery="Select * from exam";

			preparedStatement = currentConnection.prepareStatement(selectQuery);
			resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {

				Exam exam2= new Exam();
				exam2.setExamId(resultSet.getString(1));
				exam2.setExamName(resultSet.getString(2));
				exam2.setDate(resultSet.getString(3));
				exam2.setTime(resultSet.getString(4));
				exam2.setMarks(resultSet.getString(5));
				exam2.setInstituteId(resultSet.getString(6));

				examList.add(exam2);
			}
			preparedStatement.close();

		}catch (SQLException e) {
			e.printStackTrace();
		}
		return examList;
	}

	/**
	 *	Method to upload question
	 *	@return description : String
	 *	@see uploadQuestion
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public String uploadQuestion(QuestionPaper question) {
		try {

			insertQuery= "insert into questionare(questionId,question,optionA,optionB,optionC,optionD,correctAns,examId,questionNo) values (?,?,?,?,?,?,?,?,?)";

			preparedStatement = currentConnection.prepareStatement(insertQuery);
			preparedStatement.setInt(1,question.getQuestionId());

			preparedStatement.setString(2,question.getQuestion());
			preparedStatement.setString(3,question.getOptionA());
			preparedStatement.setString(4, question.getOptionB());
			preparedStatement.setString(5, question.getOptionC());
			preparedStatement.setString(6, question.getOptionD());
			preparedStatement.setString(7, question.getCorrectAnswer());
			preparedStatement.setString(8, question.getExamId());
			preparedStatement.setString(9, question.getQuestionNo());

			preparedStatement.executeUpdate();

			preparedStatement.close();

			return "SUCCESS";
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return "Exam uploaded successfully!";
	}





}