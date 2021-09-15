package com.rafale.studio.v1.developerhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.chaos.view.PinView;

import soup.neumorphism.NeumorphImageButton;

public class OTPActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_OAc = 1000;
    private Class_Preloader_One loaderOAc;
    private NeumorphImageButton cancelBtnOAc;
    private TextView numShowOAc;
    private PinView pinViewOAc;
    private Button verifyBtnOAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_otpactivity);

        loaderOAc = new Class_Preloader_One(OTPActivity.this);
        cancelBtnOAc = (NeumorphImageButton) findViewById(R.id.cancle_btn_OAc);
        numShowOAc = (TextView) findViewById(R.id.num_show_area_text_OAc);
        pinViewOAc = (PinView) findViewById(R.id.pin_view_OAc);
        verifyBtnOAc = (Button) findViewById(R.id.verify_btn_OAc);

        String valueShowStr = getIntent().getStringExtra("ccpValueToShow");
        String numShowStr = getIntent().getStringExtra("numberToShow");
        numShowOAc.setText(valueShowStr + " " + numShowStr);

        verifyBtnOAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                successIntentOAc();
            }
        });

    }// @Override

    private void successIntentOAc() {
        String str_pinView_input = pinViewOAc.getText().toString().trim();

        if (str_pinView_input.isEmpty()) {
            pinViewOAc.setError("*required field!");
            pinViewOAc.requestFocus();
            return;
        } else if (str_pinView_input.length() != 6) {
            pinViewOAc.setError("*invalid OTP!");
            pinViewOAc.requestFocus();
            return;
        } else {
            loaderOAc.startLoadingDialog();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), MessageActivity_1.class));
                    finish();
                    loaderOAc.dismissDilog();
                }
            }, SPLASH_OAc);
        }
    }

}// END