<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="table-responsive">
    	<table class="table table-hover table-bordered">
    		<thead>
    			<tr>
    				<th>id</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th>邮箱</th>
                    <th>电话</th>
    			</tr>
    		</thead>
    		<tbody>
    			<c:forEach var="user" items="${users}">
                  <tr>
                      <td>${user.id}</td>
                      <td>${user.name}</td>
                      <td>${user.pwd}</td>
                      <td>${user.email}</td>
                      <td>${user.tel}</td>
                  </tr>
                </c:forEach>
    		</tbody>
    	</table>
    </div>
    <h2 class="text-center">
        <a href='<c:url value="/home/index" />'>123</a>
    </h2>
</div>
<!-- jQuery -->
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<!-- Bootstrap JavaScript -->
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</body>
</html>