name := """scala-play-angular-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).settings(
  watchSources ++= (baseDirectory.value / "ui/src" ** "*").get
)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.22",
  "com.typesafe.slick" %% "slick" % "3.3.2",
)
