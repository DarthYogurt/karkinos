package com.karkinos.croupon;

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
    Deal data[] = null;
    
    public DealAdapter(Context context, int layoutResourceId, Deal[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    static class ViewHolder
    {
    	ImageView imgDealImage;
    	TextView txtDealDesc;
        TextView txtSupporters;
        TextView txtRegularPrice;
        TextView txtDealPrice;
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
            holder.txtDealDesc = (TextView)convertView.findViewById(R.id.txtDealDesc);
            holder.txtSupporters = (TextView)convertView.findViewById(R.id.txtSupporters);
            holder.txtRegularPrice = (TextView)convertView.findViewById(R.id.txtRegularPrice);
            holder.txtDealPrice = (TextView)convertView.findViewById(R.id.txtDealPrice);
            
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        
        Deal dealEntry = data[position];

        holder.imgDealImage.setImageResource(dealEntry.image);
        holder.txtDealDesc.setText(dealEntry.description);
        holder.txtSupporters.setText(String.valueOf(dealEntry.currentSupporters + " / " + dealEntry.maxSupporters + " Supporters"));
        holder.txtRegularPrice.setText(String.valueOf("$" + dealEntry.regularPrice));
        holder.txtRegularPrice.setPaintFlags(holder.txtRegularPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.txtDealPrice.setText(String.valueOf("$" + dealEntry.discountPrice));
        
        return convertView;
    }
   
}