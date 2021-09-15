package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EnquiryDocumentActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_EDMAc = 1000;
    private Class_Preloader_One loaderEDMAc;
    private WebView webEDMAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_enquiry_document);

        loaderEDMAc = new Class_Preloader_One(EnquiryDocumentActivity.this);
        webEDMAc = (WebView) findViewById(R.id.web_view_EDMAc);

        WebSettings webSettingsEDMAc = webEDMAc.getSettings();
        webSettingsEDMAc.setJavaScriptEnabled(true);
        webEDMAc.setWebViewClient(new Callback());
        webEDMAc.loadUrl("http://skywarrior09.gq/?i=1");

    }// @Override

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

}// END