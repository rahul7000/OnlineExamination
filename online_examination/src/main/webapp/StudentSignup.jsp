<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Student Signup Form</title>
      
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <%@include file="/Header.jsp" %>
		<%@include file="/Footer.html" %>
	<script type="text/javascript" src="ValidStudent.js">

</script>

    </head>
    <body>
         
        
        <div class="container">
                <h1>Student Signup Form</h1>
                
			   <section>				
                <div id="container_demo" >
                    <div id="wrapper">
                        <div id="studentSignup">
                            <form name="signup"  action="StudentRegisterController" method="post" onsubmit="return validate(signup)" >
`                         
                                <h1>Signup</h1> 
                                <p> 
                                    <label for="username" class="uname" > Enter Name </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="Enter full name"/>
                                </p>
                                <p> 
                                    <label for="email" class="email"  > Enter Email </label>
                                    <input id="email" name="email" required="required" type="email" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="passwd"> Enter Password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="Enter password" /> 
                                </p>
                                   <p> 
                                    <label for="confpassword" class="confpassword"  > Confirm Password </label>
                                    <input id="confpassword" name="confpassword" required="required" type="password" placeholder="confirm password"/>
                                </p>
                                
                                <p> 
                                    <label for="dob" class="dob"  > Enter DOB </label>
                                    <input id="dob" name="dob" required="required" type="text" placeholder="YYYY/MM/DD"/>
                                      
  
                                </p>
                                
                                <p> 
                                    <label for="gender" class="gender" > Select Gender </label>
                                    <select name="dropdown">
									<option value="male" selected>Male</option>
									<option value="female" selected>Female</option>
									
									</select>
									
                                </p>
                             	
                                  <p> 
                                    <label for="mobile" class="mobile" > Enter Mobile Number </label>
                                    <input id="mobile" name="mobile" required="required" type="text" placeholder="9*********"/>
                                </p>
                                
                              	
                                 <p class="Signup button"> 
                                    <input type="submit" value="Signup" /> 
								</p>
                           </form>
                        </div>

                       
                    </div>
                </div>  
            </section>
        </div>
        <%@include file="/Footer.html" %>
    </body>
</html>





