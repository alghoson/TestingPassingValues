package com.example.testingpassingvalues;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText mNameText;
	private EditText mEmailText;
	private EditText mAgeText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mNameText = (EditText) findViewById(R.id.myname);
		mEmailText = (EditText) findViewById(R.id.myemail);
		mAgeText = (EditText) findViewById(R.id.myage);
		
		Button btnNext = (Button) findViewById(R.id.calc);
		
		btnNext.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String name = mNameText.getText().toString();
				String email = mEmailText.getText().toString();
				String age = mAgeText.getText().toString();
				
				Intent i = new Intent();
				i.setClassName("com.example.testingpassingvalues", "com.example.testingpassingvalues.display");
				i.putExtra("Age", age);
				i.putExtra("Email", email);
				i.putExtra("Name", name);
				
				startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
