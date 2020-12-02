<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>READ</title>
<style>
	h2 {
		text-decoration: underline;
	}
 	table, th, tr, td {
 		border-collapse: collapse;
 	}
 	th {
 		background-color: pink;
 		width: auto;
 	}
 	td {
 		width: 300px;
 		height: 100px;
 	}
</style>
</head>
<body>
	<h2>READ</h2>
	<table border=1>
		<tr>
			<th>제목 : ${contents.title }</th>
			<th>${contents.i_board }</th>
		</tr>
		<tr>
			<td colspan="2">${contents.ctnt }</td>
		</tr>
		<tr>
			<th colspan="2">작성일 : ${contents.r_dt }</th>
		</tr>
	</table>
	<a href="/dbshowList">Back to List</a><br/>
	<a href="/dbupdate?i_board=${contents.i_board }">Update</a><br/>
	<a href="/DBdeleteList?i_board=${contents.i_board }">Delete</a>
</body>
</html>