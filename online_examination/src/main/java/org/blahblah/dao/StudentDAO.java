
package org.blahblah.dao;

import java.util.List;

import org.blahblah.model.Exam;
import org.blahblah.model.Institute;
import org.blahblah.model.QuestionPaper;
import org.blahblah.model.Student;

/**
 *      
 * 		Have the declaration of all methods related to student that will be implemented
 *      @see StudentDao
 *      @version 1.0
 *      @author Rahul
 *      @since 25-June-2017
 */
public interface StudentDAO {

	public String registerStudent(Student student);

	public List<Institute> getAllInstitutes(String studentMailId);
	
	public List<Exam> getAllExams(String instituteId, String studentMailId) ;
	
	public List<QuestionPaper> getAllQuestions(String examId);
	
}
