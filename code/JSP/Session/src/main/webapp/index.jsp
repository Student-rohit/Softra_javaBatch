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
<title>go to login page </title>
</head>
<body>
	<a href="pages/login.jsp?type=1"> <h1> please login here </h1></a>

</body>
</html>