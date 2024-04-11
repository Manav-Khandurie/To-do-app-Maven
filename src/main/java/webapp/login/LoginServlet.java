package webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.login.LoginService;
import webapp.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService validate = new LoginService();
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (validate.isValid(request.getParameter("username"), request.getParameter("password"))) {
			// request.setAttribute("WelcomeName",
			// request.getParameter("username"));
			// request.setAttribute("WelcomePassword",
			// request.getParameter("password"));
			// request.setAttribute("todos", todoService.retrieveTodos());
			// request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,
			// response);

			// Here we add our user name to our login session. This way we store
			// the attribute in our Session scope as opposed to our Request
			// scope.
			// Session attributes should be application wide, but occupy memory
			// the entire time. Things only for a particular request should be
			// in Request scope.

			request.getSession().setAttribute("name", request.getParameter("username"));
			response.sendRedirect("/list-todos.do");
		} else {
			request.setAttribute("loginError", "Login Unsuccessful, invalid credentials");

			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
