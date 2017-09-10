
package org.blahblah.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.blahblah.constants.Constants;
import org.blahblah.dao.StudentDAO;
import org.blahblah.model.Exam;
import org.blahblah.model.Institute;
import org.blahblah.model.QuestionPaper;
import org.blahblah.model.Student;
import org.blahblah.utility.DBUtility;

/**
 *      
 * 		Have the definition of all methods related to student
 *      @see StudentDAO
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 25-June-2017
 */
public class StudentDAOImplementation implements StudentDAO {

	static Connection currentConnection =null;
	static ResultSet resultSet = null;   
	static PreparedStatement preparedStatement = null;
	static String selectQuery;
	static String insertQuery;
	static String deleteQuery;
	static String updateQuery;

	/**
	 * StudentDAOImplementation constructor without parameters 	
	 */
	public StudentDAOImplementation(){
		currentConnection = DBUtility.getConnection();
		
	}

	/**
	 *	Method to register the Student
	 *	@return description : String
	 *	@see registerStudent
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public String registerStudent(Student student) {

		try {

			insertQuery = "insert into student (STUDENTID, STUDENTNAME, STUDENTMAIL, STUDENTPASSWORD, STUDENTGENDER, STUDENTDOB,STUDENTPHONE) values (?,?,?,?,?,?,?)";

			PreparedStatement preparedStatement = currentConnection.prepareStatement(insertQuery);
			String studentId = "STU"+ Constants.STUDENT_ID_GENERATOR;
			++Constants.STUDENT_ID_GENERATOR;

			student.setStudentId(studentId);

			preparedStatement.setString( 1, student.getStudentId());
			preparedStatement.setString( 2, student.getStudentName());
			preparedStatement.setString( 3, student.getEmailId());
			preparedStatement.setString( 4, student.getPassword());
			preparedStatement.setString( 5, student.getGender());
			preparedStatement.setString(6, student.getDateOfBirth());
			preparedStatement.setString(7, student.getContactNumber());

			preparedStatement.executeUpdate();

			String insertQuery2 = "insert into login(LOGINID, PASSWORD, TYPE) values (?,?,?)";
			preparedStatement = currentConnection.prepareStatement(insertQuery2);

			preparedStatement.setString( 1, student.getEmailId());
			preparedStatement.setString( 2, student.getPassword());
			preparedStatement.setString( 3, "student");

			preparedStatement.executeUpdate();

			preparedStatement.close();
			return "SUCCESS"; 

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Oops.. Something went wrong there..!";     
	}

	/**
	 *	Method to get all institute list
	 *	@return description : List<Institute>
	 *	@see getAllInstitute
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Institute> getAllInstitutes(String studentMailId) {
		List<Institute> instituteList = new ArrayList<Institute>();

		try {
			selectQuery = "select * from institute";
			
			preparedStatement = currentConnection.prepareStatement(selectQuery);
			resultSet = preparedStatement.executeQuery(selectQuery);
			Institute institute = new Institute();

			while (resultSet.next()) {
				institute = new Institute();

				institute.setInstituteId(resultSet.getString(1) );
				institute.setInstituteName(resultSet.getString(2) );
				institute.setEmailId(resultSet.getString(3) );
				institute.setPassword(resultSet.getString(4) );
				institute.setContactNumber(resultSet.getString(5) );   

				instituteList.add(institute);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return instituteList;
	}

	/**
	 *	Method to get all exam list
	 *	@return description : List<Exam>
	 *	@see getAllExams
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Exam> getAllExams(String instituteId, String studentMailId) {
		List<Exam> exams = new ArrayList<Exam>();

		try {

			selectQuery = "select * from exam where INSTITUTEID = ?" ;
			preparedStatement = currentConnection.prepareStatement(selectQuery);
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

			updateQuery = "update student set INSTITUTEID = ? where STUDENTMAIL = ?";

			PreparedStatement preparedStatement = currentConnection.prepareStatement(updateQuery);
			preparedStatement.setString(1, instituteId);
			preparedStatement.setString(2, studentMailId);

			preparedStatement.executeUpdate();

			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exams;
	}       

	/**
	 *	Method to get all question list
	 *	@return description : List<QuestionPaper>
	 *	@see getAllquestions
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public  List<QuestionPaper> getAllQuestions(String examId){
		List<QuestionPaper> QuestionList = new ArrayList<QuestionPaper>();

		try {
			selectQuery = "select * from QUESTIONARE where EXAMID = ? order by questionId ";
			preparedStatement = currentConnection.prepareStatement(selectQuery);
			preparedStatement.setString(1, examId);

			resultSet = preparedStatement.executeQuery();

			while( resultSet.next() ) {
				QuestionPaper question = new QuestionPaper();

				question.setQuestionId(resultSet.getInt(1));
				question.setQuestion(resultSet.getString(2));
				question.setOptionA(resultSet.getString(3));
				question.setOptionB(resultSet.getString(4));
				question.setOptionC(resultSet.getString(5));
				question.setOptionD(resultSet.getString(6));
				question.setCorrectAnswer(resultSet.getString(7));
				question.setExamId(resultSet.getString(8));
				question.setQuestionNo(resultSet.getString(9));

				QuestionList.add(question);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return QuestionList;
	}
}
