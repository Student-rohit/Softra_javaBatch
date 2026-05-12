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


	<jsp:useBean id="stud"  class="com.bean.StudentBean">
	
	
<jsp:setProperty name="stud" param="stuId" property="stuId" />
<jsp:setProperty name="stud" param="stuName" property="stuName" />	

<h2>hello servlet</h2>

	<jsp:getProperty name="stuId" property="stuId"/>
		
	<jsp:getProperty name="stuName" property="stuName"/>
	
	 </jsp:useBean>
	
</body>
</html>