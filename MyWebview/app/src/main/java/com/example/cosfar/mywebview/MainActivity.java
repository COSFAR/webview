package com.example.cosfar.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mWebView=(WebView) findViewById(R.id.mWebView);
        // specify the url of the web page in loadUrl function
        mWebView.loadUrl("file:///android_asset/simple.html");
        // указываем страницу загрузки

    }


}
