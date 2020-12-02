<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
</head>
<body>
	<table>
		<tr>
			<th>Number</th>
			<th>Title</th>
		</tr>
		<tr>
			<td>1</td>		<!-- 키 값을 안주면 파싱안됨 꼭 주기!! -->
			<!--                  쿼리스트링(?) 키(i_board) 키 값(1)   -->
			<td><a href="/BoardDetail?i_board=1">Hello~</a></td>
		</tr>
		<tr>
			<td>2</td>
			<td><a href="/BoardDetail?i_board=2">Hello!</a></td>
		</tr>
		<tr>
			<td>3</td>
			<td><a href="/BoardDetail?i_board=3">Hello^^</a></td>
		</tr>
	</table>
</body>
</html>