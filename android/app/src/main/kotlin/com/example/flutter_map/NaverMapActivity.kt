package com.example.flutter_map

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.fragment.app.FragmentActivity
import com.naver.maps.map.NaverMapSdk


class NaverMapActivity: FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NaverMapSdk.getInstance(this).client =
                NaverMapSdk.NaverCloudPlatformClient("ijsjvd6csc")

        setContentView(R.layout.activity_navermap)
    }
}