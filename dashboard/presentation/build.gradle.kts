plugins {
    alias(libs.plugins.weatherdemo.android.feature.ui)
}

android {
    namespace = "com.weatherdemo.dashboard.presentation"
}

dependencies {

    implementation(projects.dashboard.domain)
    implementation(projects.core.domain)
}