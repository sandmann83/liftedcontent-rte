import sbt._
import Keys._
    
object RichTextEditorBuild extends Build {
  val liftVersion = "2.4"

  override lazy val settings = super.settings ++ Seq(
    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.10" % "test",
      "org.specs2" %% "specs2" % "1.7.1" % "test",
      "org.slf4j" % "slf4j-log4j12" % "1.6.4",
      "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources,
      "net.liftweb" %% "lift-util" % liftVersion % "compile->default" withSources,
      "net.liftweb" %% "lift-common" % liftVersion % "compile->default" withSources,
      "net.liftweb" %% "lift-textile" % liftVersion % "compile->default" withSources,
      "eu.sbradl" %% "liftedcontent-util" % "1.0.0" % "compile"
    )
  )

  lazy val root = Project("RichTextEditor", file(".")) settings(Project.defaultSettings:_*)
} 
