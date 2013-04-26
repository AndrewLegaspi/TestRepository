package com.example.ocheminteract;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Mechanisms extends Activity {

	private Button sn2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mechanisms);
		
		sn2 = (Button) findViewById(R.id.mechanisms_button_sn2);
		
		sn2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent i = new Intent(Mechanisms.this, SN2.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mechanisms, menu);
		return true;
	}

}