//Robert Payne
//In Class 2b
package com.example.inclass2b;

import com.example.inclass2b.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity implements OnCheckedChangeListener, OnSeekBarChangeListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		RadioGroup rg = (RadioGroup) findViewById (R.id.radioGroup1);
		rg.setOnCheckedChangeListener(this);
		RadioButton rb = (RadioButton) findViewById (R.id.radio0);
		rb.setChecked(true);
		SeekBar sb = (SeekBar) findViewById (R.id.seekBar1);
		sb.setProgress(90);
	    sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	    
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout);
				if(fromUser)
					rl.setAlpha((float) ((float)progress/100.0));
			
			}
		});
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout);
	
		switch (arg1) {
		case R.id.RadioButton02:

			rl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.RadioButton01:
			rl.setBackgroundColor(Color.RED);
			break;
		case R.id.radio0:
			rl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.radio1:
			rl.setBackgroundColor(Color.GREEN);
			break;
		case R.id.radio2:
			rl.setBackgroundColor(Color.BLUE);
			break;

		default:
			break;
		}
	}


	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout);
		if(arg2)
			rl.setAlpha((float) ((float)arg1/100.0));
		
		
	}


	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}

}

