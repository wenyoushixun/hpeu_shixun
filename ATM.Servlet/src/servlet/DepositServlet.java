package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountServletlmpl;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServletlmpl service = new AccountServletlmpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        service.initAccounts();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accountindex=(Integer)request.getSession().getAttribute("indexes");
		double depositAmount=Double.parseDouble(request.getParameter("depositAmount"));
		
		double deposit=service.deposit(accountindex, depositAmount);
		
		request.getSession().setAttribute("deposit", deposit);
		
		request.getRequestDispatcher("/depositResult.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
