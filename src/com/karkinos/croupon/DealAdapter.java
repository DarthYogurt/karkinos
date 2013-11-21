package com.karkinos.croupon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DealAdapter extends ArrayAdapter<Deal>{

    Context context; 
    int layoutResourceId;    
    Deal data[] = null;
    
    public DealAdapter(Context context, int layoutResourceId, Deal[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        DealHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new DealHolder();
            holder.txtDeal = (TextView)row.findViewById(R.id.txtDeal);
            holder.imgDealImage = (ImageView)row.findViewById(R.id.imgDealImage);
            holder.txtSupporters = (TextView)row.findViewById(R.id.txtSupporters);
            holder.txtPrice = (TextView)row.findViewById(R.id.txtPrice);
            
            row.setTag(holder);
        }
        else
        {
            holder = (DealHolder)row.getTag();
        }
        
        Deal deal = data[position];
        holder.txtDeal.setText(deal.deal);
        holder.imgDealImage.setImageResource(deal.image);
        holder.txtSupporters.setText(String.valueOf(deal.currentSupporters + " / " + deal.maxSupporters + " Supporters"));
        holder.txtPrice.setText(String.valueOf("$" + deal.price));
        
        return row;
    }
    
    static class DealHolder
    {
    	TextView txtDeal;
        ImageView imgDealImage;
        TextView txtSupporters;
        TextView txtPrice;
    }
}