package chapter03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUTD = 1L;
	
	public void init() throws ServletException{
		System.out.println("init 메서드가 수행되었습니다.");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 메서드가 수행되었습니다.");
		//super.doGet(req, resp);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드가 수행되었습니다.");
		//super.destroy();
	}
	
	

}
