package com.example.apiapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp

class Myapp @Inject constructor():Application()
