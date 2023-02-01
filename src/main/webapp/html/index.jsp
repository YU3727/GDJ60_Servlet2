<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 230131 5~6교시 -->
<!DOCTYPE html>
<html>
	<head> <!-- head 부분은 화면상에 출력되지 않음 -->
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body> <!-- body 부분은 화면상에 출력 됨 -->
	
	<!-- <a href="https://www.naver.com">NAVER</a>  NAVER로 가기-->
	<!--
	<a href="http://localhost:8080/GDJ60_Servlet2/html/product.jsp">Product</a>
	주소에 URL을 넣은 경우. 아래는 URL에서 IP,PORT를 없앤 URI를 넣은 경우이다.
	-->
	<!-- 절대경로로 표시
		<a href="/GDJ60_Servlet2/html/product.jsp">Product</a>
		<a href="/GDJ60_Servlet2/html/member.jsp">Member</a>
		<a href="/GDJ60_Servlet2/">HOME</a>
		<a href="/GDJ60_Servlet2/product">PRO</a>
	
	 -->
	<!-- 상대경로로 표시, 현재폴더는 /html. html에서 움직인다고 생각한다. -->
	<a href="./product.jsp">Product</a>
	<a href="./member.jsp">Member</a>
	<a href="../">HOME</a>
	<a href="../product">PRO</a> <br>
	
	
	<a href="../sub/sub1.jsp">sub1 상대경로</a>
	<a href="/GDJ60_Servlet2/sub/sub1.jsp">sub1 절대경로</a>
	
	<!-- 
		<h1>제목1</h1>
		<h2>제목2</h2>
		<h3>제목3</h3>
		<hr>
		Text
		<hr>
		<h4>제목4</h4>
		<h5>제목5</h5>
		<h6>제목6</h6>
		Woo woo woo woo ooh<br> enter치고 내려가라
		Woo woo woo woo <br>
		
		<p>
		Stay in the middle 
		Like you a little
		</p>
		
		<p>
		Don't want no riddle 
		말해줘 say it back 
		</p>
		
		<p>
		Oh say it ditto 
		아침은 너무 멀어
		So say it ditto 
		</p>
		 -->
		
	</body>
</html>