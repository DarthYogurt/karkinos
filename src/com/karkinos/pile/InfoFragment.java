package com.karkinos.pile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class InfoFragment extends Fragment {
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
	    
	    View view = inflater.inflate(R.layout.fragment_info_page, container, false);
	    
	    ImageView btnToStoryboard = (ImageView)view.findViewById(R.id.btnToStoryBoard);
	    btnToStoryboard.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getActivity(), StoryboardPageActivity.class);
				startActivity(intent);
			}
		});
	    
        return view;
	}
}
