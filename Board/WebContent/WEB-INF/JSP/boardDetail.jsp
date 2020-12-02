<%@page import="com.koreait.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO data = (BoardVO)request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<h2>Detail</h2>
	<div>제목 <%=data.getTitle() %><br/>
		 내용 <%=data.getCtnt() %><br/>
		 등록날짜 <%=data.getR_dt() %>
	</div>
	<a href="/BoardList">뒤로 가기</a>
</body>
</html>