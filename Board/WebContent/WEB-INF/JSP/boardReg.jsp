<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
</head>
<body>
<div>
	<h1>글 등록하기</h1>
		<form action="/BoardMod" method="post">
			<div>
				번호 : <input type="number" name="i_board">
			</div>
			<div>
				제목 : <input type="text" name="title">
			</div>
			<div>
				내용 : <textarea name="ctnt"></textarea>
			</div>
			<div>
				<input type="submit" value="등록">
				<input type="reset" value="다시 쓰기">
			</div>
		</form>
		<a href="/BoardList">메인으로</a>
	</div>
	
</body>
</html>