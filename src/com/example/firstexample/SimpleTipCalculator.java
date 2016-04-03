package com.example.firstexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleTipCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		
		initDisplayButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	private void initDisplayButton(){
		Button dispButton = (Button)findViewById(R.id.button1);
		dispButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				EditText editText1 = (EditText)findViewById(R.id.editText1);
				EditText editText2 = (EditText)findViewById(R.id.editText2);
				EditText editText3 = (EditText)findViewById(R.id.editText3);
				EditText editText4 = (EditText)findViewById(R.id.editText4);
				TextView textDisp = (TextView)findViewById(R.id.textView1);
				TextView textDisp2 = (TextView)findViewById(R.id.textView2);
				
				String nameToDisp = editText1.getText().toString();
				String nameToDisp2 = editText2.getText().toString();
				float num1 = Float.parseFloat(nameToDisp);
				float num2 = Float.parseFloat(nameToDisp2);
				float TipPercentage=num1*(num2/100);
				float TotalBill=num1+TipPercentage;
				String strAmount=String.valueOf(TipPercentage);
				String strAmount2=String.valueOf(TotalBill);
				
				editText3.setText(strAmount);
				editText4.setText(strAmount2);
				
			}
			
			
		});
		Button dispButton2 = (Button)findViewById(R.id.button3);
		dispButton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText editText1 = (EditText)findViewById(R.id.editText1);
				EditText editText2 = (EditText)findViewById(R.id.editText2);
				EditText editText3 = (EditText)findViewById(R.id.editText3);
				EditText editText4 = (EditText)findViewById(R.id.editText4);
				TextView textDisp = (TextView)findViewById(R.id.textView1);
				TextView textDisp2 = (TextView)findViewById(R.id.textView2);
				
				editText1.setText(" ");
				editText2.setText(" ");
				editText3.setText(" ");
				editText4.setText(" ");
				
			}
			
			
		})
		
		
		;
		
		
	}
}
