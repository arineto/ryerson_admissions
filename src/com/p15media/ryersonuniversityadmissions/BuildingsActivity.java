package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class BuildingsActivity extends Activity {
	
	private VideoView video;
	private ImageView image;
	private MediaController controller;
	private String path;
	private int video_name;
	private int picture_name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buildings);
		
		video_name = getIntent().getExtras().getInt("video_name");
		picture_name =  getIntent().getExtras().getInt("picture_name");
		
		image = (ImageView) findViewById(R.id.building_image);
		image.setImageBitmap(new PictureBitmap(getResources(), picture_name, 400, 400).decodeSampledBitmapFromResource());
		
		video = (VideoView) findViewById(R.id.building_video);
		path = "android.resource://" + getPackageName() + "/" + video_name;
		video.setVideoURI(Uri.parse(path));
		video.start();
		
		controller = new MediaController(this);
		controller.setMediaPlayer(video);
		video.setMediaController(controller);
		
	}
}
