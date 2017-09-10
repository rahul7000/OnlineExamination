/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :InstituteCalculateResultTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for calculate result




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
import org.blahblah.model.Report;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for calculate result
 *      @see InstituteCalculateResultTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class InstituteCalculateResultTest {

	InstituteDAO dao = new InstituteDAOImplementation();
	Report tempResult = new Report();
	String ans1 = "optionA";
	String ans2 = "optionB";
	String ans3 = "optionD";
	String ans4 = "optionD";
	String ans5 = "optionA";
	
	@Before
	public void initializer(){
		
	tempResult = dao.calculateResult(ans1, ans2, ans3, ans4, ans5, "r@g.com");
	}
	
	@Test
	public void test() {
		assertNotNull(tempResult);
	}
}
