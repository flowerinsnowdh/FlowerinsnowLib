plugins {
    id("java")
    id("java-library")
    id("maven-publish")
}

group = rootProject.version
version = rootProject.version

repositories {
    System.getenv("GRADLE_CENTRAL_MIRROR")?.let {
        maven(it)
    }
    mavenCentral()
}

dependencies {
    api(project(":array"))
    api(project(":exception"))
    compileOnly("org.jetbrains:annotations:${project.property("deps.jetbrains.annotations.version")}")

    testImplementation(platform("org.junit:junit-bom:6.0.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }

    withSourcesJar()
    withJavadocJar()
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
