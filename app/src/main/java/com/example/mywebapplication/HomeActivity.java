package com.example.mywebapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeActivity extends AppCompatActivity {

    WebView wv;
    String myPage = "https://www.armwebinfo.co.in/site/";
//    String myPageError = "file:///android_asset/myPageError/index.html";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().getJavaScriptEnabled();
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl(myPage);
//        wv.setWebViewClient(new WebViewClient() {
//            ;
//
//            public void onReceivedError(WebView view, int errorCode, String description, String faillingUrl) {
//                wv.loadUrl(myPageError);
    }
}



