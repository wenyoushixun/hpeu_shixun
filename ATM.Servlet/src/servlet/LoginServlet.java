package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountServletlmpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/login", loadOnStartup = 2)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServletlmpl service = new AccountServletlmpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		service.initAccounts();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//判断用户和密码是否能匹配
		int accountindex = service.login(username, password);
		if (accountindex != -1) {
			//session 该用户索引
			request.getSession().setAttribute("indexes", accountindex);
			//欢迎该用户
			request.getSession().setAttribute("indexes", accountindex);
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			
			request.setAttribute("message", "用户或密码错误！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
