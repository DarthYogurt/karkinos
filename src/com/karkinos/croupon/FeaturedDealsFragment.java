package com.karkinos.croupon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FeaturedDealsFragment extends Fragment {
		
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View V = inflater.inflate(R.layout.fragment_featured_deals, container, false);
	    ListView LV = (ListView)V.findViewById(R.id.dealsListView);

        Deal deal_data[] = new Deal[]
		        {
		            new Deal("Deal 1", R.drawable.test_image, 389, 700, 500),
		            new Deal("Deal 2", R.drawable.test_image, 20, 80, 1500),
		            new Deal("Deal 3", R.drawable.test_image, 1932, 2000, 60),
		            new Deal("Deal 4", R.drawable.test_image, 198, 450, 350),
		            new Deal("Deal 5", R.drawable.test_image, 60, 70, 1100)
		        };
        
        // Sets up adapter to pass data into ListView XML
        DealAdapter adapter = new DealAdapter(getActivity(), R.layout.listview_item_row, deal_data);
        
        View header = (View)inflater.inflate(R.layout.listview_header_row, null);
        
        LV.addHeaderView(header);
        LV.setAdapter(adapter);

        return V;
	}
	
}
