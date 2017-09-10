
package org.blahblah.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.blahblah.dao.AdminDAO;
import org.blahblah.model.Institute;
import org.blahblah.model.Student;
import org.blahblah.utility.DBUtility;

/**
 *      
 * 		Have the definition of all methods related to admin
 *      @see AdminDAO
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 25-June-2017
 */
public class AdminDAOImplementation implements AdminDAO {
	static Connection currentConnection = null;
	static ResultSet resultSet = null;  
	static PreparedStatement preparedStatement = null;
	static String selectQuery;
	static String deleteQuery;

	/**
	 * AdminDAOImplementation constructor without parameters 	
	 */
	public AdminDAOImplementation() {
		currentConnection = DBUtility.getConnection();
	}

	/**
	 *	Method to get all student list
	 *	@return description : List<Student>
	 *	@see getAllStudents
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();

		try {
			selectQuery = "select * from Student";
			preparedStatement = currentConnection.prepareStatement(selectQuery);

			resultSet = preparedStatement.executeQuery(selectQuery);

			while(resultSet.next()){
				Student student = new Student();

				student.setStudentId(resultSet.getString(1));
				student.setStudentName(resultSet.getString(2));
				student.setEmailId(resultSet.getString(3));
				student.setPassword(resultSet.getString(4));
				student.setGender(resultSet.getString(5));
				student.setDateOfBirth(resultSet.getString(6));
				student.setContactNumber(resultSet.getString(7));
				student.setInstituteId(resultSet.getString(8));

				studentList.add(student);
			}
			preparedStatement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return studentList;
	}

	/**
	 *	Method to delete student
	 *	@return description : void
	 *	@see deleteStudent
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public void deleteStudent(String studentId) {
		deleteQuery = "delete from Student where studentId=?";
		try{
			preparedStatement = currentConnection.prepareStatement(deleteQuery);

			preparedStatement.setString(1, studentId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *	Method to get all institute list
	 *	@return description : List<Institute>
	 *	@see getAllInstitute
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public List<Institute> getAllInstitutes() {
		List<Institute> instituteList = new ArrayList<Institute>();
		selectQuery = "select * from Institute";

		try {
			preparedStatement = currentConnection.prepareStatement(selectQuery);
			resultSet = preparedStatement.executeQuery(selectQuery);
			while(resultSet.next()){

				Institute institute = new Institute();

				institute.setInstituteId(resultSet.getString(1));
				institute.setInstituteName(resultSet.getString(2));
				institute.setEmailId(resultSet.getString(3));
				institute.setPassword(resultSet.getString(4));
				institute.setContactNumber(resultSet.getString(5));

				instituteList.add(institute);
			}
			preparedStatement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return instituteList;
	}

	/**
	 *	Method to delete institute
	 *	@return description : void
	 *	@see deleteInstitute
	 *	@version 1.0
	 *	@author Rahul Rajput
	 *	@since  25-June-2017
	 */
	public void deleteInstitute(String instituteId) {
		deleteQuery = "delete from Institute where instituteId=?";
		try {
			preparedStatement = currentConnection.prepareStatement(deleteQuery);

			preparedStatement.setString(1, instituteId);
			preparedStatement.executeUpdate();

		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}
