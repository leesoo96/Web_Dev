<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>READ</title>
</head>
<body>
	제목 ${item.title }<br/>
	내용 ${item.ctnt } <br/>
	작성일 ${item.r_dt } <br/>
	
	<a href="/v2/SerBoardList">뒤로 가기</a>
	<a href="/v2/SerBoardDel?i_board=${item.i_board}">
		<button>삭제</button>
	</a>
	<a href="/v2/SerBoardMod?i_board=${item.i_board}">
		<button>수정</button>
	</a>
</body>
</html>