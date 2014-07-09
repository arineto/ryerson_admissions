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
		openActivity(view.getContext(), R.raw.kerr, R.raw.khw_picture);
	}
	
	public void openRAC(View view){
		openActivity(view.getContext(), R.raw.rac, R.raw.rac_picture);
	}
	
	public void openTheatreSchool(View view){
		openActivity(view.getContext(), R.raw.theatreschool, R.raw.rts_picture);
	}
	
	public void openRyersonTheatre(View view){
		openActivity(view.getContext(), R.raw.theatre, R.raw.the_picture);
	}
	
	public void openArchitectureBuilding(View view){
		openActivity(view.getContext(), R.raw.architecture, R.raw.arc_picture);
	}
	
	public void openEricBuilding(View view){
		openActivity(view.getContext(), R.raw.eric, R.raw.eph_she_picture);
	}
	
	public void openGeorgeBuilding(View view){
		openActivity(view.getContext(), R.raw.george, R.raw.eng_picture);
	}
	
	public void openInteriorDesignBuilding(View view){
		openActivity(view.getContext(), R.raw.interiordesign, R.raw.sid_picture);
	}
	
	public void openMonetaryTimes(View view){
		openActivity(view.getContext(), R.raw.monetary, R.raw.mon_picture);
	}
	
	public void openRogersCentre(View view){
		openActivity(view.getContext(), R.raw.rcc, R.raw.rcc_picture);
	}
	
	public void openJorgensonHall(View view){
		openActivity(view.getContext(), R.raw.jorgenson, R.raw.jor_picture);
	}
	
	public void openLibrary(View view){
		openActivity(view.getContext(), R.raw.library, R.raw.lib_picture);
	}
	
	public void openPodiumBuilding(View view){
		openActivity(view.getContext(), R.raw.podium, R.raw.pod_picture);
	}
	
	public void openStudentLearningCentre(View view){
		openActivity(view.getContext(), R.raw.studentlearning, R.raw.slc_picture);
	}
	
	public void openRyersonBookstore(View view){
		openActivity(view.getContext(), R.raw.bookstore, R.raw.bks_picture);
	}
	
	public void openHeidenbergBuilding(View view){
		openActivity(view.getContext(), R.raw.heidelberg, R.raw.hei_picture);
	}
	
	public void openImageArtsBuilding(View view){
		openActivity(view.getContext(), R.raw.imagearts, R.raw.ric_picture);
	}
	
	public void openLakeDevo(View view){
		openActivity(view.getContext(), R.raw.lakedevo, R.raw.devo_picture);
	}
	
	public void openTedRogers(View view){
		openActivity(view.getContext(), R.raw.rogers, R.raw.trs_picture);
	}
	
	public void openSouthBuilding(View view){
		openActivity(view.getContext(), R.raw.southdond, R.raw.sbb_picture);
	}
	
	public void openStudentCampusCentre(View view){
		openActivity(view.getContext(), R.raw.studentcampus, R.raw.scc_picture);
	}
	
	public void openMattamyCentre(View view){
		openActivity(view.getContext(), R.raw.mattamy, R.raw.mac_picture);
	}
	
	public void openActivity(Context context, int video_name, int picture_name){
		intent = new Intent(context, BuildingsActivity.class);
		intent.putExtra("video_name", video_name);
		intent.putExtra("picture_name", picture_name);
        startActivity(intent);
	}
}
