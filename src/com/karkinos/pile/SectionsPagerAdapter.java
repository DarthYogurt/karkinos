package com.karkinos.pile;

import java.util.Locale;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.karkinos.pile.R;

// A FragmentPagerAdapter that returns a fragment corresponding to one of the sections/tabs/pages. 
public class SectionsPagerAdapter extends FragmentPagerAdapter {
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
        	return fragment = new DealsFragment();
        case 1:
        	return fragment = new DealsFragment();
        case 2:
        	return fragment = new DealsFragment();
        case 3:
        	return fragment = new DealsFragment();
        case 4:
        	return fragment = new DealsFragment();
        }
        return fragment;
	}

    @Override
	public CharSequence getPageTitle(int position) {  
	    Locale l = Locale.getDefault();  
	    switch (position) {  
	    case 0:  
	        return mContext.getString(R.string.myFriends).toUpperCase(l);  
	    case 1:
	        return mContext.getString(R.string.myDeals).toUpperCase(l);  
	    case 2:
	    	return mContext.getString(R.string.featuredDeals).toUpperCase(l);
	    case 3:
	    	return mContext.getString(R.string.browseCategories).toUpperCase(l);  
	    case 4:
	    	return mContext.getString(R.string.localDeals).toUpperCase(l);  
	    }  
	    return null;  
	}
	
	@Override  
	public int getCount() {  
	     // Show 5 total pages.  
	     return 5;  
	}
}