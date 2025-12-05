plugins {
    id("java")
    id("maven-publish")
}

group = rootProject.group
version = rootProject.version

repositories {
    System.getenv("GRADLE_CENTRAL_MIRROR")?.let {
        maven(it)
    }
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:${project.property("deps.jetbrains.annotations.version")}")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }

    withSourcesJar()
    withJavadocJar()
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 8
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    repositories {
        maven("${property("maven_publish.github_packages")}") {
            credentials {
                username = "x-access-token"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
