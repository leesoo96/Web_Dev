<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
<style>
	table,tr,th,td {
		border-collapse: collapse;
		width: 300px;
	}
	th {
		background: skyblue;
	}
	button {
		margin-top: 10px;
	}
</style>
</head>
<body>
	<table border=1>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
	<c:forEach items="${list }" var="item">
		<tr>
			<td>${item.i_board }</td>
			<td><a href="/v2/boardDetail?i_board=${item.i_board }">${item.title }</a></td>
			<td>${item.r_dt }</td>
		</tr>
	</c:forEach>
	</table>
	
	<div>
		<!-- GET방식으로 오픈-->
		<a href="/v2/boardReg"><button>글쓰기</button></a>
	</div>

</body>
</html>