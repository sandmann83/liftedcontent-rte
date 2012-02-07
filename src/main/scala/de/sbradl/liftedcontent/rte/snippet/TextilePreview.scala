package de.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.S
import net.liftweb.util.Helpers._
import net.liftweb.textile.TextileParser

object TextilePreview {

  def render = {
    "* *" #> TextileParser.toHtml(S.param("data").openOr(""))
  }

}