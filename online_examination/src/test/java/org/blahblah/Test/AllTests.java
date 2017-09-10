package org.blahblah.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdminInstituteListTest.class, AdminLoginTest.class, AdminStudentListTest.class, DBConnectionTest.class,
		InstituteCalculateResultTest.class, InstituteExamListTest.class, InstituteLoginTest.class,
		InstituteSignUpTest.class, InstituteStudentListTest.class, StudentInstituteListTest.class, StudentLoginTest.class,
		StudentSignUpTest.class })
public class AllTests {

}
