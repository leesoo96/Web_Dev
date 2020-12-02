<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL표현식</title>
</head>
<body>
	<h2>Detail</h2>
	<!-- EL표현식을 쓰면 스크립틀릿과 같은 역할을 한다 
		setAttribute한 애들만 EL식을 쓸 수 있다 
	-->
	<div>제목 ${data.title}<br/>
		 내용 ${data.ctnt}<br/>
		 등록날짜 ${data.r_dt}<br/>
		 수정날짜 ${data.m_dt}
	</div>
	<a href="/BoardList">뒤로 가기</a>
	<a href="/BoardDel?i_board=${data.i_board}">
		<button>삭제</button>
	</a>
	<a href="/BoardMod?i_board=${data.i_board}">
		<button>수정</button>
	</a>
	<!-- 세션 : 로그인 
	            애플리케이션 : 모든 클라이언트에게 보여줌        
	 -->
</body>
</html>