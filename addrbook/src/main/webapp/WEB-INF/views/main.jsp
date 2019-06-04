<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>주소록</title>
	<%@ include file="include/header.jsp" %>
</head>
<body>
	<div align="center">
		<%@ include file="include/menu.jsp" %>
		<h2>주소록</h2>
		<table border="1" width="700px">
			<tr>
				<td>이름</td>
				<td>전화번호</td>
				<td>그룹</td>
				<td>이메일</td>
				<td>주소</td>
			</tr>
			<c:forEach var="row" items="${list }">
				<tr>
					<td>
						<a href="${path }/addr/view.do?name=${row.name}">
							${row.name }
						</a>
					</td>
					<td>${row.tel }</td>
					<td>${row.party }</td>
					<td>${row.email }</td>
					<td>${row.address }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>