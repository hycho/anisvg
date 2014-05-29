// @SOURCE:C:/workspace/repeatYoutube/conf/routes
// @HASH:de0e0ec569c9169a541921b3fd1b6ed3751956d1
// @DATE:Thu May 29 11:26:51 KST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_mobileIndex1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile"))))
        

// @LINE:9
private[this] lazy val controllers_Repeat_save2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/save"))))
        

// @LINE:10
private[this] lazy val controllers_Repeat_newlist3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/newlist"))))
        

// @LINE:11
private[this] lazy val controllers_Repeat_grouplist4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/grouplist"))))
        

// @LINE:12
private[this] lazy val controllers_Repeat_grouplisthtml5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/grouplisthtml"))))
        

// @LINE:13
private[this] lazy val controllers_Repeat_grouplisthtml6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/grouplisthtml"))))
        

// @LINE:14
private[this] lazy val controllers_Repeat_playlist7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/playlist"))))
        

// @LINE:15
private[this] lazy val controllers_Repeat_playlisthtml8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/playlisthtml"))))
        

// @LINE:16
private[this] lazy val controllers_Repeat_playlisthtml9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/playlisthtml"))))
        

// @LINE:17
private[this] lazy val controllers_Repeat_playerhtml10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/playerhtml"))))
        

// @LINE:18
private[this] lazy val controllers_Repeat_playerhtml11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mobile/playerhtml"))))
        

// @LINE:20
private[this] lazy val controllers_Repeat_searchgrouplist12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/searchgrouplist"))))
        

// @LINE:21
private[this] lazy val controllers_Repeat_logplay13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/logplay"))))
        

// @LINE:22
private[this] lazy val controllers_Repeat_mDownLoad14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/download"))))
        

// @LINE:23
private[this] lazy val controllers_Repeat_fileDownLoad15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("repeat/filedownload"))))
        

// @LINE:25
private[this] lazy val controllers_Analysis_viewmusiccount16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analysis/viewmusiccount"))))
        

