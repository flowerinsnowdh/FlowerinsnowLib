plugins {
    id("java-platform")
    id("maven-publish")
}

group = rootProject.group
version = rootProject.version

dependencies {
    constraints {
        rootProject.subprojects.filterNot { it == project }.forEach(this::api)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["javaPlatform"])
        }
    }

    repositories {
        maven("${project.property("maven_publish.github_packages")}") {
            credentials {
                username = "x-access-token"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
