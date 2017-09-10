<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
       <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Institute Signup Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="ValidInstitute.js"></script>
	
    </head>
    <body>
         <%@include file="Header.jsp" %>
        
        <div class="container">
                <h1>Institute Signup Form</h1>
                
			   <section>				
                <div id="container_demo" >
                    <div id="wrapper">
                        <div id="Institutesignup">
                            <form name="isignup" action="InstituteRegisterController" method="post" onsubmit="return ivalidate()"> 
                            
                                <h1>Signup</h1> 
                                <p> 
                                    <label for="username" class="uname" > Enter Institute Name </label>
                                    <input id="institutename" name="institutename" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                           
                                <p> 
                                    <label for="email" class="email"  > Enter Email </label>
                                    <input id="institutemail" name="institutemail" required="required" type="email" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="passwd"> Enter Password </label>
                                    <input id="institutepassword" name="institutepassword" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                   <p> 
                                    <label for="confpassword" class="confpassword"  > Confirm Password </label>
                                    <input id="confpassword" name="confpassword" required="required" type="password" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                
                                
                                  <p> 
                                    <label for="mobile" class="mobile" > Enter Mobile Number </label>
                                    <input id="institutephone" name="institutephone" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
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
        <%@include file="Footer.html" %>
    </body>
</html>





