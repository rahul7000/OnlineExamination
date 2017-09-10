
package org.blahblah.model;

/**
 *      
 * 		Model class for report
 *      @see Report
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */

public class Report {

	
	private String studentMailId;
	private int correctAnswers;
	private int incorrectAnswers;
	private int score;
	
	/**
	 * @return the studentMailId
	 */
	public String getStudentMailId() {
		return studentMailId;
	}
    /**
	 * @param studentMailId the studentMailId to set
	 */
	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

    /**
	 * @return the correctAnswers
	 */
	public int getCorrectAnswers() {
		return correctAnswers;
	}

    /**
	 * @param correctAnswers the correctAnswers to set
	 */
	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

    /**
	 * @return the incorrectAnswers
	 */
	public int getIncorrectAnswers() {
		return incorrectAnswers;
	}

    /**
	 * @param incorrectAnswers the incorrectAnswers to set
	 */
	public void setIncorrectAnswers(int incorrectAnswers) {
		this.incorrectAnswers = incorrectAnswers;
	}

    /**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}


    @Override
	public String toString() {
		return "Report [studentMailId=" + studentMailId + ", correctAnswers=" + correctAnswers + ", incorrectAnswers="
				+ incorrectAnswers + ", score=" + score + "]"+"\n";
	}
	
	
	
	
	
}


