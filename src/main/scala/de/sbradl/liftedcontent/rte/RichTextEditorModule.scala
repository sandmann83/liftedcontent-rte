package de.sbradl.liftedcontent.rte

import net.liftweb.sitemap.LocPath.stringToLocPath
import net.liftweb.sitemap.Loc.Hidden
import net.liftweb.sitemap.Menu
import de.sbradl.liftedcontent.util.Module

class RichTextEditorModule extends Module {

  def name = "RichTextEditor"

  override def menus = List(Menu.i("TEXTILE_PREVIEW") / "textile" >> Hidden)
}