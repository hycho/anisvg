var searchModule = angular.module('searchModule', ['ui.bootstrap', 'angularMoment']);

searchModule.controller('searchController', ['$scope','$filter','$modal', '$log', '$http', '$location','listVideo', function ($scope, $filter, $modal, $log, $http, $location, listVideo) {
	$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
	
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
	
	$scope.items = ['item1', 'item2', 'item3', 'item4', 'item5', 'item6', 'item7', 'item8', 'item9', 'item10', 'item11', 'item12']; //이거 사용하나?
	
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
	
	$scope.insertRepeat = function(youtubeid, title, desc, thumburl, recommend){
//		console.log("youtubeid = "+youtubeid.substring(youtubeid.lastIndexOf(":")+1)+", title = "+title+", desc = "+desc+", thumburl = "+thumburl+", recommend = "+Math.round(recommend));
//		console.log("user id = "+angular.element("#userid").val());
		
		var path = $location.absUrl().substr(0, $location.absUrl().lastIndexOf("/"));
		var params = {
			userId : angular.element("#userid").val(),
			youtubeId : youtubeid.substring(youtubeid.lastIndexOf(":")+1),
			title : title,
			description : desc,
			thumbUrl : thumburl, 
			recommend : Math.round(recommend)
		};
		
		$http.post(path+"/insertRepeat", $.param(params), {
		}).success(function(data, status){
			alert("등록완료. 최상위 메뉴의 반복듣기를 선택해주세요.");
		}).error(function(data, status){
			alert("ERROR");
		});
	};
	
	// mapping function video = html
	var videoMapping = function(data){
//		console.log(data);
		$scope.entries = {data : $filter("partition")(data.feed.entry, 4)};
		$scope.bigTotalItems = data.feed.openSearch$totalResults.$t;
	};

}]);

