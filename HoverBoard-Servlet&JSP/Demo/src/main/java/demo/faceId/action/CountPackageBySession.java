package demo.faceId.action;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import demo.faceId.dao.FaceIdDAO;
import demo.user.model.User;

public class CountPackageBySession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CountPackageBySession() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=utf-8");
//
//		FaceIdDAO faceIdDAO = new FaceIdDAO();
//		PrintWriter pw = response.getWriter();
//
//		HttpSession session = request.getSession();
//		User userLogin = (User) session.getAttribute("user");
//		if (userLogin != null) {
//			String userAddress = userLogin.getUser_address();
//			System.out.println(userAddress);
//			int total = faceIdDAO.countPackage(userAddress);
//			System.out.println(total);
//			request.setAttribute("packageTotal", total);

//			request.getRequestDispatcher("login_user_packagelist.jsp").include(request, response);
//			request.getRequestDispatcher("package_User.jsp").include(request, response);
//			System.out.println(total);
//		} else {
//			pw.print("請登入後操作");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
