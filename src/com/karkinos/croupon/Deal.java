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
    
    int getImage() {
    	return this.image;
    }
    
    void setImage(int i) {
    	this.image = i;
    }
    
    String getDescription() {
    	return this.description;
    }
    
    void setDescription(String s) {
    	this.description = s;
    }
    
    int getCurrentSupporters() {
    	return this.currentSupporters;
    }
    
    void setCurrentSupporters(int i) {
    	this.currentSupporters = i;
    }
    
    int getMaxSupporters() {
    	return this.maxSupporters;
    }
    
    void setMaxSupporters(int i) {
    	this.maxSupporters = i;
    }
    
    int getRegularPrice() {
    	return this.regularPrice;
    }
    
    void setRegularPrice(int i) {
    	this.regularPrice = i;
    }
    
    int getDiscountPrice() {
    	return this.discountPrice;
    }
    
    void setDiscountPrice(int i) {
    	this.discountPrice = i;
    }
    
}