plugins {
    alias(libs.plugins.weatherdemo.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}