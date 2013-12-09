package com.karkinos.pile;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class NominatePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_nominate_page);
		// Show the Up button in the action bar.
		
		
		//SPINNER
		Spinner spinner = (Spinner) findViewById(R.id.category);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.category_array, android.R.layout.simple_spinner_item); // Create an ArrayAdapter using the string array and a default spinner layout
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);	// Specify the layout to use when the list of choices appears
		spinner.setAdapter(adapter);	// Apply the adapter to the spinner
		
		
		
		//AUTOCOMPLETE
		
		AutoCompleteTextView nominateItem = (AutoCompleteTextView) findViewById(R.id.autocomplete_nominate_item); // Get a reference to the AutoCompleteTextView in the layout
		String[] suggestedItems = getResources().getStringArray(R.array.suggested_items_array); // Get the string array
		ArrayAdapter<String> adapterItem = 
		        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, suggestedItems);		// Create the adapter and set it to the AutoCompleteTextView 
		nominateItem.setAdapter(adapterItem);
		
		
		
		
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nominate_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
