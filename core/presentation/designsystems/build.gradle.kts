plugins {
    alias(libs.plugins.weatherdemo.android.library.compose)
}

android {
    namespace = "com.weatherdemo.core.presentation.designsystems"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.tooling)
    api(libs.androidx.compose.material3)
}