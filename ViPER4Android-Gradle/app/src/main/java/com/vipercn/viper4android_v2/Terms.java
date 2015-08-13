package com.vipercn.viper4android_v2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.vipercn.viper4android_v2.preference.Settings;

public class Terms extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terms);
		
		
		// 버튼을 뷰와 연결한다.
        Button button = (Button) findViewById(R.id.terms_agree);
         
        // 버튼에 클릭 리스너를 등록한다.
        // 등록된 클릭 리스너는 버튼에 클릭 이벤트가 발생했을때 처리할 수 있다.
        button.setOnClickListener(new OnClickListener()
        {
            // 클릭 이벤트를 처리한다.
            public void onClick(View v)
            {
                // 무엇을 할지 정의 하는 인텐트를 생성한다.
                // FirstActivity에서 SecondActivity로 이동 할것을 정의하였다.
                Intent intent = new Intent(Terms.this, Settings.class);
                 
                // 인텐트에 있는 정보대로 액티비티를 시작한다.
                startActivity(intent);
            }
	

        });}}
