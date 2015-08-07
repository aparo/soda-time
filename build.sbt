val scala211Version="2.11.7"
val scala210Version="2.10.5"

lazy val root = project.in(file(".")).
  aggregate(sodatimeJS, sodatimeJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val sodatime = crossProject.in(file(".")).
  settings(
    name := "soda-time",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.11.7",
    organization := "org.mdedetrich",
    crossScalaVersions := Seq(scala211Version,scala210Version),
    libraryDependencies ++= Seq("org.scalatest" %%% "scalatest" % "3.0.0-M7" % "test")
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val sodatimeJVM = sodatime.jvm
lazy val sodatimeJS = sodatime.js
