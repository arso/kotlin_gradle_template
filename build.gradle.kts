import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "org.arso"
version = "1.0-SNAPSHOT"

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}
sourceSets.test {
    java.srcDirs("src/test/java", "src/test/kotlin")
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.mockito:mockito-core:3.+")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

//application {
//    mainClass.set("MainKt")
//}