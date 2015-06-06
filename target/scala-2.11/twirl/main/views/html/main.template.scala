
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(js: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/animate.css")),format.raw/*9.97*/("""">
            <!-- Basic Page Needs
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
        <meta charset="utf-8">
        <title>Your page title here :)</title>
        <meta name="description" content="">
        <meta name="author" content="">

            <!-- Mobile Specific Metas
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

            <!-- FONT
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
        <link href="//fonts.googleapis.com/css?family=Raleway:400,300,600" rel="stylesheet" type="text/css">

            <!-- CSS
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
        <link rel="stylesheet" href=""""),_display_(/*27.39*/routes/*27.45*/.Assets.at("stylesheets/normalize.css")),format.raw/*27.84*/("""">
        <link rel="stylesheet" href=""""),_display_(/*28.39*/routes/*28.45*/.Assets.at("stylesheets/skeleton.css")),format.raw/*28.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*29.59*/routes/*29.65*/.Assets.at("images/favicon.png")),format.raw/*29.97*/("""">
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.at("javascripts/hello.js")),format.raw/*30.63*/("""" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-2.1.4.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.at("javascripts/noty/packaged/jquery.noty.packaged.min.js")),format.raw/*32.96*/("""" type="text/javascript"></script>
        """),_display_(/*33.10*/if(!(js == null))/*33.27*/ {_display_(Seq[Any](format.raw/*33.29*/("""
            """),format.raw/*34.13*/("""<script src=""""),_display_(/*34.27*/routes/*34.33*/.Assets.at("javascripts/" + js)),format.raw/*34.64*/(""" """),format.raw/*34.65*/(""""type="text/javascript"></script>
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""<script src="https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js"></script>
        <link rel="stylesheet" href="http://getskeleton.com/css/custom.css">
    </head>
    <body>
    	<style type="text/css">
    	body"""),format.raw/*41.10*/("""{"""),format.raw/*41.11*/("""background: #fff url(""""),_display_(/*41.34*/routes/*41.40*/.Assets.at("images/inicial.jpg")),format.raw/*41.72*/("""");"""),format.raw/*41.75*/("""}"""),format.raw/*41.76*/("""
    	"""),format.raw/*42.6*/("""</style>
    
    """),_display_(/*44.6*/content),format.raw/*44.13*/("""
    """),format.raw/*45.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html,js:String): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(js)

  def f:((String) => (Html) => (String) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (js) => apply(title)(content)(js)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 05 12:37:23 BRT 2015
                  SOURCE: C:/Users/paulo_000/Downloads/si1-lab2/app/views/main.scala.html
                  HASH: dd13c2e7585fab45e6f0a3b4491c16289f8e94ba
                  MATRIX: 734->1|864->43|892->45|969->96|994->101|1082->163|1096->169|1150->203|1232->259|1246->265|1303->302|2067->1039|2082->1045|2142->1084|2210->1125|2225->1131|2284->1169|2372->1230|2387->1236|2440->1268|2492->1293|2507->1299|2562->1333|2745->1489|2760->1495|2848->1562|2919->1606|2945->1623|2985->1625|3026->1638|3067->1652|3082->1658|3134->1689|3163->1690|3237->1733|3273->1742|3534->1975|3563->1976|3613->1999|3628->2005|3681->2037|3712->2040|3741->2041|3774->2047|3819->2066|3847->2073|3879->2078
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|62->34|62->34|63->35|64->36|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|72->44|73->45
                  -- GENERATED --
              */
          