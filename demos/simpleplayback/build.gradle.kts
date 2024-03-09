// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    id("com.android.application") version "8.2.0-rc03" apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.hilt) apply false
}