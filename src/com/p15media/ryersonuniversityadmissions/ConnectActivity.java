package com.p15media.ryersonUniversityAdmissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ConnectActivity extends Activity {
	
	Integer[] imageViews = {R.id.imageView1, R.id.imageView2, R.id.imageView3, R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7};
	Integer[] pics = {R.drawable.lines, R.drawable.fb_icon, R.drawable.intagram_icon, R.drawable.snapchat_icon, R.drawable.vine_icon, R.drawable.twitter_icon, R.drawable.newsletter_icon};

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= 720) {
            setContentView(R.layout.activity_connect720);
        } else if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.activity_connect600);
        } else {
            setContentView(R.layout.activity_connect);
        }
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
		try{
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://snapchat.com"));
			intent.setPackage("com.snapchat.android");
			startActivity(intent);
		} catch(Exception e){
			try {
			    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.snapchat.android&hl=en")));
			} catch (android.content.ActivityNotFoundException anfe) {
			    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.snapchat.android&hl=en")));
			}
		}
	}
	
	public void openVine(View view){
		try{
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vine.co/RyersonUAR"));
			intent.setPackage("co.vine.android");
			startActivity(intent);
		} catch(Exception e){
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://vine.co/RyersonUAR")));
		}
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
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://why.ryerson.ca/newsletter-signup/")));
	}
}
