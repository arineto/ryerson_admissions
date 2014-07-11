package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ConnectActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect);
	}
	
	public void openFacebook(View view){
		try {
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/118137451556523"));
			intent.setPackage("com.facebook.katana");
			startActivity(intent);
		} catch (Exception e) {
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RyersonUAR")));
		}
	}
	
	public void openInstagram(View view){
	    try {
	    	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/RyersonUAR"));
	    	intent.setPackage("com.instagram.android");
	        startActivity(intent);
	    } catch (ActivityNotFoundException e) {
	        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/RyersonUAR")));
	    }
	}
	
	public void openSnapchat(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://snapchat.com")));
	}
	
	public void openVine(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://vine.co/RyersonUAR")));
	}
	
	public void openTwitter(View view){
		try {
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=123575972"));
			startActivity(intent);
		}catch (Exception e) {
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/RyersonUAR")));
		}
	}
	
	public void openNews(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mailoutinteractive.com/Industry/Subscribe.aspx?m=30364")));
	}
}
