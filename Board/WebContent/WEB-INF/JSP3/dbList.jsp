<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIST</title>
<style>
	table,tr,td,th {
		border-collapse: collapse;
	}
	th {
		background-color: pink;
	}
</style>
</head>
<body>
	<h2>SHOW LIST</h2>
	<table border=1>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${contents }" var="items">
		<tr>
			<td>${items.i_board }</td>
			<td><a href="/dbReadBoard?i_board=${items.i_board }">${items.title }</a></td>
			<td>${items.r_dt }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="/dbwriteList">글쓰기</a>
</body>
</html>