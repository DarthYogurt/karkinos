package com.karkinos.croupon;

// Object class for each individual deal
public class Deal {
	public String description = "";
	public int image;
    public int currentSupporters = 0;
    public int maxSupporters = 0;
    public float regularPrice = 0;
    public float discountPrice = 0;
    
    public Deal() {
        super();
    }
    
    public Deal(String description, int image, int currentSupporters, 
    			 int maxSupporters, float regularPrice, float discountPrice) {
        super();
        this.description = description;
        this.image = image;
        this.currentSupporters = currentSupporters;
        this.maxSupporters = maxSupporters;
        this.regularPrice = regularPrice;
        this.discountPrice = discountPrice;
    }
    
    public int getImage() {
    	return this.image;
    }
    
    public void setImage(int i) {
    	this.image = i;
    }
    
    public String getDescription() {
    	return this.description;
    }
    
    public void setDescription(String s) {
    	this.description = s;
    }
    
    public int getCurrentSupporters() {
    	return this.currentSupporters;
    }
    
    public void setCurrentSupporters(int i) {
    	this.currentSupporters = i;
    }
    
    public int getMaxSupporters() {
    	return this.maxSupporters;
    }
    
    public void setMaxSupporters(int i) {
    	this.maxSupporters = i;
    }
    
    public float getRegularPrice() {
    	return this.regularPrice;
    }
    
    public void setRegularPrice(float i) {
    	this.regularPrice = i;
    }
    
    public float getDiscountPrice() {
    	return this.discountPrice;
    }
    
    public void setDiscountPrice(float i) {
    	this.discountPrice = i;
    }
    
}