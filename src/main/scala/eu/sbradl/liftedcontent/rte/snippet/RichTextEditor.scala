package eu.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.S
import net.liftweb.util.Props

class RichTextEditor {

  def render = <head>
                 <script src="/js/jquery.js" type="text/javascript"></script>
                 <script src={ mercuryLoaderSrc } type="text/javascript"></script>
                 <script>
                 	jQuery(window).on('mercury:ready', function() {{
  						Mercury.saveUrl = '{S.contextPath + S.attr("saveUrl").openOr("/save")}';
  					}});
                 </script>
               </head>

  private def mercuryLoaderSrc = "/classpath/rte/javascripts/mercury_loader.js?pack=" + mercuryPackage + "&src=" + S.contextPath

  private def mercuryPackage = "bundled"

}