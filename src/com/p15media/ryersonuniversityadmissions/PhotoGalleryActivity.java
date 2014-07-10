package com.p15media.ryersonuniversityadmissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoGalleryActivity extends Activity {
	
	Integer[] pics = {R.drawable.photo01, R.drawable.photo02, R.drawable.photo03, R.drawable.photo04, R.drawable.photo05,
						R.drawable.photo06, R.drawable.photo07, R.drawable.photo08, R.drawable.photo09, R.drawable.photo10,
						R.drawable.photo11, R.drawable.photo12, R.drawable.photo13, R.drawable.photo14, R.drawable.photo15,
						R.drawable.photo16, R.drawable.photo17, R.drawable.photo18, R.drawable.photo19};
	String[] texts = {"Toronto\n\nVibrant, multicultural, and Canada's largest city. Ryerson's campus can be seen in the centre of the image.",
						"Student Campus Centre\n\nHome to a variety of student groups and services, as well as the Oakham Café and Ram in the Rye pub.",
						"Ronald D. Besse information and Learning Commons\n\nThe Ryerson Library has more than just few book - you can also access technology, tutoring and reference services.",
						"Students hanging out with our mascot, Eggy the Ram", 
						"Ted Rogers Schol of Information Management\n\nHome to Ryerson's Bachelor of Commerce and MBA programs, located in the heart of Toronto's business community.",
						"Image Arts Building\n\nA former brewery warehouse, the newly renovated space houses the School of Image Arts and Ryerson Image Centre",
						"Campus-wide events, like the annual Parade and Picnic, integrate our campus in the downtown community.", 
						"Yonge and Dundas", "Students on campus", "The Quad", "George Vari Engineering and Computing Centre", 
						"Gould Street\n\nOnce a busy city street, the intersection of Gould and Victoria Street on campus is now filled with patio tables and students enjoying the pedestrian only zone.", 
						"Ryerson Campus", "Dundas Subway Station\n\n Ryerson is just steps away from transit options, making it easily accessible.", 
						"Student in a lecture hall\n\nThe largest lecture hall on campus seats 500.", 
						"The lights of Yonge-Dundas Square at night.", "The Quad in winter", "Students studying and taking advantage of the Wi-Fi available across campus", 
						"Events are held throughout the year in the Quad, including orientation activities and convocation."};
	Integer[] imageViews = {R.id.connect_button, R.id.imageView2, R.id.imageView3, R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7, R.id.imageView8,
							R.id.imageView9, R.id.imageView10, R.id.imageView11, R.id.imageView12, R.id.imageView13, R.id.imageView14, R.id.imageView15, 
							R.id.imageView16, R.id.imageView17,	R.id.imageView18, R.id.imageView19};
	Integer[] textViews = {R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9, 
							R.id.textView10, R.id.textView11, R.id.textView12, R.id.textView13, R.id.textView14, R.id.textView15, R.id.textView16, R.id.textView17, 
							R.id.textView18, R.id.textView19};
	private ImageView imageView;
	private TextView textView;
	

	@SuppressLint("InlinedApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_DeviceDefault);
		setContentView(R.layout.activity_photo_gallery);
		
		for(int i=0; i<pics.length; i++){
			imageView = (ImageView) findViewById(imageViews[i]);
			textView = (TextView) findViewById(textViews[i]);
			textView.setText(texts[i]);
			imageView.setImageBitmap(new PictureBitmap(getResources(), pics[i], 400, 220).decodeSampledBitmapFromResource());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo_gallery, menu);
		return true;
	}
}
