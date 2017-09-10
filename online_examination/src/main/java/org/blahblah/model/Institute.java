
package org.blahblah.model;

/**
 *      
 * 		Model class for institute
 *      @see Institute
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
public class Institute {

	private String instituteId;
	private String instituteName;
	private String emailId;
	private String contactNumber;
	private String password;
	
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
	
	/**
	 * @return the instituteName
	 */
	public String getInstituteName() {
		return instituteName;
	}
	
	/**
	 * @param instituteName the instituteName to set
	 */
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", emailId=" + emailId
				+ ", contactNumber=" + contactNumber + ", password=" + password + "]";
	}
	

	

}