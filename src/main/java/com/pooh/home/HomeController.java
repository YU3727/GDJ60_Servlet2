package com.pooh.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
//230131 3~4교시, 7교시
//230201 2~3교시 Parameter 정보 꺼내보기
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello YU");
		
		//요청된 Parameter들의 정보를 꺼내보고 싶을때
		//Client에서 Server로 보내는 모든 요청은 request 객체에 존재한다. request.~
		//request의 메서드 형식이 어떤타입인지
//		String method = request.getMethod();
//		System.out.println("Method : "+method);
//		
//		StringBuffer sb = request.getRequestURL();
//		System.out.println("URL : "+sb); //스트링버퍼는 문자열을 합치는애들
//		
//		String uri = request.getRequestURI();
//		System.out.println("URI : "+uri);
//		
//		Cookie [] cookies = request.getCookies();
//		for(Cookie cookie : cookies) {
//			System.out.println("CookieName : "+cookie.getName());
//			System.out.println("CookieValue : "+cookie.getValue());
//		}
//		
//		String contextPath = request.getContextPath();
//		System.out.println("ContextPath : "+contextPath); //얘는 경로명까지를 의미함
//		
//		String name = request.getParameter("name");
//		System.out.println("Name : "+name);
//		
//		String age = request.getParameter("age");
//		if(age != null) {
//			int a = Integer.parseInt(age);
//			System.out.println("age : "+age);
//		}
//		
//		String[] moneys = request.getParameterValues("money");
//		for(String m : moneys) {
//			System.out.println("money : "+m);
//		}
		
		//응답을 내보내야하는데 java에선 java언어를, web browser에서는 html, css.. 등을 쓰기때문에 호환되지 않는다
		
		
		//예전에 java에서 소켓프로그래밍 하는것과 유사함
//		PrintWriter out = response.getWriter();
//		out.println("<h1>YU PAGE</h1>");
//		out.println("<h2>Header2</h2>");
//		out.close(); //끝났으면 연결해제
		
		//이제 java에서 jsp(home.jsp)로 응답을 보내고 싶다.
		//서버내부에서 쓸때는 '/' 자체가 root
		//jsp에서 쓸때는 프로젝트명까지 써야 root(ip:port/프로젝트명)
		//보통 main page로 이용
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
