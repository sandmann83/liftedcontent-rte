package de.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.js.JsCmds
import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.SHtml

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

  def render = {
    <head>
      <link rel="stylesheet" type="text/css" href="/css/aloha.css"/>
    </head>
    <tail>
      <script src="/lib/aloha.js" data-aloha-plugins="common/abbr,common/align,common/block,common/horizontalruler,common/format,common/table,common/link,common/list,common/undo"></script>
      <script type="text/javascript">
        Aloha.ready( function() {{
         
        // Make #content editable once Aloha is loaded and ready.
        Aloha.jQuery('.editable').aloha();
         
    }});
      </script>
    </tail>

  }

}