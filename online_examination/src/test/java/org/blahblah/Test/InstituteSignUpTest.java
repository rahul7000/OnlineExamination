/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :InstituteSignUpTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for institute signup 




       Change History

       Version                      :1.0
       Date(DD/MM/YYYY)             :15-June-2017
       Modified by                  :GR_TH3_JAVA_4
       Description of change        :Initial Version

 *****************************************************************************/
package org.blahblah.Test;

import static org.junit.Assert.*;

import org.blahblah.dao.InstituteDAO;
import org.blahblah.daoimplementation.InstituteDAOImplementation;
import org.blahblah.model.Institute;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for institute signup 
 *      @see InstituteSignUpTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class InstituteSignUpTest {

	InstituteDAO dao = new InstituteDAOImplementation();
	Institute tempInstitute = new Institute();
	
	@Before
	public void initializer(){
	tempInstitute.setInstituteName("SBI");
	tempInstitute.setEmailId("SBI@g.com");
	tempInstitute.setContactNumber("8130714976");
	tempInstitute.setPassword("1234567");	
	}
	
	@Test
	public void test() {
	assertEquals("SUCCESS",dao.registerInstitute(tempInstitute));
	}

}
