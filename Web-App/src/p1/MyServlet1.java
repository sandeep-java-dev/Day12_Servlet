package p1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String serverAddress = context.getInitParameter("Server-address");
		
		ServletConfig config = getServletConfig();
		String role = config.getInitParameter("role");
		
		String hrNumber = config.getInitParameter("HR-Number");
		
		resp.getWriter().append("server address "+serverAddress+" role "+role+" HR Number "+hrNumber);
		
		
	}
	
}
