package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class PrivacyPolicyActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_PPAc = 1000;
    private Class_Preloader_One loaderPPAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_privacy_policy);

        loaderPPAc = new Class_Preloader_One(PrivacyPolicyActivity.this);

    }// @Override

}// END