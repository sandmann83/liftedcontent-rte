package eu.sbradl.liftedcontent.rte

import eu.sbradl.liftedcontent.util.Module

import net.liftweb.http.ResourceServer

class RichTextEditorModule extends Module {
  
  override def init {
    ResourceServer.allow {
      case "rte" :: _ => true
    }
  }
  
}