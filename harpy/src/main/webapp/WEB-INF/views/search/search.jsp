<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html ng-app="searchModule">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome to Harpy</title>

<!-- Bootstrap css-->
<link href="resources/module/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- harpy css -->
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/area.css" rel="stylesheet">

</head>
<body ng-controller="searchController">
	<script type="text/ng-template" id="repeatModalContents.html">
        <div class="modal-header">
            <h3 class="modal-title">I'm a modal!</h3>
        </div>
        <div class="modal-body">
            <ul>
                <li ng-repeat="item in items">
                    <a ng-click="selected.item = item">{{ item }}</a>
                </li>
            </ul>
            Selected: <b>{{ selected.item }}</b>
        </div>
        <div class="modal-footer">
            <button class="btn btn-primary" ng-click="ok()">OK</button>
            <button class="btn btn-warning" ng-click="cancel()">Cancel</button>
        </div>
    </script>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/harpy/search">Harpy</a>
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

	<div class="container">
		<div class="starter-template">
			<h1>Harpy에 오신것을 환영합니다.</h1>
		</div>
		<div class="starter-search-div">
			<input type="text" popover="듣고 싶은 음악을 입력해 주세요." popover-trigger="focus" class="form-control" ng-keyup="searchVideo($event.keyCode)" ng-model="searchText.text">
		</div>
		<button class="btn btn-default" ng-click="open('lg')">Large modal</button>
	</div>
	<!-- /.container -->

	<div class="container margin-top-60">
		<div class="row" ng-repeat="entryList in entries.data">
			<div class="col-lg-3 margin-top-40" ng-repeat="entry in entryList">
				<div class="div-align-center" style="position: relative;">
					<img ng-src="{{entry.media$group.media$thumbnail[0].url}}" class="cursor-pointer" style="width:250px;"/>
					<span class="video-time">{{getTime(entry.media$group.media$content[0].duration)}}</span>
				</div>
				<!-- <iframe style="width: 360px;" id="ytplayer" src="http://www.youtube.com/embed/M7lc1UVf-VE?autoplay=1&origin=http://example.com"></iframe>-->
				<h4 class="ellipsis-250">{{entry.title.$t}}</h4>
    			<rating ng-model="entry.gd$rating.average" readonly="true"></rating>
				<p class="text-danger">As of v7.0.1, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">MyList 등록 &raquo;</a>
				</p>
			</div>
		</div>
	</div>
	
	<div class="div-align-center">
		<pagination ng-change="pageChanged()" total-items="bigTotalItems" ng-model="bigCurrentPage" items-per-page="perPage" max-size="maxSize" class="pagination-sm" boundary-links="true" rotate="false" num-pages="numPages"></pagination>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="resources/module/jquery/jquery-1.11.1.min.js"></script>
	<script src="resources/module/angularjs/angular.min-1.3.0.js"></script>
	<script src="resources/module/angularjs/ui-bootstrap-tpls-0.11.0.js"></script>
	<script src="resources/module/moment/moment.min-2.6.0.js"></script>
	<script src="resources/module/moment/angular-moment.min.js"></script>
	
	
	<!-- Search module -->
	<script src="resources/module/search/searchModule.js"></script>
</body>
</html>