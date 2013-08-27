package com.shashank.smartrail;

import android.os.Bundle;

import com.shashank.smartrail.activities.SmartTrainFragmentActivity;

public class MainActivity extends SmartTrainFragmentActivity {

	public MainActivity() {
		super(R.string.app_name);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getSupportActionBar().setDisplayShowHomeEnabled(false);
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// getSupportMenuInflater().inflate(R.menu.menu_blank, menu);
	// return true;
	// }
}
