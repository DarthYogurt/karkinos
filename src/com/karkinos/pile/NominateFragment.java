package com.karkinos.pile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

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
  		
  		Button btnBecomeAChampion = (Button)view.findViewById(R.id.btnBeAChampion);
  		btnBecomeAChampion.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast test;
				test = Toast.makeText(getActivity(), "Become a Champion Button works!", Toast.LENGTH_SHORT);
				test.show();
			}
		});
        
        return view;
	}
	
}
