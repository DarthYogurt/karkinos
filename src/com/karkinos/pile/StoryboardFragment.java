package com.karkinos.pile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class StoryboardFragment extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_storyboard_page, container, false);
        
        ImageView image = (ImageView)rootView.findViewById(R.id.imgStoryboard);
        image.setImageResource(R.drawable.storyboard1);

        return rootView;
    }

}
