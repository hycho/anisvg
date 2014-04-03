<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Friends Job(Global)</title>
<link rel="stylesheet" href="<c:url value='/static/css/main.css'/>" type="text/css" />
<link rel="stylesheet" href="<c:url value='/static/css/mediaqueries.css'/>" type="text/css" />
<link rel="stylesheet" href="<c:url value='/static/css/dcmegamenu.css'/>" type="text/css" />
<link rel="stylesheet" href="<c:url value='/static/css/skins/black.css'/>" type="text/css" />

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.min.js"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery-ui.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery-mobilemenu.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/custom.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery.hoverIntent.minified.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery.dcmegamenu.1.3.3.js'/>"></script>

<script type="text/javascript">
jQuery(document).ready(function($){
	$('img').removeAttr('width height'); 
	
	$('#mega-menu-2').dcMegaMenu({
		rowItems: '4',
		speed: 'fast',
		effect: 'fade',
		event: 'click'
	});
});
</script>
</head>
<body style="background-color:#FFFFFF"> 
<div class="row0" id="global_top">
	<header id="gheader" class="full_width clear">
	    <hgroup>
			<span class="icon-group icon-large"></span>
			<span>Friend Job(Global)</span>
	    </hgroup>
	    <div id="header-contact">
	      <ul class="list none">
	        <li><a href="#">로그인</a></li>
	        <li><a href="#">회원가입</a></li>
	        <li><a href="#">서비스안내</a></li>
	        <li><a href="#">고객센터</a></li>
	        <li><a href="#">이벤트</a></li>
	      </ul>
	    </div>
	</header>
</div>
<div class="wrapper row1">
  <header id="header" class="full_width clear">
    <hgroup>
      <h1><a href="<c:url value='/'/>">Friends Job(Global)</a></h1>
      <h2>프랜드 잡(글로벌)에 오신것을 환영합니다.</h2>
    </hgroup>
    <div id="header-contact">
      <ul class="list none">
      	<li><input type="text" value="검색하세요." size="30" class="search_input1"/><a href="#" class="button small gradient white" style="margin-left:5px;">검색</a></li>
        <li><span class="icon-envelope"></span> <a href="#">kofwhgh@gmail.com</a></li>
        <li><span class="icon-phone"></span> 010-7345-6059</li>
      </ul>
    </div>
  </header>
