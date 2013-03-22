package com.example.androidunittester.test;

import android.test.ActivityInstrumentationTestCase2;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidunittester.MainActivity;
import com.example.androidunittester.R;

public class ButtonHandlerTester extends ActivityInstrumentationTestCase2 <MainActivity> {

	Button b1, b2, b3, b4;

	@SuppressWarnings("deprecation")
	public ButtonHandlerTester() {
		super("com.example.androidunittester", MainActivity.class);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		b1 = (Button) getActivity().findViewById(R.id.button1);
		b2 = (Button) getActivity().findViewById(R.id.button2);
		b3 = (Button) getActivity().findViewById(R.id.button3);
		b4 = (Button) getActivity().findViewById(R.id.button4);


	}

	public void testButton1() throws Exception {

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		sendKeys(KeyEvent.KEYCODE_DPAD_LEFT);

		assertTrue(b1.hasFocus());

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		assertTrue(b2.hasFocus());

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		assertTrue(b3.hasFocus());

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		assertTrue(b4.hasFocus());
	}

	public void testButton1Text() throws Exception {

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		sendKeys(KeyEvent.KEYCODE_DPAD_LEFT);

		assertTrue(b1.hasFocus());

		sendKeys(KeyEvent.KEYCODE_ENTER);
		Toast toast = getActivity().getToast();
		String displayedText = ((TextView)((LinearLayout)toast.getView()).getChildAt(0)).getText().toString();
		assertTrue(displayedText.equals("Button 1"));
	}

	public void testButton2Text() throws Exception {

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);

		assertTrue(b2.hasFocus());
		sendKeys(KeyEvent.KEYCODE_ENTER);
		Toast toast = getActivity().getToast();
		String displayedText = ((TextView)((LinearLayout)toast.getView()).getChildAt(0)).getText().toString();
		assertTrue(displayedText.equals("Button 2"));
	}

	public void testButton3Text() throws Exception {

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);

		assertTrue(b3.hasFocus());
		sendKeys(KeyEvent.KEYCODE_ENTER);
		Toast toast = getActivity().getToast();
		String displayedText = ((TextView)((LinearLayout)toast.getView()).getChildAt(0)).getText().toString();
		assertTrue(displayedText.equals("Button 3"));
	}
	
	public void testButton4Text() throws Exception {

		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);

		assertTrue(b4.hasFocus());
		sendKeys(KeyEvent.KEYCODE_ENTER);
		Toast toast = getActivity().getToast();
		String displayedText = ((TextView)((LinearLayout)toast.getView()).getChildAt(0)).getText().toString();
		assertTrue(displayedText.equals("Button 4"));
	}

}
