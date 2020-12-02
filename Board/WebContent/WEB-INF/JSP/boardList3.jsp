<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ELELELEL</title>
</head>
<body>
	<table>
		<tr>
			<th>Number</th>
			<th>Title</th>
		</tr>

	<c:forEach items="${data }" var="item">
		<tr>
			<td>${item.i_board }</td>
			<td><a href="/BoardDetail?i_board=${item.i_board }">
					${item.title }
				</a>
			</td>
		</tr>
	</c:forEach>
	</table>
	<div><a href="/BoardReg">글쓰기</a></div>
</body>
</html>