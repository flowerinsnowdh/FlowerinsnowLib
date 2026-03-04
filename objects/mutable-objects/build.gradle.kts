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
    compileOnly(libs.jetbrains.annotations)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }

    withSourcesJar()
    withJavadocJar()
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 8
}

tasks.named<JavaCompile>("compileTestJava") {
    options.release = java.toolchain.languageVersion.get().asInt()
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