package de.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.js.JsCmds
import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.SHtml
import net.liftweb.http.S
import eu.sbradl.repository.ContentRepository
import net.liftweb.util.Helpers._

class RichTextEditor {

  def textile = {
    <head>
      <link rel="stylesheet" type="text/css" href="/markitup/skins/markitup/style.css"/>
      <link rel="stylesheet" type="text/css" href="/markitup/style.css"/>
    </head>
    <tail>
      <script src="/markitup/jquery.markitup.js"></script>
      <script src="/markitup/set.js"></script>
      <script language="javascript">
        $('textarea').markItUp(mySettings);
      </script>
    </tail>
  }

  def render = <head>
                 <link rel="stylesheet" type="text/css" href="/css/sh_style.css"/>
                 <link rel="stylesheet" type="text/css" href="/css/sh_ide-eclipse.min.css"/>
               </head>
               <div id="editor_controls"></div>
               <tail>
                 <script language="javascript">
                   var CONTEXT_ROOT = "{ S.contextPath }";
                 </script>
                 <script src="/js/RichTextEditor.js"></script>
                 <script src="/js/sh_main.min.js"></script>
                 <script src="/js/sh_xml.min.js"></script>
                 <script src="/js/sh_java.min.js"></script>
                 <script language="javascript">
                   jQuery(document).ready(function() {{
  					  enableDesignMode();
  					  sh_highlightDocument();
  					}});
                 </script>
               </tail>

}