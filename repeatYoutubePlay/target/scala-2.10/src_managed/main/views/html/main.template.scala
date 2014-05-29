
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/style.css"))),format.raw/*10.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/list.css"))),format.raw/*11.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/input.css"))),format.raw/*12.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/look.css"))),format.raw/*13.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/button.css"))),format.raw/*14.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Assets.at("stylesheets/layer.css"))),format.raw/*15.89*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Assets.at("stylesheets/menu.css"))),format.raw/*16.88*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.48*/routes/*17.54*/.Assets.at("stylesheets/popup.css"))),format.raw/*17.89*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*18.54*/routes/*18.60*/.Assets.at("stylesheets/jquery-ui-1.10.2.custom.css"))),format.raw/*18.113*/("""">
        
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/jquery-ui-1.10.2.custom.js"))),format.raw/*21.81*/("""" type="text/javascript"></script>
        <!-- <script src="https://www.youtube.com/iframe_api"></script>-->
        <script src=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Assets.at("javascripts/constants.js"))),format.raw/*23.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Assets.at("javascripts/youtube_repeat.js"))),format.raw/*24.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("javascripts/common_event.js"))),format.raw/*25.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*26.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Assets.at("javascripts/Titillium.font.js"))),format.raw/*27.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Assets.at("javascripts/crossBrowser.js"))),format.raw/*28.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("javascripts/localStorage.js"))),format.raw/*29.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Assets.at("javascripts/cookieStorage.js"))),format.raw/*30.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Assets.at("javascripts/storage.js"))),format.raw/*31.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*32.23*/routes/*32.29*/.Assets.at("javascripts/common_ajax.js"))),format.raw/*32.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*33.23*/routes/*33.29*/.Assets.at("javascripts/knockout-2.2.1.js"))),format.raw/*33.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*34.23*/routes/*34.29*/.Assets.at("javascripts/planetxsdk.js"))),format.raw/*34.68*/("""" type="text/javascript"></script>
        
        <script type="text/javascript" src="http://widgets.twimg.com/j/2/widget.js"></script>
        <script type="text/javascript">
	       
        
	        var _gaq = _gaq || [];
	        _gaq.push(['_setAccount', 'UA-40462744-1']);
	        _gaq.push(['_trackPageview']);

	        (function() """),format.raw/*44.22*/("""{"""),format.raw/*44.23*/("""
	        	var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	        """),format.raw/*48.10*/("""}"""),format.raw/*48.11*/(""")();
	        
        	var playGroupListModel;
			Cufon.replace('h1');
			
			$(document).ready(function()"""),format.raw/*53.32*/("""{"""),format.raw/*53.33*/("""
				searchYoutube(rowCount, startPage);
				
				setKeyDownEvent(13, $("#searchName"), function()"""),format.raw/*56.53*/("""{"""),format.raw/*56.54*/("""
					searchYoutube(rowCount, startPage);
				"""),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""");
				
				$(function() """),format.raw/*60.18*/("""{"""),format.raw/*60.19*/("""
					$('.cloud_bar').css('marginLeft', '-250px');
			
			        $('.cloud_bar').hover(
			            function () """),format.raw/*64.28*/("""{"""),format.raw/*64.29*/("""
			                $(this).stop().animate("""),format.raw/*65.43*/("""{"""),format.raw/*65.44*/("""'marginLeft':'-2px'"""),format.raw/*65.63*/("""}"""),format.raw/*65.64*/(""",500);
			            """),format.raw/*66.16*/("""}"""),format.raw/*66.17*/(""",
			            function () """),format.raw/*67.28*/("""{"""),format.raw/*67.29*/("""
			                $(this).stop().animate("""),format.raw/*68.43*/("""{"""),format.raw/*68.44*/("""'marginLeft':'-250px'"""),format.raw/*68.65*/("""}"""),format.raw/*68.66*/(""",500);
			            """),format.raw/*69.16*/("""}"""),format.raw/*69.17*/("""
			        );
			    """),format.raw/*71.8*/("""}"""),format.raw/*71.9*/(""");
				
				settingGroupYoutube();
//				
				$("#pop_group" ).draggable();
				//$("#pop_music_count" ).draggable();
				
				$("#pop_removeItems").click(function()"""),format.raw/*78.43*/("""{"""),format.raw/*78.44*/("""
					var increaseJ = 0;
					$("#group_div_body").find("input").each(function(i, opts)"""),format.raw/*80.63*/("""{"""),format.raw/*80.64*/("""
						if(opts.checked)"""),format.raw/*81.23*/("""{"""),format.raw/*81.24*/("""
							var num = $(opts).attr("num");
							removeStorage(num-increaseJ);
							increaseJ++;
						"""),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""
					"""),format.raw/*86.6*/("""}"""),format.raw/*86.7*/(""");
					settingGroupYoutube();
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""");
			
				$("#pop_close").click(function()"""),format.raw/*90.37*/("""{"""),format.raw/*90.38*/("""
					$("#pop_group").hide();
				"""),format.raw/*92.5*/("""}"""),format.raw/*92.6*/(""");
				
				/*$("#pop_music_count_close").click(function()"""),format.raw/*94.51*/("""{"""),format.raw/*94.52*/("""
					$("#pop_music_count").hide();
				"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");*/
				
				$("#pop_oneplay").click(function()"""),format.raw/*98.39*/("""{"""),format.raw/*98.40*/("""
					$("#pop_group_header").text('"""),_display_(Seq[Any](/*99.36*/Messages/*99.44*/.get("title.youtube.list.one"))),format.raw/*99.74*/("""');
					playType = PLAYTYPE_ONE;
				"""),format.raw/*101.5*/("""}"""),format.raw/*101.6*/(""");
				
				$("#pop_autoplay").click(function()"""),format.raw/*103.40*/("""{"""),format.raw/*103.41*/("""
					$("#pop_group_header").text('"""),_display_(Seq[Any](/*104.36*/Messages/*104.44*/.get("title.youtube.list.all"))),format.raw/*104.74*/("""');
					playType = PLAYTYPE_AUTO;
				"""),format.raw/*106.5*/("""}"""),format.raw/*106.6*/(""");
				
				$("#pop_new").click(function()"""),format.raw/*108.35*/("""{"""),format.raw/*108.36*/("""
					$("#mw_temp").show();
				"""),format.raw/*110.5*/("""}"""),format.raw/*110.6*/(""");
				
				$("#pop_save").click(function()"""),format.raw/*112.36*/("""{"""),format.raw/*112.37*/("""
					var password = prompt("패스워드를 입력해 주십시요.","xxxxxx");
					if(password != null)"""),format.raw/*114.26*/("""{"""),format.raw/*114.27*/("""
						var params = getAllPlayListParams();
						params["id"] = playGroupListModel.selGroupId;
						params["password"] = password;
						call_ajax_json('"""),_display_(Seq[Any](/*118.24*/routes/*118.30*/.Repeat.save())),format.raw/*118.44*/("""', params, function(data)"""),format.raw/*118.69*/("""{"""),format.raw/*118.70*/("""
							alert("성공 했습니다.");
							playGroupListModel.findGroupList();
						"""),format.raw/*121.7*/("""}"""),format.raw/*121.8*/(""");
					"""),format.raw/*122.6*/("""}"""),format.raw/*122.7*/("""
				"""),format.raw/*123.5*/("""}"""),format.raw/*123.6*/(""");				
				
				$("#pop_mp3download").click(function()"""),format.raw/*125.43*/("""{"""),format.raw/*125.44*/("""
					$(this).find("span").text("다운로드중...");
					mp3DownFunc();
					$(this).prop("onclick", null);
				"""),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""");
				
				var mp3DownFunc = function()"""),format.raw/*131.33*/("""{"""),format.raw/*131.34*/("""
					var downIds = "";
					$("input:checkbox[name='rejection']:checked").each(function()"""),format.raw/*133.67*/("""{"""),format.raw/*133.68*/("""
						var id = $(this).val();
						var name = $(this).attr("kname");
						
						downIds += id+"\u0002"+name+"\u0001";
					"""),format.raw/*138.6*/("""}"""),format.raw/*138.7*/(""");
					
					$.ajax("""),format.raw/*140.13*/("""{"""),format.raw/*140.14*/("""
				        type : 'POST',
				        url : '/repeat/download',
				        data : """),format.raw/*143.20*/("""{"""),format.raw/*143.21*/("""dwcode:downIds"""),format.raw/*143.35*/("""}"""),format.raw/*143.36*/(""",
				        dataType : "json",
				        success : function(data) """),format.raw/*145.38*/("""{"""),format.raw/*145.39*/("""
				        	if(data != null)"""),format.raw/*146.30*/("""{"""),format.raw/*146.31*/("""
				    			$("#dwcode").val(data.keyName);
				    			$("#downloadFrm").submit();
				    			
				    			$("#pop_mp3download").click(function()"""),format.raw/*150.50*/("""{"""),format.raw/*150.51*/("""
									$(this).find("span").text("다운로드중...");
									mp3DownFunc();
									$(this).prop("onclick", null);
								"""),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""");
				    		"""),format.raw/*155.11*/("""}"""),format.raw/*155.12*/("""
				        """),format.raw/*156.13*/("""}"""),format.raw/*156.14*/("""
				    """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/(""");
				"""),format.raw/*158.5*/("""}"""),format.raw/*158.6*/("""
				
				var _playGroupListModel = function() """),format.raw/*160.42*/("""{"""),format.raw/*160.43*/("""
				    var self = this;
				    
				    self.groupListData = ko.observable();
				    self.groupText = ko.observable("");
				    self.selGroupId = "";
				    
				    self.musicCountListData = ko.observable();
				    
				    self.findGroupList = function() """),format.raw/*169.41*/("""{"""),format.raw/*169.42*/(""" 
				        call_ajax_json('"""),_display_(Seq[Any](/*170.30*/routes/*170.36*/.Repeat.grouplist())),format.raw/*170.55*/("""', """),format.raw/*170.58*/("""{"""),format.raw/*170.59*/("""}"""),format.raw/*170.60*/(""", self.groupListData);
				    """),format.raw/*171.9*/("""}"""),format.raw/*171.10*/(""";
				    
				    self.findMusicCountList = function() """),format.raw/*173.46*/("""{"""),format.raw/*173.47*/(""" 
				        call_ajax_json('"""),_display_(Seq[Any](/*174.30*/routes/*174.36*/.Analysis.viewmusiccount())),format.raw/*174.62*/("""', """),format.raw/*174.65*/("""{"""),format.raw/*174.66*/("""}"""),format.raw/*174.67*/(""", self.musicCountListData);
				    """),format.raw/*175.9*/("""}"""),format.raw/*175.10*/(""";
				    
				    self.searchgrouplist = function() """),format.raw/*177.43*/("""{"""),format.raw/*177.44*/(""" 
				        call_ajax_json('"""),_display_(Seq[Any](/*178.30*/routes/*178.36*/.Repeat.searchgrouplist())),format.raw/*178.61*/("""', """),format.raw/*178.64*/("""{"""),format.raw/*178.65*/("""text: self.groupText"""),format.raw/*178.85*/("""}"""),format.raw/*178.86*/(""", self.groupListData);
				    """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/(""";
				    
				    self.findPlayList = function(group) """),format.raw/*181.45*/("""{"""),format.raw/*181.46*/(""" 
				    	self.selGroupId = group.id;
				    	call_ajax_json(""""),_display_(Seq[Any](/*183.27*/routes/*183.33*/.Repeat.playlist())),format.raw/*183.51*/("""", """),format.raw/*183.54*/("""{"""),format.raw/*183.55*/(""" groupId: group.id """),format.raw/*183.74*/("""}"""),format.raw/*183.75*/(""", function(data)"""),format.raw/*183.91*/("""{"""),format.raw/*183.92*/("""
				    		if(data.playlist != null)"""),format.raw/*184.36*/("""{"""),format.raw/*184.37*/("""
				    			settingPlayList(data.playlist);
				    		"""),format.raw/*186.11*/("""}"""),format.raw/*186.12*/("""
				    	"""),format.raw/*187.10*/("""}"""),format.raw/*187.11*/(""");
				    """),format.raw/*188.9*/("""}"""),format.raw/*188.10*/(""";
				    self.findGroupList();
				    self.findMusicCountList();
				"""),format.raw/*191.5*/("""}"""),format.raw/*191.6*/(""";
				playGroupListModel = new _playGroupListModel();
				ko.applyBindings(playGroupListModel);
				
				ko.bindingHandlers.returnKey = """),format.raw/*195.36*/("""{"""),format.raw/*195.37*/("""
					init: function(element, valueAccessor, allBindingsAccessor, viewModel) """),format.raw/*196.77*/("""{"""),format.raw/*196.78*/("""
						ko.utils.registerEventHandler(element, 'keydown', function(evt) """),format.raw/*197.71*/("""{"""),format.raw/*197.72*/("""
							if (evt.keyCode === 13) """),format.raw/*198.32*/("""{"""),format.raw/*198.33*/("""
								evt.preventDefault();
								evt.target.blur();
								valueAccessor().call(viewModel);
						 	"""),format.raw/*202.9*/("""}"""),format.raw/*202.10*/("""
						"""),format.raw/*203.7*/("""}"""),format.raw/*203.8*/(""");
					"""),format.raw/*204.6*/("""}"""),format.raw/*204.7*/("""
				 """),format.raw/*205.6*/("""}"""),format.raw/*205.7*/(""";
			"""),format.raw/*206.4*/("""}"""),format.raw/*206.5*/(""");
			
			function nextPage()"""),format.raw/*208.23*/("""{"""),format.raw/*208.24*/("""
				startPage += 10;
				searchYoutube(rowCount, startPage);
			"""),format.raw/*211.4*/("""}"""),format.raw/*211.5*/("""
			
			function prevPage()"""),format.raw/*213.23*/("""{"""),format.raw/*213.24*/("""
				if(startPage - 10 > 0)"""),format.raw/*214.27*/("""{"""),format.raw/*214.28*/("""
					startPage -= 10;
					searchYoutube(rowCount, startPage);
				"""),format.raw/*217.5*/("""}"""),format.raw/*217.6*/("""else"""),format.raw/*217.10*/("""{"""),format.raw/*217.11*/("""
					alert('"""),_display_(Seq[Any](/*218.14*/Messages/*218.22*/.get("alert.message.firstpage"))),format.raw/*218.53*/("""');
				"""),format.raw/*219.5*/("""}"""),format.raw/*219.6*/("""
			"""),format.raw/*220.4*/("""}"""),format.raw/*220.5*/("""
			
			function newlist()"""),format.raw/*222.22*/("""{"""),format.raw/*222.23*/("""
				var title = $("#listTitle").val();
				var password = $("#listPass").val();
				if(title != null)"""),format.raw/*225.22*/("""{"""),format.raw/*225.23*/("""
					var params = getAllPlayListParams();
					params["title"] = title;
					params["password"] = password;
					call_ajax_json('"""),_display_(Seq[Any](/*229.23*/routes/*229.29*/.Repeat.newlist())),format.raw/*229.46*/("""', params, function(data)"""),format.raw/*229.71*/("""{"""),format.raw/*229.72*/("""
						alert("성공 했습니다.");
						playGroupListModel.findGroupList();
						$("#mw_temp").hide();
					"""),format.raw/*233.6*/("""}"""),format.raw/*233.7*/(""");	
				"""),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""else"""),format.raw/*234.10*/("""{"""),format.raw/*234.11*/("""
					alert("title을 입력 하지 않으 셨습니다.");
				"""),format.raw/*236.5*/("""}"""),format.raw/*236.6*/("""
			"""),format.raw/*237.4*/("""}"""),format.raw/*237.5*/("""
			
		</script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*240.59*/routes/*240.65*/.Assets.at("images/favicon.png"))),format.raw/*240.97*/("""">
    </head>
    <body>
   <form id="downloadFrm" name="downloadFrm" action=""""),_display_(Seq[Any](/*243.55*/routes/*243.61*/.Repeat.fileDownLoad())),format.raw/*243.83*/("""" method="post">
        <input type="hidden" id="dwcode" name="dwcode" value="" />
	</form>
    
        """),_display_(Seq[Any](/*247.10*/content)),format.raw/*247.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 11:26:55 KST 2014
                    SOURCE: C:/workspace/repeatYoutube/app/views/main.scala.html
                    HASH: b288c3df570d02b64e2ea0cdda990e6cc6f50bc9
                    MATRIX: 727->1|853->31|881->53|1117->254|1143->259|1241->321|1256->327|1313->362|1405->418|1420->424|1476->458|1568->514|1583->520|1640->555|1732->611|1747->617|1803->651|1895->707|1910->713|1968->749|2054->799|2069->805|2126->840|2212->890|2227->896|2283->930|2369->980|2384->986|2441->1021|2533->1077|2548->1083|2624->1136|2694->1170|2709->1176|2776->1221|2869->1278|2884->1284|2958->1336|3126->1468|3141->1474|3201->1512|3294->1569|3309->1575|3374->1618|3467->1675|3482->1681|3545->1722|3638->1779|3653->1785|3713->1823|3806->1880|3821->1886|3886->1929|3979->1986|3994->1992|4057->2033|4150->2090|4165->2096|4228->2137|4321->2194|4336->2200|4400->2242|4493->2299|4508->2305|4566->2341|4659->2398|4674->2404|4736->2444|4829->2501|4844->2507|4909->2550|5002->2607|5017->2613|5078->2652|5450->2996|5479->2997|5842->3332|5871->3333|6006->3440|6035->3441|6161->3539|6190->3540|6263->3586|6291->3587|6344->3612|6373->3613|6517->3729|6546->3730|6617->3773|6646->3774|6693->3793|6722->3794|6772->3816|6801->3817|6858->3846|6887->3847|6958->3890|6987->3891|7036->3912|7065->3913|7115->3935|7144->3936|7193->3958|7221->3959|7414->4124|7443->4125|7558->4212|7587->4213|7638->4236|7667->4237|7796->4339|7824->4340|7857->4346|7885->4347|7947->4382|7975->4383|8046->4426|8075->4427|8136->4461|8164->4462|8250->4520|8279->4521|8346->4561|8374->4562|8450->4610|8479->4611|8551->4647|8568->4655|8620->4685|8686->4723|8715->4724|8791->4771|8821->4772|8894->4808|8912->4816|8965->4846|9032->4885|9061->4886|9132->4928|9162->4929|9222->4961|9251->4962|9323->5005|9353->5006|9464->5088|9494->5089|9687->5245|9703->5251|9740->5265|9794->5290|9824->5291|9928->5367|9957->5368|9993->5376|10022->5377|10055->5382|10084->5383|10167->5437|10197->5438|10330->5543|10359->5544|10428->5584|10458->5585|10577->5675|10607->5676|10762->5803|10791->5804|10841->5825|10871->5826|10985->5911|11015->5912|11058->5926|11088->5927|11187->5997|11217->5998|11276->6028|11306->6029|11479->6173|11509->6174|11658->6295|11688->6296|11730->6309|11760->6310|11802->6323|11832->6324|11869->6333|11899->6334|11934->6341|11963->6342|12039->6389|12069->6390|12362->6654|12392->6655|12460->6686|12476->6692|12518->6711|12550->6714|12580->6715|12610->6716|12669->6747|12699->6748|12784->6804|12814->6805|12882->6836|12898->6842|12947->6868|12979->6871|13009->6872|13039->6873|13103->6909|13133->6910|13215->6963|13245->6964|13313->6995|13329->7001|13377->7026|13409->7029|13439->7030|13488->7050|13518->7051|13577->7082|13607->7083|13691->7138|13721->7139|13823->7204|13839->7210|13880->7228|13912->7231|13942->7232|13990->7251|14020->7252|14065->7268|14095->7269|14160->7305|14190->7306|14273->7360|14303->7361|14342->7371|14372->7372|14411->7383|14441->7384|14540->7455|14569->7456|14734->7592|14764->7593|14870->7670|14900->7671|15000->7742|15030->7743|15091->7775|15121->7776|15256->7883|15286->7884|15321->7891|15350->7892|15386->7900|15415->7901|15449->7907|15478->7908|15511->7913|15540->7914|15598->7943|15628->7944|15721->8009|15750->8010|15806->8037|15836->8038|15892->8065|15922->8066|16018->8134|16047->8135|16080->8139|16110->8140|16161->8154|16179->8162|16233->8193|16269->8201|16298->8202|16330->8206|16359->8207|16414->8233|16444->8234|16575->8336|16605->8337|16773->8468|16789->8474|16829->8491|16883->8516|16913->8517|17042->8618|17071->8619|17107->8627|17136->8628|17169->8632|17199->8633|17269->8675|17298->8676|17330->8680|17359->8681|17471->8756|17487->8762|17542->8794|17659->8874|17675->8880|17720->8902|17864->9009|17894->9016
                    LINES: 26->1|30->1|32->4|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|72->44|72->44|76->48|76->48|81->53|81->53|84->56|84->56|86->58|86->58|88->60|88->60|92->64|92->64|93->65|93->65|93->65|93->65|94->66|94->66|95->67|95->67|96->68|96->68|96->68|96->68|97->69|97->69|99->71|99->71|106->78|106->78|108->80|108->80|109->81|109->81|113->85|113->85|114->86|114->86|116->88|116->88|118->90|118->90|120->92|120->92|122->94|122->94|124->96|124->96|126->98|126->98|127->99|127->99|127->99|129->101|129->101|131->103|131->103|132->104|132->104|132->104|134->106|134->106|136->108|136->108|138->110|138->110|140->112|140->112|142->114|142->114|146->118|146->118|146->118|146->118|146->118|149->121|149->121|150->122|150->122|151->123|151->123|153->125|153->125|157->129|157->129|159->131|159->131|161->133|161->133|166->138|166->138|168->140|168->140|171->143|171->143|171->143|171->143|173->145|173->145|174->146|174->146|178->150|178->150|182->154|182->154|183->155|183->155|184->156|184->156|185->157|185->157|186->158|186->158|188->160|188->160|197->169|197->169|198->170|198->170|198->170|198->170|198->170|198->170|199->171|199->171|201->173|201->173|202->174|202->174|202->174|202->174|202->174|202->174|203->175|203->175|205->177|205->177|206->178|206->178|206->178|206->178|206->178|206->178|206->178|207->179|207->179|209->181|209->181|211->183|211->183|211->183|211->183|211->183|211->183|211->183|211->183|211->183|212->184|212->184|214->186|214->186|215->187|215->187|216->188|216->188|219->191|219->191|223->195|223->195|224->196|224->196|225->197|225->197|226->198|226->198|230->202|230->202|231->203|231->203|232->204|232->204|233->205|233->205|234->206|234->206|236->208|236->208|239->211|239->211|241->213|241->213|242->214|242->214|245->217|245->217|245->217|245->217|246->218|246->218|246->218|247->219|247->219|248->220|248->220|250->222|250->222|253->225|253->225|257->229|257->229|257->229|257->229|257->229|261->233|261->233|262->234|262->234|262->234|262->234|264->236|264->236|265->237|265->237|268->240|268->240|268->240|271->243|271->243|271->243|275->247|275->247
                    -- GENERATED --
                */
            