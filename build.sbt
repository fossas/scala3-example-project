lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-example-project",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.1.2",
     libraryDependencies ++= Seq(
      "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.26",
      "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
