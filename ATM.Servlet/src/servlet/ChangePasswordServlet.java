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
		//��ȡ���������룬������
		int accountindex = (Integer) request.getSession().getAttribute("indexes");
		String originalPassword = request.getParameter("originalPassword");
		String newPassword = request.getParameter("newPassword");

		double password = service.changepassword(accountindex, originalPassword, newPassword);

		//���ݷ���ֵ������Ӧ����Ӧ
		if (password == 1) {
			request.setAttribute("newpassword", "������Ϊ��");
			request.getSession().setAttribute("password", newPassword);
			request.getRequestDispatcher("/changePasswordResult.jsp").forward(request, response);
		}
		request.getSession().setAttribute("password", "��������������룡");
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
