package com.karkinos.pile;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DealsFragment extends Fragment implements OnScrollListener {
	public static final String KEY_ID = "id";
	DealAdapter adapter;
	
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View view = inflater.inflate(R.layout.fragment_deals_page, container, false);
	    ListView listView = (ListView)view.findViewById(R.id.dealsListView);

	    final Database d = new Database(this.getActivity());
	    d.writeDataToFile();
	    //d.getCurrentDeals();
	    //ArrayList<Deal> all_deals = d.getCurrentDeals();
		//d.readDataFromFile();
		
	    Log.d("InDealsFragment", "HERE");

        final ArrayList<Deal> all_deals =  d.getCurrentDeals();
        
        // Sets up adapter to pass data into XML
        adapter = new DealAdapter(getActivity(), R.layout.listview_item_row, all_deals);
        
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				Deal deal = all_deals.get(position);
				Intent intent = new Intent(getActivity(), DealPageActivity.class);
				Bundle bundle = new Bundle();
				bundle.putInt(KEY_ID, deal.getId());
				intent.putExtras(bundle);
				startActivity(intent);
			}
        });
        
        return view;
	}
	
	@Override
	public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

	}
	
	@Override
	public void onScrollStateChanged(AbsListView listView, int scrollState) {

	}
}

