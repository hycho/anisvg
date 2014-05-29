
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
object mobileplaylist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[PlayListGroupR],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String , datas: List[PlayListGroupR], gid: String):play.api.templates.Html = {
        _display_ {import play.i18n._

import helper._


Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/jquery.mobile-1.3.2.css"))),format.raw/*12.109*/("""">
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*13.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery.mobile-1.3.2.js"))),format.raw/*14.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/knockout-2.2.1.js"))),format.raw/*15.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/common_ajax.js"))),format.raw/*16.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/common_mobile.js"))),format.raw/*17.71*/("""" type="text/javascript"></script>
        <script type="text/javascript">
	        var _gaq = _gaq || [];
	        _gaq.push(['_setAccount', 'UA-40462744-1']);
	        _gaq.push(['_trackPageview']);

	        (function() """),format.raw/*23.22*/("""{"""),format.raw/*23.23*/("""
	        	var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	        """),format.raw/*27.10*/("""}"""),format.raw/*27.11*/(""")();
		
	   
		</script>
    </head>
    <body>
        <section id="page1" data-role="page">
		  <header data-role="header">
		  <h1>Repeat Youtube</h1>
		  <a href=""""),_display_(Seq[Any](/*36.15*/routes/*36.21*/.Repeat.grouplisthtml())),format.raw/*36.44*/("""" data-icon="home" data-iconpos="notext" data-direction="reverse">Home</a>
		  </header>
		  <div class="content" data-role="content">
			  <ul data-role="listview">
			   """),_display_(Seq[Any](/*40.8*/for(data <- datas) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
			  		<li>
					    <a href="#" onclick="player('"""),_display_(Seq[Any](/*42.40*/data/*42.44*/.keycode)),format.raw/*42.52*/("""');">
					    	<strong>"""),_display_(Seq[Any](/*43.20*/data/*43.24*/.title)),format.raw/*43.30*/("""</strong>
					    </a>
					</li>
				""")))})),format.raw/*46.6*/("""
			  </ul>
			  
		  </div>
		 <form id="frm2" name="frm2" method="post" action=""""),_display_(Seq[Any](/*50.55*/routes/*50.61*/.Repeat.playerhtml())),format.raw/*50.81*/("""">
		  	<input type="hidden" id="groupId" name="groupId" value=""""),_display_(Seq[Any](/*51.63*/gid)),format.raw/*51.66*/("""">
		  	<input type="hidden" id="keycode" name="keycode" value="">
		  </form>
		  <footer data-role="footer"><h1>team killers</h1></footer>
		</section>
    </body>
</html>
"""))}
    }
    
    def render(title:String,datas:List[PlayListGroupR],gid:String): play.api.templates.Html = apply(title,datas,gid)
    
    def f:((String,List[PlayListGroupR],String) => play.api.templates.Html) = (title,datas,gid) => apply(title,datas,gid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 11:26:55 KST 2014
                    SOURCE: C:/workspace/repeatYoutube/app/views/mobileplaylist.scala.html
                    HASH: 978c19b39b3e6b8737ccc5e1b6435eb65862175e
                    MATRIX: 760->1|931->59|959->98|1045->149|1071->154|1255->302|1270->308|1324->340|1416->396|1431->402|1503->451|1564->476|1579->482|1646->527|1739->584|1754->590|1824->638|1917->695|1932->701|1997->744|2090->801|2105->807|2167->847|2260->904|2275->910|2339->952|2590->1175|2619->1176|2982->1511|3011->1512|3215->1680|3230->1686|3275->1709|3483->1882|3517->1900|3557->1902|3645->1954|3658->1958|3688->1966|3749->1991|3762->1995|3790->2001|3861->2041|3980->2124|3995->2130|4037->2150|4138->2215|4163->2218
                    LINES: 26->1|32->1|34->5|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|52->23|52->23|56->27|56->27|65->36|65->36|65->36|69->40|69->40|69->40|71->42|71->42|71->42|72->43|72->43|72->43|75->46|79->50|79->50|79->50|80->51|80->51
                    -- GENERATED --
                */
            