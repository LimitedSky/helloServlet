package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Read formData
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// Process : Access to database, perform business logic

		// Build HTML code
		PrintWriter out = response.getWriter();

		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br/>";
		htmlResponse += "<h2> Your userpassword is " + password + "</br>";
		htmlResponse += "</html>";

		out.println(htmlResponse);

	}

}