</div>
<!-- ################################################################################################ -->
<div class="black" >
<ul id="mega-menu-2" class="mega-menu" style="margin: 0 auto; max-width: 1200px;">
	<li><a href="<c:url value='/'/>">채용홈</a></li>
	<li><a href="test.html">업종별</a>
		<ul>
			<li><a href="#">경영∙사무</a>
				<ul>
					<li><a href="#">기획∙전략∙경영</a></li>
					<li><a href="#">인사∙노무∙교육</a></li>
					<li><a href="#">재무∙세무∙IR</a></li>
					<li><a href="#">사무보조∙문서작성</a></li>
					<li><a href="#">사무∙총무∙법무</a></li>
					<li><a href="#">경리∙회계∙결산</a></li>
					<li><a href="#">비서∙인포메이션</a></li>
				</ul>
			</li>
			<li><a href="#">마케팅∙무역∙유통</a>	
			    <ul>
					<li><a href="#">마케팅∙광고</a></li>
					<li><a href="#">홍보∙PR</a></li>
					<li><a href="#">구매∙자재</a></li>
					<li><a href="#">배송∙운전∙택배</a></li>
					<li><a href="#">상품기획∙MD</a></li>
					<li><a href="#">무역∙해외영업</a></li>
					<li><a href="#">유통∙물류∙재고</a></li>
				</ul>
			</li>
			<li><a href="#">영업∙고객상담</a>
			    <ul>
					<li><a href="#">제품∙서비스영업</a></li>
					<li><a href="#">기술영업</a></li>
					<li><a href="#">법인영업</a></li>
					<li><a href="#">채권∙심사</a></li>
					<li><a href="#">부동산∙창업</a></li>
					<li><a href="#">단순홍보∙회원관리</a></li>
					<li><a href="#">아웃바운드TM</a></li>
					<!-- <li><a href="#">금융∙보험영업</a></li>
					<li><a href="#">광고영업</a></li>
					<li><a href="#">영업관리∙지원</a></li>
					<li><a href="#">판매∙캐셔∙매장관리</a></li>
					<li><a href="#">이벤트∙웨딩∙나레이터</a></li>
					<li><a href="#">교육상담∙학원관리</a></li>
					<li><a href="#">고객센터∙인바운드∙CS</a></li> -->
				</ul>
			</li>
			<li><a href="#">IT∙인터넷</a>
			    <ul>
					<li><a href="#">웹기획∙웹마케팅∙PM</a></li>
					<li><a href="#">웹프로그래머</a></li>
					<li><a href="#">시스템프로그래머</a></li>
					<li><a href="#">네트워크∙서버∙보안∙DBA</a></li>
					<li><a href="#">HTML∙웹표준∙컨텐츠관리</a></li>
					<li><a href="#">QA∙테스터∙검증</a></li>
					<li><a href="#">웹디자인</a></li>
					<!-- <li><a href="#">응용프로그래머</a></li>
					<li><a href="#">SE∙시스템분석∙설계</a></li>
					<li><a href="#">IT∙디자인∙컴퓨터강사</a></li>
					<li><a href="#">웹사이트운영</a></li> -->
				</ul>
			</li>
			<li><a href="#">연구개발∙설계</a>
			  <ul>
				<li><a href="#">자동차∙조선∙기계</a></li>
				<li><a href="#">화악∙에너지∙환경 식품</a></li>
				<li><a href="#">기계설계∙CAD∙CAM</a></li>
				<li><a href="#">통신기술∙네트워크구축</a></li>
				<li><a href="#">반도체∙디스플레이</a></li>
				<li><a href="#">전기∙전자∙제어</a></li>
				<li><a href="#">건설∙설계∙인테리어</a></li>
			  </ul>
			</li>
			<li><a href="#">생산∙제조</a>
			  <ul>
				<li><a href="#">생산∙제조∙설비∙조립</a></li>
				<li><a href="#">생산관리∙공정관리∙품질관리</a></li>
				<li><a href="#">설치∙정비∙A/S</a></li>
				<li><a href="#">포장∙가공∙검사</a></li>
				<li><a href="#">시공∙현장∙공무</a></li>
				<li><a href="#">시설∙빌딩∙안전</a></li>
			  </ul>
			</li>
			<li><a href="#">전문∙특수직</a>
			  <ul>
				<li><a href="#">경여분석∙컨설턴트</a></li>
				<li><a href="#">회계∙세무</a></li>
				<li><a href="#">외국어∙번역∙통역</a></li>
				<li><a href="#">학습지∙방문교사</a></li>
				<li><a href="#">뷰티미용∙애완∙스포츠</a></li>
				<li><a href="#">보안∙경비∙경호</a></li>
			  </ul>
			</li>
			<li><a href="#">디자인</a>
			  <ul>
				<li><a href="#">그래픽디자인∙CG</a></li>
				<li><a href="#">제품∙산업디자인</a></li>
				<li><a href="#">건축∙인테리어디자인</a></li>
				<li><a href="#">캐릭터∙에니메이션</a></li>
				<li><a href="#">출판∙편집디자인</a></li>
				<li><a href="#">광고∙시각디자인</a></li>
			  </ul>
			</li>
		</ul>
	</li>
	<li><a href="#">지역별</a>
		<ul>
			<li style="width:60px;">
			<ul>
				<li><a href="#" style="width:40px;">서울</a></li>
				<li><a href="#" style="width:40px;">경기</a></li>
				<li><a href="#" style="width:40px;">인천</a></li>
				<li><a href="#" style="width:40px;">부산</a></li>
				<li><a href="#" style="width:40px;">대구</a></li>
				<li><a href="#" style="width:40px;">대전</a></li>
				<li><a href="#" style="width:40px;">광주</a></li>
				<li><a href="#" style="width:40px;">울산</a></li>
				<li><a href="#" style="width:40px;">세종</a></li>
			</ul>
			</li>
			<li style="width:60px;">
				<ul>
					<li><a href="#" style="width:40px;">강원</a></li>
					<li><a href="#" style="width:40px;">경남</a></li>
					<li><a href="#" style="width:40px;">경북</a></li>
					<li><a href="#" style="width:40px;">전남</a></li>
					<li><a href="#" style="width:40px;">전북</a></li>
					<li><a href="#" style="width:40px;">충남</a></li>
					<li><a href="#" style="width:40px;">충북</a></li>
					<li><a href="#" style="width:40px;">제주</a></li>
					<li><a href="#" style="width:40px;">전국</a></li>
				</ul>
			</li>
		</ul>
	</li>
	<li><a href="#">분류별</a>
		<ul style="width:220px;">
			<li style="width:100px;">
				<ul>
					<li><a href="#" style="width:80px;">직급∙경력별</a></li>
					<li><a href="#" style="width:80px;">인턴직</a></li>
					<li><a href="#" style="width:80px;">우대조건별</a></li>
					<li><a href="#" style="width:80px;">복리후생별</a></li>
					<li><a href="#" style="width:80px;">석박사급</a></li>
					<li><a href="#" style="width:80px;">전공계열별</a></li>
				</ul>
			</li>
			<li style="width:100px;">
				<ul>
					<li><a href="#" style="width:80px;">외국어별</a></li>
					<li><a href="#" style="width:80px;">자격증별</a></li>
					<li><a href="#" style="width:80px;">병역특례</a></li>
					<li><a href="#" style="width:80px;">생생인담톡</a></li>
					<li><a href="#" style="width:80px;">포토 채용정보</a></li>
					<li><a href="#" style="width:80px;">동영상 채용관</a></li>
				</ul>
			</li>
		</ul>
	</li>
	<li><a href="#">기업별</a>
		<ul style="width:260px;">
			<li style="width:120px;">
				<ul>
					<li><a href="#" style="width:100px;">대기업</a></li>
					<li><a href="#" style="width:100px;">주권상장기업</a></li>
					<li><a href="#" style="width:100px;">코스닥 상장기업</a></li>
					<li><a href="#" style="width:100px;">밴처기업</a></li>
					<li><a href="#" style="width:100px;">강소기업</a></li>
					<li><a href="#" style="width:100px;">우수중소기업</a></li>
				</ul>
			</li>
			<li style="width:120px;">
				<ul>
					<li><a href="#" style="width:100px;">외국계기업</a></li>
					<li><a href="#" style="width:100px;">공공기관∙공사협회</a></li>
					<li><a href="#" style="width:100px;">소속협회별</a></li>
					<li><a href="#" style="width:100px;">공무원∙공직</a></li>
					<li><a href="#" style="width:100px;">블루칩채용관</a></li>
				</ul>
			</li>
		</ul>
	</li>
	<!-- <li><a href="#">전체보기</a>
		<ul>
			<li><a href="#">개발중 입니다.</a>
			<ul>
				<li><a href="#">개발 중 입니다.</a></li>
			</ul>
		</li>
	</li>-->
