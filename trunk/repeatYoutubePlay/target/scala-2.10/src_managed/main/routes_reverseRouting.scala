// @SOURCE:C:/workspace/repeatYoutube/conf/routes
// @HASH:de0e0ec569c9169a541921b3fd1b6ed3751956d1
// @DATE:Thu May 29 11:26:51 KST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:25
class ReverseAnalysis {
    

// @LINE:25
def viewmusiccount(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "analysis/viewmusiccount")
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def mobileIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mobile")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRepeat {
    

// @LINE:13
// @LINE:12
def grouplisthtml(): Call = {
   () match {
// @LINE:12
case () if true => Call("GET", _prefix + { _defaultPrefix } + "mobile/grouplisthtml")
                                                        
// @LINE:13
case () if true => Call("POST", _prefix + { _defaultPrefix } + "mobile/grouplisthtml")
                                                        
   }
}
                                                

// @LINE:20
def searchgrouplist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/searchgrouplist")
}
                                                

// @LINE:16
// @LINE:15
def playlisthtml(): Call = {
   () match {
// @LINE:15
case () if true => Call("GET", _prefix + { _defaultPrefix } + "mobile/playlisthtml")
                                                        
// @LINE:16
case () if true => Call("POST", _prefix + { _defaultPrefix } + "mobile/playlisthtml")
                                                        
   }
}
                                                

// @LINE:18
// @LINE:17
def playerhtml(): Call = {
   () match {
// @LINE:17
case () if true => Call("GET", _prefix + { _defaultPrefix } + "mobile/playerhtml")
                                                        
// @LINE:18
case () if true => Call("POST", _prefix + { _defaultPrefix } + "mobile/playerhtml")
                                                        
   }
}
                                                

// @LINE:22
def mDownLoad(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/download")
}
                                                

// @LINE:23
def fileDownLoad(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/filedownload")
}
                                                

// @LINE:21
def logplay(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/logplay")
}
                                                

// @LINE:14
def playlist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/playlist")
}
                                                

// @LINE:10
def newlist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/newlist")
}
                                                

// @LINE:9
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/save")
}
                                                

// @LINE:11
def grouplist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "repeat/grouplist")
}
                                                
    
}
                          
}
                  


// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:25
class ReverseAnalysis {
    

// @LINE:25
def viewmusiccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Analysis.viewmusiccount",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "analysis/viewmusiccount"})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def mobileIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mobileIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRepeat {
    

// @LINE:13
// @LINE:12
def grouplisthtml : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.grouplisthtml",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/grouplisthtml"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/grouplisthtml"})
      }
      }
   """
)
                        

// @LINE:20
def searchgrouplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.searchgrouplist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/searchgrouplist"})
      }
   """
)
                        

// @LINE:16
// @LINE:15
def playlisthtml : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.playlisthtml",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/playlisthtml"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/playlisthtml"})
      }
      }
   """
)
                        

// @LINE:18
// @LINE:17
def playerhtml : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.playerhtml",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/playerhtml"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/playerhtml"})
      }
      }
   """
)
                        

// @LINE:22
def mDownLoad : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.mDownLoad",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/download"})
      }
   """
)
                        

// @LINE:23
def fileDownLoad : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.fileDownLoad",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/filedownload"})
      }
   """
)
                        

// @LINE:21
def logplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.logplay",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/logplay"})
      }
   """
)
                        

// @LINE:14
def playlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.playlist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/playlist"})
      }
   """
)
                        

// @LINE:10
def newlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.newlist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/newlist"})
      }
   """
)
                        

// @LINE:9
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/save"})
      }
   """
)
                        

// @LINE:11
def grouplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Repeat.grouplist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "repeat/grouplist"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:25
class ReverseAnalysis {
    

// @LINE:25
def viewmusiccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Analysis.viewmusiccount(), HandlerDef(this, "controllers.Analysis", "viewmusiccount", Seq(), "POST", """""", _prefix + """analysis/viewmusiccount""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def mobileIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mobileIndex(), HandlerDef(this, "controllers.Application", "mobileIndex", Seq(), "GET", """""", _prefix + """mobile""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRepeat {
    

// @LINE:12
def grouplisthtml(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.grouplisthtml(), HandlerDef(this, "controllers.Repeat", "grouplisthtml", Seq(), "GET", """""", _prefix + """mobile/grouplisthtml""")
)
                      

// @LINE:20
def searchgrouplist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.searchgrouplist(), HandlerDef(this, "controllers.Repeat", "searchgrouplist", Seq(), "POST", """""", _prefix + """repeat/searchgrouplist""")
)
                      

// @LINE:15
def playlisthtml(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.playlisthtml(), HandlerDef(this, "controllers.Repeat", "playlisthtml", Seq(), "GET", """""", _prefix + """mobile/playlisthtml""")
)
                      

// @LINE:17
def playerhtml(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.playerhtml(), HandlerDef(this, "controllers.Repeat", "playerhtml", Seq(), "GET", """""", _prefix + """mobile/playerhtml""")
)
                      

// @LINE:22
def mDownLoad(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.mDownLoad(), HandlerDef(this, "controllers.Repeat", "mDownLoad", Seq(), "POST", """""", _prefix + """repeat/download""")
)
                      

// @LINE:23
def fileDownLoad(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.fileDownLoad(), HandlerDef(this, "controllers.Repeat", "fileDownLoad", Seq(), "POST", """""", _prefix + """repeat/filedownload""")
)
                      

// @LINE:21
def logplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.logplay(), HandlerDef(this, "controllers.Repeat", "logplay", Seq(), "POST", """""", _prefix + """repeat/logplay""")
)
                      

// @LINE:14
def playlist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.playlist(), HandlerDef(this, "controllers.Repeat", "playlist", Seq(), "POST", """""", _prefix + """repeat/playlist""")
)
                      

// @LINE:10
def newlist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.newlist(), HandlerDef(this, "controllers.Repeat", "newlist", Seq(), "POST", """""", _prefix + """repeat/newlist""")
)
                      

// @LINE:9
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.save(), HandlerDef(this, "controllers.Repeat", "save", Seq(), "POST", """""", _prefix + """repeat/save""")
)
                      

// @LINE:11
def grouplist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Repeat.grouplist(), HandlerDef(this, "controllers.Repeat", "grouplist", Seq(), "POST", """""", _prefix + """repeat/grouplist""")
)
                      
    
}
                          
}
                  
      