package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class BuildingsActivity extends Activity {
	
	private VideoView video;
	private MediaController controller;
	private String path;
	private int video_name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buildings);
		
		video_name = getIntent().getExtras().getInt("video_name");
		
		video = (VideoView) findViewById(R.id.building_video);
		path = "android.resource://" + getPackageName() + "/" + video_name;
		video.setVideoURI(Uri.parse(path));
		video.start();
		
		controller = new MediaController(this);
		controller.setMediaPlayer(video);
		video.setMediaController(controller);
		
	}
}
