package com.karkinos.croupon;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DealsFragment extends Fragment {
		
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View view = inflater.inflate(R.layout.fragment_show_deals, container, false);
	    ListView listView = (ListView)view.findViewById(R.id.dealsListView);

	    final Database d = new Database(this.getActivity());
	    d.writeDataToFile();
	    //d.getCurrentDeals();
	    //ArrayList<Deal> all_deals = d.getCurrentDeals();
		//d.readDataFromFile();
		
	    Log.d("InDealsFragment", "HERE");
	    // Sample set of data passed to adapter for testing purposes

        final ArrayList<Deal> all_deals =  d.getCurrentDeals();
        
        // Sets up adapter to pass data into XML
        DealAdapter adapter = new DealAdapter(getActivity(), R.layout.listview_item_row, all_deals);
        
        // TO ADD HEADER ROW BACK IN
        // View header = (View)inflater.inflate(R.layout.listview_header_row, null);
        // LV.addHeaderView(header);
        
        listView.setAdapter(adapter);       
        
        listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				Deal deal = all_deals.get(position);
				Intent intent = new Intent(getActivity(), DealPage.class);
				Bundle bundle = new Bundle();
				bundle.putInt("id", deal.getId());
				bundle.putParcelable("db", (Parcelable) d);
				
//				bundle.putString("Description", deal.description);
//				bundle.putInt("Image", deal.image);
//				bundle.putInt("CurrentSupporters", deal.currentSupporters);
//				bundle.putInt("MaxSupporters", deal.maxSupporters);
//				bundle.putFloat("RegularPrice", deal.regularPrice);
//				bundle.putFloat("DiscountPrice", deal.discountPrice);
				intent.putExtras(bundle);
				startActivity(intent);
			}
        });
        
        return view;
	}
	
}
