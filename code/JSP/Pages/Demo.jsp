<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> usage of scripting Tags</h3>

<h4> sum of 2 no's is</h4> <%=2+7 %>

	<%
    out.print("welcome to the jsp ");

    out.print("<h3>hello  </h3>");
%>
	
	
	<%!
		int add2nos(){
		int a=10;
		int b=20;
		return(a+b);
	}
	%>
	
	<h3>invoking the function </h3> <%= add2nos() %>
	
</body>
</html>