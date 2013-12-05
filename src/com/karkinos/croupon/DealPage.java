package com.karkinos.croupon;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.joda.time.DateTime;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class DealPage extends Activity {
	Button btnJoinCause;
	
	long mMilliseconds = 60000;
	SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("HH:mm:ss");
	TextView mTimerTextView;
	
	CountDownTimer mCountDownTimer = new CountDownTimer(mMilliseconds, 1000) {
		@Override
		public void onFinish() {
			mTimerTextView.setText(mSimpleDateFormat.format(0));
		}
		
		public void onTick(long millisUntilFinished) {
			mTimerTextView.setText(mSimpleDateFormat.format(millisUntilFinished));
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deal_page);
		setupActionBar();
		
		Bundle bundle = getIntent().getExtras();
		int id = bundle.getInt("id");
		Database db = bundle.getParcelable("db");
		
//		String description = bundle.getString("Description");
//		int image = bundle.getInt("Image");
//		String currentSupporters = Integer.toString(bundle.getInt("CurrentSupporters"));
//		String maxSupporters = Integer.toString(bundle.getInt("MaxSupporters"));
//		String supporters = currentSupporters + " / " + maxSupporters + " Supporters";
//		String regularPrice = Float.toString(bundle.getFloat("RegularPrice"));
//		String discountPrice = Float.toString(bundle.getFloat("DiscountPrice"));
		
		ImageView imgDealImage = (ImageView)findViewById(R.id.imgDealImage);
		TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
		TextView txtDescription = (TextView)findViewById(R.id.txtDescription);
		TextView txtSupporters = (TextView)findViewById(R.id.txtSupporters);
		TextView txtDiscountPrice = (TextView)findViewById(R.id.txtDiscountPrice);
		
		mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		mTimerTextView = (TextView) findViewById(R.id.txtCountDownTimer);
		
		mCountDownTimer.start();
		
		btnJoinCause = (Button)findViewById(R.id.btnJoinCause);
		btnJoinCause.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast test;
				test = Toast.makeText(getApplicationContext(), "Join Cause Button Works!", Toast.LENGTH_SHORT);
				test.show();
			}
		});
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.deal_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
