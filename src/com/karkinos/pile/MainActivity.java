package com.karkinos.pile;

import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	private static final int NUM_PAGES = 4; 
	
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
	
	private class SectionsPagerAdapter extends FragmentPagerAdapter {
		private Context mContext = null;
		
		public SectionsPagerAdapter(FragmentManager fm, Context context) {
	        super(fm);
	        mContext = context;
	    }

		@Override  
		public Fragment getItem(int position) {  
	        Fragment fragment = new Fragment();
	        switch (position) {
	        case 0:
	        	return fragment = new InfoFragment();
	        case 1:
	        	return fragment = new NominateFragment();
	        case 2:
	        	return fragment = new DealsFragment();
	        case 3:
	        	return fragment = new DealsFragment();
	        }
	        return fragment;
		}

	    @Override
		public CharSequence getPageTitle(int position) {  
		    Locale l = Locale.getDefault();  
		    switch (position) {  
		    case 0:  
		        return mContext.getString(R.string.info).toUpperCase(l);  
		    case 1:
		        return mContext.getString(R.string.nominateDeal).toUpperCase(l);  
		    case 2:
		    	return mContext.getString(R.string.featuredDeals).toUpperCase(l);
		    case 3:
		    	return mContext.getString(R.string.myDeals).toUpperCase(l);
		    }  
		    return null;  
		}
		
		@Override  
		public int getCount() {
		     return NUM_PAGES;  
		}
	}
}
