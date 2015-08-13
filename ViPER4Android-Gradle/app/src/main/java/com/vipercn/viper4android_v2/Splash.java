package com.vipercn.viper4android_v2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	
	Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        @Override
    public void run()
        {
            finish();
        }
    }, 2000);

}}