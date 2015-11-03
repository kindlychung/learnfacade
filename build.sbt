import SonatypeKeys._

sonatypeSettings

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "learnFacade"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.querki" %%% "querki-jsext" % "0.5",
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)