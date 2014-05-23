<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html ng-app="loginModule">
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
	<div class="container" ng-controller="loginController">
		<form class="form-signin" role="form" action="<c:url value='/harpy/j_spring_security_check' />" id="loginForm" method="post">
			<h2 class="form-signin-heading">Please log-in</h2>
			<input id="j_username" name="j_username" type="text" class="form-control" placeholder="UserId" required autofocus />
			<input id="j_password" name="j_password" type="password" class="form-control" placeholder="Password" required /> 
			<p style="text-align:right">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Log-in</button>
			</p>
		</form>
		<div class="form-join">
			<button class="btn btn-lg btn-primary btn-block" ng-click="goJoinPage()">Join</button>
		</div>
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
