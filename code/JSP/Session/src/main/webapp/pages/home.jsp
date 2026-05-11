<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >

	<%
		if(session.getAttribute("user") == null){
			response.sendRedirect("login.jsp?type=0");
		}
	%>
	
	<h2>welcome to the landing page</h2>

</body>
</html>