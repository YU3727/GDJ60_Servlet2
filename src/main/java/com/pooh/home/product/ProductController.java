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
	private ProductDTO pDTO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
        pDAO = new ProductDAO();
        productService = new ProductService();
        pDTO = new ProductDTO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Product Page");
		
		StringBuffer sb = request.getRequestURL();
		System.out.println("URL : "+sb.toString());
		System.out.println("URI : "+request.getRequestURI());
		
		
		//어떤 url이 왔을때 어떤 jsp를 보여줄것인가를 선택
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf('/')+1);
		String path = "";
		
		switch (uri) {
		default:
			System.out.println("인식하지 못하는 url");
			break;
		case "list.do" :
			try {
				List<ProductDTO> ar = productService.getProductList();
				//request에 list라는 이름으로 serverdata를 담아둠.
				request.setAttribute("list", ar);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			path = "productList.jsp";
			break;
		case "add.do" :
			System.out.println("상품등록입니다");
			path = "productAdd.jsp";
			break;
		case "update.do" :
			System.out.println("상품수정입니다");
			path = "productUpdate.jsp";
			break;
		case "delete.do" :
			System.out.println("상품삭제입니다");
			break;
		case "detail.do" :
			//parameter 꺼냄
			String para = request.getParameter("productnum");
			//parameter는 String 타입인데, productnum은 Long 타입이라 형변환
			Long num = Long.parseLong(para);
			//얻어낸 productnum을 ProductDTO에 넣어줌
			pDTO.setProductNum(num);
			try {
				pDTO = productService.getProductDetail(pDTO);
				//servlet-jsp간 데이터를 주고받기위해 attribute 이용
				request.setAttribute("detail", pDTO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			path = "productDetail.jsp";
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/product/"+path);
		
		//jsp 페이지로 가자.(forwarding 하자)
		view.forward(request, response);
		
		
		
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
//		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/product/productList.jsp");
//		
//		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
