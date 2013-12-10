package com.karkinos.pile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        
        ImageView image = (ImageView)rootView.findViewById(R.id.imgStoryboard);
        int position = getArguments().getInt(KEY_POSITION, -1);
        
        int[] images = {R.drawable.storyboard1, R.drawable.storyboard2, R.drawable.storyboard3,
        				R.drawable.storyboard4, R.drawable.storyboard5, R.drawable.storyboard6,
        				R.drawable.storyboard7, R.drawable.storyboard8, R.drawable.storyboard9};
        
        image.setImageResource(images[position]);

        return rootView;
    }

}
