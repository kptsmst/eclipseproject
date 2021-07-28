package dwp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    String userName = "admin";
    String password = "pass@123";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yourName = request.getParameter("yourName");
		String yourPassword = request.getParameter("yourPassword");
		boolean success = false;
		boolean nameSuccess = false;
		if (yourName.equals(userName)) {
			nameSuccess = true;
			if (yourPassword.equals(password)) {
				success = true;
			}
		}
		PrintWriter writer = response.getWriter();
		if (nameSuccess == true && success == false ) {
			writer.println("<h1>Incorrect password for " + yourName + "</h1>");			
		}
		else if (success) {
			writer.println("<h1>Hello " + yourName + "</h1>");
			writer.println("<h1>Login Success</h1>");			
		} else {
			writer.println("<h1>No user " + yourName + " found" + "</h1>");			
		}
		writer.close();
	}
	
}
