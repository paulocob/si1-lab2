// @SOURCE:C:/Users/paulo_000/Downloads/si1-lab2/conf/routes
// @HASH:8d45298b1f31062ee53c180caaf3e2606d1e41ba
// @DATE:Fri Jun 05 09:21:08 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
class ReverseAssets {


// @LINE:20
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def responderOuApagarPergunta(titulo:String, index:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "responderOuApagarPergunta" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("titulo", titulo)), Some(implicitly[QueryStringBindable[Int]].unbind("index", index)))))
}
                        

// @LINE:7
def fazerBusca(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix)
}
                        

// @LINE:14
def criarAnuncio(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "criarAnuncio")
}
                        

// @LINE:17
def visitarAnuncio(anuncio:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "visitarAnuncio/" + implicitly[PathBindable[String]].unbind("anuncio", dynamicString(anuncio)))
}
                        

// @LINE:9
def criarPergunta(titulo:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "criarPergunta" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("titulo", titulo)))))
}
                        

// @LINE:6
def verAnuncios(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:15
def novoAnuncio(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "criarAnuncio")
}
                        

// @LINE:18
def deletarAnuncio(titulo:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deletarAnuncio/" + implicitly[PathBindable[String]].unbind("titulo", dynamicString(titulo)))
}
                        

// @LINE:12
def contabilizarFeedback(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "contabilizarFeedback")
}
                        

}
                          
}
                  


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:20
class ReverseAssets {


// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def responderOuApagarPergunta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.responderOuApagarPergunta",
   """
      function(titulo,index) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "responderOuApagarPergunta" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("titulo", titulo), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("index", index)])})
      }
   """
)
                        

// @LINE:7
def fazerBusca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.fazerBusca",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def criarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criarAnuncio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "criarAnuncio"})
      }
   """
)
                        

// @LINE:17
def visitarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.visitarAnuncio",
   """
      function(anuncio) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitarAnuncio/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("anuncio", encodeURIComponent(anuncio))})
      }
   """
)
                        

// @LINE:9
def criarPergunta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criarPergunta",
   """
      function(titulo) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criarPergunta" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("titulo", titulo)])})
      }
   """
)
                        

// @LINE:6
def verAnuncios : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.verAnuncios",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:15
def novoAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.novoAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criarAnuncio"})
      }
   """
)
                        

// @LINE:18
def deletarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletarAnuncio",
   """
      function(titulo) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletarAnuncio/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("titulo", encodeURIComponent(titulo))})
      }
   """
)
                        

// @LINE:12
def contabilizarFeedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contabilizarFeedback",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contabilizarFeedback"})
      }
   """
)
                        

}
              
}
        


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
class ReverseAssets {


// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def responderOuApagarPergunta(titulo:String, index:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.responderOuApagarPergunta(titulo, index), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "responderOuApagarPergunta", Seq(classOf[String], classOf[Int]), "POST", """""", _prefix + """responderOuApagarPergunta""")
)
                      

// @LINE:7
def fazerBusca(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.fazerBusca(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fazerBusca", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:14
def criarAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criarAnuncio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "criarAnuncio", Seq(), "GET", """""", _prefix + """criarAnuncio""")
)
                      

// @LINE:17
def visitarAnuncio(anuncio:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.visitarAnuncio(anuncio), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "visitarAnuncio", Seq(classOf[String]), "GET", """""", _prefix + """visitarAnuncio/$anuncio<[^/]+>""")
)
                      

// @LINE:9
def criarPergunta(titulo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criarPergunta(titulo), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "criarPergunta", Seq(classOf[String]), "POST", """""", _prefix + """criarPergunta""")
)
                      

// @LINE:6
def verAnuncios(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.verAnuncios(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "verAnuncios", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:15
def novoAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.novoAnuncio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "novoAnuncio", Seq(), "POST", """""", _prefix + """criarAnuncio""")
)
                      

// @LINE:18
def deletarAnuncio(titulo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletarAnuncio(titulo), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deletarAnuncio", Seq(classOf[String]), "POST", """""", _prefix + """deletarAnuncio/$titulo<[^/]+>""")
)
                      

// @LINE:12
def contabilizarFeedback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contabilizarFeedback(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contabilizarFeedback", Seq(), "POST", """""", _prefix + """contabilizarFeedback""")
)
                      

}
                          
}
        
    