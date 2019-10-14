package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import model._User;
import service.UserService;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName = request.getParameter("username");
		String Password = request.getParameter("userpass");
		
		UserService service = new UserService();
		List<_User> list = service.Login(UserName,Password);

		JsonObject jsonObject = new JsonObject();
		if (list.size()>0) {
			_User u = list.get(0);
			Gson gson  = new Gson();
			String String = gson.toJson(u);
			
			jsonObject.addProperty("code", "1");
			jsonObject.addProperty("user", String);
			
		}else {
			jsonObject.addProperty("code", "0");
			
		}
		PrintWriter printWriter = response.getWriter();
		printWriter.println(jsonObject);
		printWriter.flush();
		printWriter.close();
		System.out.println("OK1");
	}

}
