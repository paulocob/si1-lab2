
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[models.Anuncio],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(anuncios: java.util.List[models.Anuncio])(numAnuncios: Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(/*3.2*/main("The Good Music Search")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

    """),format.raw/*5.5*/("""<div class="container" style="margin-top : 5 %">
        """),_display_(/*6.10*/helper/*6.16*/.form(action=routes.Application.fazerBusca())/*6.61*/ {_display_(Seq[Any](format.raw/*6.63*/("""<b>
            <div class="row">
                <div class="eight columns">
                    <h1>The Good Music Search :D</h1>
                </div>
            </div>
            <div class="row">
            <script type="text/javascript">
				function Nova()
				"""),format.raw/*15.5*/("""{"""),format.raw/*15.6*/("""
				"""),format.raw/*16.5*/("""location.href=""""),_display_(/*16.21*/{routes.Application.criarAnuncio()}),format.raw/*16.56*/(""""
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
			"""),format.raw/*18.4*/("""</script>
            <input class="button-primary" type="button" value="Criar um novo anúncio" onClick = "Nova()">
                
            </div>
            <div class="row">
                <div class="seven columns">
                    <input class="u-full-width" type="search" placeholder=" procure por: estilos musicais, instrumentos, entre outros." id="buscaInput" name="busca">
                </div>
            </div>
            
            
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/for(anuncio <- anuncios) yield /*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
            """),format.raw/*31.13*/("""<hr>
            <div class="row code">
                <div class="anuncios prettyprint">
                    <a href=""""),_display_(/*34.31*/{routes.Application.visitarAnuncio(anuncio.getTitulo + "+" + anuncio.getData)}),format.raw/*34.109*/("""">
                        <h5>"""),_display_(/*35.30*/anuncio/*35.37*/.getTitulo),format.raw/*35.47*/(""" """),_display_(/*35.49*/if(anuncio.getAnunciante.getOcasional())/*35.89*/ {_display_(Seq[Any](format.raw/*35.91*/("""
                            """),format.raw/*36.29*/("""--Procuro Ocasional
                        """)))}/*37.27*/else/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                            """),format.raw/*38.29*/("""--Procuro Banda
                        """)))}),format.raw/*39.26*/(""" """),format.raw/*39.27*/("""</h5><br>                    </a>

                    """),_display_(/*41.22*/anuncio/*41.29*/.getDescricao),format.raw/*41.42*/(""" """),format.raw/*41.43*/("""<br>
                    """),_display_(/*42.22*/anuncio/*42.29*/.getContatos.get("fb")),format.raw/*42.51*/("""<br>
                    """),_display_(/*43.22*/anuncio/*43.29*/.getContatos.get("email")),format.raw/*43.54*/("""<br>
                    """),_display_(/*44.22*/anuncio/*44.29*/.getAnunciante.getCidade),format.raw/*44.53*/(""", """),_display_(/*44.56*/anuncio/*44.63*/.getAnunciante.getBairro),format.raw/*44.87*/(""" """),format.raw/*44.88*/("""<br>
                    <div class="row" style="margin-top : 3 %">
                        <div class="three columns">
                        Estilos que gosta:
                            <ul>
                            """),_display_(/*49.30*/for(gosta <- anuncio.getAnunciante.getGosta) yield /*49.74*/ {_display_(Seq[Any](format.raw/*49.76*/("""
                                """),format.raw/*50.33*/("""<li>"""),_display_(/*50.38*/gosta),format.raw/*50.43*/("""</li>
                            """)))}),format.raw/*51.30*/("""
                            """),format.raw/*52.29*/("""</ul>
                        
                        Estilos que nao gosta:
                            <ul>
                            """),_display_(/*56.30*/for(desgosta <- anuncio.getAnunciante.getDesgosta) yield /*56.80*/ {_display_(Seq[Any](format.raw/*56.82*/("""
                                """),format.raw/*57.33*/("""<li>"""),_display_(/*57.38*/desgosta),format.raw/*57.46*/("""</li>
                            """)))}),format.raw/*58.30*/("""
                            """),format.raw/*59.29*/("""</ul>
                        
                        Toca:
                            <ul>
                            """),_display_(/*63.30*/for(instrumentos <- anuncio.getAnunciante.getInstrumentos) yield /*63.88*/ {_display_(Seq[Any](format.raw/*63.90*/("""
                                """),format.raw/*64.33*/("""<li>"""),_display_(/*64.38*/instrumentos),format.raw/*64.50*/("""</li>
                            """)))}),format.raw/*65.30*/("""
                            """),format.raw/*66.29*/("""</ul>
                        </div>
                    </div>
                    
                    """),_display_(/*70.22*/anuncio/*70.29*/.getData),format.raw/*70.37*/(""" """),format.raw/*70.38*/("""<br>
                </div>
            </div>
        """)))}),format.raw/*73.10*/("""
    """),format.raw/*74.5*/("""</div>
</b>
""")))}/*76.2*/(null)),format.raw/*76.8*/("""
"""))}
  }

  def render(anuncios:java.util.List[models.Anuncio],numAnuncios:Int): play.twirl.api.HtmlFormat.Appendable = apply(anuncios)(numAnuncios)

  def f:((java.util.List[models.Anuncio]) => (Int) => play.twirl.api.HtmlFormat.Appendable) = (anuncios) => (numAnuncios) => apply(anuncios)(numAnuncios)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 05 15:09:35 BRT 2015
                  SOURCE: C:/Users/paulo_000/Downloads/si1-lab2/app/views/index.scala.html
                  HASH: d3c5235f348723d674c2a9ef9c8a784ab5364bae
                  MATRIX: 751->1|899->61|927->64|964->93|1003->95|1035->101|1119->159|1133->165|1186->210|1225->212|1524->484|1552->485|1584->490|1627->506|1683->541|1716->547|1744->548|1775->552|2275->1021|2312->1031|2352->1055|2392->1057|2433->1070|2581->1191|2681->1269|2740->1301|2756->1308|2787->1318|2816->1320|2865->1360|2905->1362|2962->1391|3026->1437|3039->1442|3078->1443|3135->1472|3207->1513|3236->1514|3319->1570|3335->1577|3369->1590|3398->1591|3451->1617|3467->1624|3510->1646|3563->1672|3579->1679|3625->1704|3678->1730|3694->1737|3739->1761|3769->1764|3785->1771|3830->1795|3859->1796|4111->2021|4171->2065|4211->2067|4272->2100|4304->2105|4330->2110|4396->2145|4453->2174|4620->2314|4686->2364|4726->2366|4787->2399|4819->2404|4848->2412|4914->2447|4971->2476|5121->2599|5195->2657|5235->2659|5296->2692|5328->2697|5361->2709|5427->2744|5484->2773|5617->2879|5633->2886|5662->2894|5691->2895|5778->2951|5810->2956|5841->2969|5867->2975
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|34->6|34->6|43->15|43->15|44->16|44->16|44->16|45->17|45->17|46->18|57->29|58->30|58->30|58->30|59->31|62->34|62->34|63->35|63->35|63->35|63->35|63->35|63->35|64->36|65->37|65->37|65->37|66->38|67->39|67->39|69->41|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|77->49|77->49|77->49|78->50|78->50|78->50|79->51|80->52|84->56|84->56|84->56|85->57|85->57|85->57|86->58|87->59|91->63|91->63|91->63|92->64|92->64|92->64|93->65|94->66|98->70|98->70|98->70|98->70|101->73|102->74|104->76|104->76
                  -- GENERATED --
              */
          