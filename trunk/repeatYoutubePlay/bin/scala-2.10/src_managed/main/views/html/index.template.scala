
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(message)/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
<div class="cloud_bar pt_top100 cursor_hand">
	<div class="boxtop"></div>
	<div class="boxmiddle">
		<script type="text/javascript">
			new TWTR.Widget("""),format.raw/*10.20*/("""{"""),format.raw/*10.21*/("""
				version:2,
				type:'profile',
				rpp:11,
				interval:30000,
				width:'auto',
				height:135,
				theme:"""),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""
					shell:"""),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
						background:'none',
						color:'#A7A6AE'
					"""),format.raw/*21.6*/("""}"""),format.raw/*21.7*/(""",
					tweets:"""),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""
						background:'none',
						color:'#A7A6AE',
						links:'#DCDCDE'
					"""),format.raw/*26.6*/("""}"""),format.raw/*26.7*/("""
				"""),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""",
				features:"""),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
					scrollbar:false,
					loop:false,
					live:true,
					hashtags:true,
					timestamp:false,
					avatars:false,
					behavior:'default'
				"""),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/(""").render().setUser('kofwhgh').start();
		</script>
	</div>
	<div class="boxbottom"></div>
</div>
<div class="cloud_bar pt_top350 cursor_hand">
	<div class="boxtop"></div>
	<div class="boxmiddle">
		<script type="text/javascript">
			new TWTR.Widget("""),format.raw/*46.20*/("""{"""),format.raw/*46.21*/("""
				version:2,
				type:'profile',
				rpp:11,
				interval:30000,
				width:'auto',
				height:135,
				theme:"""),format.raw/*53.11*/("""{"""),format.raw/*53.12*/("""
					shell:"""),format.raw/*54.12*/("""{"""),format.raw/*54.13*/("""
						background:'none',
						color:'#A7A6AE'
					"""),format.raw/*57.6*/("""}"""),format.raw/*57.7*/(""",
					tweets:"""),format.raw/*58.13*/("""{"""),format.raw/*58.14*/("""
						background:'none',
						color:'#A7A6AE',
						links:'#DCDCDE'
					"""),format.raw/*62.6*/("""}"""),format.raw/*62.7*/("""
				"""),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""",
				features:"""),format.raw/*64.14*/("""{"""),format.raw/*64.15*/("""
					scrollbar:false,
					loop:false,
					live:true,
					hashtags:true,
					timestamp:false,
					avatars:false,
					behavior:'default'
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""").render().setUser('sejoung').start();
		</script>
	</div>
	<div class="boxbottom"></div>
</div>
<div class="cloud_bar pt_top600 cursor_hand">
	<div class="boxtop"></div>
	<div class="boxmiddle">
		<script type="text/javascript">
			new TWTR.Widget("""),format.raw/*82.20*/("""{"""),format.raw/*82.21*/("""
				version:2,
				type:'profile',
				rpp:11,
				interval:30000,
				width:'auto',
				height:135,
				theme:"""),format.raw/*89.11*/("""{"""),format.raw/*89.12*/("""
					shell:"""),format.raw/*90.12*/("""{"""),format.raw/*90.13*/("""
						background:'none',
						color:'#A7A6AE'
					"""),format.raw/*93.6*/("""}"""),format.raw/*93.7*/(""",
					tweets:"""),format.raw/*94.13*/("""{"""),format.raw/*94.14*/("""
						background:'none',
						color:'#A7A6AE',
						links:'#DCDCDE'
					"""),format.raw/*98.6*/("""}"""),format.raw/*98.7*/("""
				"""),format.raw/*99.5*/("""}"""),format.raw/*99.6*/(""",
				features:"""),format.raw/*100.14*/("""{"""),format.raw/*100.15*/("""
					scrollbar:false,
					loop:false,
					live:true,
					hashtags:true,
					timestamp:false,
					avatars:false,
					behavior:'default'
				"""),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
			"""),format.raw/*109.4*/("""}"""),format.raw/*109.5*/(""").render().setUser('HooNiDaeBBang').start();
		</script>
	</div>
	<div class="boxbottom"></div>
</div>

<div class="mainCenter"> 
	<div id="topPan">
	<div id="ImgPan" class="pt_margin10"><a href="/index.jsp" ><h1>Youtube Repeat</h1></a> </div>
	</div>
	
	<div class="rightBodyPan fixed_img_row" style="float:right; margin:100 auto; width:300px;">
		<ul id="youtubeRightList"></ul>
	</div>  
	
	<div id="bodyPan">
		<p class="toptextpadding"><div id="player"></div></p>
	</div>
	
	<div id="bodyPan">
		<p class="toptextpadding" style="text-align:right">
			<input id="searchName" class="i_text uid" type="text" value="you got it"/>
			<button class="btnSearch1" onclick="clickSearchYoutube()">
				<span class="searchImage"></span>
			</button>
		</p>
	</div>
	
	<div id="bodyMiddlePan">
		<div class="fixed_img_row">
			<ul id="youtubeList">
		    </ul>
		</div>
	</div>
	
	<div id="bodyPan" style="margin-top:10px;text-align:right">
		<a href="#" class="btn2_big" onclick="prevPage();"><span>"""),_display_(Seq[Any](/*145.61*/Messages/*145.69*/.get("btn.prev"))),format.raw/*145.85*/("""</span></a>
		<a href="#" class="btn2_big" onclick="nextPage();"><span>"""),_display_(Seq[Any](/*146.61*/Messages/*146.69*/.get("btn.next"))),format.raw/*146.85*/("""</span></a>
	</div>
	
	<div id="pop_group" class="pop_wrap" style="top:100px;left:20px;width:288px">
	    <div class="pop_content">
	        <form action="" method="post">
	            <h4 id="pop_group_header" class="ly_header">"""),_display_(Seq[Any](/*152.59*/Messages/*152.67*/.get("title.youtube.list"))),format.raw/*152.93*/("""</h4>
	            <fieldset>
	                <legend>"""),_display_(Seq[Any](/*154.27*/Messages/*154.35*/.get("title.youtube.list"))),format.raw/*154.61*/("""</legend>
	                <dl id="group_div_body" class="ly_body">
	                <dt>"""),_display_(Seq[Any](/*156.23*/Messages/*156.31*/.get("title.youtube.list.now"))),format.raw/*156.61*/("""</dt>
	                </dl>
	                <div class="pop_footer">
		                <a id="pop_removeItems" class="btn2_sml"><span>"""),_display_(Seq[Any](/*159.67*/Messages/*159.75*/.get("btn.play.del"))),format.raw/*159.95*/("""</span></a>
		                <a id="pop_autoplay" class="btn2_sml"><span>"""),_display_(Seq[Any](/*160.64*/Messages/*160.72*/.get("btn.play.all"))),format.raw/*160.92*/("""</span></a>
		                <a id="pop_oneplay" class="btn2_sml"><span>"""),_display_(Seq[Any](/*161.63*/Messages/*161.71*/.get("btn.play.one"))),format.raw/*161.91*/("""</span></a>
		                <a id="pop_close" class="btn2_sml"><span>"""),_display_(Seq[Any](/*162.61*/Messages/*162.69*/.get("btn.close"))),format.raw/*162.86*/("""</span></a>
	                </div>
	                <a href="#" onclick="document.getElementById('PLEASE_INSERT_UNIQUE_ID').style.display='none';return false" class="close_layer"><img src="http://static.naver.com/common/btn/btn_close2.gif" alt="레이어닫기" height="14" width="15"></a>
	            </fieldset>
	        </form>
	    </div>
	    <span class="shadow shadow2"></span><span class="shadow shadow3"></span><span class="shadow shadow4"></span>
	</div>
<div id="footermainPan">
  <div id="footerPan">
  	<h2>유튜브 반복재생</h2>
  	<p>환영합니다. 유튜브를 반복 재생해서 들을 수 있으며, 좋아하는 노래를 그룹화 하여 반복 재생을 할 수 있습니다.</p>
  </div>
</div>
""")))})))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 13 20:34:01 KST 2013
                    SOURCE: U:/work/repeatYoutube/app/views/index.scala.html
                    HASH: b9df03a9cc6083d760ae71ab40d5633301bce7e4
                    MATRIX: 723->1|836->18|864->40|900->42|921->55|960->57|1141->210|1170->211|1310->323|1339->324|1379->336|1408->337|1488->390|1516->391|1558->405|1587->406|1690->482|1718->483|1750->488|1778->489|1821->504|1850->505|2023->651|2051->652|2082->656|2110->657|2387->906|2416->907|2556->1019|2585->1020|2625->1032|2654->1033|2734->1086|2762->1087|2804->1101|2833->1102|2936->1178|2964->1179|2996->1184|3024->1185|3067->1200|3096->1201|3269->1347|3297->1348|3328->1352|3356->1353|3633->1602|3662->1603|3802->1715|3831->1716|3871->1728|3900->1729|3980->1782|4008->1783|4050->1797|4079->1798|4182->1874|4210->1875|4242->1880|4270->1881|4314->1896|4344->1897|4518->2043|4547->2044|4579->2048|4608->2049|5639->3043|5657->3051|5696->3067|5805->3139|5823->3147|5862->3163|6129->3393|6147->3401|6196->3427|6289->3483|6307->3491|6356->3517|6483->3607|6501->3615|6554->3645|6728->3782|6746->3790|6789->3810|6901->3885|6919->3893|6962->3913|7073->3987|7091->3995|7134->4015|7243->4087|7261->4095|7301->4112
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|45->17|45->17|46->18|46->18|49->21|49->21|50->22|50->22|54->26|54->26|55->27|55->27|56->28|56->28|64->36|64->36|65->37|65->37|74->46|74->46|81->53|81->53|82->54|82->54|85->57|85->57|86->58|86->58|90->62|90->62|91->63|91->63|92->64|92->64|100->72|100->72|101->73|101->73|110->82|110->82|117->89|117->89|118->90|118->90|121->93|121->93|122->94|122->94|126->98|126->98|127->99|127->99|128->100|128->100|136->108|136->108|137->109|137->109|173->145|173->145|173->145|174->146|174->146|174->146|180->152|180->152|180->152|182->154|182->154|182->154|184->156|184->156|184->156|187->159|187->159|187->159|188->160|188->160|188->160|189->161|189->161|189->161|190->162|190->162|190->162
                    -- GENERATED --
                */
            