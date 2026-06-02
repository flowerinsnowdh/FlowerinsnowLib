// SPDX-License-Identifier: LGPL-3.0-or-later
// SPDX-SnippetCopyrightText: 2026 flowerinsnow <flowerimsnow@gmail.com>

// Copyright (C) 2026  flowerinsnow <flowerimsnow@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

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

            pom {
                name = "${project.property("maven_publish.pom.name")} :objects-mutable-objects"
                description = "${project.property("maven_publish.pom.description")}"
                url = "${project.property("maven_publish.pom.url")}"
                licenses {
                    license {
                        name = "${project.property("maven_publish.pom.license.name")}"
                        url = "${project.property("maven_publish.pom.license.url")}"
                        distribution = "repo"
                    }
                }
                developers {
                    developer {
                        id = "${project.property("maven_publish.pom.developers.flowerinsnow.id")}"
                        name = "${project.property("maven_publish.pom.developers.flowerinsnow.name")}"
                        email = "${project.property("maven_publish.pom.developers.flowerinsnow.email")}"
                        url = "${project.property("maven_publish.pom.developers.flowerinsnow.url")}"
                        timezone = "${project.property("maven_publish.pom.developers.flowerinsnow.timezone")}"
                    }
                }
                scm {
                    connection = "${project.property("maven_publish.pom.scm.connection")}"
                    developerConnection = "${project.property("maven_publish.pom.scm.developerConnection")}"
                    tag = "${project.property("maven_publish.pom.scm.tag")}"
                    url = "${project.property("maven_publish.pom.scm.url")}"
                }
            }
        }
    }

    repositories {
        maven("${project.property("maven_publish.repo.github_packages")}") {
            credentials {
                username = "x-access-token"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

tasks.named<Jar>("jar") {
    from(rootProject.file("LICENSES/LGPL-3.0-or-later.txt")) {
        rename { "LICENSE" }
        into("META-INF/")
    }
    from(rootProject.file("NOTICE")) {
        into("META-INF/")
    }
}