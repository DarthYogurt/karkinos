package com.karkinos.croupon;

// Object class for each individual deal
public class Deal {
	public String dealDesc = "";
	public int dealImage;
    public int currentSupporters = 0;
    public int maxSupporters = 0;
    public int regPrice = 0;
    public int dealPrice = 0;
    
    public Deal() {
        super();
    }
    
    public Deal(String dealDesc, int dealImage, int currentSupporters, 
    			 int maxSupporters, int regPrice, int dealPrice) {
        super();
        this.dealDesc = dealDesc;
        this.dealImage = dealImage;
        this.currentSupporters = currentSupporters;
        this.maxSupporters = maxSupporters;
        this.regPrice = regPrice;
        this.dealPrice = dealPrice;
    }
    
    private String getDealDesc() {
    	return this.dealDesc;
    }
    
    private void setDealDesc(String s) {
    	this.dealDesc = s;
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
    
    private int getRegPrice() {
    	return this.regPrice;
    }
    
    private void setRegPrice(int i) {
    	this.regPrice = i;
    }
    
    private int getDealPrice() {
    	return this.dealPrice;
    }
    
    private void setDealPrice(int i) {
    	this.dealPrice = i;
    }
    
}