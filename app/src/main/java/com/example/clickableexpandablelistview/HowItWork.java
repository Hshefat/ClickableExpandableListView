package com.example.clickableexpandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class HowItWork extends AppCompatActivity {
    WebView W;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_it_works);

        W = (WebView) findViewById(R.id.webViewHowItWorks);
        progressBar = findViewById(R.id.progress_how_it_works);

        W.getSettings().setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
        W.loadUrl("http://www.helodoc.com/help/howitworks");

    }

    public class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }





}