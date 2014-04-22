package com.qmz.testevent3;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestEvent3 extends Activity {
	private static final String TAG = "TestEvent3";
	private TextView mText;                          
	private OnClickListener mListener1=new Button1_Listener();
	private OnClickListener mListener2=new Button2_Listener();
	public TestEvent3(){
		
	}
	class Button1_Listener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mText.setTextColor(Color.RED);
			mText.setText("RED");
		}
	}
	class Button2_Listener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mText.setTextColor(Color.GREEN);
			mText.setText("GREEN");
		}
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_event3);
        mText=(TextView)findViewById(R.id.text1);
        final Button mButton1=(Button)findViewById(R.id.button1);
        final Button mButton2=(Button)findViewById(R.id.button2);
        
        mButton1.setOnClickListener(mListener1);
        mButton2.setOnClickListener(mListener2);
    }



    
}
