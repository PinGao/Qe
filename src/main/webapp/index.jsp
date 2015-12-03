<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!--Created by WenPinGao on 2015/12/3.-->
<!DOCTYPE html>
<html lang="">
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title Page</title>

    <!-- Bootstrap CSS -->
    <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
      <h1 class="text-center">${pageContext.request.contextPath}</h1>
    <span class="badge">123</span>
  </div>

<!-- jQuery -->
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<!-- Bootstrap JavaScript -->
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</body>
</html>