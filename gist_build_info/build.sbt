
lazy val root = project
  .in(file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    name := "sandbox",
    description := "sbt project that compiles using Scala 3",
    version := "0.9.0",
    scalaVersion := "3.2.2",
    sbtVersion := "1.5.2",
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "net.codetojoy"
  )

libraryDependencies += "junit" % "junit" % "4.13.1" 
libraryDependencies += "org.scalatest" % "scalatest_3" % "3.2.9"
libraryDependencies += "org.scalatestplus" % "junit-4-13_3" % "3.2.9.0"

buildInfoKeys ++= Seq[BuildInfoKey](
  // Add a build number. Automatically incremented every time the code is compiled.
  buildInfoBuildNumber,
  // Add a custom field with the build size
  BuildInfoKey.action("buildTimestamp") {
    new java.util.Date().toString()
  }
)

