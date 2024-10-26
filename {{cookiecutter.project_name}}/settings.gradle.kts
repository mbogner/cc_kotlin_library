rootProject.name = "{{cookiecutter.project_name}}"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        val kotlinVersion: String by System.getProperties()
        val sonarqubeVersion: String by System.getProperties()

        kotlin("jvm") version kotlinVersion
        id("org.sonarqube") version sonarqubeVersion
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val bomVersion: String by System.getProperties()
            version("bom", bomVersion)
            library("bom", "dev.mbo", "spring-boot-bom").versionRef("bom")
        }
    }
}