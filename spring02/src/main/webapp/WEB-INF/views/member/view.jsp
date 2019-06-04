<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%@ include file="../include/header.jsp" %>
	<script>
		$(function(){
			$("#btnUpdate").click(function(){
				document.form1.action="${path}/member/update.do";
				document.form1.submit();
			});
			
			$("#btnDelete").click(function(){
				alert("ssss");
				if(confirm("삭제하시겠습니까?")) {
					document.form1.action="${path}/member/delete.do";
					document.form1.submit();
				}
			});
		})
	
	</script>
</head>
<body>
	<%@ include file="../include/menu.jsp" %>
	<h1>회원정보</h1>
	<form name="form1" method="post">
		<table border="1" width="400px">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" value="${dto.userid}" readonly></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"></td>
			</tr>
			<tr>
				<td>이 름</td>
				<td><input type="text" name="name" value="${dto.name }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${dto.email }"></td>
			</tr>
			<tr>
				<td>회원 가입 일자</td>
				<td>
					<fmt:formatDate value="${dto.join_date }" pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정" id="btnUpdate">
					<input type="button" value="삭제" id="btnDelete">
					<div style="color:red;">${message}</div>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>