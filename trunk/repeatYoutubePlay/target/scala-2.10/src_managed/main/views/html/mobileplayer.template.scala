
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
object mobileplayer extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String , keycode: String , gid: String):play.api.templates.Html = {
        _display_ {import play.i18n._

import helper._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*4.1*/("""
<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/jquery.mobile-1.3.2.css"))),format.raw/*11.109*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery.mobile-1.3.2.js"))),format.raw/*13.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/knockout-2.2.1.js"))),format.raw/*14.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/common_ajax.js"))),format.raw/*15.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/common_mobile.js"))),format.raw/*16.71*/("""" type="text/javascript"></script>
        <script type="text/javascript">
	        var _gaq = _gaq || [];
	        _gaq.push(['_setAccount', 'UA-40462744-1']);
	        _gaq.push(['_trackPageview']);

	        (function() """),format.raw/*22.22*/("""{"""),format.raw/*22.23*/("""
	        	var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	        """),format.raw/*26.10*/("""}"""),format.raw/*26.11*/(""")();
		
		</script>
    </head>
    <body>
        <section id="page1" data-role="page">
		  <header data-role="header">
		  <h1>Repeat Youtube</h1>
		  <a href="#" onclick="playlist('"""),_display_(Seq[Any](/*34.37*/gid)),format.raw/*34.40*/("""');" data-icon="back" data-iconpos="notext" data-direction="reverse">back</a>
		  </header>
		  <div data-role="content">
		  	<iframe class="youtube-player" type="text/html" width="100%" height="385px" src="http://www.youtube.com/embed/"""),_display_(Seq[Any](/*37.117*/keycode)),format.raw/*37.124*/("""?autoplay=1" allowfullscreen frameborder="0"></iframe>
		    <p>
			    <a href="#" data-role="button" data-inline="true">"""),_display_(Seq[Any](/*39.59*/Messages/*39.67*/.get("btn.play.all"))),format.raw/*39.87*/("""</a>
			    <a href="#" data-role="button" data-inline="true">"""),_display_(Seq[Any](/*40.59*/Messages/*40.67*/.get("btn.play.one"))),format.raw/*40.87*/("""</a>
			</p>
		  </div>
		  <footer data-role="footer"><h1>team killers</h1></footer>
		</section>
    </body>
</html>
"""))}
    }
    
    def render(title:String,keycode:String,gid:String): play.api.templates.Html = apply(title,keycode,gid)
    
    def f:((String,String,String) => play.api.templates.Html) = (title,keycode,gid) => apply(title,keycode,gid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 11:26:55 KST 2014
                    SOURCE: C:/workspace/repeatYoutube/app/views/mobileplayer.scala.html
                    HASH: c4ec9a6ec7f46d4aae919d1a78bbb7f0c5ba3682
                    MATRIX: 744->1|904->48|931->86|1017->137|1043->142|1227->290|1242->296|1296->328|1388->384|1403->390|1475->439|1536->464|1551->470|1618->515|1711->572|1726->578|1796->626|1889->683|1904->689|1969->732|2062->789|2077->795|2139->835|2232->892|2247->898|2311->940|2562->1163|2591->1164|2954->1499|2983->1500|3204->1685|3229->1688|3504->1926|3534->1933|3693->2056|3710->2064|3752->2084|3851->2147|3868->2155|3910->2175
                    LINES: 26->1|32->1|33->4|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|51->22|51->22|55->26|55->26|63->34|63->34|66->37|66->37|68->39|68->39|68->39|69->40|69->40|69->40
                    -- GENERATED --
                */
            