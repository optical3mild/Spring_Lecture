<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>
	<%@ include file="../include/menu.jsp" %>
	<div align="center">
		<h2>등록화면</h2>
		<br>
		<form name="form1" method="post" action="${path }/addr/insert.do">
			<table border="1" width="400px">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="tel"></td>
				</tr>
				<tr>
					<td>그룹</td>
					<td><input type="text" name="party"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="등록">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>