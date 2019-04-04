val publishVersion = "0.0.1"

version in ThisBuild := {
  val branch = git.gitCurrentBranch.value
  if (branch == "master") publishVersion
  else s"${publishVersion}-$branch-SNAPSHOT"
}

organization in ThisBuild := "com.github.fit51"
homepage in ThisBuild := Some(url("https://github.com/fit51/monix-etcd"))

scmInfo in ThisBuild := Some(
  ScmInfo(url("https://github.com/fit51/monix-etcd"), "git@github.com:fit51/monix-etcd.git")
)
developers in ThisBuild := List(
  Developer("fit51", "Pavel Kondratyuk", "fit511@yandex.ru", url("https://github.com/fit51"))
)
licenses in ThisBuild += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
publishMavenStyle in ThisBuild := true

publishTo in ThisBuild := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

useGpg in ThisBuild := true
pomIncludeRepository in ThisBuild := { _ => false }

updateOptions in ThisBuild := updateOptions.value.withGigahorse(false)

credentials in ThisBuild += Credentials(Path.userHome / ".sbt" / "sonatype_credentials")