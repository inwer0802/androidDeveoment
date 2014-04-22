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

public class TestEvent2 extends Activity implements OnClickListener {						//ʵ����صĽӿ�
	private static final String TAG = "TestEvent2";
	private TextView mText;                                           										//����ؼ��������
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
        mButton1.setOnClickListener(this);												//���ü�����ΪTestEvent2
        mButton2=(Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(this);												//���ü�����ΪTestEvent2
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.v(TAG, "onClick()"); 
		switch (v.getId()) {																		//ͨ��getId()���ֲ�ͬ�Ŀؼ�
		case R.id.button1:
			mText.setTextColor(Color.RED);													//�����ı����ı���ɫΪ��
			mText.setText("red");
			break;
		case R.id.button2:
		mText.setTextColor(Color.GREEN);													//�����ı����ı���ɫΪ��
		mText.setText("green");
		break;
		default:
			Log.v(TAG, "other");
			break;
		}
		
	}
    
}
