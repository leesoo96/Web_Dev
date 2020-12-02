<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	web-inf / index.jsp -> 안열림ㅋ
	직접 접근 X
	모든 JSP파일은 web-inf 아래에 생성하기!
	서블릿으로만 열 수 있다!!!!!!!!! -> 이렇게 개발해야된다
	
	web-inf는 보안(웹 노출)때문에 접근할 수 없도록 세팅되어있다. 
	스프링도 마찬가지!
</body>
</html>