package com.karkinos.pile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class StoryboardFragment extends Fragment {
	private static final String KEY_POSITION = "position";
	
	static StoryboardFragment newInstance(int position) {
		StoryboardFragment fragment = new StoryboardFragment();
		Bundle args = new Bundle();
		
		args.putInt(KEY_POSITION, position);
		fragment.setArguments(args);
		
		return(fragment);
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_storyboard_page, container, false);
        
        ImageView iv = (ImageView)rootView.findViewById(R.id.imgStoryboard);
        int position = getArguments().getInt(KEY_POSITION, -1);
        
        int[] images = {R.drawable.storyboard01, R.drawable.storyboard02, R.drawable.storyboard03, R.drawable.storyboard04};
        
        iv.setImageResource(images[position]);
        
        Button btnToMain = (Button)rootView.findViewById(R.id.btnToMain);
        
        if (position == 3) {
        	btnToMain.setVisibility(View.VISIBLE);
	    }
        
        btnToMain.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getActivity(), MainActivity.class);
				startActivity(intent);
			}
		});
        	
        return rootView;
    }

}
