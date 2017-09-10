/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :InstituteStudentListTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for institute student list




       Change History

       Version                      :1.0
       Date(DD/MM/YYYY)             :15-June-2017
       Modified by                  :GR_TH3_JAVA_4
       Description of change        :Initial Version

 *****************************************************************************/
package org.blahblah.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.blahblah.dao.InstituteDAO;
import org.blahblah.daoimplementation.InstituteDAOImplementation;
import org.blahblah.model.Student;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for institute student list
 *      @see InstituteStudentListTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class InstituteStudentListTest {

	InstituteDAO dao = new InstituteDAOImplementation();
	List<Student> tempStudentList = new ArrayList<Student>();
	
	@Before
	public void initializer(){
	tempStudentList = dao.getAllStudents("ASET@g.com");
	}
	
	@Test
	public void test() {
		assertNotNull(tempStudentList);
	}
}
