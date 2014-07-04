package com.p15media.ryersonuniversityadmissions;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class PhotoGalleryActivity extends Activity {
	
	Integer[] pics = {R.drawable.photo01, R.drawable.photo02, R.drawable.photo03, R.drawable.photo04, R.drawable.photo05,
						R.drawable.photo06, R.drawable.photo07, R.drawable.photo08, R.drawable.photo09, R.drawable.photo10,
						R.drawable.photo11, R.drawable.photo12, R.drawable.photo13, R.drawable.photo14, R.drawable.photo15,
						R.drawable.photo16, R.drawable.photo17, R.drawable.photo18, R.drawable.photo19};
	String[] texts = {"Toronto\n\nVibrant, multicultural, and Canada's largest city. Ryerson's campus can be seen in the centre of the image.",
						"Student Campus Centre\n\nHome to a viriety of student groups and services, as well as the Oakham Café and Ram in the Rye pub.",
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
	private ImageView imageView;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo_gallery);
		
//		Gallery ga = (Gallery) findViewById(R.id.photo_gallery);
//		ga.setAdapter(new ImageAdapter(this));
//		imageView = (ImageView) findViewById(R.id.photo_gallery_image);
//		textView = (TextView) findViewById(R.id.photo_gallery_text);
//		ga.setOnItemClickListener(new OnItemClickListener() {
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//			    textView.setText(texts[arg2]);
//			    imageView.setImageResource(pics[arg2]);
//			}
//		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo_gallery, menu);
		return true;
	}
	
	public class ImageAdapter extends BaseAdapter{

		private Context context;
		int imageBackground;
		
		public ImageAdapter(Context context){
			this.context = context;
			TypedArray ta = obtainStyledAttributes(R.styleable.Gallery1);
			ta.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 1);
			ta.recycle();
		}
		
		@Override
		public int getCount() {
		    return pics.length;
		}


		@Override
		public Object getItem(int arg0) {
		    return arg0;
		}

		@Override
		public long getItemId(int arg0) {
		    return arg0;
		}


		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
		    ImageView imageView = new ImageView(context);
		    imageView.setImageResource(pics[arg0]);
		    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		    imageView.setLayoutParams(new Gallery.LayoutParams(150,120));
		    imageView.setBackgroundResource(imageBackground);
		    return imageView;
		}
		
	}

}
