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
		openActivity(view.getContext(), R.raw.kerr);
	}
	
	public void openRAC(View view){
		openActivity(view.getContext(), R.raw.rac);
	}
	
	public void openTheatreSchool(View view){
		openActivity(view.getContext(), R.raw.theatreschool);
	}
	
	public void openRyersonTheatre(View view){
		openActivity(view.getContext(), R.raw.theatre);
	}
	
	public void openArchitectureBuilding(View view){
		openActivity(view.getContext(), R.raw.architecture);
	}
	
	public void openEricBuilding(View view){
		openActivity(view.getContext(), R.raw.eric);
	}
	
	public void openGeorgeBuilding(View view){
		openActivity(view.getContext(), R.raw.george);
	}
	
	public void openInteriorDesignBuilding(View view){
		openActivity(view.getContext(), R.raw.interiordesign);
	}
	
	public void openMonetaryTimes(View view){
		openActivity(view.getContext(), R.raw.monetary);
	}
	
	public void openRogersCentre(View view){
		openActivity(view.getContext(), R.raw.rcc);
	}
	
	public void openJorgensonHall(View view){
		openActivity(view.getContext(), R.raw.jorgenson);
	}
	
	public void openLibrary(View view){
		openActivity(view.getContext(), R.raw.library);
	}
	
	public void openPodiumBuilding(View view){
		openActivity(view.getContext(), R.raw.podium);
	}
	
	public void openStudentLearningCentre(View view){
		openActivity(view.getContext(), R.raw.studentlearning);
	}
	
	public void openRyersonBookstore(View view){
		openActivity(view.getContext(), R.raw.bookstore);
	}
	
	public void openHeidenbergBuilding(View view){
		openActivity(view.getContext(), R.raw.heidelberg);
	}
	
	public void openImageArtsBuilding(View view){
		openActivity(view.getContext(), R.raw.imagearts);
	}
	
	public void openLakeDevo(View view){
		openActivity(view.getContext(), R.raw.lakedevo);
	}
	
	public void openTedRogers(View view){
		openActivity(view.getContext(), R.raw.rogers);
	}
	
	public void openSouthBuilding(View view){
		openActivity(view.getContext(), R.raw.southdond);
	}
	
	public void openStudentCampusCentre(View view){
		openActivity(view.getContext(), R.raw.studentcampus);
	}
	
	public void openMattamyCentre(View view){
		openActivity(view.getContext(), R.raw.mattamy);
	}
	
	public void openActivity(Context context, int video_name){
		intent = new Intent(context, BuildingsActivity.class);
		intent.putExtra("video_name", video_name);
        startActivity(intent);
	}
}
