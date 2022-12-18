lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "spring-boot-scala-web",

  version := "1.0",

  scalaVersion := "2.13.1",

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.5.4",
    "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.5.4",
    "org.springframework.boot"%"spring-boot-starter-data-elasticsearch"%"2.5.4",
   ),

  mainClass := Some("example.Main")
)
