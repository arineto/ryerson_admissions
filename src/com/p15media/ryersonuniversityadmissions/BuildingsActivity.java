package com.p15media.ryersonuniversityadmissions;

import java.io.File;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class BuildingsActivity extends Activity {
	
	private String building;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buildings);
		
//		building = getIntent().getExtras().getString("building");
//		TextView text = (TextView) findViewById(R.id.building_text_test);
//		text.setText(building);
		
		VideoView videoView =(VideoView)findViewById(R.id.videoView);
	    MediaController mediaController= new MediaController(this);
	    mediaController.setAnchorView(videoView);   
	    File file = new File(getFilesDir(), "videoteste.mp4");
	    Uri uri = Uri.fromFile(file);    
	    videoView.setMediaController(mediaController);
	    videoView.setVideoURI(uri);        
	    videoView.requestFocus();

	    videoView.start();
	}
}
