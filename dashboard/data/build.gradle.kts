plugins {
    alias(libs.plugins.weatherdemo.android.library)
    alias(libs.plugins.weatherdemo.jvm.ktor)
}

android {
    namespace = "com.weatherdemo.dashboard.data"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.dashboard.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}