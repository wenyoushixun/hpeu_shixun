package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountServletlmpl;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/withdraw")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServletlmpl service = new AccountServletlmpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WithdrawServlet() {
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
		int accountindex = (Integer) request.getSession().getAttribute("indexes");
		double withdrawAmout = Double.parseDouble(request.getParameter("withdrawAmount"));

		double withdraw = service.withdraw(accountindex, withdrawAmout);

		if (withdraw == -1) {
			request.setAttribute("withdraw", "余额不足！");
			request.getRequestDispatcher("/withdrawResult.jsp").forward(request, response);
		}
		request.setAttribute("withdraws", "取款成功，余额为！");
		request.getSession().setAttribute("withdraw", withdraw);
		request.getRequestDispatcher("/withdrawResult.jsp").forward(request, response);
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
