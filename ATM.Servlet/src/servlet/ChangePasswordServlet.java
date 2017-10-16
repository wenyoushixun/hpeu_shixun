package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountServletlmpl;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/changePassword")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServletlmpl service = new AccountServletlmpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangePasswordServlet() {
		super();
		service.initAccounts();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取索引，密码，新密码
		int accountindex = (Integer) request.getSession().getAttribute("indexes");
		String originalPassword = request.getParameter("originalPassword");
		String newPassword = request.getParameter("newPassword");

		double password = service.changepassword(accountindex, originalPassword, newPassword);

		//根据返回值给出相应的响应
		if (password == 1) {
			request.setAttribute("newpassword", "新密码为！");
			request.getSession().setAttribute("password", newPassword);
			request.getRequestDispatcher("/changePasswordResult.jsp").forward(request, response);
		}
		request.getSession().setAttribute("password", "密码错误，重新输入！");
		request.getRequestDispatcher("/changePasswordResult.jsp").forward(request, response);
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
