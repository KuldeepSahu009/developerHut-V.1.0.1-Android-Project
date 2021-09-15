package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_IAc = 1000;
    private Class_Preloader_One loaderIAc;
    private Button signInUpBtn_IAc, guestBtn_IAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);

        loaderIAc = new Class_Preloader_One(IntroActivity.this);
        signInUpBtn_IAc = (Button) findViewById(R.id.signin_signup_btn_IAc);
        guestBtn_IAc = (Button) findViewById(R.id.guest_btn_IAc);

        signInUpBtn_IAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSignInUpBtn();
            }
        });

        guestBtn_IAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickGuistBtn();
            }
        });

    }// @Override

    private void clickGuistBtn() {
        loaderIAc.startLoadingDialog();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(IntroActivity.this, "under construction!", Toast.LENGTH_SHORT).show();
                loaderIAc.dismissDilog();
            }
        }, SPLASH_IAc);
    }

    private void clickSignInUpBtn() {
        loaderIAc.startLoadingDialog();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(IntroActivity.this, PhoneAuthActivity.class));
                finish();
                loaderIAc.dismissDilog();
            }
        }, SPLASH_IAc);
    }

}// END