</ul>
</div>

<!-- content -->
<div class="wrapper row3">
  <div id="container">
    <!-- ################################################################################################ -->
    <div id="homepage" class="clear">
      <!-- ################################################################################################ -->
      <section class="clear">
      	<p class="title_n">Grand master 채용정보</p>
        <article class="one_third1 first" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1 first" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1 first" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
        <article class="one_third1" style="border: 1px solid #E5E4E3; cursor:pointer; padding:5px 5px 5px 5px">
          <p style="text-align: center;">
          	<img style="text-align:center" src="http://ads.jobkorea.co.kr/RealMedia/ads/Creatives/OasDefault/131230_jk_kotra_mm/kotra131230.gif" alt="">
          </p>
        </article>
      </section>
      <div class="divider2"></div>
      <section class="last">
        <p class="title_n">Grand 채용정보</p>
        <ul class="nospace clear">
          <li class="one_sixth first">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
        <ul class="nospace clear">
          <li class="one_sixth first">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
        <ul class="nospace clear">
          <li class="one_sixth first">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_sixth">
            <figure class="team-member"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
      </section>
    </div>
    <div class="divider2"></div>
    <section class="last">
        <p class="title_n">Power 채용정보</p>
        <ul class="nospace clear rectpadding_first_5">
          <li class="one_100 first">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
        <ul class="nospace clear rectpadding_normal_5">
          <li class="one_100 first">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption style="background-color:#f1fde3;">
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
        <ul class="nospace clear rectpadding_last_5">
          <li class="one_100 first">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption style="background-color:#f1fde3;">
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
          <li class="one_100">
            <figure class="team-member1"><img src="/static/images/demo/team-member.gif" alt="">
              <figcaption>
                <p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
              </figcaption>
            </figure>
          </li>
        </ul>
      </section>
      <div class="divider2"></div>
      <section>
      <ul class="nospace clear">
		<li class="two_quarter first">
			<p class="title_n">Soft 채용정보</p>
			<ul class="list underline">
			  <li>
			  	<p class="team-name">Name Goes Here</p>
                <p class="team-title">Job Title Here</p>
				<p style="float:right;margin-top:-30px;">test</p>                
              </li>
			  <li>Quisque faucibus cursus</li>
			  <li>Integer eget nisi dolor</li>
			  <li>Sed consectetur neque</li>
			</ul>
			<code class="code">&lt;ul class="list underline"&gt;</code>
		</li>      
		<li class="two_quarter">
			<p class="title_n">Soft 채용정보</p>
			<ul class="list underline">
			  <li>Nullam congue odio</li>
			  <li>Quisque faucibus cursus</li>
			  <li>Integer eget nisi dolor</li>
			  <li>Sed consectetur neque</li>
			</ul>
			<code class="code">&lt;ul class="list underline"&gt;</code>
		</li>
      </ul>
      </section>
    </div>
    
    <!-- ################################################################################################ -->
    <div class="clear"></div>
  </div>
