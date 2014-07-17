package com.p15media.ryersonuniversityadmissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class VideoGalleryActivity extends Activity {
	
	private Intent intent;

	@SuppressLint("InlinedApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= 720) {
            setContentView(R.layout.activity_video_gallery720);
        } else if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.activity_video_gallery600);
        } else {
            setContentView(R.layout.activity_video_gallery);
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.video_gallery, menu);
		return true;
	}
	
	public void openMakeYourMark(View view){
		intent = new Intent(Intent.ACTION_VIEW);
		intent.setPackage("com.google.android.youtube");
	    intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PL6F3AF1921499DB91"));
	    startActivity(intent);
	}
	
	public void openHowTo(View view){
		intent = new Intent(Intent.ACTION_VIEW);
		intent.setPackage("com.google.android.youtube");
	    intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLnivnh4KiGgQ8KJJBswnuG2XMPc1ObI5t"));
	    startActivity(intent);
	}
	
	public void openCampusLife(View view){
		intent = new Intent(Intent.ACTION_VIEW);
		intent.setPackage("com.google.android.youtube");
	    intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PL7C014DFB4F08FF43"));
	    startActivity(intent);
	}
	
	public void openAdmissionsPage(View view){
		intent = new Intent(Intent.ACTION_VIEW);
		intent.setPackage("com.google.android.youtube");
	    intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PL13AC54E9C6F52776"));
	    startActivity(intent);
	}
}
