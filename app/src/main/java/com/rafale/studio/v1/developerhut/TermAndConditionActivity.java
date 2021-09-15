package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class TermAndConditionActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_TACAc = 1000;
    private Class_Preloader_One loaderTACAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_term_and_condition);

        loaderTACAc = new Class_Preloader_One(TermAndConditionActivity.this);

    }// @Override

}// END