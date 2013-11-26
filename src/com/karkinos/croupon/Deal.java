package com.karkinos.croupon;

// Object class for each individual deal
public class Deal {
	public String description = "";
	public int image;
    public int currentSupporters = 0;
    public int maxSupporters = 0;
    public int regularPrice = 0;
    public int discountPrice = 0;
    
    public Deal() {
        super();
    }
    
    public Deal(String description, int image, int currentSupporters, 
    			 int maxSupporters, int regularPrice, int discountPrice) {
        super();
        this.description = description;
        this.image = image;
        this.currentSupporters = currentSupporters;
        this.maxSupporters = maxSupporters;
        this.regularPrice = regularPrice;
        this.discountPrice = discountPrice;
    }
    
    private String getDescription() {
    	return this.description;
    }
    
    private void setDescription(String s) {
    	this.description = s;
    }
    
    private int getCurrentSupporters() {
    	return this.currentSupporters;
    }
    
    private void setCurrentSupporters(int i) {
    	this.currentSupporters = i;
    }
    
    private int getMaxSupporters() {
    	return this.maxSupporters;
    }
    
    private void setMaxSupporters(int i) {
    	this.maxSupporters = i;
    }
    
    private int getRegularPrice() {
    	return this.regularPrice;
    }
    
    private void setRegularPrice(int i) {
    	this.regularPrice = i;
    }
    
    private int getDiscountPrice() {
    	return this.discountPrice;
    }
    
    private void setDiscountPrice(int i) {
    	this.discountPrice = i;
    }
    
}