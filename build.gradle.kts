import org.jetbrains.changelog.Changelog

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.23"
    id("org.jetbrains.intellij") version "1.17.3"
    id("org.jetbrains.changelog") version "2.2.0"
}

group = "com.liuujun"
version = "1.0.4"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2023.2.6")
    type.set("IC") // Targ et IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}

// 配置插件
changelog{
    header.set(provider { version.get() }) //这里可以使用正则匹配
    groups.empty()
    repositoryUrl = "https://plugin.com" //这里配置插件地址
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("232")
        untilBuild.set("242.*")
        changeNotes.set(provider {
            changelog.renderItem(
                changelog
                    .getLatest()
                    .withHeader(false)
                    .withEmptySections(false),
                Changelog.OutputType.HTML
            )
        })
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
