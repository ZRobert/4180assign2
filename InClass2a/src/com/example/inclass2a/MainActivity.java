//Robert Payne
//in Class 2a
package com.example.inclass2a;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;


public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		Button b3 = (Button) findViewById(R.id.button3);
		Button b4 = (Button) findViewById(R.id.button4);
		Button b5 = (Button) findViewById(R.id.button5);
				
		b1.setOnClickListener(this);

		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		TableLayout layout = (TableLayout) findViewById(R.id.TableLayout1);
		switch (v.getId()) {
		case R.id.button1:
			Log.d("myApp", "Button 1 Clicked !!");
			layout.setBackgroundColor(Color.BLACK);
			break;
		case R.id.button2:
			Log.d("myApp", "Button 1 Clicked !!");
			layout.setBackgroundColor(Color.WHITE);
			break;
		case R.id.button3:
			Log.d("myApp", "Button 3 Clicked !!");
			layout.setBackgroundColor(Color.RED);
			break;
		case R.id.button4:
			Log.d("myApp", "Button 4 Clicked !!");
			layout.setBackgroundColor(Color.GREEN);
			break;
		case R.id.button5:
			Log.d("myApp", "Button 5 Clicked !!");
			layout.setBackgroundColor(Color.BLUE);
			break;

		default:
			break;
		}

}
}
