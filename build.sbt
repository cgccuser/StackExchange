val scala3Version = "3.1.0"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project
  .in(file("."))
  .settings(
    name := "stackExchange",
    version := "0.1.0",
    // assembly / mainClass := Some("stackExchange"),
    assembly / assemblyOutputPath := new java.io.File(s"StackExchange.jar"),
    scalaVersion := scala3Version,
    scalacOptions ++= Seq(
      "-rewrite",
      "-indent"
    ),
    // libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )
