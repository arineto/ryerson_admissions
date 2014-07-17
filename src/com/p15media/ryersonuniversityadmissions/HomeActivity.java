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
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;


@SuppressLint("SetJavaScriptEnabled")
public class HomeActivity extends Activity {

	private Intent intent;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= 720) {
            setContentView(R.layout.activity_home720);
        } else if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.activity_home600);
        } else if (config.smallestScreenWidthDp >= 480) {
            setContentView(R.layout.activity_home480);
        } else {
            setContentView(R.layout.activity_home);
        }
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
		ProgressDialog pd = ProgressDialog.show(this, "Please wait", "Loading please wait..", true, false);
		new CopyRead("admission.pdf", view.getContext(), pd).execute("");
	}

	public void international_guide(View view){
		ProgressDialog pd = ProgressDialog.show(this, "Please wait", "Loading please wait..", true, false);
		new CopyRead("international.pdf", view.getContext(), pd).execute("");
	}

	public void photo_gallery(View view){
		final ProgressDialog myPd_ring=ProgressDialog.show(HomeActivity.this, "Please wait", "Loading please wait..", true);
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {
              public void run() {
                    try{
                          Thread.sleep(3000);
                    }catch(Exception e){}
                    myPd_ring.dismiss();
              }
        }).start();
		intent = new Intent(view.getContext(), PhotoGalleryActivity.class);
		startActivityForResult(intent, 0);
	}

	public void video_gallery(View view){
		final ProgressDialog myPd_ring=ProgressDialog.show(HomeActivity.this, "Please wait", "Loading please wait..", true);
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {
              public void run() {
                    try{
                          Thread.sleep(3000);
                    }catch(Exception e){}
                    myPd_ring.dismiss();
              }
        }).start();
		intent = new Intent(view.getContext(), VideoGalleryActivity.class);
		startActivityForResult(intent, 0);
	}

	public void ryerson_blogs(View view){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://why.ryerson.ca/")));
	}
	
	public void openConnect(View view){
		final ProgressDialog myPd_ring=ProgressDialog.show(HomeActivity.this, "Please wait", "Loading please wait..", true);
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {
              public void run() {
                    try{
                          Thread.sleep(3000);
                    }catch(Exception e){}
                    myPd_ring.dismiss();
              }
        }).start();
		intent = new Intent(view.getContext(), ConnectActivity.class);
		startActivityForResult(intent, 0);
	}
	
	private class CopyRead extends AsyncTask<String, Void, Object>{
		
		String name;
		Context context;
		ProgressDialog dialog;

		public CopyRead(String name, Context context, ProgressDialog dialog){
			this.name = name;
			this.context = context;
			this.dialog = dialog;
		}
		
		protected Object doInBackground(String... arg0) {
			CopyReadAssets(name, context);
			return null;	
		}
		
		protected void onPostExecute(Object result) {
            dialog.dismiss();
        }
		
		@SuppressWarnings({ "static-access", "deprecation" })
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
}
