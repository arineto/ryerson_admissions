package com.p15media.ryersonuniversityadmissions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class HomeActivity extends Activity {
	
	private WebView webView;
	
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
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.provadys.com/wp-content/uploads/2013/10/test.pdf")));
	}
	
	public void international_guide(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hollywood-arts.org/wp-content/uploads/2014/05/pdf-sample.pdf")));
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
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://why.ryerson.ca/")));
	}

}
