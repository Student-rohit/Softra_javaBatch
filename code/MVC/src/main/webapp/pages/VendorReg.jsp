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
<title>Vendor Registration</title>

</head>

<body>

<form action="pages/vend_bean_store.jsp" method="post">

    <input type="text"
           name="venId"
           placeholder="Enter Vendor ID">

    <br><br>

    <input type="text"
           name="venName"
           placeholder="Enter Vendor Name">

    <br><br>

    <input type="text"
           name="mobile"
           placeholder="Enter Vendor Mobile">

    <br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>