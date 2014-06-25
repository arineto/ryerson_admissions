package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class AdmissionsHandbookActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admissions_handbook);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admissions_handbook, menu);
		return true;
	}

}
