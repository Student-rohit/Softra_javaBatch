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
<title>Vendor Page</title>
</head>

<body>

<jsp:useBean id="vend" class="com.VendorBean" scope="session" />

<jsp:setProperty name="vend" property="venId" param="venId" />
<jsp:setProperty name="vend" property="venName" param="venName" />
<jsp:setProperty name="vend" property="mobile" param="mobile" />

<h2>Vendor Details</h2>

Vendor ID :
<jsp:getProperty name="vend" property="venId"/>

<br><br>

Vendor Name :
<jsp:getProperty name="vend" property="venName"/>

<br><br>

Mobile :
<jsp:getProperty name="vend" property="mobile"/>

</body>
</html>