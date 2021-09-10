plugins {
    java
    kotlin("jvm") version "1.4.10"
    scala
    application
}

group = "com.github.largogreentea"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
    maven("https://mvnrepository.com/artifact/org.yaml/snakeyaml")
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
    //scala
    implementation("org.scala-lang:scala-library:2.11.4")
    //Java Development Api
    implementation("net.dv8tion:JDA:4.3.0_277")
    implementation("com.jagrosh:jda-utilities:3.0.5")
    // https://mvnrepository.com/artifact/org.yaml/snakeyaml
    implementation("org.yaml:snakeyaml:1.27")
    testImplementation("org.scalatest:scalatest_2.11:3.0.0")
    testImplementation("junit:junit:4.13")
}
application{
    mainClass.set("${group}.${rootProject.name}.main")
}
