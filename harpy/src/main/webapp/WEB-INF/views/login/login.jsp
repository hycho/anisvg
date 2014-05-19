<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>

<!-- Bootstrap css-->
<link href="resources/module/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- harpy css -->
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/area.css" rel="stylesheet">
<link href="resources/css/login.css" rel="stylesheet">

</head>
<body>
	<div class="container">
		<form class="form-signin" role="form" action="/harpy/j_spring_security_check" id="loginForm" method="post">
			<h2 class="form-signin-heading">Please login</h2>
			<input id="j_username" name="j_username" type="text" class="form-control" required autofocus>
			<input id="j_password" name="j_password" type="password" class="form-control" required> 
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
		</form>
	</div>
	<!-- /container -->

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="resources/module/jquery/jquery-1.11.1.min.js"></script>
	<script src="resources/module/angularjs/angular.min-1.3.0.js"></script>
	<script src="resources/module/angularjs/ui-bootstrap-tpls-0.11.0.js"></script>

	<!-- Search module -->
	<script src="resources/module/login/loginModule.js"></script>
</body>
</html>
