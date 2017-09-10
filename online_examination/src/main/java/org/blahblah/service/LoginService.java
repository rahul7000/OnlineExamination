
package org.blahblah.service;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.blahblah.model.Login;
import org.blahblah.utility.DBUtility;

/**
 *      
 * 		Contains functionalities of login 
 *      @see LoginService
 *      @version 1.0
 *      @author Rahul
 *      @since 15-June-2017
 */
public class LoginService {

	static Connection currentConnection = null;
	static ResultSet resultSet = null;  
	static Statement statement = null;
	static String selectQuery;


	/**
	 * LoginService constructor without parameters	
	 */
	public LoginService() {
		currentConnection = DBUtility.getConnection();
		try {
			statement = currentConnection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *method for login 
	 *@return description : Login
	 *@see login
	 *@version 1.0
	 *@author Rahul
	 *@since  15-June-2017
	 */
	public Login login(Login user){
		String username1 = user.getUserName();  
		String password1 = user.getPassword(); 
		String selectQuery = "select * from login where LOGINID= '"+ username1 + "' AND PASSWORD= '" + password1 + "'";

		try {
			resultSet = statement.executeQuery(selectQuery);	
			boolean more = resultSet.next();

			if (!more) {
				user.setValid(false);
			} else if (more){
				String userType = resultSet.getString(3);	
				user.setType(userType);
				user.setValid(true);
			}

			resultSet.close();
			statement.close();
		} catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}
		return user;
	}	


}
