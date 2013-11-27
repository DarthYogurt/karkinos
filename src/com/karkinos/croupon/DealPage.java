package com.karkinos.croupon;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
		// Show the Up button in the action bar.
		setupActionBar();
		
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
		
		// Sample set of data passed to adapter for testing purposes
        Deal all_deal_data[] = new Deal[]
		        {
		            new Deal("Deal 1", R.drawable.test_image, 389, 700, 750, 500),
		            new Deal("Deal 2", R.drawable.test_image, 20, 80, 1800, 1500),
		            new Deal("Deal 3", R.drawable.test_image, 1932, 2000, 75, 60),
		            new Deal("Deal 4", R.drawable.test_image, 198, 450, 450, 350),
		            new Deal("Deal 5", R.drawable.test_image, 60, 70, 1500, 1100)
		        };
        
		DealAdapter adapter = new DealAdapter(this, R.layout.activity_deal_page, all_deal_data);
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
