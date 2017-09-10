
package org.blahblah.model;

/**
 *      
 * 		Model class for exam
 *      @see Exam
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
public class Exam {

	private String examId;
	private String examName;
	private String date;
	private String time;
	private String marks;
	private String instituteId;
	
	/**
	 * @return the examId
	 */
	public String getExamId() {
		return examId;
	}
	
	/**
	 * @param examId the examId to set
	 */
	public void setExamId(String examId) {
		this.examId = examId;
	}
	
	/**
	 * @return the examName
	 */
	public String getExamName() {
		return examName;
	}
	
	/**
	 * @param examName the examName to set
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}
	
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * @return the marks
	 */
	public String getMarks() {
		return marks;
	}
	
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	/**
	 * @return the instituteId
	 */
	public String getInstituteId() {
		return instituteId;
	}
	
	/**
	 * @param instituteId the instituteId to set
	 */
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", date=" + date + ", time=" + time + ", marks="
				+ marks + ", instituteId=" + instituteId + "]";
	}

}

