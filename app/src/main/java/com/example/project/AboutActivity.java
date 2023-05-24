package com.example.project;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = findViewById(R.id.about_WebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/about.html");
    }
}
