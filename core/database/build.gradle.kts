plugins {
    alias(libs.plugins.weatherdemo.android.library)
    alias(libs.plugins.weatherdemo.android.room)
}

android {
    namespace = "com.weatherdemo.core.database"
}

dependencies {

    implementation(projects.core.domain)
}