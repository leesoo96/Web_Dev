<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>table</title>
<style>
	table, tr, th, td{
		border: 2px solid #000;
		border-collapse : collapse;
	}
</style>
</head>
<body>
<!-- 주의 레이아웃을 짤 때는 table태그 절대 사용하지말고 div 태그로 짜주기!!!!!!! -->
	<div>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>주소</th>
				</tr>	
			</thead>
			
			<tbody>
				<tr>
					<td>1</td>
					<td>아리아나</td>
					<td>미국</td>
				</tr>
				<tr>
					<td>2</td>
					<td>에드</td>
					<td>미국</td>
				</tr>
				<tr>
					<td rowspan="2">3</td>
					<td>시아</td>
					<td rowspan="2">오스트레일리아</td>
				</tr>
				<tr>
					<td>카디</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>