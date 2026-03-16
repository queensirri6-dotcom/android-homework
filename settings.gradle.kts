// settings.gradle.kts

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "AnimalHierarchy"

// Optional subprojects:
// include("app")
// include("core")