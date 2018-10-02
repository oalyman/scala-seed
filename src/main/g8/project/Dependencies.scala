import sbt._

object Dependencies {

  lazy val compileDeps: Seq[ModuleID] = Seq(
    "com.github.pathikrit" %% "better-files" % "3.6.0",
    "com.beachape"         %% "enumeratum"   % "1.5.13"
  )

  lazy val testDeps: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )

}
