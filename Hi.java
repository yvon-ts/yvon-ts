
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hi extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

		//res.setContentType("text/html; charset=UTF-8"); //�w��CountFilter�@�L����B�z�F
		PrintWriter out = res.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , �@�ɧA�n cat !</BIG><br>");
		out.println("</BODY></HTML>");
	}
}
