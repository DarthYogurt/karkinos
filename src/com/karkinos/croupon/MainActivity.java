package com.karkinos.croupon;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	// Fragment PagerAdapter keeps every loaded fragment in memory. 
	// If too memory intensive, switch to FragmentStatePagerAdapter.
	SectionsPagerAdapter mSectionsPagerAdapter;
		
	ViewPager mViewPager; // ViewPager that will host section contents.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Creates the adapter that will return a fragment for each of the primary sections.
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), this);
		
		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
