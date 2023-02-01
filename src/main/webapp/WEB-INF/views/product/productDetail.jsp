<%@page import="com.pooh.home.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Detail Page</h1>
	<%
		ProductDTO pDTO = (ProductDTO)request.getAttribute("detail");
		
	%>
		<h3><%= pDTO.getProductNum()%></h3>
		<h3><%= pDTO.getProductName()%></h3>
		<h3><%= pDTO.getProductDetail()%></h3>
</body>
</html>