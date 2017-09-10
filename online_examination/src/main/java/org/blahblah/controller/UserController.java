
package org.blahblah.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.blahblah.constants.Constants;
import org.blahblah.model.Login;
import org.blahblah.service.LoginService;

/**
 *      
 * 		Servlet implementation class LoginController
 *      @see HttpServlet
 *      @version 1.0
 *      @author Rahul Rajput
 *      @since 15-June-2017
 */
@WebServlet("/LoginController")

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("action").equals("logout")){
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			request.getRequestDispatcher(Constants.LOGOUT).include(request, response);
	        HttpSession session=request.getSession();  
			session.removeAttribute("currentSessionUser");
			session.invalidate();
			out.close();  
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginService service = new LoginService();
		Login user = new Login();
		if(request.getParameter("action").equalsIgnoreCase("login")){
			
			try
			{
				user.setUserName(request.getParameter("username"));
				user.setPassword(request.getParameter("password"));

				user = service.login(user);

				if(user.isValid())
				{
					HttpSession session = request.getSession(true);
					session.setAttribute("currentSessionUser", user);

					if(user.getType().equalsIgnoreCase("admin"))
					{
						response.sendRedirect(Constants.ADMIN_PAGE);
					}else if(user.getType().equalsIgnoreCase("institute"))
					{
						response.sendRedirect(Constants.INSTITUTE_PAGE);
					}else
					{
						response.sendRedirect(Constants.STUDENT_PAGE);
					}	
				}else
				{
					response.sendRedirect(Constants.INVALID_PAGE);
				}

			}catch(Throwable e)
			{
				e.getMessage();
			}
		}

		doGet(request, response);
	}

}
