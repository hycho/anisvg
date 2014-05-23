var loginModule = angular.module('loginModule', ['ui.bootstrap']);

loginModule.controller('loginController', ['$scope','$location','$window', '$modal', function ($scope, $location, $window, $modal) {
	$scope.joinOpen = function(size){
		$scope.contextUrl = $location.absUrl().substr(0, $location.absUrl().lastIndexOf("/"));
		$scope.action = {url: $scope.contextUrl + '/join'};
		
		var joinModalInstance = $modal.open({
			templateUrl: $scope.action.url,
			controller: joinModalInstanceCtrl,
			size: size
		});
		
		joinModalInstance.result.then(function (selectedItem) {
	    	
	    }, function () {
	    	
	    });
	};

}]);

var joinModalInstanceCtrl = function ($scope, $modalInstance) {
	
};