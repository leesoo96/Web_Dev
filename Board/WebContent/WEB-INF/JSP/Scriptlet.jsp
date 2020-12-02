<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! // - 서블릿
	public String Hello(){
		return "Hello, JSP";
	}
	// -> 옛날 코딩기법임~~
%>
<%  // - 스크립틀릿
	//자바 코드 사용
	int num1 = 10;
	int num2 = 20;
	String str1 = "ABCDE";
	
	// 스크립틀릿은 실무에서는 잘 쓰지않는다!!!!!
	// 메소드 생성 불가. 메소드 안에 또 메소드를 만드는 것이라고 생각하기. 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet</title>
</head>
<body>
	num1 = <%=num1 %> <br/>
	num2 = <%=num2 %> <br/>
	str1 = <% out.print(str1); %>
	
	<div><%=Hello() %></div>
</body>
</html>