<%@page import="oracle.jdbc.internal.PDBChangeEvent"%>
<%@page import="java.util.List"%>
<%@page import="com.pooh.s1.product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List Page</h1>
	
	<!-- 내장객체에서 Attribute에 값을 넣고 이걸 html으로 뿌리는 방법-->
	<%-- for 반복문을 이용하기 위해 꺽쇠% for{ %꺽쇠 꺽쇠% } %꺽쇠 이런식으로 쓴다.--%>
	<%
		List<ProductDTO> ar = (List<ProductDTO>)request.getAttribute("list");
		for(ProductDTO pDTO : ar) {
			
	%>
	
	<h3><%= pDTO.getProductNum()%></h3>
	<h3><a href="./detail.do?productnum=<%=pDTO.getProductNum()%>"><%= pDTO.getProductName()%></a></h3>
	
	<%} %>
	
	<!-- Ctrl + Shift + / 하면 주석 -->
<!-- 	<a href="./add.do">ProductAdd</a>
	<a href="./update.do">ProductUpdate</a>
	<a href="./detail.do">ProductDetail</a> -->
</body>
</html>