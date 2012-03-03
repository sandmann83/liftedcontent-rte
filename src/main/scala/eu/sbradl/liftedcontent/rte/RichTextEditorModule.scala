package eu.sbradl.liftedcontent.rte

import eu.sbradl.liftedcontent.util.Module

import net.liftweb.http.ResourceServer
import net.liftweb.sitemap.LocPath.stringToLocPath
import net.liftweb.sitemap.Loc.Hidden
import net.liftweb.sitemap.Menu

class RichTextEditorModule extends Module {

  def name = "RichTextEditor"

  override def menus = List(Menu.i("TEXTILE_PREVIEW") / "textile" >> Hidden)

  override def init {
    ResourceServer.allow {
      case "rte" :: _ => true
    }
  }
}