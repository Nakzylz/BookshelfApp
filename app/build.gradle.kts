plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.bookshelfapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.bookshelfapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    // Core Libraries
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // Retrofit for network requests
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Gson for JSON parsing
    implementation("com.google.code.gson:gson:2.8.8")

    // Coil for image loading in Compose
    implementation("coil-kt:coil-compose:2.4.0")

    // Compose libraries
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.material3:material3:1.1.0")
    implementation("androidx.compose.ui:ui:1.5.1")

    // Koin for Dependency Injection (no kapt required)
    implementation("io.insert-koin:koin-android:3.2.0")
    implementation("io.insert-koin:koin-core:3.2.0")

    // Testing dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.espresso:espresso-core:3.5.1")
}

