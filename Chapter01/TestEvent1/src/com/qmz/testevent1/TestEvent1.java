package com.qmz.testevent1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestEvent1 extends Activity {
	private static final String TAG = "TestEvent1";

	public TestEvent1() {

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_event1);
		final TextView Text = (TextView) findViewById(R.id.text1);
		final Button Button1 = (Button) findViewById(R.id.button1);
		final Button Button2 = (Button) findViewById(R.id.button2);
		Button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Text.setTextColor(Color.RED);
				Text.setText("red");
			}
		});
		Button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Text.setTextColor(Color.GREEN);
				Text.setText("green");
			}
		});

	}

}
