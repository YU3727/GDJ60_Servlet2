<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 230131 7교시 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<!-- web.xml을 보면 ProductController를 호출하기 위한 주소로 /product를 적어두었기 때문에 -->
	<!-- 아래의 주소로 가야한다. -->
	<!-- **작업할 때 Project Explorer에서 찾지말고 홈페이지 url을 보고 주소를 참조하는게 안헷갈리고 좋다 -->
	<a href ="./product?name=test&detail=explain">ProductList 상대경로</a>
	
	<a href="./memberList.do">MemberList 상대경로</a>
</body>
</html>	