package eu.sbradl.liftedcontent.rte.snippet

import net.liftweb.http.S
import net.liftweb.util.Props

class RichTextEditor {

  def render = <head>
                 <script src="/js/jquery.js" type="text/javascript"></script>
                 <script src={ mercuryLoaderSrc } type="text/javascript"></script>
                 <script>
                   jQuery(window).on('mercury:ready', function() {{
  Mercury.saveUrl = '{S.contextPath + "/save"}';
}});
                 </script>
               </head>

  private def mercuryLoaderSrc = "/classpath/rte/mercury_loader.js?pack=" + mercuryPackage + "&src=" + S.contextPath + "/classpath/rte"

  //  private def mercuryPackage = Props.mode match {
  //    case Props.RunModes.Development => "development"
  //    case _ =>
  //  }
  private def mercuryPackage = "bundled"

}