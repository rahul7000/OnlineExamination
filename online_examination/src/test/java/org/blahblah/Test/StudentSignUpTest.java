/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :StudentSignUpTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for student sign up




       Change History

       Version                      :1.0
       Date(DD/MM/YYYY)             :15-June-2017
       Modified by                  :GR_TH3_JAVA_4
       Description of change        :Initial Version

 *****************************************************************************/
package org.blahblah.Test;

import static org.junit.Assert.*;

import org.blahblah.dao.StudentDAO;
import org.blahblah.daoimplementation.StudentDAOImplementation;
import org.blahblah.model.Student;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for student sign up
 *      @see StudentSignUpTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class StudentSignUpTest {
	StudentDAO dao = new StudentDAOImplementation();
	Student tempStudent = new Student();
	
	@Before
	public void initializer(){
	tempStudent.setStudentName("RAHUL");
	tempStudent.setDateOfBirth("1111/11/11");
	tempStudent.setGender("male");
	tempStudent.setEmailId("rahul.rajput@gmail.com");
	tempStudent.setContactNumber("8130714976");
	tempStudent.setPassword("1234567");
	}
	
	@Test
	public void test() {
	assertEquals("SUCCESS",dao.registerStudent(tempStudent));
	}

}