<!-- Footer -->
<div class="wrapper row2">
  <div id="footer" class="clear">
    <div class="one_quarter first">
      <h2 class="footer_title">Footer Navigation</h2>
      <nav class="footer_nav">
        <ul class="nospace">
          <li><a href="#">Home Page</a></li>
          <li><a href="#">Our Services</a></li>
          <li><a href="#">Meet the Team</a></li>
          <li><a href="#">Blog</a></li>
          <li><a href="#">Contact Us</a></li>
          <li><a href="#">Gallery</a></li>
          <li><a href="#">Portfolio</a></li>
          <li><a href="#">Online Shop</a></li>
        </ul>
      </nav>
    </div>
    <div class="one_quarter">
      <h2 class="footer_title">Latest Gallery</h2>
      <ul id="ft_gallery" class="nospace spacing clear">
        <li class="one_third first"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third first"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third first"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/static/images/demo/80x80.gif" alt=""></a></li>
      </ul>
    </div>
    <div class="one_quarter">
      <h2 class="footer_title">From Twitter</h2>
      <div class="tweet-container">
        <ul class="list none">
          <li><strong>@<a href="#">name</a></strong> <span class="tweet_text">RT <span class="at">@</span><a href="#">name</a> Donec suscipit vehicula turpis sed lutpat Quisque vitae quam neque.</span> <span class="tweet_time"><a href="#">about 9 hours ago</a></span></li>
          <li><strong>@<a href="#">name</a></strong> <span class="tweet_text">RT <span class="at">@</span><a href="#">name</a> Donec suscipit vehicula turpis sed lutpat Quisque vitae quam neque.</span> <span class="tweet_time"><a href="#">about 9 hours ago</a></span></li>
          <li><strong>@<a href="#">name</a></strong> <span class="tweet_text">RT <span class="at">@</span><a href="#">name</a> Donec suscipit vehicula turpis sed lutpat Quisque vitae quam neque.</span> <span class="tweet_time"><a href="#">about 9 hours ago</a></span></li>
          <li><strong>@<a href="#">name</a></strong> <span class="tweet_text">RT <span class="at">@</span><a href="#">name</a> Donec suscipit vehicula turpis sed lutpat Quisque vitae quam neque.</span> <span class="tweet_time"><a href="#">about 9 hours ago</a></span></li>
        </ul>
      </div>
    </div>
    <div class="one_quarter">
      <h2 class="footer_title">Contact Us</h2>
      <form class="rnd5" action="#" method="post">
        <div class="form-input clear">
          <label for="ft_author">Name <span class="required">*</span><br>
            <input type="text" name="ft_author" id="ft_author" value="" size="22">
          </label>
          <label for="ft_email">Email <span class="required">*</span><br>
            <input type="text" name="ft_email" id="ft_email" value="" size="22">
          </label>
        </div>
        <div class="form-message">
          <textarea name="ft_message" id="ft_message" cols="25" rows="10"></textarea>
        </div>
        <p>
          <input type="submit" value="Submit" class="button small orange">
          &nbsp;
          <input type="reset" value="Reset" class="button small grey">
        </p>
      </form>
    </div>
  </div>
</div>
<div class="wrapper row4">
  <div id="copyright" class="clear">
    <p class="fl_left">Copyright &copy; 2013 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
  </div>
</div>
</body>
</html>
