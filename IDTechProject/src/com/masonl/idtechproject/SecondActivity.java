package com.masonl.idtechproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {
	
	int CountDownTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		final TextView text1 = (TextView) findViewById(R.id.textView1);
		
		final TextView text2 = (TextView) findViewById(R.id.textView2);
		
		Button button1 = (Button) findViewById(R.id.button1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				startActivity(intent);
				
			}
		});
		
		 new CountDownTimer(60000, 1000) {

		     public void onTick(long millisUntilFinished) {
		         text1.setText("Seconds Remaining: " + millisUntilFinished / 1000);
		     }

		     public void onFinish() {
		    	 text1.setText("");
		         text2.setText("Done!");
		     }
		  }.start();
		
	}

}
