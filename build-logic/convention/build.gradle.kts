plugins {
    `kotlin-dsl`
}

group = "com.weatherdemo.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication"){
            id = "weatherdemo.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose"){
            id = "weatherdemo.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary"){
            id = "weatherdemo.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose"){
            id = "weatherdemo.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidFeatureUi"){
            id = "weatherdemo.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }

        register("androidRoom"){
            id = "weatherdemo.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }

        register("jvmLibrary"){
            id = "weatherdemo.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("jvmKtor"){
            id = "weatherdemo.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"
        }
    }
}