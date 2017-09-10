
package org.blahblah.model;

/**
 *      
 * 		Model class for question
 *      @see QuestionPaper
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
public class QuestionPaper {

	private int questionId;
	private String questionNo;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String correctAnswer;
	private String examId;
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the questionNo
	 */
	public String getQuestionNo() {
		return questionNo;
	}
	/**
	 * @param questionNo the questionNo to set
	 */
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the optionA
	 */
	public String getOptionA() {
		return optionA;
	}
	/**
	 * @param optionA the optionA to set
	 */
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	/**
	 * @return the optionB
	 */
	public String getOptionB() {
		return optionB;
	}
	/**
	 * @param optionB the optionB to set
	 */
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	/**
	 * @return the optionC
	 */
	public String getOptionC() {
		return optionC;
	}
	/**
	 * @param optionC the optionC to set
	 */
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	/**
	 * @return the optionD
	 */
	public String getOptionD() {
		return optionD;
	}
	/**
	 * @param optionD the optionD to set
	 */
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuestionPaper [questionId=" + questionId + ", questionNo=" + questionNo + ", question=" + question
				+ ", optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD
				+ ", correctAnswer=" + correctAnswer + ", examId=" + examId + "]";
	}

	
	
	
}
