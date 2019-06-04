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
				document.form1.action="${path}/addr/update.do";
				document.form1.submit();
			});
			
			$("#btnDelete").click(function(){
				alert("ssss");
				if(confirm("삭제하시겠습니까?")) {
					document.form1.action="${path}/addr/delete.do";
					document.form1.submit();
				}
			});
		})
	
	</script>
</head>
<body>
	<%@ include file="../include/menu.jsp" %>
	<div align="center">
		<h1>회원정보</h1>
		<form name="form1" method="post">
			<table border="1" width="400px">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${dto.name}"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="tel" value="${dto.tel}"></td>
				</tr>
				<tr>
					<td>그룹</td>
					<td><input type="text" name="party" value="${dto.party }"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email" value="${dto.email }"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" value="${dto.address }"></td>
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
	</div>
</body>
</html>