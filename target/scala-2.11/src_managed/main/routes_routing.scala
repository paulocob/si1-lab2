// @SOURCE:C:/Users/paulo_000/Downloads/si1-lab2/conf/routes
// @HASH:8d45298b1f31062ee53c180caaf3e2606d1e41ba
// @DATE:Fri Jun 05 09:21:08 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_verAnuncios0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_verAnuncios0_invoker = createInvoker(
controllers.Application.verAnuncios(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "verAnuncios", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_fazerBusca1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_fazerBusca1_invoker = createInvoker(
controllers.Application.fazerBusca(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fazerBusca", Nil,"POST", """""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_criarPergunta2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criarPergunta"))))
private[this] lazy val controllers_Application_criarPergunta2_invoker = createInvoker(
controllers.Application.criarPergunta(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "criarPergunta", Seq(classOf[String]),"POST", """""", Routes.prefix + """criarPergunta"""))
        

// @LINE:10
private[this] lazy val controllers_Application_responderOuApagarPergunta3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("responderOuApagarPergunta"))))
private[this] lazy val controllers_Application_responderOuApagarPergunta3_invoker = createInvoker(
controllers.Application.responderOuApagarPergunta(fakeValue[String], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "responderOuApagarPergunta", Seq(classOf[String], classOf[Int]),"POST", """""", Routes.prefix + """responderOuApagarPergunta"""))
        

// @LINE:12
private[this] lazy val controllers_Application_contabilizarFeedback4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contabilizarFeedback"))))
private[this] lazy val controllers_Application_contabilizarFeedback4_invoker = createInvoker(
controllers.Application.contabilizarFeedback(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contabilizarFeedback", Nil,"POST", """""", Routes.prefix + """contabilizarFeedback"""))
        

// @LINE:14
private[this] lazy val controllers_Application_criarAnuncio5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criarAnuncio"))))
private[this] lazy val controllers_Application_criarAnuncio5_invoker = createInvoker(
controllers.Application.criarAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "criarAnuncio", Nil,"GET", """""", Routes.prefix + """criarAnuncio"""))
        

// @LINE:15
private[this] lazy val controllers_Application_novoAnuncio6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criarAnuncio"))))
private[this] lazy val controllers_Application_novoAnuncio6_invoker = createInvoker(
controllers.Application.novoAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "novoAnuncio", Nil,"POST", """""", Routes.prefix + """criarAnuncio"""))
        

// @LINE:17
private[this] lazy val controllers_Application_visitarAnuncio7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visitarAnuncio/"),DynamicPart("anuncio", """[^/]+""",true))))
private[this] lazy val controllers_Application_visitarAnuncio7_invoker = createInvoker(
controllers.Application.visitarAnuncio(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "visitarAnuncio", Seq(classOf[String]),"GET", """""", Routes.prefix + """visitarAnuncio/$anuncio<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Application_deletarAnuncio8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletarAnuncio/"),DynamicPart("titulo", """[^/]+""",true))))
private[this] lazy val controllers_Application_deletarAnuncio8_invoker = createInvoker(
controllers.Application.deletarAnuncio(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deletarAnuncio", Seq(classOf[String]),"POST", """""", Routes.prefix + """deletarAnuncio/$titulo<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.verAnuncios()"""),("""POST""", prefix,"""controllers.Application.fazerBusca()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criarPergunta""","""controllers.Application.criarPergunta(titulo:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """responderOuApagarPergunta""","""controllers.Application.responderOuApagarPergunta(titulo:String, index:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contabilizarFeedback""","""controllers.Application.contabilizarFeedback()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criarAnuncio""","""controllers.Application.criarAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criarAnuncio""","""controllers.Application.novoAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visitarAnuncio/$anuncio<[^/]+>""","""controllers.Application.visitarAnuncio(anuncio:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletarAnuncio/$titulo<[^/]+>""","""controllers.Application.deletarAnuncio(titulo:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_verAnuncios0_route(params) => {
   call { 
        controllers_Application_verAnuncios0_invoker.call(controllers.Application.verAnuncios())
   }
}
        

// @LINE:7
case controllers_Application_fazerBusca1_route(params) => {
   call { 
        controllers_Application_fazerBusca1_invoker.call(controllers.Application.fazerBusca())
   }
}
        

// @LINE:9
case controllers_Application_criarPergunta2_route(params) => {
   call(params.fromQuery[String]("titulo", None)) { (titulo) =>
        controllers_Application_criarPergunta2_invoker.call(controllers.Application.criarPergunta(titulo))
   }
}
        

// @LINE:10
case controllers_Application_responderOuApagarPergunta3_route(params) => {
   call(params.fromQuery[String]("titulo", None), params.fromQuery[Int]("index", None)) { (titulo, index) =>
        controllers_Application_responderOuApagarPergunta3_invoker.call(controllers.Application.responderOuApagarPergunta(titulo, index))
   }
}
        

// @LINE:12
case controllers_Application_contabilizarFeedback4_route(params) => {
   call { 
        controllers_Application_contabilizarFeedback4_invoker.call(controllers.Application.contabilizarFeedback())
   }
}
        

// @LINE:14
case controllers_Application_criarAnuncio5_route(params) => {
   call { 
        controllers_Application_criarAnuncio5_invoker.call(controllers.Application.criarAnuncio())
   }
}
        

// @LINE:15
case controllers_Application_novoAnuncio6_route(params) => {
   call { 
        controllers_Application_novoAnuncio6_invoker.call(controllers.Application.novoAnuncio())
   }
}
        

// @LINE:17
case controllers_Application_visitarAnuncio7_route(params) => {
   call(params.fromPath[String]("anuncio", None)) { (anuncio) =>
        controllers_Application_visitarAnuncio7_invoker.call(controllers.Application.visitarAnuncio(anuncio))
   }
}
        

// @LINE:18
case controllers_Application_deletarAnuncio8_route(params) => {
   call(params.fromPath[String]("titulo", None)) { (titulo) =>
        controllers_Application_deletarAnuncio8_invoker.call(controllers.Application.deletarAnuncio(titulo))
   }
}
        

// @LINE:20
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     