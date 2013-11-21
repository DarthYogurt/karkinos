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
            holder.txtDealDesc = (TextView)row.findViewById(R.id.txtDealDesc);
            holder.imgDealImage = (ImageView)row.findViewById(R.id.imgDealImage);
            holder.txtSupporters = (TextView)row.findViewById(R.id.txtSupporters);
            holder.txtRegularPrice = (TextView)row.findViewById(R.id.txtRegularPrice);
            holder.txtDealPrice = (TextView)row.findViewById(R.id.txtDealPrice);
            
            row.setTag(holder);
        }
        else
        {
            holder = (DealHolder)row.getTag();
        }
        
        Deal deal = data[position];

        holder.txtDealDesc.setText(deal.dealDesc);
        holder.imgDealImage.setImageResource(deal.dealImage);
        holder.txtSupporters.setText(String.valueOf(deal.currentSupporters + " / " + deal.maxSupporters + " Supporters"));
        holder.txtRegularPrice.setText(String.valueOf("$" + deal.regularPrice));
    	holder.txtRegularPrice.setPaintFlags(holder.txtRegularPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.txtDealPrice.setText(String.valueOf("$" + deal.dealPrice));
        
        return row;
    }
    
    static class DealHolder
    {
    	TextView txtDealDesc;
        ImageView imgDealImage;
        TextView txtSupporters;
        TextView txtRegularPrice;
        TextView txtDealPrice;
    }
    
}