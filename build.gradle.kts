plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "com.animalhierarchy"
version = "1.0.0"

repositories {
    mavenCentral()
}

// Matches your exact folder structure: src/main/kotlin
sourceSets {
    main {
        kotlin {
            srcDirs("src/main/kotlin")
        }
    }
}

dependencies {
    // Explicitly declared - fixes "Cannot access built-in declaration kotlin.String" error
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.23")
}

application {
    mainClass.set("MainKt")
}

// Fat JAR - packages everything into one runnable file
tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.runtimeClasspath.get().map {
        if (it.isDirectory) it else zipTree(it)
    })
}

kotlin {
    jvmToolchain(17)
}