package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserService;
import serviceImpl.UserServiceImpl;

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
		
		String error = (String) request.getSession().getAttribute("error");
		request.getSession().invalidate();
		request.setAttribute("error", error);
		getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(request.getParameter("username"));
		UserService userService = new UserServiceImpl();
		
		if (userService.loginCheck(username, password)) {
			request.getSession().setAttribute("name", username);
			getServletContext().getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request, response);
			
		} else {

			request.getSession().setAttribute("error", "Username and/or Password is incorrect.");
			response.sendRedirect("login");
			
		}
	}

}
