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
<body>
	<form action="pages/bean_store.jsp">
		<input type="text"  name="stuId" />
		<input type="text"  name="stuName" />
		<input type="submit"  value="send data" />
	
	</form>


</body>
</html>