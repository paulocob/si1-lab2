
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
object criaranuncio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("The Good Music Search")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 5%">
        <h2>Crie um novo Anúncio:</h2>
        """),_display_(/*6.10*/helper/*6.16*/.form(action=routes.Application.novoAnuncio(), 'onsubmit -> "return validarFormulario();")/*6.106*/ {_display_(Seq[Any](format.raw/*6.108*/("""
            """),format.raw/*7.13*/("""<div class="row">
                <div class="four columns">
                    <label for="tituloInput">Título</label>
                    <input class="u-full-width" type="text" placeholder="" id="tituloInput" name="titulo" required>
                
                    <label for="codigoInput">Código de criação</label>
                    <input class="u-full-width" type="text" placeholder="" id="codigoInput" name="codigo" required>
                </div>
            </div>
            <div class="row">
                <div class="six columns">
                    <label for="descricaoInput">Descrição</label>
                    <textarea class="u-full-width" id="descricaoInput" name="descricao" style="resize:vertical" required></textarea>
                    
                        <label for="instrumentosInput">Instrumentos que toco</label>
                        <input class="u-full-width" type="text" id="instrumentosInput" name="instrumentos" required>
                    
                    
                    
                    	<label for="gostosInput">Estilos que curto</label>
                        <input class="u-full-width" type="text" id="gostosInput" name="gosta" placeholder="folk,funk,samba,...">
                    	<label for="desgostosInput">Estilos que nao curto</label>
                        <input class="u-full-width" type="text" id="desgostosInput" name="desgosta" placeholder="xaxado,rock...">
                        <label for="cidadeInput">Cidade</label>
                        <input class="u-full-width" type="text" placeholder="" id="cidadeInput" name="cidade" required>
                        <label for="bairroInput">Bairro</label>
                        <input class="u-full-width" type="text" placeholder="" id="bairroInput" name="bairro" required>
                        <label for="emailInput">Email</label>
                        <input class="u-full-width" type="email" placeholder="" id="emailInput" name="email">
                        <label for="fbInput">Facebook</label>
                        <input class="u-full-width" type="url" placeholder="http://" id="fbInput" name="fb">
                    
                </div>
                
            </div>
            <div class="row">
                <div class="tencolumns">
                    <div class="ten columns">
                        <label class="banda">
                            <input type="radio" name="ocasional" value="false" id="banda">
                            <span class="label-body">Procuro uma banda</span>
                        </label>
                    
                        <label class="ocasional">
                            <input type="radio" name="ocasional" value="true" id="ocasional">
                            <span class="label-body">Procuro Ocasional</span>
                        </label>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="ten columns"></div>
                <div class="four columns">
                    <div class="u-pull-right">
                        <input class="button-primary" type="submit" value="Criar anúncio" id="criarBotao">
                    </div>
                </div>
            </div>
        """)))}),format.raw/*65.10*/("""
    """),format.raw/*66.5*/("""</div>
""")))}/*67.2*/("formulario.js")))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 05 14:56:56 BRT 2015
                  SOURCE: C:/Users/paulo_000/Downloads/si1-lab2/app/views/criaranuncio.scala.html
                  HASH: 086fab7ba2f86bf29885b1c46981c59fcb867879
                  MATRIX: 730->1|835->18|863->21|900->50|939->52|970->57|1091->152|1105->158|1204->248|1244->250|1284->263|4619->3567|4651->3572|4677->3580
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|34->6|35->7|93->65|94->66|95->67
                  -- GENERATED --
              */
          