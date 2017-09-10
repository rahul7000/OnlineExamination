
package org.blahblah.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *      
 * 		class to establish the connection with mysql 
 *      @see DBUtility
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
public class DBUtility {
	
	 private static Connection connection;
	 
	 /**
	 *to establish the connection with mysql
	 *@return description : Connection
	 *@see getConnection
	 *@version 1.0
	 *@author Rahul Rajput
	 *@since  15-June-2017
	 */
	    public static Connection getConnection()
	    {
	        if( connection != null )
	        {
	            return connection;
	        }
	        try {
	        	Properties properties = new Properties();
                InputStream inputStream = DBUtility.class.getResourceAsStream("/db.properties");
                
                properties.load(inputStream);
            
                String driver = properties.getProperty("driver");
                String url = properties.getProperty("url");
                String user = properties.getProperty("user");
                String password = properties.getProperty("password");
                
                Class.forName(driver);
                
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return connection;

	    }
	 
	    /**
		 *to close the connection with mysql
		 *@return description : void
		 *@see closeConnection
		 *@version 1.0
		 *@author Rahul Rajput
		 *@since  15-June-2017
		 */
	    public static void closeConnection( Connection toBeClosed )
	    {
	        if(toBeClosed == null)
	            return;
	        try {
	            toBeClosed.close();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }


}
