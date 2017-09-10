/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :AdminLoginTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for admin login




       Change History

       Version                      :1.0
       Date(DD/MM/YYYY)             :15-June-2017
       Modified by                  :GR_TH3_JAVA_4
       Description of change        :Initial Version

 *****************************************************************************/
package org.blahblah.Test;

import static org.junit.Assert.*;

import org.blahblah.model.Login;
import org.blahblah.service.LoginService;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for admin login
 *      @see AdminLoginTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class AdminLoginTest {
	Login tempUser =  new Login();
	LoginService service = new LoginService();
	
	@Before
	public void initializer(){
	tempUser.setUserName("admin");
	tempUser.setPassword("admin");
	tempUser = service.login(tempUser);
	}
	
	@Test
	public void test() {
	assertTrue(tempUser.isValid());
	}
}
