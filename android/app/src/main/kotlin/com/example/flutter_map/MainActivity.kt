package com.example.flutter_map

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import com.naver.maps.map.NaverMapSdk
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    private val CHANNEL = "com.startActivity/testChannel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        flutterEngine?.let { GeneratedPluginRegistrant.registerWith(it) }

        MethodChannel(flutterEngine?.dartExecutor?.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
            if (call.method.equals("StartSecondActivity")) {
                intent = Intent(this, NaverMapActivity::class.java)
                startActivity(intent)
                result.success("ActivityStarted")
            } else {
                result.notImplemented()
            }
        }
    }
}
