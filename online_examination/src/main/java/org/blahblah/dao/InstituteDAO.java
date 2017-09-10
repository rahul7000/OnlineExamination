
package org.blahblah.dao;

import java.util.ArrayList;
import java.util.List;

import org.blahblah.model.Exam;
import org.blahblah.model.Institute;
import org.blahblah.model.QuestionPaper;
import org.blahblah.model.Report;
import org.blahblah.model.Student;

/**
 *      
 * 		Have the declaration of all methods related to institute that will be implemented
 *      @see InstituteDAO
 *      @version 1.0
 *      @author Rahul
 *      @since 25-June-2017
 */
public interface InstituteDAO {

	public String registerInstitute(Institute institute);
	
	public List<Student> getAllStudents(String instituteMailId);
	
	public List<Exam> getAllExams(String instituteMailId);
	public void deleteExam(String examId );
	
	public ArrayList<Exam> uploadExam(Exam exam);
	public String uploadQuestion(QuestionPaper question);
	
	public Report calculateResult(String ans1, String ans2, String ans3, String ans4, String ans5, 
			String studentMailId);
}
