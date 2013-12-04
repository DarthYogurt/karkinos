package com.karkinos.croupon;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DealAdapter extends ArrayAdapter<Deal> {

    Context context; 
    int layoutResourceId;    
    ArrayList<Deal> data = null;
    
    public DealAdapter(Context context, int layoutResourceId, ArrayList<Deal> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    static class ViewHolder
    {
    	ImageView imgDealImage;
    	TextView txtDescription;
        TextView txtSupporters;
        TextView txtRegularPrice;
        TextView txtDiscountPrice;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        
        if(convertView == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ViewHolder();
            holder.imgDealImage = (ImageView)convertView.findViewById(R.id.imgDealImage);
            holder.txtDescription = (TextView)convertView.findViewById(R.id.txtDescription);
            holder.txtSupporters = (TextView)convertView.findViewById(R.id.txtSupporters);
            holder.txtRegularPrice = (TextView)convertView.findViewById(R.id.txtRegularPrice);
            holder.txtDiscountPrice = (TextView)convertView.findViewById(R.id.txtDiscountPrice);
            
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }

        int image = data.get(position).getImage();
        String description = data.get(position).getDescription();
        int currentSupporters = data.get(position).getCurrentSupporters();
        int maxSupporters = data.get(position).getMaxSupporters();
        int regularPrice = data.get(position).getRegularPrice();
        int discountPrice = data.get(position).getDiscountPrice();
        
        holder.imgDealImage.setImageResource(image);
        holder.txtDescription.setText(description);
        holder.txtSupporters.setText(String.valueOf(currentSupporters + " / " + maxSupporters + " Supporters"));
        holder.txtRegularPrice.setText(String.valueOf("$" + regularPrice));
        holder.txtRegularPrice.setPaintFlags(holder.txtRegularPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.txtDiscountPrice.setText(String.valueOf("$" + discountPrice));
        
//	OLD CODE USING REGULAR ARRAY VS ARRAYLIST        
//        Deal dealEntry = data[position];
//        holder.imgDealImage.setImageResource(dealEntry.image);
//        holder.txtDescription.setText(dealEntry.description);
//        holder.txtSupporters.setText(String.valueOf(dealEntry.currentSupporters + " / " + dealEntry.maxSupporters + " Supporters"));
//        holder.txtRegularPrice.setText(String.valueOf("$" + dealEntry.regularPrice));
//        holder.txtRegularPrice.setPaintFlags(holder.txtRegularPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
//        holder.txtDiscountPrice.setText(String.valueOf("$" + dealEntry.discountPrice));
        
        return convertView;
    }
   
}