package com.karkinos.croupon;

import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// A FragmentPagerAdapter that returns a fragment corresponding to one of the sections/tabs/pages. 
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	private Context mContext = null;
	
	public SectionsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

	@Override  
	public Fragment getItem(int position) {  
	    // getItem is called to instantiate the fragment for the given page.  
	    // Return a DummySectionFragment (defined as a static inner class  
	    // below) with the page number as its lone argument.  
        Fragment fragment = new DummySectionFragment();  
        Bundle args = new Bundle();  
        args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);  
        fragment.setArguments(args);  
        return fragment;
	}

    @Override
	public CharSequence getPageTitle(int position) {  
	    Locale l = Locale.getDefault();  
	    switch (position) {  
	    case 0:  
	        return mContext.getString(R.string.myFriendsTab).toUpperCase(l);  
	    case 1:
	        return mContext.getString(R.string.myDealsTab).toUpperCase(l);  
	    case 2:
	    	return mContext.getString(R.string.featuredDealsTab).toUpperCase(l);
	    case 3:
	    	return mContext.getString(R.string.browseCategoriesTab).toUpperCase(l);  
	    case 4:
	    	return mContext.getString(R.string.localDealsTab).toUpperCase(l);  
	    }  
	    return null;  
	}
	
	@Override  
	public int getCount() {  
	     // Show 5 total pages.  
	     return 5;  
	}
}