package com.inventrohyder.alc4challenge1android;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView webView = findViewById(R.id.web_view);

        //WebViewClient enable launching about page within the app
        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedSslError (WebView webview, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });

        webView.loadUrl("https://andela.com/alc/");

        Objects.requireNonNull(getSupportActionBar()).setElevation(0);
    }
}
