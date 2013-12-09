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
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class NominateFragment extends Fragment {
		
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View view = inflater.inflate(R.layout.fragment_nominate_page, container, false);
	    
	    //SPINNER
  		Spinner spinner = (Spinner)view.findViewById(R.id.category);
  		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.category_array, android.R.layout.simple_spinner_item); // Create an ArrayAdapter using the string array and a default spinner layout
  		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);	// Specify the layout to use when the list of choices appears
  		spinner.setAdapter(adapter);	// Apply the adapter to the spinner
  		
  		//AUTOCOMPLETE
  		AutoCompleteTextView nominateItem = (AutoCompleteTextView)view.findViewById(R.id.autocomplete_nominate_item); // Get a reference to the AutoCompleteTextView in the layout
  		String[] suggestedItems = getResources().getStringArray(R.array.suggested_items_array); // Get the string array
  		ArrayAdapter<String> adapterItem = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, suggestedItems);		// Create the adapter and set it to the AutoCompleteTextView 
  		nominateItem.setAdapter(adapterItem);
        
        return view;
	}
	
}
