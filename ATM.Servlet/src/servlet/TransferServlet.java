package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountServletlmpl;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServletlmpl service = new AccountServletlmpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransferServlet() {
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
		//获取信息
		int accountindex = (Integer) request.getSession().getAttribute("indexes");
		String targetAccountName = request.getParameter("targetAccountName");
		double transfer = Double.parseDouble(request.getParameter("transferAmount"));

		double index = service.transfer(accountindex, targetAccountName, transfer);

		//判断
		if (index == 1) {
			request.setAttribute("queryes", "转账成功！");
			request.setAttribute("query", transfer);

			request.getRequestDispatcher("/transferResult.jsp").forward(request, response);
		} else if (index == 0) {
			request.setAttribute("queryes", "没有该用户！");

			request.getRequestDispatcher("/transferResult.jsp").forward(request, response);
		}else if(index == -1){
			request.setAttribute("queryes", "余额不足！");
			request.getRequestDispatcher("/transferResult.jsp").forward(request, response);
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
