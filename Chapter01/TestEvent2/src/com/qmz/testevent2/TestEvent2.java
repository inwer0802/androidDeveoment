package com.qmz.testevent2;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestEvent2 extends Activity implements OnClickListener {						//实现相关的接口
	private static final String TAG = "TestEvent2";
	private TextView mText;                                           										//保存控件类的引用
	private Button mButton1;
	private TextView mButton2;
	public TestEvent2(){
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_event2);
        mText=(TextView)findViewById(R.id.text1);
        mButton1=(Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(this);												//设置监听者为TestEvent2
        mButton2=(Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(this);												//设置监听者为TestEvent2
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.v(TAG, "onClick()"); 
		switch (v.getId()) {																		//通过getId()区分不同的控件
		case R.id.button1:
			mText.setTextColor(Color.RED);													//设置文本和文本颜色为红
			mText.setText("red");
			break;
		case R.id.button2:
		mText.setTextColor(Color.GREEN);													//设置文本和文本颜色为绿
		mText.setText("green");
		break;
		default:
			Log.v(TAG, "other");
			break;
		}
		
	}
    
}
