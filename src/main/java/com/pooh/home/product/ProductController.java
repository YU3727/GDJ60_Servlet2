package com.pooh.home.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
//230131 3~4교시, 7교시
//230201 3~4교시
	private static final long serialVersionUID = 1L;
	
	private ProductDAO pDAO;
	private ProductService productService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
        pDAO = new ProductDAO();
        productService = new ProductService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Product Page");
		
		StringBuffer sb = request.getRequestURL();
		System.out.println("URL : "+sb.toString());
		System.out.println("URI : "+request.getRequestURI());
		
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf('/')+1);
		System.out.println(uri);
		
//		String name = request.getParameter("name");
//		System.out.println("Name : "+name);
//		
//		String detail = request.getParameter("detail");
//		System.out.println("Detail : "+detail);
//
//		//230201 4교시
//		//parameter로 받은 data를 db로 insert 하는게 최종목적
//		try {
//			ProductDTO pDTO = new ProductDTO();
//			pDTO.setProductName(name);
//			pDTO.setProductDetail(detail);
//			int result = productService.setAddProduct(pDTO, new ArrayList<ProductOptionDTO>());
//			System.out.println(result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		//보여주고싶은 페이지의 경로를 getRequestDispatcher의 괄호내에 작성
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/product/productList.jsp");
		
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
