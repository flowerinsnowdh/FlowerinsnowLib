plugins {
    id("java")
    id("java-library")
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
    api(project(":array"))
    api(project(":exception"))
    compileOnly(libs.jetbrains.annotations)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
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

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release = 8
}

tasks.named<JavaCompile>("compileTestJava") {
    options.release = java.toolchain.languageVersion.get().asInt()
}

tasks.withType<Javadoc>().configureEach {
    options.encoding = "UTF-8"
}
