<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/include.jsp" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<script type="text/javascript">
	//이메일 인증 후 창닫기
	//alert('${param.auth}');
	if ('${param.auth}'=='1'){
		window.close();
	}
</script>	
</head>
<body>
<%@include file="menu.jsp" %>
<div class="container-fluid bg-1 text-center">
  <h3 class="margin"></h3>
  <img src="${path}/resources/images/clouds.jpg" class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="600" height="600">
  <h3>환영합니다!!</h3>
</div>

<%@include file="footer.jsp" %>
</body>
</html>