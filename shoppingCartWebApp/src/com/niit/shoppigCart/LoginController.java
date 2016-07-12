package com.niit.shoppigCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		String userID=request.getParameter("userID");
		String passWord=request.getParameter("passWord");
		
		LoginDAO loginDAO=new LoginDAO();
		RequestDispatcher dispatcher;
		if(loginDAO.isValidUser(userID, passWord)==true)
		{
			//Navigate to home page
			dispatcher=request.getRequestDispatcher("Home.html");
			dispatcher.forward(request, response);
		}
		
		else
		{
			//Navigate to Login Page
			dispatcher=request.getRequestDispatcher("Login.html");
			PrintWriter writer=response.getWriter();
			writer.append("invalid.................");
			dispatcher.include(request, response);
			
		}
	}

}
