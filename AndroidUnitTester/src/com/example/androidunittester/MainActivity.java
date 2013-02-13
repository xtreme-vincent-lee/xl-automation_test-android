package com.example.androidunittester;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b1, b2, b3, b4;
	Toast myToast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		
		ButtonHandler bh = new ButtonHandler(this);
		
		b1.setOnClickListener(bh);
		b2.setOnClickListener(bh);
		b3.setOnClickListener(bh);
		b4.setOnClickListener(bh);
		



	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	public void toast(String msg){
		myToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
		myToast.show();
	}


	public Toast getToast(){
		return myToast;
	}
	
}
