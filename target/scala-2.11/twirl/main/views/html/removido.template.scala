
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
object removido extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("The Good Music Search")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 5%">
    """),_display_(/*5.6*/helper/*5.12*/.form(action=routes.Application.contabilizarFeedback())/*5.67*/ {_display_(Seq[Any](format.raw/*5.69*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="six columns">
                <div class="u-pull-left">
                    <label class="banda">
                        <input type="radio" name="ok" value="true" id="ok">
                        <span class="label-body">Consegui encontrar :)</span>
                    </label>
                </div>

                <div class="u-pull-right">
                    <label class="ocasional">
                        <input type="radio" name="nao" value="false" id="nao">
                        <span class="label-body">Nao encontrei :/</span>
                    </label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="four columns">
                <div class="u-pull-right">
                    <input class="button-primary" type="submit" value="Responder" id="resposta">
                </div>
            </div>
        </div>
    """)))}),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""</div>
""")))}/*32.2*/(null)))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 05 13:28:47 BRT 2015
                  SOURCE: C:/Users/paulo_000/Downloads/si1-lab2/app/views/removido.scala.html
                  HASH: 7dee7a96a1c783966d03487244cc24417562ba6d
                  MATRIX: 726->1|831->18|859->21|896->50|935->52|966->57|1043->109|1057->115|1120->170|1159->172|1194->181|2165->1122|2197->1127|2223->1135
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|33->5|33->5|33->5|33->5|34->6|58->30|59->31|60->32
                  -- GENERATED --
              */
          