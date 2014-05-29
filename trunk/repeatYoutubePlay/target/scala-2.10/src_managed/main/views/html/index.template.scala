
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
<div class="mainCenter">
	<div id="topPan">
	<div id="ImgPan" class="pt_margin10"><a href="/index.jsp" ><h1>Youtube Repeat</h1></a> </div>
	</div>
	
	<div class="rightBodyPan fixed_img_row">
		<ul id="youtubeRightList"></ul>
	</div>  
	
	<div class="leftBodyPan fixed_nonimg_row" data-bind="with: groupListData" style="height:1000px; overflow-y:auto; padding-right:5px;">
		<p class="toptextpadding" style="text-align:right">
			<input data-bind="value: $parent.groupText, returnKey:$root.searchgrouplist"" id="playListSeachTitle" class="i_text uid width200px pb_margin5" type="text" /> 
			<button class="btnSearch1 pb_margin5" data-bind="click: $root.searchgrouplist">
				<span class="searchImage"></span>
			</button>
		</p>
		<ul id="youtubeLeftList" data-bind="foreach: grouplist">
			<li>
			    <a href="#" data-bind="click: $root.findPlayList">
			    	<strong data-bind="text: title">title</strong>
			    </a>
	    		<p>descrpition</p>
			</li>
		</ul>
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
		<a href="#" class="btn2_big" onclick="prevPage();"><span>"""),_display_(Seq[Any](/*53.61*/Messages/*53.69*/.get("btn.prev"))),format.raw/*53.85*/("""</span></a>
		<a href="#" class="btn2_big" onclick="nextPage();"><span>"""),_display_(Seq[Any](/*54.61*/Messages/*54.69*/.get("btn.next"))),format.raw/*54.85*/("""</span></a>
	</div>
	
	<div id="pop_group" class="pop_wrap" style="top:100px;left:20px;width:260px">
	    <div class="pop_content">
	        <form action="" method="post">
	            <h4 id="pop_group_header" class="ly_header">"""),_display_(Seq[Any](/*60.59*/Messages/*60.67*/.get("title.youtube.list"))),format.raw/*60.93*/("""</h4>
	            <fieldset>
	                <legend>"""),_display_(Seq[Any](/*62.27*/Messages/*62.35*/.get("title.youtube.list"))),format.raw/*62.61*/("""</legend>
	                <dl id="group_div_body" class="ly_body">
	                <dt>"""),_display_(Seq[Any](/*64.23*/Messages/*64.31*/.get("title.youtube.list.now"))),format.raw/*64.61*/("""</dt>
	                </dl>
	                <div class="pop_footer">
		                <a id="pop_removeItems" class="btn2_sml"><span>"""),_display_(Seq[Any](/*67.67*/Messages/*67.75*/.get("btn.play.del"))),format.raw/*67.95*/("""</span></a>
		                <a id="pop_autoplay" class="btn2_sml"><span>"""),_display_(Seq[Any](/*68.64*/Messages/*68.72*/.get("btn.play.all"))),format.raw/*68.92*/("""</span></a>
		                <a id="pop_oneplay" class="btn2_sml"><span>"""),_display_(Seq[Any](/*69.63*/Messages/*69.71*/.get("btn.play.one"))),format.raw/*69.91*/("""</span></a>
		                <a id="pop_close" class="btn2_sml"><span>"""),_display_(Seq[Any](/*70.61*/Messages/*70.69*/.get("btn.close"))),format.raw/*70.86*/("""</span></a>
		                <a id="pop_new" class="btn2_sml"><span>"""),_display_(Seq[Any](/*71.59*/Messages/*71.67*/.get("btn.new"))),format.raw/*71.82*/("""</span></a>
		                <a id="pop_save" class="btn2_sml"><span>"""),_display_(Seq[Any](/*72.60*/Messages/*72.68*/.get("btn.save"))),format.raw/*72.84*/("""</span></a>
		                <!-- a id="pop_mp3download" class="btn2_sml"><span>mp3 다운로드</span></a -->
	                </div>
	                <a href="#" onclick="document.getElementById('pop_group').style.display='none';return false" class="close_layer"><img src="http://static.naver.com/common/btn/btn_close2.gif" alt="레이어닫기" height="14" width="15"></a>
	            </fieldset>
	        </form>
	    </div>
	    <span class="shadow shadow2"></span><span class="shadow shadow3"></span><span class="shadow shadow4"></span>
	</div>
	
	<!-- music_count analysis -->
	<!-- <div id="pop_music_count" data-bind="with: musicCountListData" class="pop_wrap" style="top:100px;left:20px;width:500px">
	    <div class="pop_content">
	        <form action="" method="post">
	            <h4 id="pop_group_header" class="ly_header">저장된 곡 중 가장 많이 본 Best 5곡</h4>
	            <fieldset>
	                <legend>가장 많이 들은 최신 5곡</legend>
	                <dl id="group_div_body" class="ly_body" data-bind="foreach: musiccount">
	                
	                <dd class="overflow_ellipsis400" >
	                	<label style="cursor:pointer" data-bind="text: title"></label>
	                	<label style="cursor:pointer" data-bind="text: size"></label>
	                </dd>
	                
	                </dl>
	                <a href="#" onclick="document.getElementById('pop_music_count').style.display='none';return false" class="close_layer"><img src="http://static.naver.com/common/btn/btn_close2.gif" alt="레이어닫기" height="14" width="15"></a>
	            </fieldset>
	        </form>
	    </div>
	    <span class="shadow shadow2"></span><span class="shadow shadow3"></span><span class="shadow shadow4"></span>
	</div>-->
	
	<!-- UI Object -->
	<div id="mw_temp" class="mw">
	    <div class="bg"></div>
	    <div class="fg">
	        <p>
	        	<input id="listTitle" class="i_text uid width350px" type="text" value="타이틀"/>
	        </p>
	        <p>
	        	<input id="listPass" class="i_text uid width350px" type="password" value="패스워드"/>
	        </p>
	        <p style="text-align:right">
	        <button type="button" onclick="newlist();">"""),_display_(Seq[Any](/*115.54*/Messages/*115.62*/.get("btn.save"))),format.raw/*115.78*/("""</button>
	        <button type="button" onclick="document.getElementById('mw_temp').style.display='none'">"""),_display_(Seq[Any](/*116.99*/Messages/*116.107*/.get("btn.close"))),format.raw/*116.124*/("""</button>
	        </p>
	    </div>
	</div>
	<!-- //UI Object -->
	
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
                    DATE: Thu May 29 14:16:43 KST 2014
                    SOURCE: C:/workspace/repeatYoutube/app/views/index.scala.html
                    HASH: 992cb0a60ae5d28788acd20ae40ecfe64e5b7b42
                    MATRIX: 723->1|836->18|864->40|900->42|921->55|960->57|2572->1633|2589->1641|2627->1657|2735->1729|2752->1737|2790->1753|3056->1983|3073->1991|3121->2017|3213->2073|3230->2081|3278->2107|3404->2197|3421->2205|3473->2235|3646->2372|3663->2380|3705->2400|3816->2475|3833->2483|3875->2503|3985->2577|4002->2585|4044->2605|4152->2677|4169->2685|4208->2702|4314->2772|4331->2780|4368->2795|4475->2866|4492->2874|4530->2890|6721->5044|6739->5052|6778->5068|6923->5176|6942->5184|6983->5201
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|81->53|81->53|81->53|82->54|82->54|82->54|88->60|88->60|88->60|90->62|90->62|90->62|92->64|92->64|92->64|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|143->115|143->115|143->115|144->116|144->116|144->116
                    -- GENERATED --
                */
            