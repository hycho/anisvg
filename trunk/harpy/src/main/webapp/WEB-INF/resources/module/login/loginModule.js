var loginModule = angular.module('loginModule', ['ui.bootstrap']);

loginModule.controller('loginController', ['$scope','$location','$window', function ($scope, $location, $window) {
	$scope.goJoinPage = function(){
		$scope.contextUrl = $location.absUrl().substr(0, $location.absUrl().lastIndexOf("/"));
		$scope.action = {url: $scope.contextUrl + '/join'};
		$window.location = $scope.action.url;
	};

}]);