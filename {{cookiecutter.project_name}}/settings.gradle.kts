rootProject.name = "{{cookiecutter.project_name}}"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        val kotlinVersion: String by System.getProperties()
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
        kotlin("plugin.noarg") version kotlinVersion

        val sonarqubeVersion: String by System.getProperties()
        id("org.sonarqube") version sonarqubeVersion

        val dokkaVersion: String by System.getProperties()
        id("org.jetbrains.dokka") version dokkaVersion

        val nexusPublishPluginVersion: String by System.getProperties()
        id("io.github.gradle-nexus.publish-plugin") version nexusPublishPluginVersion
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