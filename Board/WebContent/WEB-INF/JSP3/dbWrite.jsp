<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WRITE</title>
</head>
<body>
	<h2>WRITE</h2>
	<form action="/dbwriteList" method="post">
		제목 <input type="text" name="title" ><br/>
		내용 <textarea name="ctnt"></textarea><br/>
		
		<input type="reset" value="다시쓰기">
		<input type="submit" value="확인">
	</form>
	<a href="/dbshowList">Back to List</a>
</body>
</html>