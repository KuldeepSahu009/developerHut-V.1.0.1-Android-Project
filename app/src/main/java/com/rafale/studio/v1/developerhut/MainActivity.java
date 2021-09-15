package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_MAc = 2000;
    private Class_Preloader_One loaderMAc;
    private Animation leftInAnim, rightInAnim;
    private TextView textOne, textTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        leftInAnim = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        rightInAnim = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);

        loaderMAc = new Class_Preloader_One(MainActivity.this);
        textOne = (TextView) findViewById(R.id.textView);
        textTwo = (TextView) findViewById(R.id.textView2);

        textOne.setAnimation(leftInAnim);
        textTwo.setAnimation(rightInAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), IntroActivity.class));
                finish();
            }
        }, SPLASH_MAc);

    }// @Override

}// END