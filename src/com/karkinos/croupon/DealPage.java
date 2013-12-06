package com.karkinos.croupon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	int image;
	String title;
	String description;
	int currentSupporters;
	int maxSupporters;
	double regularPrice;
	double discountPrice;
	double msrp;
	double lowestMarketPrice;
	int rank;
	int votes;
	int categoryId;
	int championId;
	String qa;
	String comments;
	String webUrls;
	Date endingTime;
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
		
		final Database db = new Database(this);
		
		Deal d = db.getDeal(id);
		image = d.getImage();
		title = d.getTitle();
		description = d.getDescription();
		currentSupporters = d.getCurrentSupporters();
		maxSupporters = d.getMaxSupporters();
		regularPrice = d.getRegularPrice();
		discountPrice = d.getDiscountPrice();
		msrp = d.getMsrp();
		lowestMarketPrice = d.getLowestMarketPrice();
		rank = d.getRank();
		votes = d.getVotes();
		categoryId = d.getCategoryId();
		championId = d.getChampionId();
		qa = d.getQa();
		comments = d.getComments();
		webUrls = d.getWebUrls();
		endingTime = d.getEndingTime();
		
		ImageView imgDealImage = (ImageView)findViewById(R.id.imgDealImage);
		imgDealImage.setImageResource(image);
		TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
		txtTitle.setText(title);
		TextView txtDescription = (TextView)findViewById(R.id.txtDescription);
		txtDescription.setText(description);
		TextView txtSupporters = (TextView)findViewById(R.id.txtSupporters);
		txtSupporters.setText(currentSupporters + " / " + maxSupporters + " Supporters");
		TextView txtDiscountPrice = (TextView)findViewById(R.id.txtDiscountPrice);
		txtDiscountPrice.setText(Double.toString(discountPrice));
		TextView txtQA = (TextView)findViewById(R.id.txtQA);
		txtQA.setText(qa);
		
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
