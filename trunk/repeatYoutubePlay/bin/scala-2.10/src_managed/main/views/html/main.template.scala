
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
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/style.css"))),format.raw/*8.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/list.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/input.css"))),format.raw/*10.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/look.css"))),format.raw/*11.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/button.css"))),format.raw/*12.96*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.48*/routes/*13.54*/.Assets.at("stylesheets/layer.css"))),format.raw/*13.89*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.48*/routes/*14.54*/.Assets.at("stylesheets/menu.css"))),format.raw/*14.88*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Assets.at("stylesheets/popup.css"))),format.raw/*15.89*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("stylesheets/jquery-ui-1.10.2.custom.css"))),format.raw/*16.113*/("""">
        
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*18.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/jquery-ui-1.10.2.custom.js"))),format.raw/*19.81*/("""" type="text/javascript"></script>
        <script src="https://www.youtube.com/iframe_api"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/constants.js"))),format.raw/*21.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/youtube_repeat.js"))),format.raw/*22.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Assets.at("javascripts/common_event.js"))),format.raw/*23.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*24.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("javascripts/Titillium.font.js"))),format.raw/*25.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Assets.at("javascripts/crossBrowser.js"))),format.raw/*26.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Assets.at("javascripts/localStorage.js"))),format.raw/*27.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Assets.at("javascripts/jquery.cookie.js"))),format.raw/*28.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("javascripts/cookieStorage.js"))),format.raw/*29.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Assets.at("javascripts/storage.js"))),format.raw/*30.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Assets.at("javascripts/common_ajax.js"))),format.raw/*31.69*/("""" type="text/javascript"></script>
        <script type="text/javascript" src="http://widgets.twimg.com/j/2/widget.js"></script>
        <script type="text/javascript">
			Cufon.replace('h1');
			
			$(document).ready(function()"""),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
				searchYoutube(rowCount, startPage);
				
				setKeyDownEvent(13, $("#searchName"), function()"""),format.raw/*39.53*/("""{"""),format.raw/*39.54*/("""
					searchYoutube(rowCount, startPage);
				"""),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""");
				
				$(function() """),format.raw/*43.18*/("""{"""),format.raw/*43.19*/("""
					$('.cloud_bar').css('marginLeft', '-250px');
			
			        $('.cloud_bar').hover(
			            function () """),format.raw/*47.28*/("""{"""),format.raw/*47.29*/("""
			                $(this).stop().animate("""),format.raw/*48.43*/("""{"""),format.raw/*48.44*/("""'marginLeft':'-2px'"""),format.raw/*48.63*/("""}"""),format.raw/*48.64*/(""",500);
			            """),format.raw/*49.16*/("""}"""),format.raw/*49.17*/(""",
			            function () """),format.raw/*50.28*/("""{"""),format.raw/*50.29*/("""
			                $(this).stop().animate("""),format.raw/*51.43*/("""{"""),format.raw/*51.44*/("""'marginLeft':'-250px'"""),format.raw/*51.65*/("""}"""),format.raw/*51.66*/(""",500);
			            """),format.raw/*52.16*/("""}"""),format.raw/*52.17*/("""
			        );
			    """),format.raw/*54.8*/("""}"""),format.raw/*54.9*/(""");
				
				settingGroupYoutube();
				
				$("#pop_group" ).draggable();
				
				$("#pop_removeItems").click(function()"""),format.raw/*60.43*/("""{"""),format.raw/*60.44*/("""
					$("#group_div_body").find("input").each(function(i, opts)"""),format.raw/*61.63*/("""{"""),format.raw/*61.64*/("""
						if(opts.checked)"""),format.raw/*62.23*/("""{"""),format.raw/*62.24*/("""
							var key = $(opts).attr("value");
							removeStorage(YGRLR_SPARATOR1+key);
						"""),format.raw/*65.7*/("""}"""),format.raw/*65.8*/("""
					"""),format.raw/*66.6*/("""}"""),format.raw/*66.7*/(""");
					settingGroupYoutube();
				"""),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""");
			
				$("#pop_close").click(function()"""),format.raw/*70.37*/("""{"""),format.raw/*70.38*/("""
					$("#pop_group").hide();
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""");
				
				$("#pop_oneplay").click(function()"""),format.raw/*74.39*/("""{"""),format.raw/*74.40*/("""
					$("#pop_group_header").text('<spring:message code="title.youtube.list.one"/>');
					playType = PLAYTYPE_ONE;
				"""),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""");
				
				$("#pop_autoplay").click(function()"""),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""
					$("#pop_group_header").text('<spring:message code="title.youtube.list.all"/>');
					playType = PLAYTYPE_AUTO;
				"""),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""");
			"""),format.raw/*83.4*/("""}"""),format.raw/*83.5*/(""");
			
			function nextPage()"""),format.raw/*85.23*/("""{"""),format.raw/*85.24*/("""
				startPage += 10;
				searchYoutube(rowCount, startPage);
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/("""
			
			function prevPage()"""),format.raw/*90.23*/("""{"""),format.raw/*90.24*/("""
				if(startPage - 10 > 0)"""),format.raw/*91.27*/("""{"""),format.raw/*91.28*/("""
					startPage -= 10;
					searchYoutube(rowCount, startPage);
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""else"""),format.raw/*94.10*/("""{"""),format.raw/*94.11*/("""
					alert('<spring:message code="alert.message.firstpage"/>');
				"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/("""
		</script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*99.59*/routes/*99.65*/.Assets.at("images/favicon.png"))),format.raw/*99.97*/("""">
    </head>
    <body>
        """),_display_(Seq[Any](/*102.10*/content)),format.raw/*102.17*/("""
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
                    DATE: Mon May 13 20:06:20 KST 2013
                    SOURCE: U:/work/repeatYoutube/app/views/main.scala.html
                    HASH: f5ca4c1c4ee307ef20f3a7480ab308353090b4c9
                    MATRIX: 727->1|834->31|1071->233|1097->238|1194->300|1208->306|1264->341|1355->397|1369->403|1424->437|1516->493|1531->499|1588->534|1680->590|1695->596|1751->630|1843->686|1858->692|1916->728|2002->778|2017->784|2074->819|2160->869|2175->875|2231->909|2317->959|2332->965|2389->1000|2481->1056|2496->1062|2572->1115|2642->1149|2657->1155|2724->1200|2817->1257|2832->1263|2906->1315|3066->1439|3081->1445|3141->1483|3234->1540|3249->1546|3314->1589|3407->1646|3422->1652|3485->1693|3578->1750|3593->1756|3653->1794|3746->1851|3761->1857|3826->1900|3919->1957|3934->1963|3997->2004|4090->2061|4105->2067|4168->2108|4261->2165|4276->2171|4340->2213|4433->2270|4448->2276|4512->2318|4605->2375|4620->2381|4678->2417|4771->2474|4786->2480|4848->2520|5104->2748|5133->2749|5259->2847|5288->2848|5361->2894|5389->2895|5442->2920|5471->2921|5615->3037|5644->3038|5715->3081|5744->3082|5791->3101|5820->3102|5870->3124|5899->3125|5956->3154|5985->3155|6056->3198|6085->3199|6134->3220|6163->3221|6213->3243|6242->3244|6291->3266|6319->3267|6468->3388|6497->3389|6588->3452|6617->3453|6668->3476|6697->3477|6814->3567|6842->3568|6875->3574|6903->3575|6965->3610|6993->3611|7064->3654|7093->3655|7154->3689|7182->3690|7256->3736|7285->3737|7432->3857|7460->3858|7535->3905|7564->3906|7712->4027|7740->4028|7773->4034|7801->4035|7858->4064|7887->4065|7979->4130|8007->4131|8062->4158|8091->4159|8146->4186|8175->4187|8270->4255|8298->4256|8330->4260|8359->4261|8455->4330|8483->4331|8514->4335|8542->4336|8649->4407|8664->4413|8718->4445|8790->4480|8820->4487
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|64->36|64->36|67->39|67->39|69->41|69->41|71->43|71->43|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|82->54|82->54|88->60|88->60|89->61|89->61|90->62|90->62|93->65|93->65|94->66|94->66|96->68|96->68|98->70|98->70|100->72|100->72|102->74|102->74|105->77|105->77|107->79|107->79|110->82|110->82|111->83|111->83|113->85|113->85|116->88|116->88|118->90|118->90|119->91|119->91|122->94|122->94|122->94|122->94|124->96|124->96|125->97|125->97|127->99|127->99|127->99|130->102|130->102
                    -- GENERATED --
                */
            