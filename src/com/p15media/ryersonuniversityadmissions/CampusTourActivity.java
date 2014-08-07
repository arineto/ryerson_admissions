package com.p15media.ryersonUniversityAdmissions;

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
		openActivity(view.getContext(), "Rx4mqpVCHh4", R.raw.khw_picture);
	}
	
	public void openRAC(View view){
		openActivity(view.getContext(), "hzHALKNwPlc", R.raw.rac_picture);
	}
	
	public void openTheatreSchool(View view){
		openActivity(view.getContext(), "-8Rrs3VbYBM", R.raw.rts_picture);
	}
	
	public void openRyersonTheatre(View view){
		openActivity(view.getContext(), "whBWjFQnYbU", R.raw.the_picture);
	}
	
	public void openArchitectureBuilding(View view){
		openActivity(view.getContext(), "qVKjJVEcY-w", R.raw.arc_picture);
	}
	
	public void openEricBuilding(View view){
		openActivity(view.getContext(), "3I9LwBZx2zI", R.raw.eph_she_picture);
	}
	
	public void openGeorgeBuilding(View view){
		openActivity(view.getContext(), "mvYhrvZtHMw", R.raw.eng_picture);
	}
	
	public void openInteriorDesignBuilding(View view){
		openActivity(view.getContext(), "FyWyNNm0YtY", R.raw.sid_picture);
	}
	
	public void openMonetaryTimes(View view){
		openActivity(view.getContext(), "TE0f5EBgvNk", R.raw.mon_picture);
	}
	
	public void openRogersCentre(View view){
		openActivity(view.getContext(), "IXCL5ZicMVg", R.raw.rcc_picture);
	}
	
	public void openJorgensonHall(View view){
		openActivity(view.getContext(), "mQPlPB30oDw", R.raw.jor_picture);
	}
	
	public void openLibrary(View view){
		openActivity(view.getContext(), "UrPWgULe0co", R.raw.lib_picture);
	}
	
	public void openPodiumBuilding(View view){
		openActivity(view.getContext(), "q8ExbI39Ajc", R.raw.pod_picture);
	}
	
	public void openStudentLearningCentre(View view){
		openActivity(view.getContext(), "hL0sQNrwQFo", R.raw.slc_picture);
	}
	
	public void openRyersonBookstore(View view){
		openActivity(view.getContext(), "qKrGL7RNbHU", R.raw.bks_picture);
	}
	
	public void openHeidenbergBuilding(View view){
		openActivity(view.getContext(), "m7HDPnXfFSk", R.raw.hei_picture);
	}
	
	public void openImageArtsBuilding(View view){
		openActivity(view.getContext(), "i6yScO1bO30", R.raw.ric_picture);
	}
	
	public void openLakeDevo(View view){
		openActivity(view.getContext(), "P6kTGxDj_0o", R.raw.devo_picture);
	}
	
	public void openTedRogers(View view){
		openActivity(view.getContext(), "60fuv4KZnqg", R.raw.trs_picture);
	}
	
	public void openSouthBuilding(View view){
		openActivity(view.getContext(), "izDo-Uc21jM", R.raw.sbb_picture);
	}
	
	public void openStudentCampusCentre(View view){
		openActivity(view.getContext(), "5PnVfmibcR4", R.raw.scc_picture);
	}
	
	public void openMattamyCentre(View view){
		openActivity(view.getContext(), "nhmk4Ez1qfE", R.raw.mac_picture);
	}
	
	public void openActivity(Context context, String video_name, int picture_name){
		intent = new Intent(context, BuildingsActivity.class);
		intent.putExtra("video_name", video_name);
		intent.putExtra("picture_name", picture_name);
        startActivity(intent);
	}
}