var ModalInstanceCtrl = function ($scope, $modalInstance, $http, $location, items) {
	// 하드코딩을 좋아하지 않지만... Module과 Controller로 분리가 되니 여기에 상수를 선언하고 사용함, 차후 바꿔도 안바꿔도 될듯.
	$scope.vlistElemStr = "vlist";
	
	$scope.repeat = {check: false};
	$scope.shuffle = {check: false};
	$scope.auto = {check: false};
	$scope.num = 0;
	$scope.delArr = [];
	$scope.videos = [];
	$scope.playList = [];
	
	// youtube player object
	$scope.player;
	
	$scope.items = items;
	$scope.selected = {
		item: $scope.items[0]
	};
	
	$scope.$watch('$viewContentLoaded', function(){
//		console.log("init modal");
		initModalPlayer();
	});

	$scope.ok = function () {
		$modalInstance.close($scope.selected.item);
	};

	$scope.cancel = function () {
		$modalInstance.dismiss('cancel');
	};
	
	$scope.listOver = function($event) {
		angular.element($event.currentTarget).addClass('repeat-over-color').removeClass('repeat-leave-color');
	};
	
	$scope.listLeave = function($event) {
		angular.element($event.currentTarget).addClass('repeat-leave-color').removeClass('repeat-over-color');
	};
	
	$scope.listClick = function($event, $index, id) {
		var curElemJlite = angular.element($event.currentTarget);
		convertList(curElemJlite);
		$scope.num = $index;
		playModalPlayer($scope.num);
	};
	
	$scope.menuOptions = [
	    ['삭제하기', function ($itemScope, $event) {
//	    	console.log($itemScope);
//	    	console.log($event);
	    	deleteRepeat(angular.element($event.currentTarget));
	    	
	    	//console.log()
	    }]
	];
	
	// delete repeat list
	var deleteRepeat = function($jLite){
		var seq = $jLite.attr("attrSeq");
//		console.log("seq = "+seq);

		var path = $location.absUrl().substr(0, $location.absUrl().lastIndexOf("/"));
		
		var params = {
			seq : seq
		};
		
		$http.post(path+"/deleteRepeat", $.param(params), {
		}).success(function(data, status){
			alert("삭제 완료");
			$scope.delArr.push($jLite.attr("attrIndex"));
			$jLite.remove();
		}).error(function(data, status){
			alert("ERROR");
		});
	};
	
	// init modalplayer via there 
	var initModalPlayer = function() {
		var path = $location.absUrl().substr(0, $location.absUrl().lastIndexOf("/"));
		var params = {
			userId : angular.element("#userid").val()
		};
		
		$http.post(path+"/getRepeatList", $.param(params), {
		}).success(function(response, status){
			$scope.videos = response.data;
			angular.forEach(response.data, function(value, key){
				 $scope.playList.push(value.YOUTUBEID);
			});
		}).error(function(response, status){
			alert("ERROR");
		});
		
		$scope.player = new YT.Player('modalPlayer',{
			width: '400',
			height: '300',
			events:{
				'onReady': onPlayerReady,
				'onStateChange' : onPlayerStateChange
			}
		});
	};
	
	var onPlayerReady = function(event){
		playModalPlayer($scope.num);
	};
	
	var onPlayerStateChange = function(event){
		switch(event.target.getPlayerState()){
			case -1:
				break;
			case 0:
				if($scope.auto.check){
					$scope.player.playVideo();
				}else if($scope.shuffle.check){
					shufflePlayModalPlayer();
				}else if($scope.repeat.check){
					$scope.num = $scope.num+1;
					playModalPlayer($scope.num);
				}
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 5:
				break;
			default :
				break;
		}
	};
	
	var shufflePlayModalPlayer = function(num) {
		playModalPlayer(Math.floor(Math.random() * $scope.playList.length));
	};
	
	var playModalPlayer = function(num) {
//		console.log($scope.playList.length);
		if(($scope.playList.length-$scope.delArr.length) == 0) { return; }
		
		angular.forEach($scope.delArr, function(value, key){
			if(value == num){
//				console.log("value = "+value+" num = "+num);
				num++;
			}
		});
		
		var cnt = $scope.playList.length;
		
		if(num == cnt) { num = 0; }
			
//		console.log("PlayNum = "+num+" PlayModalPlayer id = "+$scope.playList[num]);
		$scope.player.cueVideoById({
			'videoId': $scope.playList[num],
			'suggestedQuality': 'large'
		});
		$scope.player.playVideo();
		
		convertList(angular.element("#"+$scope.vlistElemStr+num));
	};
	
	var convertList = function(elemJlite){
		angular.forEach(elemJlite.parent(), function(value, key){
			 var liElem = angular.element(value);
			 liElem.find(".red-triangle").addClass("display-hide").removeClass("display-show");
			 liElem.find(".list-number").addClass("display-show").removeClass("display-hide");
			 liElem.find(".repeat-right-video-thumb").removeClass("red-border");
		});
		elemJlite.find(".red-triangle").addClass("display-show").removeClass("display-hide");
		elemJlite.find(".list-number").addClass("display-hide").removeClass("display-show");
		elemJlite.find(".repeat-right-video-thumb").addClass("red-border");
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

//context menu directive
searchModule.directive('ngContextMenu', function ($parse) {
    var renderContextMenu = function ($scope, event, options) {
        if (!$) { var $ = angular.element; }
        $(event.target).addClass('context');
        var $contextMenu = $('<div>');
        $contextMenu.addClass('dropdown clearfix');
        var $ul = $('<ul>');
        $ul.addClass('dropdown-menu');
        $ul.attr({ 'role': 'menu' });
        $ul.css({
            display: 'block',
            position: 'absolute',
            left: event.pageX + 'px',
            top: event.pageY + 'px'
        });
        angular.forEach(options, function (item, i) {
            var $li = $('<li>');
            if (item === null) {
                $li.addClass('divider');
            } else {
                $a = $('<a>');
                $a.attr({ tabindex: '-1', href: '#' });
                $a.text(item[0]);
                $li.append($a);
                $li.on('click', function () {
                    $scope.$apply(function() {
                        item[1].call($scope, $scope, event);
                    });
                });
            }
            $ul.append($li);
        });
        $contextMenu.append($ul);
        $contextMenu.css({
            width: '100%',
            height: '100%',
            position: 'absolute',
            top: 0,
            left: 0,
            zIndex: 9999
        });
        $(document).find('body').append($contextMenu);
        $contextMenu.on("click", function (e) {
            $(event.target).removeClass('context');
            $contextMenu.remove();
        }).on('contextmenu', function (event) {
            $(event.target).removeClass('context');
            event.preventDefault();
            $contextMenu.remove();
        });
    };
    return function ($scope, element, attrs) {
        element.on('contextmenu', function (event) {
            $scope.$apply(function () {
                event.preventDefault();
                var options = $scope.$eval(attrs.ngContextMenu);
                if (options instanceof Array) {
                    renderContextMenu($scope, event, options);
                } else {
                    throw '"' + attrs.ngContextMenu + '" not an array';                    
                }
            });
        });
    };
});