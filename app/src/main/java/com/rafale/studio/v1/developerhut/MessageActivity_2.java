package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MessageActivity_2 extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_M2Ac = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_message2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                finish();
            }
        }, SPLASH_M2Ac);

    }// @Override

}// END