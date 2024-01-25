package com.example.android_webview_demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()


    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup(){

        val webViewer = findViewById<WebView>(R.id.wb_View)

        webViewer.webViewClient = WebViewClient()


        webViewer.apply {

            //Load the desired URL
            loadUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true



        }

    }


}