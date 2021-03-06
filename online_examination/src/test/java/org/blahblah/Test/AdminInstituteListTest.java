/****************************************************************************
                       Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
 of this source code in whole or in part is prohibited without written consent from
 Aricent Technologies
       File Name                    :AdminInstituteListTest.java
       Principal Author             :GR_TH3_JAVA_4
       Date of First Release        :15-June-2017
       Description                  :test class for admin institute list




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

import org.blahblah.dao.AdminDAO;
import org.blahblah.daoimplementation.AdminDAOImplementation;
import org.blahblah.model.Institute;
import org.junit.Before;
import org.junit.Test;

/**
 *      
 * 		test class for admin institute list
 *      @see AdminInstituteListTest
 *      @version 1.0
 *      @author GR_TH3_JAVA_4
 *      @since 15-June-2017
 */
public class AdminInstituteListTest {
	AdminDAO dao = new AdminDAOImplementation();
	List<Institute> tempInstituteList = new ArrayList<Institute>();
	
	@Before
	public void initializer(){
	tempInstituteList = dao.getAllInstitutes();
	}
	
	@Test
	public void test() {
		assertNotNull(tempInstituteList);
	}


}
