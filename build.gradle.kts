val kotlin = "1.4.32"
val reactVersion = "17.0.2-pre.153-kotlin-$kotlin"
val styledVersion = "5.2.3-pre.153-kotlin-$kotlin"

plugins {
    kotlin("js") version "1.4.32"
}

group = "dev.skalable"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    maven(url = "https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    implementation("org.jetbrains:kotlin-react:$reactVersion")
    implementation("org.jetbrains:kotlin-react-dom:$reactVersion")
    implementation("org.jetbrains:kotlin-styled:$styledVersion")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}

