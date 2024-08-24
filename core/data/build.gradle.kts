plugins {
    alias(libs.plugins.weatherdemo.android.library)
    alias(libs.plugins.weatherdemo.jvm.ktor)
}

android {
    namespace = "com.weatherdemo.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}