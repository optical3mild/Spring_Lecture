<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<c:set var="path" value="${pageContext.request.contextPath }" />
</head>
<body>
	<div style="text-align:center">
		<a href="${path }/">전체목록</a>
		<a href="${path }/addAddress.do">추가하기</a>
		<form name="form1" method="post" action="${path }/addrbook/searchByName.do">
			<input type="text" name="searchByName">
			<input type="submit" value="찾기">
		</form>	
	</div>
	<hr>
</body>
</html>