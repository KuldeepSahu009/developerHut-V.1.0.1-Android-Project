package com.rafale.studio.v1.developerhut;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

import java.util.concurrent.TimeUnit;

import soup.neumorphism.NeumorphImageButton;

public class PhoneAuthActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu on 2/08/2021.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     * Developed Under: @Rafale_Studio
     */

    private static int SPLASH_PAAc = 1000;
    private Class_Preloader_One loaderPAAc;
    private NeumorphImageButton backBtn_PAAc;
    private EditText numberInput_PAAc;
    private CountryCodePicker CCP_PAAc;
    private Button sendBtn_PAAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_phone_auth);

        loaderPAAc = new Class_Preloader_One(PhoneAuthActivity.this);
        backBtn_PAAc = (NeumorphImageButton) findViewById(R.id.back_btn_PAAc);
        numberInput_PAAc = (EditText) findViewById(R.id.mobile_number_input_PAAc);
        CCP_PAAc = (CountryCodePicker) findViewById(R.id.ccp_PAAc);
        sendBtn_PAAc = (Button) findViewById(R.id.send_btn_PAAc);

        sendBtn_PAAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_ccpValuePPAc = CCP_PAAc.getTextView_selectedCountry().toString().trim();
                String str_numberInputPPAc = numberInput_PAAc.getText().toString().trim();

                if (str_numberInputPPAc.isEmpty()) {
                    numberInput_PAAc.setError("*required field!");
                    numberInput_PAAc.requestFocus();
                    return;
                } else if (str_numberInputPPAc.length() != 10) {
                    numberInput_PAAc.setError("*invalid number!");
                    numberInput_PAAc.requestFocus();
                    return;
                } else if (str_numberInputPPAc.length() == 10) {
                    loaderPAAc.startLoadingDialog();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intentPAAc = new Intent(getApplicationContext(), OTPActivity.class);
                            intentPAAc.putExtra("numberToShow", str_numberInputPPAc);
                            intentPAAc.putExtra("ccpValueToShow", str_ccpValuePPAc);
                            startActivity(intentPAAc);
                            loaderPAAc.dismissDilog();
                        }
                    }, SPLASH_PAAc);
                } else {
                    numberInput_PAAc.setError("*something went wrong!");
                    numberInput_PAAc.requestFocus();
                    return;
                }
            }
        });

    }// @Override

}// END