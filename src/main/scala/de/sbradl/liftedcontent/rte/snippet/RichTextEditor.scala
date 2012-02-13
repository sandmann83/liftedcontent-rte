package de.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.S

class RichTextEditor {

  def textile = {
    <head>
      <link rel="stylesheet" type="text/css" href="/classpath/rte/markitup/skins/markitup/style.css"/>
      <link rel="stylesheet" type="text/css" href="/classpath/rte/markitup/style.css"/>
    </head>
    <tail>
      <script src="/classpath/rte/markitup/jquery.markitup.js"></script>
      <script src="/classpath/rte/markitup/set.js"></script>
      <script language="javascript">
		mySettings.previewParserPath = '{S.contextPath + "/textile"}';
        $('textarea').markItUp(mySettings);
      </script>
    </tail>
  }

  def render = <head>
                 <link rel="stylesheet" type="text/css" href="/classpath/rte/css/sh_style.css"/>
                 <link rel="stylesheet" type="text/css" href="/classpath/rte/css/sh_ide-eclipse.min.css"/>
               </head>
               <div id="editor_controls"></div>
               <tail>
                 <script language="javascript">
                   var CONTEXT_ROOT = "{ S.contextPath }";
                 </script>
                 <script src="/classpath/rte/js/RichTextEditor.js"></script>
                 <script src="/classpath/rte/js/sh_main.min.js"></script>
                 <script src="/classpath/rte/js/sh_xml.min.js"></script>
                 <script src="/classpath/rte/js/sh_java.min.js"></script>
                 <script language="javascript">
                   jQuery(document).ready(function() {{
  					  enableDesignMode();
  					  sh_highlightDocument();
  					}});
                 </script>
               </tail>

}