import Dependencies._
import InitialCommands._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.11",
      version := "$version$"
    )),
    name := "$name$",
    libraryDependencies ++= Dependencies.apply,
    initialCommands := InitialCommands.apply
  )
