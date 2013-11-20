package com.karkinos.croupon;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

public class FeaturedDealsFragment extends Fragment {

		private TableLayout dealsContainer;
		
		public FeaturedDealsFragment() {  
		}  
	  
		@Override  
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
		    View rootView = inflater.inflate(R.layout.fragment_featured_deals, container, false);  
		    return rootView;  
		}
		
//		public void onResume() {
//			super.onResume();
//			
//			LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//			dealsContainer = (TableLayout) getActivity().findViewById(R.id.addRow);
//		}
		
}
