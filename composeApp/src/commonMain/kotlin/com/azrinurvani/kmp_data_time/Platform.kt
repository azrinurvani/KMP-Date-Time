package com.azrinurvani.kmp_data_time

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform