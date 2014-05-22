<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!-- Repeat modal left video area -->
<div class="repeat-left-video">
	<div class="repeat-left-video-body">
		<!-- <iframe style="width: 400px; height: 300px;" frameborder="0" id="ytplayer" src="http://www.youtube.com/embed/M7lc1UVf-VE?autoplay=1&origin=http://example.com"></iframe> -->
		<div id="modalPlayer"></div>
	</div>
</div>
<!-- /Repeat modal left video area -->

<div class="repeat-right-video" id="sidebar" role="navigation">
	<div class="repeat-right-video-head">
		<span class="btn-left-area">
			<img class="btn-media-backward btn-opacity-4" src="http://s.ytimg.com/yts/img/pixel-vfl3z5WfW.gif" alt="Backward"/>
			<img class="btn-media-forward btn-opacity-4" src="http://s.ytimg.com/yts/img/pixel-vfl3z5WfW.gif" alt="Forward"/>
		</span>
		<span class="btn-right-area">
			<img class="btn-media-repeat" ng-class="{btnOpacity85: repeat}" ng-click="repeat=!repeat" src="http://s.ytimg.com/yts/img/pixel-vfl3z5WfW.gif" alt="Repeat"/>
			<img class="btn-media-suffle" ng-class="{btnOpacity85: suffle}" ng-click="suffle=!suffle" src="http://s.ytimg.com/yts/img/pixel-vfl3z5WfW.gif" alt="Suffle"/>
		</span>
	</div>
	<ol class="repeat-right-video-body">
		<li class="repeat-right-video-row" ng-mouseover="listOver($event)" ng-mouseleave="listLeave($event)" ng-click="listClick($event,video.YOUTUBEID)" ng-repeat="video in videos">
			<span class="red-triangle display-hide"> ▶ </span>
			<span class="list-number display-show"> {{$index+1}} </span>  
			<a class="repeat-right-video-link" href="#"> 
				<span class="repeat-right-video-thumb">
					<img ng-src="{{video.THUMBURL}}" alt="미리보기 이미지" width="64" />
				</span>
				<div class="repeat-right-video-desc">
					<h4 class="video-title">{{video.TITLE}}</h4>
					<span class="video-author"> 
						설명: <b><span>{{video.DESCRIPTION}}</span></b>
					</span>
				</div>
			</a>
		</li>
	</ol>
</div>