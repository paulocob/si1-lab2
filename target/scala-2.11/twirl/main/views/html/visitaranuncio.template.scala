
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
object visitaranuncio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Anuncio,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(anuncio: Anuncio):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("The Good Music Search")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 5%">
        <div class="row code">
            <div class="anuncios prettyprint">
                """),_display_(/*7.18*/if(!message.isEmpty())/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
                    """),format.raw/*8.21*/("""<script>erroDeCodigo(""""),_display_(/*8.44*/message),format.raw/*8.51*/("""");</script>
                """)))}),format.raw/*9.18*/("""
                """),format.raw/*10.17*/("""<a """"),_display_(/*10.22*/{routes.Application.visitarAnuncio(anuncio.getTitulo + "+" + anuncio.getData)}),format.raw/*10.100*/("""">
                    <h5>"""),_display_(/*11.26*/anuncio/*11.33*/.getTitulo),format.raw/*11.43*/(""" """),_display_(/*11.45*/if(anuncio.getAnunciante.getOcasional())/*11.85*/ {_display_(Seq[Any](format.raw/*11.87*/("""
                        """),format.raw/*12.25*/("""--Procuro Ocasional
                    """)))}/*13.23*/else/*13.28*/{_display_(Seq[Any](format.raw/*13.29*/("""
                        """),format.raw/*14.25*/("""--Procuro Banda
                    """)))}),format.raw/*15.22*/(""" """),format.raw/*15.23*/("""</h5><br>                    </a>

                """),_display_(/*17.18*/anuncio/*17.25*/.getDescricao),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""<br>
                """),_display_(/*18.18*/anuncio/*18.25*/.getContatos.get("fb")),format.raw/*18.47*/("""<br>
                """),_display_(/*19.18*/anuncio/*19.25*/.getContatos.get("email")),format.raw/*19.50*/("""<br>
                """),_display_(/*20.18*/anuncio/*20.25*/.getAnunciante.getCidade),format.raw/*20.49*/(""", """),_display_(/*20.52*/anuncio/*20.59*/.getAnunciante.getBairro),format.raw/*20.83*/(""" """),format.raw/*20.84*/("""<br>
                <div class="row" style="margin-top : 3 %">
                    <div class="three columns">
                        Estilos que gosta:
                        <ul>
                        """),_display_(/*25.26*/for(gosta <- anuncio.getAnunciante.getGosta) yield /*25.70*/ {_display_(Seq[Any](format.raw/*25.72*/("""
                            """),format.raw/*26.29*/("""<li>"""),_display_(/*26.34*/gosta),format.raw/*26.39*/("""</li>
                        """)))}),format.raw/*27.26*/("""
                        """),format.raw/*28.25*/("""</ul>
                  
                        Estilos que nao gosta:
                        <ul>
                        """),_display_(/*32.26*/for(desgosta <- anuncio.getAnunciante.getDesgosta) yield /*32.76*/ {_display_(Seq[Any](format.raw/*32.78*/("""
                            """),format.raw/*33.29*/("""<li>"""),_display_(/*33.34*/desgosta),format.raw/*33.42*/("""</li>
                        """)))}),format.raw/*34.26*/("""
                        """),format.raw/*35.25*/("""</ul>
                    
                        Intrumentos que toca:
                        <ul>
                        """),_display_(/*39.26*/for(instrumentos <- anuncio.getAnunciante.getInstrumentos) yield /*39.84*/ {_display_(Seq[Any](format.raw/*39.86*/("""
                            """),format.raw/*40.29*/("""<li>"""),_display_(/*40.34*/instrumentos),format.raw/*40.46*/("""</li>
                        """)))}),format.raw/*41.26*/("""
                        """),format.raw/*42.25*/("""</ul>
                    </div>
                </div>
                
                """),_display_(/*46.18*/anuncio/*46.25*/.getData),format.raw/*46.33*/(""" """),format.raw/*46.34*/("""<br>
                """),_display_(/*47.18*/helper/*47.24*/.form(action=routes.Application.deletarAnuncio(anuncio.getTitulo))/*47.90*/ {_display_(Seq[Any](format.raw/*47.92*/("""
                    """),format.raw/*48.21*/("""<div class="row">

                        <div class="five columns">
                            <label for="codigoInput">Código de criação</label>
                            <input class="u-full-width" type="text" placeholder="" id="codigoInput" name="codigo" required>
                        </div>
                    </div>
                    <div class="row">

                        <div class="four columns">
                            <div class="u-pull-left">
                                <input class="button-primary" type="submit" value="Deletar anúncio" id="delAnuncio">
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*63.18*/("""

                """),_display_(/*65.18*/helper/*65.24*/.form(action=routes.Application.criarPergunta(anuncio.getTitulo))/*65.89*/ {_display_(Seq[Any](format.raw/*65.91*/("""
                    """),format.raw/*66.21*/("""<div class="row">
                        <div class="five columns">
                            <input class="u-full-width" type="text" placeholder="Escreva sua pergunta" id="codigoPergunta" name="pergunta">
                        </div>
                        <div class="four columns">
                            <div class="u-pull-left">
                                <input class="button-primary" type="submit" value="Perguntar" id="perguntar">
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*76.18*/("""
                """),format.raw/*77.17*/("""<div class="row">
                """),_display_(/*78.18*/if(!anuncio.getConversas.isEmpty)/*78.51*/ {_display_(Seq[Any](format.raw/*78.53*/("""
                    """),format.raw/*79.21*/("""<h2>Perguntas</h2>
                    """),_display_(/*80.22*/for(conversa <- anuncio.getConversas) yield /*80.59*/ {_display_(Seq[Any](format.raw/*80.61*/("""
                        """),format.raw/*81.25*/("""<hr>
                        <div class="row code">
                            <div class="anuncios prettyprint">
                                Pergunta: """),_display_(/*84.44*/conversa/*84.52*/.getPergunta),format.raw/*84.64*/("""
                            """),format.raw/*85.29*/("""</div>
                        </div><br>
                        """),_display_(/*87.26*/if(conversa.getResposta == null || conversa.getResposta.isEmpty)/*87.90*/ {_display_(Seq[Any](format.raw/*87.92*/("""
                            """),_display_(/*88.30*/helper/*88.36*/.form(action=routes.Application.responderOuApagarPergunta(anuncio.getTitulo, anuncio.getConversas.indexOf(conversa)))/*88.153*/ {_display_(Seq[Any](format.raw/*88.155*/("""
                                """),format.raw/*89.33*/("""<div class="row">
                                    <div class="five columns">
                                        <input class="u-full-width" type="text" placeholder="Responder" id="codigoResposta" name="resposta">
                                    </div>
                                    <div class="four columns">
                                        <input class="u-full-width" type="text" placeholder="Código do criador" id="codigoInput" name="codigoResposta" required>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="four columns">
                                        <div class="u-pull-left">
                                            <input class="button-primary" type="submit" name="acao" value="Responder Pergunta" id="responderPergunta">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="four columns">
                                        <div class="u-pull-left">
                                            <input class="button-primary" type="submit" name="acao" value="Apagar Pergunta" id="responderPergunta">
                                        </div>
                                    </div>
                                </div>

                            """)))}),format.raw/*112.30*/("""
                        """)))}/*113.27*/else/*113.32*/{_display_(Seq[Any](format.raw/*113.33*/("""
                            """),format.raw/*114.29*/("""<div class="row code">
                                <div class="anuncios prettyprint">
                                    Resposta: """),_display_(/*116.48*/conversa/*116.56*/.getResposta),format.raw/*116.68*/("""
                                """),format.raw/*117.33*/("""</div>
                            </div>
                        """)))}),format.raw/*119.26*/("""

                    """)))}),format.raw/*121.22*/("""
                """)))}),format.raw/*122.18*/("""

                """),format.raw/*124.17*/("""</div>
            </div>
        </div>
    </div>
""")))}/*128.2*/("utils.js")))}
  }

  def render(message:String,anuncio:Anuncio): play.twirl.api.HtmlFormat.Appendable = apply(message)(anuncio)

  def f:((String) => (Anuncio) => play.twirl.api.HtmlFormat.Appendable) = (message) => (anuncio) => apply(message)(anuncio)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 05 13:37:41 BRT 2015
                  SOURCE: C:/Users/paulo_000/Downloads/si1-lab2/app/views/visitaranuncio.scala.html
                  HASH: 6bde7fa71f8352dc15dd817dc39b626de768fa83
                  MATRIX: 740->1|863->36|891->39|928->68|967->70|998->75|1166->217|1196->239|1235->241|1283->262|1332->285|1359->292|1419->322|1464->339|1496->344|1596->422|1651->450|1667->457|1698->467|1727->469|1776->509|1816->511|1869->536|1929->578|1942->583|1981->584|2034->609|2102->646|2131->647|2210->699|2226->706|2260->719|2289->720|2338->742|2354->749|2397->771|2446->793|2462->800|2508->825|2557->847|2573->854|2618->878|2648->881|2664->888|2709->912|2738->913|2974->1122|3034->1166|3074->1168|3131->1197|3163->1202|3189->1207|3251->1238|3304->1263|3457->1389|3523->1439|3563->1441|3620->1470|3652->1475|3681->1483|3743->1514|3796->1539|3950->1666|4024->1724|4064->1726|4121->1755|4153->1760|4186->1772|4248->1803|4301->1828|4418->1918|4434->1925|4463->1933|4492->1934|4541->1956|4556->1962|4631->2028|4671->2030|4720->2051|5453->2753|5499->2772|5514->2778|5588->2843|5628->2845|5677->2866|6273->3431|6318->3448|6380->3483|6422->3516|6462->3518|6511->3539|6578->3579|6631->3616|6671->3618|6724->3643|6909->3801|6926->3809|6959->3821|7016->3850|7110->3917|7183->3981|7223->3983|7280->4013|7295->4019|7422->4136|7463->4138|7524->4171|9072->5687|9118->5714|9132->5719|9172->5720|9230->5749|9395->5886|9413->5894|9447->5906|9509->5939|9608->6006|9663->6029|9713->6047|9760->6065|9832->6118
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|41->13|41->13|41->13|42->14|43->15|43->15|45->17|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|48->20|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|67->39|67->39|67->39|68->40|68->40|68->40|69->41|70->42|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|91->63|93->65|93->65|93->65|93->65|94->66|104->76|105->77|106->78|106->78|106->78|107->79|108->80|108->80|108->80|109->81|112->84|112->84|112->84|113->85|115->87|115->87|115->87|116->88|116->88|116->88|116->88|117->89|140->112|141->113|141->113|141->113|142->114|144->116|144->116|144->116|145->117|147->119|149->121|150->122|152->124|156->128
                  -- GENERATED --
              */
          