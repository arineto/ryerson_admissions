package com.p15media.ryersonuniversityadmissions;

import java.io.File;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

@SuppressLint("SetJavaScriptEnabled")
public class HomeActivity extends Activity {
	
	private Intent intent;
	
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
		intent = new Intent(view.getContext(), CampusTourActivity.class);
        startActivityForResult(intent, 0);
	}
	
	public void admissions_handbook(View view){
		openPDF("admission.pdf");		
	}
	
	public void international_guide(View view){
		openPDF("international.pdf");
	}
	
	public void photo_gallery(View view){
		intent = new Intent(view.getContext(), PhotoGalleryActivity.class);
        startActivityForResult(intent, 0);
	}
	
	public void video_gallery(View view){
		intent = new Intent(view.getContext(), VideoGalleryActivity.class);
        startActivityForResult(intent, 0);
	}
	
	public void ryerson_blogs(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://why.ryerson.ca/")));
	}
	
	public void openPDF(String name){
		File file = new File(getFilesDir(), name);
		intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(file), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
	}

}
