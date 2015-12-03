<!DOCTYPE html>
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
            <h1>注册</h1>
            <p>欢迎注册...</p>
            <p>
              <a class="btn btn-primary btn-lg">Learn more</a>
            </p>
          </div>
        </div>

        <div class="row">
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">

            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
              <form action="${pageContext.request.contextPath}/hello/userSave" method="post" role="form">

                  <div class="form-group">
                      <input type="text" name="name" class="form-control" id="name" placeholder="请输入用户名">
                  </div>
                  <div class="form-group">
                      <input type="password" name="pwd" class="form-control" id="pwd" placeholder="请输入密码">
                  </div>
                  <div class="form-group">
                      <input type="email" name="email" class="form-control" id="email" placeholder="请输入邮箱">
                  </div>
                  <div class="form-group">
                      <input type="text" name="tel" class="form-control" id="tel" placeholder="请输入电话">
                  </div>
                <button type="submit" class="btn btn-primary center-block">Submit</button>
              </form>
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">

            </div>
        </div>
      </div>


        <!-- jQuery -->
        <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	</body>
</html>