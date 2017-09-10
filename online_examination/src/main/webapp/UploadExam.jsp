<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
       <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
       
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<%@include file="HeaderLogout.jsp" %>
    </head>
    <body>
         
        
        <div class="container">
                <h1>Exam Registration Form</h1>
                
			   <section>				
                <div id="container_demo" >
                    <div id="wrapper">
                        <div id="ExamRegister">
                       
                             <form name="esign" action="InstituteController?action=uploadExam" method = "post" >
                                <h1>Exam Details</h1> 
                                <p> 
                                    <label for="examaname" class="examname" > Select Exam Name/ Subject </label>
                                    <input id="examname" name="examname" required="required" type="text" placeholder="java"/>
                                </p> 
                                <p> 
                                    <label for="date" class="date"  > Enter Date </label>
                                    <input id="date" name="date" required="required" type="date" placeholder="DD/MM/YYYY"/>
                                </p>
                             
                                <p> 
                                    <label for="time" class="time"  > Enter Time </label>
                                    <input id="time" name="time" required="required" type="time" placeholder="20:78"/>
                                </p>
                                <p> 
                                    <label for="marks" class="marks"> Enter Total Marks </label>
                                    <input id="marks" name="marks" required="required" type="text" placeholder="50"/> 
                                </p>
                                  
                                 <p class="Signup button"> 
                                    <input type="submit" value="Register" /> 
								</p>
                           </form>
                        </div>

                       
                    </div>
                </div>  
            </section>
        </div>
        
 <%@include file="Footer.html" %>
    </body>
</html>





