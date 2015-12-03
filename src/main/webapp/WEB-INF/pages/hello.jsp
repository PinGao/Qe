<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page pageEncoding="utf-8" %>
<html lang="zh">
	<head>
		<title>Title</title>
		<meta charset="UTF-8">
		<meta name=description content="">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Bootstrap CSS -->
		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" media="screen">
	</head>
	<body>
    <div class="container">
        <div class="jumbotron">
        	<div class="container">
        		<h1>${message}</h1>
        		<p>Contents...</p>
        		<p>
        			<a href="${pageContext.request.contextPath}/hello/showRes" class="btn btn-primary btn-lg">注册</a>
        		</p>
        	</div>
        </div>
       <div class="row">
           <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3 col-xs-offset-3 col-sm-offset-3 col-md-offset-3 col-lg-offset-3">
               <div class="responsive">
                   <table class="table table-hover table-bordered">
                       <thead>
                       <tr>
                           <th>姓名</th>
                           <th>密码</th>
                           <th>邮箱</th>
                           <th>电话</th>
                       </tr>
                       </thead>
                       <tbody>
                       <c:forEach items="${pbu.beanList}" var="user">
                           <tr>
                               <td>${user.name}</td>
                               <td>${user.pwd}</td>
                               <td>${user.email}</td>
                               <td>${user.tel}</td>
                           </tr>
                       </c:forEach>
                       </tbody>
                   </table>
                   <c:choose>
                       <c:when test="${pbu.pc < 10}">
                           <c:set var="begin" value="1" />
                           <c:set var="end" value="${pbu.pc }" />
                       </c:when>
                       <c:otherwise>
                           <c:set var="begin" value="${pbu.pi -5 }" />
                           <c:set var="end" value="${pbu.pi + 4 }" />
                           <c:if test="${begin < 1 }">
                               <c:set var="begin" value="1" />
                           </c:if>
                           <c:if test="${end > pbu.pc }">
                               <c:set var="end" value="${pbu.pc}" />
                           </c:if>
                       </c:otherwise>
                   </c:choose>
               </div>
               <ul class="pager">
                   <c:if test="${pbu.pi > 1}">
                       <li><a href="${pageContext.request.contextPath}/hello/index?pi=${pbu.pi - 1}">上一页</a></li>
                   </c:if>
                   <c:forEach begin="${begin}" end="${end}" var="i">
                       <li><a href="${pageContext.request.contextPath}/hello/index?pi=${i}">第${i}页</a></li>
                   </c:forEach>

                   <c:if test="${pbu.pi < pbu.pc}">
                       <li><a href="${pageContext.request.contextPath}/hello/index?pi=${pbu.pi + 1}">下一页</a></li>
                   </c:if>
               </ul>
           </div>
       </div>
    </div>

    <!-- jQuery -->
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	</body>
</html>
