<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%@ include file = "../common/header.jsp" %>
	<script>
		function doF(){
			$.ajax({
				type:"post",
				url:"${path}/test/doF",
				success: function(result){
					$("#result").html("상품명 : "+result.name+"가격 : "+ result.price);
				}
			})
		}	
	
	
	</script>
</head>
<body>
	<%@ include file = "../common/menu.jsp" %>
	<h1>링크 테스트</h1>
	<a href="${path }/test/menu1">menu1</a><br>
	<a href="javascript:doF()" >doF</a><br>
	<div id="result">
		
	
	</div>
</body>
</html>