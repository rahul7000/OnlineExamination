# OnlineExamination
  --Creating a simple J2EE application that performs CRUD (Create Read Update Delete) operations for conducting online examination      using Jsp, Servlet and MySQL.
  -- It contains the knowledge for the followings:
      * MVC(Model View Controller)
      * DAO(Data Access Object)
      * REST(Representational State Transfer)
      * CRUD(Create Read Update Delete)
      * MySQL(Structured Query Language)
      * Basic understanding of JSP, Servlets, Java Coding.

# Prerequisites
For this tutorial, we will need the following tools: (The older or newer version should also works). Moreover, basic Java knowledge is assumed.
--Eclipse IDE for Java EE Developers
--Apache Tomcat v7 or later
--MySQL Community Server and MySQL Workbench (GUI Tool)
--MySQL Connector for Java
--jstl.jar and standard.jar. 

# Contains

--Create the database
  First, lets create the database and table for the pojo classes mentioned below


--POJO classes / Model Classes
  Exam (Model class for exam, having variables and getter setter related to the Test) 
  Institute (Model class for Institute, having variables and getter setter related to the Institute) 
  Login (Model class for Login, having variables and getter setter related to the Login credentials) 
  QuestionPaper (Model class for Question Paper, having variables and getter setter related to the Question Paper) 
  Report (Model class for Report, having variables and getter setter related to the Report generation) 
  Student (Model class for Student, having variables and getter setter related to the student) 
  
--Creating DB Connection Utility
  Create a new class in your package and name it DbUtility.java. This class handles the database connection to our 
  MySQL server. In this class, we read a .properties file which contains the information necessary for the connection.
  
--Property File  
  Create the properties file directly under the src folder. Create a new file, name it db.properties. Put the following
  information.
  #Database Credentials
  #Fri Jun 16 11:11:29 IST 2017
  driver=com.mysql.jdbc.Driver
  url=jdbc:mysql://localhost:3306/onlineexaminationsystem
  user=root
  password=root

--Creating Data Access Objects (DAO)
  Next, create Data Access Object classes. It contains the logic for  database operation.
 
 * AdminDAO {
	public List<Student> getAllStudents();
	public void deleteStudent(String studentId );
	public List<Institute> getAllInstitutes();
	public void deleteInstitute(String instituteId);
}
  
  * InstituteDAO {
	public String registerInstitute(Institute institute);
	public List<Student> getAllStudents(String instituteMailId);
	public List<Exam> getAllExams(String instituteMailId);
	public void deleteExam(String examId );
	public ArrayList<Exam> uploadExam(Exam exam);
	public String uploadQuestion(QuestionPaper question);
	public Report calculateResult(String ans1, String ans2, String ans3, String ans4, String ans5, 
			String studentMailId);
}

 * StudentDAO {
	public String registerStudent(Student student);
	public List<Institute> getAllInstitutes(String studentMailId);
	public List<Exam> getAllExams(String instituteId, String studentMailId) ;
	public List<QuestionPaper> getAllQuestions(String examId);
}

--Creating Controllers
  Finally, create a new Servlets inside the project and name it <any Name>Controller.java
  * AdminController
  * InstituteController
  * StudentController
  * StudentRegisterController
  * InstituteRegisterController
  * UserController

--Creating View
  Now, it’s time for us to create the jsp, the view for our application. Under the WebContent folder.
