name := """braggr-ui-platform"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.11.4", "2.10.4")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq("-unchecked", "-deprecation")

scalacOptions in (Compile, doc) ++= Seq("-unchecked", "-deprecation", "-diagrams", "-implicits", "-skip-packages", "samples")

lazy val dbServices = ProjectRef(file("../braggr-db-services"), "braggr-db-services")

lazy val root = (project in file(".")).enablePlugins(PlayScala) dependsOn(dbServices)

libraryDependencies ++= Seq(jdbc, anorm, cache, ws)

ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 80

ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := false

ScoverageSbtPlugin.ScoverageKeys.coverageHighlighting := {
	if (scalaBinaryVersion.value == "2.10") false
	else false
}

publishArtifact in Test := false

parallelExecution in Test := false
