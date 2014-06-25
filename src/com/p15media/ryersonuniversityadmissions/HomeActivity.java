package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	public void campus_tour(View view){
		Intent myIntent = new Intent(view.getContext(), CampusTourActivity.class);
        startActivityForResult(myIntent, 0);
	}
	
	public void admissions_handbook(View view){
		Intent myIntent = new Intent(view.getContext(), AdmissionsHandbookActivity.class);
        startActivityForResult(myIntent, 0);
	}
	
	public void international_guide(View view){
		Intent myIntent = new Intent(view.getContext(), InternationalGuideActivity.class);
        startActivityForResult(myIntent, 0);
	}
	
	public void photo_gallery(View view){
		Intent myIntent = new Intent(view.getContext(), PhotoGalleryActivity.class);
        startActivityForResult(myIntent, 0);
	}
	
	public void video_gallery(View view){
		Intent myIntent = new Intent(view.getContext(), VideoGalleryActivity.class);
        startActivityForResult(myIntent, 0);
	}
	
	public void ryerson_blogs(View view){
		Intent myIntent = new Intent(view.getContext(), RyersonBlogsActivity.class);
        startActivityForResult(myIntent, 0);
	}

}
