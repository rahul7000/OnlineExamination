
package org.blahblah.dao;

import java.util.List;

import org.blahblah.model.Institute;
import org.blahblah.model.Student;

/**
 *      
 * 		Have the declaration of all methods that will be implemented  
 *      @see AdminDAO
 *      @version 1.0
 *      @author Rahul Rajput  
 *      @since 25-June-2017
 */
public interface AdminDAO {
	
	public List<Student> getAllStudents();
	public void deleteStudent(String studentId );
	
	public List<Institute> getAllInstitutes();
	public void deleteInstitute(String instituteId);
	
}

