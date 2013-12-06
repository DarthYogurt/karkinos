package com.karkinos.croupon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
	
	long mMilliseconds;
	CountDownTimer mCountDownTimer;
//	SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("D:HH:mm:ss");
//	CountDownTimer mCountDownTimer = new CountDownTimer(mMilliseconds, 1000) {
//		@Override
//		public void onFinish() {
//			mTimerTextView.setText(mSimpleDateFormat.format(0));
//		}
//		
//		public void onTick(long millisUntilFinished) {
//			mTimerTextView.setText(mSimpleDateFormat.format(millisUntilFinished));
//		}
//	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deal_page);
		setupActionBar();
		
		Bundle bundle = getIntent().getExtras();
		int id = bundle.getInt("id");
		
		Database db = new Database(this);
		
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
		TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
		TextView txtDescription = (TextView)findViewById(R.id.txtDescription);
		TextView txtSupporters = (TextView)findViewById(R.id.txtSupporters);
		TextView txtDiscountPrice = (TextView)findViewById(R.id.txtDiscountPrice);
		TextView txtMsrp = (TextView)findViewById(R.id.txtMsrp);
		TextView txtLowestMarketPrice = (TextView)findViewById(R.id.txtLowestMarketPrice);
		TextView txtRank = (TextView)findViewById(R.id.txtRank);
		TextView txtVotes = (TextView)findViewById(R.id.txtVotes);
		TextView txtCategory = (TextView)findViewById(R.id.txtCategory);
		TextView txtQA = (TextView)findViewById(R.id.txtQA);
		TextView txtComments = (TextView)findViewById(R.id.txtComments);
		TextView txtWebUrls = (TextView)findViewById(R.id.txtWebUrls);
		TextView txtEndingTime = (TextView)findViewById(R.id.txtEndingTime);
		RelativeLayout btnToChampionPage = (RelativeLayout)findViewById(R.id.btnToChampionPage);
		Button btnJoinCause = (Button)findViewById(R.id.btnJoinCause);
		
		imgDealImage.setImageResource(image);
		txtTitle.setText(title);
		txtDescription.setText(description);
		txtSupporters.setText(currentSupporters + "/" + maxSupporters + " Supporters");
		txtDiscountPrice.setText(String.valueOf("$" + String.format("%.2f", discountPrice)));
		txtMsrp.setText(String.valueOf("$" + String.format("%.2f", msrp)));
		txtLowestMarketPrice.setText(String.valueOf("$" + String.format("%.2f", lowestMarketPrice)));
		txtRank.setText(String.valueOf(rank));
		txtVotes.setText(String.valueOf(votes));
		txtCategory.setText(String.valueOf(categoryId));
		txtQA.setText(qa);
		txtComments.setText(comments);
		txtWebUrls.setText(webUrls);
		

		btnToChampionPage.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
//				Intent intent = new Intent(this, ChampionPage.class);
//				Bundle bundle = new Bundle();
//				bundle.putInt("championId", championId);
//				intent.putExtras(bundle);
//				startActivity(intent);
				
				Toast test;
				test = Toast.makeText(getApplicationContext(), "Champion Page Button Works!", Toast.LENGTH_SHORT);
				test.show();
			}
		});
		
		btnJoinCause.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast test;
				test = Toast.makeText(getApplicationContext(), "Join Cause Button Works!", Toast.LENGTH_SHORT);
				test.show();
			}
		});
	}
	
	public class MyCountDownTimer extends CountDownTimer {
		public MyCountDownTimer(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
			
		}
		
		@Override
		public void onFinish() {
			
		}
		
		@Override
		public void onTick(long millisUntilFinished) {
			long seconds = (long) (millisUntilFinished / 1000 % 60);
			long minutes = (long) (millisUntilFinished / (1000*60) % 60);
			long hours = (long) (millisUntilFinished / (1000*60*60) % 24);
			int days = (int) (millisUntilFinished / (1000*60*60*24) % 365);	
		}
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
