import sbt._
import sbt.Keys._

object UbwSettings {

  val currentScalaVersion = "2.13.2"

  val setting1 = scalaVersion := currentScalaVersion
  val setting2 = version := "0.0.4-SNAP2020060801"
  val setting3 = organization := "org.xarcher"
  val setting4 = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

  val scalaVersionSettings = Seq(setting1, setting2, setting3, setting4)

}
