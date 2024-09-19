package com.azrinurvani.kmp_data_time

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP Date Time",
    ) {
        App()
    }
}