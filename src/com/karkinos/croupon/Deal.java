package com.karkinos.croupon;

public class Deal {
	public String deal;
	public int image;
    public int currentSupporters;
    public int maxSupporters;
    public int price;
    
    public Deal() {
        super();
    }
    
    public Deal(String deal, int image, int currentSupporters, int maxSupporters, int price) {
        super();
        this.deal = deal;
        this.image = image;
        this.currentSupporters = currentSupporters;
        this.maxSupporters = maxSupporters;
        this.price = price;
    }
}