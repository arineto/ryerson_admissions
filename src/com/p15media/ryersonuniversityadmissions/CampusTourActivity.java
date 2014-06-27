package com.p15media.ryersonuniversityadmissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class CampusTourActivity extends Activity {
	
	private Intent intent;

	@SuppressLint("InlinedApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_DeviceDefault_Light);
		setContentView(R.layout.activity_campus_tour);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.campus_tour, menu);
		return true;
	}

	public void openKerrHall(View view){
		openActivity(view.getContext(), "kerr_hall");
	}
	
	public void openRAC(View view){
		openActivity(view.getContext(), "rac");
	}
	
	public void openTheatreSchool(View view){
		openActivity(view.getContext(), "theatre_school");
	}
	
	public void openRyersonTheatre(View view){
		openActivity(view.getContext(), "ryerson_theatre");
	}
	
	public void openArchitectureBuilding(View view){
		openActivity(view.getContext(), "architecture_building");
	}
	
	public void openEricBuilding(View view){
		openActivity(view.getContext(), "eric_building");
	}
	
	public void openGeorgeBuilding(View view){
		openActivity(view.getContext(), "george_building");
	}
	
	public void openInteriorDesignBuilding(View view){
		openActivity(view.getContext(), "interior_design_building");
	}
	
	public void openMonetaryTimes(View view){
		openActivity(view.getContext(), "monetary_times");
	}
	
	public void openRogersCentre(View view){
		openActivity(view.getContext(), "rogers_centre");
	}
	
	public void openJorgensonHall(View view){
		openActivity(view.getContext(), "jorgenson_hall");
	}
	
	public void openLibrary(View view){
		openActivity(view.getContext(), "library");
	}
	
	public void openPodiumBuilding(View view){
		openActivity(view.getContext(), "podium_building");
	}
	
	public void openStudentLearningCentre(View view){
		openActivity(view.getContext(), "student_learning_centre");
	}
	
	public void openRyersonBookstore(View view){
		openActivity(view.getContext(), "ryerson_bookstore");
	}
	
	public void openHeidenbergBuilding(View view){
		openActivity(view.getContext(), "heidenberg_building");
	}
	
	public void openImageArtsBuilding(View view){
		openActivity(view.getContext(), "image_arts_building");
	}
	
	public void openLakeDevo(View view){
		openActivity(view.getContext(), "lake_devo");
	}
	
	public void openTedRogers(View view){
		openActivity(view.getContext(), "ted_rogers");
	}
	
	public void openSouthBuilding(View view){
		openActivity(view.getContext(), "south_building");
	}
	
	public void openStudentCampusCentre(View view){
		openActivity(view.getContext(), "student_campus_centre");
	}
	
	public void openMattamyCentre(View view){
		openActivity(view.getContext(), "mattamy_centre");
	}
	
	public void openActivity(Context context, String building){
		intent = new Intent(context, BuildingsActivity.class);
		intent.putExtra("building", building);
        startActivity(intent);
	}
}
