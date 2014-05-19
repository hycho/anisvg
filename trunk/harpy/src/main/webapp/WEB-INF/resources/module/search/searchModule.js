var searchModule = angular.module('searchModule', ['ui.bootstrap']);

searchModule.controller('searchController', ['$scope','$filter','listVideo', function ($scope, $filter, listVideo) {
	$scope.searchText = {text: "You got it"}; 
	$scope.entries = [];
	
	// init paging value
	$scope.maxSize = 10;
	$scope.bigTotalItems = 0;
	$scope.bigCurrentPage = 1;
	$scope.perPage = 30;
	
	// keyupEvent search input box
	$scope.searchVideo = function(keycode) {
		if (keycode == 13) {
			listVideo.getVideoHtml($scope.searchText.text, $scope.bigCurrentPage, $scope.perPage, videoMapping);
		}
	};
	
	//paging
	$scope.pageChanged = function() {
		console.log('Page changed to: ' + $scope.bigCurrentPage);
		listVideo.getVideoHtml($scope.searchText.text, $scope.bigCurrentPage, $scope.perPage, videoMapping);
	};
	
	// mapping function video = html
	var videoMapping = function(data){
		console.log(data);
		$scope.entries = {data : $filter("partition")(data.feed.entry, 4)};
		$scope.bigTotalItems = data.feed.openSearch$totalResults.$t;
		console.log("$scope.entries = " + $scope.entries);
	};

}]);

// listVideo Factory Service
searchModule.factory('listVideo', ['$http', function($http) {
	return {
		getVideoHtml : function(name, startIndex, maxResults, callback){
			var start = ((startIndex-1) * maxResults)+1;

			var url = 'http://gdata.youtube.com/feeds/api/videos?alt=json&start-index='+start+'&max-results='+maxResults+'&v=2&q=';
			
			$http.get(url+name, {
				responseType: "json"
			}).success(function(data, status){
				callback(data);
			}).error(function(data, status){
				
			});
		}
	};
}]);

// partition(groups) filter
searchModule.filter('partition', function() {
	var part = function(arr, size) {
		if(typeof arr != "undefined"){
			if ( 0 === arr.length ) return [];
		    return [ arr.slice( 0, size ) ].concat( part( arr.slice( size ), size) );
		}else{
			return '';
		}
	};
	return part;
});