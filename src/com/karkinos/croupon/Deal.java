package com.karkinos.croupon;

public class Deal {
	public String dealDesc;
	public int dealImage;
    public int currentSupporters;
    public int maxSupporters;
    public int regularPrice;
    public int dealPrice;
    
    public Deal() {
        super();
    }
    
    public Deal (String dealDesc, int dealImage, int currentSupporters, 
    			 int maxSupporters, int regularPrice, int dealPrice) {
        super();
        this.dealDesc = dealDesc;
        this.dealImage = dealImage;
        this.currentSupporters = currentSupporters;
        this.maxSupporters = maxSupporters;
        this.regularPrice = regularPrice;
        this.dealPrice = dealPrice;
    }
}