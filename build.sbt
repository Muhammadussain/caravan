// See README.md for license details.

ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.github.merl"

name := "Caravan"
libraryDependencies ++= Seq(
  "edu.berkeley.cs" %% "chisel3" % "3.5.6",
  "edu.berkeley.cs" %% "chiseltest" % "0.5.6" % "test",
  "com.typesafe.play" %% "play-json" % "2.9.2"
)
scalacOptions ++= Seq(
  // removed "-Xsource:2.11" (incompatible with Scala 2.13); leave defaults to target current Scala
  "-language:reflectiveCalls",
  "-deprecation",
  "-feature",
  "-Xcheckinit"
)
addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.6" cross CrossVersion.full)


