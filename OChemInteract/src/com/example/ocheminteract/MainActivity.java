package com.example.ocheminteract;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button mechanisms;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mechanisms = (Button) findViewById(R.id.main_button_mechanisms);
		
		mechanisms.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent i = new Intent(MainActivity.this, Mechanisms.class);
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