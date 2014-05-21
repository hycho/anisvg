var searchModule = angular.module('searchModule', ['ui.bootstrap', 'angularMoment']);

searchModule.controller('searchController', ['$scope','$filter','$modal', '$log','listVideo', function ($scope, $filter, $modal, $log, listVideo) {
	$scope.searchText = {text: "You got it"}; 
	$scope.entries = [];
	
	// init paging value
	$scope.maxSize = 10;
	$scope.bigTotalItems = 0;
	$scope.bigCurrentPage = 1;
	$scope.perPage = 20;
	
	// keyupEvent search input box
	$scope.searchVideo = function(keycode) {
		if (keycode == 13) {
			listVideo.getVideoHtml($scope.searchText.text, $scope.bigCurrentPage, $scope.perPage, videoMapping);
		}
	};
	
	//paging
	$scope.pageChanged = function() {
		listVideo.getVideoHtml($scope.searchText.text, $scope.bigCurrentPage, $scope.perPage, videoMapping);
	};
	
	$scope.items = ['item1', 'item2', 'item3', 'item4', 'item5', 'item6', 'item7', 'item8', 'item9', 'item10', 'item11', 'item12'];
	$scope.open = function (size) {
		var modalInstance = $modal.open({
			//templateUrl: 'repeatModalContents.html',
			templateUrl: '/harpy/repeatModal',
			controller: ModalInstanceCtrl,
			size: size,
			resolve: {
		        items: function () {
		        	return $scope.items;
		        }
			}
	    });

	    modalInstance.result.then(function (selectedItem) {
	    	$scope.selected = selectedItem;
	    }, function () {
	    	$log.info('Modal dismissed at: ' + new Date());
	    });
	};
	
	
	$scope.getTime = function(secs){ //이 메소드는 수정좀 하면 참좋을듯 Filter로 빼진 말기. scope에 input이 걸려있어서 -0-
		var result = "";
		var hours = Math.floor(secs / (60 * 60));
	    var divisor_for_minutes = secs % (60 * 60);
	    var minutes = Math.floor(divisor_for_minutes / 60);
	    var divisor_for_seconds = divisor_for_minutes % 60;
	    var seconds = Math.ceil(divisor_for_seconds);
	    
	    if(hours < 10) hours = "0"+hours;
	    if(minutes < 10) minutes = "0"+minutes;
	    if(seconds < 10) seconds = "0"+seconds;
	    
	    if(hours === "00"){
	    	result = minutes+":"+seconds;
	    }else{
	    	result = hours+":"+minutes+":"+seconds; 
	    }
	    
		return result;
	};
	
	
	
	// mapping function video = html
	var videoMapping = function(data){
		console.log(data);
		$scope.entries = {data : $filter("partition")(data.feed.entry, 4)};
		$scope.bigTotalItems = data.feed.openSearch$totalResults.$t;
	};

}]);

var ModalInstanceCtrl = function ($scope, $modalInstance, items) {
	$scope.repeat = false;
	$scope.supple = false;
	
	$scope.items = items;
	$scope.selected = {
		item: $scope.items[0]
	};

	$scope.ok = function () {
		$modalInstance.close($scope.selected.item);
	};

	$scope.cancel = function () {
		$modalInstance.dismiss('cancel');
	};
	
	$scope.listOver = function($event) {
		//var target = angular.element($event.target);
		console.log($event.currentTarget);
	};
	
	$scope.listLeave = function($event) {
		console.log($event.currentTarget);
	};
};

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