// @LINE:28
private[this] lazy val controllers_Assets_at17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile""","""controllers.Application.mobileIndex()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/save""","""controllers.Repeat.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/newlist""","""controllers.Repeat.newlist()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/grouplist""","""controllers.Repeat.grouplist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/grouplisthtml""","""controllers.Repeat.grouplisthtml()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/grouplisthtml""","""controllers.Repeat.grouplisthtml()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/playlist""","""controllers.Repeat.playlist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/playlisthtml""","""controllers.Repeat.playlisthtml()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/playlisthtml""","""controllers.Repeat.playlisthtml()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/playerhtml""","""controllers.Repeat.playerhtml()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mobile/playerhtml""","""controllers.Repeat.playerhtml()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/searchgrouplist""","""controllers.Repeat.searchgrouplist()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/logplay""","""controllers.Repeat.logplay()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/download""","""controllers.Repeat.mDownLoad()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """repeat/filedownload""","""controllers.Repeat.fileDownLoad()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analysis/viewmusiccount""","""controllers.Analysis.viewmusiccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_mobileIndex1(params) => {
   call { 
        invokeHandler(controllers.Application.mobileIndex(), HandlerDef(this, "controllers.Application", "mobileIndex", Nil,"GET", """""", Routes.prefix + """mobile"""))
   }
}
        

// @LINE:9
case controllers_Repeat_save2(params) => {
   call { 
        invokeHandler(controllers.Repeat.save(), HandlerDef(this, "controllers.Repeat", "save", Nil,"POST", """""", Routes.prefix + """repeat/save"""))
   }
}
        

// @LINE:10
case controllers_Repeat_newlist3(params) => {
   call { 
        invokeHandler(controllers.Repeat.newlist(), HandlerDef(this, "controllers.Repeat", "newlist", Nil,"POST", """""", Routes.prefix + """repeat/newlist"""))
   }
}
        

// @LINE:11
case controllers_Repeat_grouplist4(params) => {
   call { 
        invokeHandler(controllers.Repeat.grouplist(), HandlerDef(this, "controllers.Repeat", "grouplist", Nil,"POST", """""", Routes.prefix + """repeat/grouplist"""))
   }
}
        

// @LINE:12
case controllers_Repeat_grouplisthtml5(params) => {
   call { 
        invokeHandler(controllers.Repeat.grouplisthtml(), HandlerDef(this, "controllers.Repeat", "grouplisthtml", Nil,"GET", """""", Routes.prefix + """mobile/grouplisthtml"""))
   }
}
        

// @LINE:13
case controllers_Repeat_grouplisthtml6(params) => {
   call { 
        invokeHandler(controllers.Repeat.grouplisthtml(), HandlerDef(this, "controllers.Repeat", "grouplisthtml", Nil,"POST", """""", Routes.prefix + """mobile/grouplisthtml"""))
   }
}
        

// @LINE:14
case controllers_Repeat_playlist7(params) => {
   call { 
        invokeHandler(controllers.Repeat.playlist(), HandlerDef(this, "controllers.Repeat", "playlist", Nil,"POST", """""", Routes.prefix + """repeat/playlist"""))
   }
}
        

// @LINE:15
case controllers_Repeat_playlisthtml8(params) => {
   call { 
        invokeHandler(controllers.Repeat.playlisthtml(), HandlerDef(this, "controllers.Repeat", "playlisthtml", Nil,"GET", """""", Routes.prefix + """mobile/playlisthtml"""))
   }
}
        

// @LINE:16
case controllers_Repeat_playlisthtml9(params) => {
   call { 
        invokeHandler(controllers.Repeat.playlisthtml(), HandlerDef(this, "controllers.Repeat", "playlisthtml", Nil,"POST", """""", Routes.prefix + """mobile/playlisthtml"""))
   }
}
        

// @LINE:17
case controllers_Repeat_playerhtml10(params) => {
   call { 
        invokeHandler(controllers.Repeat.playerhtml(), HandlerDef(this, "controllers.Repeat", "playerhtml", Nil,"GET", """""", Routes.prefix + """mobile/playerhtml"""))
   }
}
        

// @LINE:18
case controllers_Repeat_playerhtml11(params) => {
   call { 
        invokeHandler(controllers.Repeat.playerhtml(), HandlerDef(this, "controllers.Repeat", "playerhtml", Nil,"POST", """""", Routes.prefix + """mobile/playerhtml"""))
   }
}
        

// @LINE:20
case controllers_Repeat_searchgrouplist12(params) => {
   call { 
        invokeHandler(controllers.Repeat.searchgrouplist(), HandlerDef(this, "controllers.Repeat", "searchgrouplist", Nil,"POST", """""", Routes.prefix + """repeat/searchgrouplist"""))
   }
}
        

// @LINE:21
case controllers_Repeat_logplay13(params) => {
   call { 
        invokeHandler(controllers.Repeat.logplay(), HandlerDef(this, "controllers.Repeat", "logplay", Nil,"POST", """""", Routes.prefix + """repeat/logplay"""))
   }
}
        

// @LINE:22
case controllers_Repeat_mDownLoad14(params) => {
   call { 
        invokeHandler(controllers.Repeat.mDownLoad(), HandlerDef(this, "controllers.Repeat", "mDownLoad", Nil,"POST", """""", Routes.prefix + """repeat/download"""))
   }
}
        

// @LINE:23
case controllers_Repeat_fileDownLoad15(params) => {
   call { 
        invokeHandler(controllers.Repeat.fileDownLoad(), HandlerDef(this, "controllers.Repeat", "fileDownLoad", Nil,"POST", """""", Routes.prefix + """repeat/filedownload"""))
   }
}
        

// @LINE:25
case controllers_Analysis_viewmusiccount16(params) => {
   call { 
        invokeHandler(controllers.Analysis.viewmusiccount(), HandlerDef(this, "controllers.Analysis", "viewmusiccount", Nil,"POST", """""", Routes.prefix + """analysis/viewmusiccount"""))
   }
}
        

// @LINE:28
case controllers_Assets_at17(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        