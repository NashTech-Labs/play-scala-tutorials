name := """play-scala-tutorials"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(jdbc, anorm, cache, ws)

instrumentSettings

ScoverageKeys.minimumCoverage := 70

ScoverageKeys.failOnMinimumCoverage := false

ScoverageKeys.highlighting := false

publishArtifact in Test := false

parallelExecution in Test := false
