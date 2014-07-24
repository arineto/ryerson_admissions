package com.p15media.ryersonuniversityadmissions;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class BuildingsActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

	private ImageView image;
	private String video_name;
	private int picture_name;
	static private final String DEVELOPER_KEY = "AIzaSyCYC7QzacEulGZDShoIjFcPB8pYQ2qqQBc";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buildings);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		video_name = getIntent().getExtras().getString("video_name");
		picture_name =  getIntent().getExtras().getInt("picture_name");
		
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
		youTubeView.initialize(DEVELOPER_KEY, this);
		
		final BitmapFactory.Options options = new BitmapFactory.Options();
		image = (ImageView) findViewById(R.id.building_image);
		image.setImageBitmap(new PictureBitmap(options).decodeSampledBitmapFromResource(getResources(), picture_name, 400, 400));
	}
	
	@Override
	public void onInitializationFailure(Provider provider, YouTubeInitializationResult error) {
		Toast.makeText(this, "Oh no! "+error.toString(),
		Toast.LENGTH_LONG).show();
	}
	
	@Override
	public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
		if (!wasRestored) {
			player.cueVideo(video_name);
	    }
	}
}
