package com.p15media.ryersonuniversityadmissions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
		CopyReadAssets("admission.pdf", view.getContext());		
	}

	public void international_guide(View view){
		CopyReadAssets("international.pdf", view.getContext());
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

	private void CopyReadAssets(String name, Context context){
		AssetManager assetManager = getAssets();

		InputStream in = null;
		OutputStream out = null;
		File file = new File(getFilesDir(), name);
		try{
			in = assetManager.open(name);
			out = openFileOutput(file.getName(), context.MODE_WORLD_READABLE);

			copyFile(in, out);
			in.close();
			in = null;
			out.flush();
			out.close();
			out = null;
		} catch (Exception e){
			Log.e("tag", e.getMessage());
		}

		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.fromFile(file), "application/pdf");
		intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
		startActivity(intent);
	}

	private void copyFile(InputStream in, OutputStream out) throws IOException{
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1){
			out.write(buffer, 0, read);
		}
	}

}
