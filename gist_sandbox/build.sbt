lazy val root = project
  .in(file("."))
  .settings(
    name := "sandbox",
    description := "sbt project that compiles using Scala 3",
    version := "0.9.0",
    scalaVersion := "3.2.2"
  )

libraryDependencies += "junit" % "junit" % "4.13.1" 
libraryDependencies += "org.scalatest" % "scalatest_3" % "3.2.9"
libraryDependencies += "org.scalatestplus" % "junit-4-13_3" % "3.2.9.0"
