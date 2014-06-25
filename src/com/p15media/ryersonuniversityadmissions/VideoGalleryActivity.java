package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class VideoGalleryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_gallery);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video_gallery, menu);
		return true;
	}
}
