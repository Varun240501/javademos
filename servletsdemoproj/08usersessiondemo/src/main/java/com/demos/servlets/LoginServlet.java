package com.demos.servlets;
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
private Connection connection;
private PreparedStatement preparedStatement;
boolean isvalidinput=false;
public LoginServlet() {
	super();// TODO Auto-generated constructor stub
	}
public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ServletContext context=config.getServletContext();
			String dburl = context.getInitParameter("dburl");
			String dbuser = context.getInitParameter("dbuser");
			String dbpass = context.getInitParameter("dbpassword");
			connection=DriverManager.getConnection(dburl,dbuser,dbpass);
			preparedStatement=connection.prepareStatement("select * from user where email=? and password=?");
			} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username =request.getParameter("username");
String name=request.getParameter("name");
String password=request.getParameter("password");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
if(!isvalidinput(username,false) || !isvalidinput(password,false)) {
	out.println("<h1>please Enter Valid Input</h1>");
	return;
	}
try{
		
		//System.out.println(id);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultset=null;
		boolean result=preparedStatement.execute();
		if(result) {
			resultset=preparedStatement.getResultSet();
		}
		if(resultset.next()) {
			System.out.println("user successfully logged in");
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd=request.getRequestDispatcher("homeServlet");
			rd.include(request, response);
		}else {
			out.println("<p> user not found </p>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
} catch (SQLException e) {
			
			e.printStackTrace();
			}
	}
private boolean isvalidinput(String inputvalue,boolean checkforno) {
	if(inputvalue==null || inputvalue.isBlank() || inputvalue.isEmpty()) {
		return false;
		}else if(checkforno) {
			try {
				Integer.parseInt(inputvalue);
				return true;
				}catch(Exception e) {
					return false;
					}
			}else {
				return true;
			}
	}

}

