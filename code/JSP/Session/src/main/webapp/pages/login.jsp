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
<title>Login form</title>
</head>
<body>

	<!-- displaying error message  -->
	<%
		if(request.getParameter("type").equals("0"))
			out.print("sorry, credentials are wrong, please login again");
	
	%>
	
	<form action="loginauth">
	
		<input type="text" name="user" placeholder="enter user name"/>
		<input type="text" name="pwd" placeholder="enter password"/>
		<input type="submit" value="please login here"/>
		
	</form>

</body>
</html>