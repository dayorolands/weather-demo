plugins {
    alias(libs.plugins.weatherdemo.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}
