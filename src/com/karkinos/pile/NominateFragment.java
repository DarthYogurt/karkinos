package com.karkinos.pile;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class NominateFragment extends Fragment {
		
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View view = inflater.inflate(R.layout.fragment_nominate_page, container, false);
	    
//	    Spinner spinner = (Spinner)findViewById(R.id.category);
//		// Create an ArrayAdapter using the string array and a default spinner layout
//		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item);
//		// Specify the layout to use when the list of choices appears
//		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		// Apply the adapter to the spinner
//		spinner.setAdapter(adapter);
        
        return view;
	}
	
}
