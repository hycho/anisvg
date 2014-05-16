<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome to Harpy</title>

<!-- Bootstrap css-->
<link href="resources/module/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- harpy css -->
<link href="resources/css/style.css" rel="stylesheet">

</head>
<body ng-app="searchModule">
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container" ng-controller="searchController">
		<div class="starter-template">
			<h1>Harpy에 오신것을 환영합니다.</h1>
		</div>
		<div class="starter-search-div">
			<input type="text" value="Roy orbinson You got it" popover="듣고 싶은 음악을 입력해 주세요." popover-trigger="focus" class="form-control">
		</div>
	</div>
	<!-- /.container -->



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="resources/module/jquery/jquery-1.11.1.min.js"></script>
	<script src="resources/module/angularjs/angular.min-1.3.0.js"></script>
	<script src="resources/module/angularjs/ui-bootstrap-tpls-0.11.0.js"></script>
	<!-- Search module -->
	<script src="resources/module/search/searchModule.js"></script>
</body>
</html>
