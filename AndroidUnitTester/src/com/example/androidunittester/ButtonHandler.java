package com.example.androidunittester;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonHandler implements OnClickListener {
	
	MainActivity parent;

	public ButtonHandler(MainActivity act) {
		this.parent = act;
	}

	@Override
	public void onClick(View v) {

		TextView view = null;
		view.setText("uh oh");
		
		switch (v.getId()){

		case R.id.button1:
			parent.toast("Button 1");
			break;
		case R.id.button2:
			parent.toast("Button 2");
			break;
		case R.id.button3:
			parent.toast("Button 3");
			break;
		case R.id.button4:
			parent.toast("Button 4");
			break;
			

		}
	}



	

}
