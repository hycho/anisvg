
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
object mobileIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[PlayListGroup],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String , datas: List[PlayListGroup]):play.api.templates.Html = {
        _display_ {import play.i18n._

import helper._


Seq[Any](format.raw/*1.46*/("""

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
		  <header data-role="header"><h1>Repeat Youtube</h1></header>
		  <div class="content" data-role="content">
			  <ul data-role="listview">
			   """),_display_(Seq[Any](/*36.8*/for(data <- datas) yield /*36.26*/ {_display_(Seq[Any](format.raw/*36.28*/("""
			  		<li>
					    <a href="#" onclick="playlist('"""),_display_(Seq[Any](/*38.42*/data/*38.46*/.id)),format.raw/*38.49*/("""');" >
					    	<strong>"""),_display_(Seq[Any](/*39.20*/data/*39.24*/.title)),format.raw/*39.30*/("""</strong>
					    </a>
					</li>
				""")))})),format.raw/*42.6*/("""
			  </ul>
		  </div>
		  <form id="frm" name="frm" method="post" action=""""),_display_(Seq[Any](/*45.54*/routes/*45.60*/.Repeat.playlisthtml())),format.raw/*45.82*/("""">
		  	<input type="hidden" id="groupId" name="groupId" value="">
		  </form>
		  <footer data-role="footer"><h1>team killers</h1></footer>
		</section>
    </body>
</html>

"""))}
    }
    
    def render(title:String,datas:List[PlayListGroup]): play.api.templates.Html = apply(title,datas)
    
    def f:((String,List[PlayListGroup]) => play.api.templates.Html) = (title,datas) => apply(title,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 11:26:55 KST 2014
                    SOURCE: C:/workspace/repeatYoutube/app/views/mobileIndex.scala.html
                    HASH: 08f25d2ba727a4aa2a8eb0ce8acbe3dbcd8877bc
                    MATRIX: 749->1|906->45|934->84|1020->135|1046->140|1230->288|1245->294|1299->326|1391->382|1406->388|1478->437|1539->462|1554->468|1621->513|1714->570|1729->576|1799->624|1892->681|1907->687|1972->730|2065->787|2080->793|2142->833|2235->890|2250->896|2314->938|2565->1161|2594->1162|2957->1497|2986->1498|3259->1736|3293->1754|3333->1756|3423->1810|3436->1814|3461->1817|3523->1843|3536->1847|3564->1853|3635->1893|3747->1969|3762->1975|3806->1997
                    LINES: 26->1|32->1|34->5|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|52->23|52->23|56->27|56->27|65->36|65->36|65->36|67->38|67->38|67->38|68->39|68->39|68->39|71->42|74->45|74->45|74->45
                    -- GENERATED --
                */
            