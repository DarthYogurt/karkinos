package com.karkinos.croupon;

public class Deal {
	public String deal;
	public int image;
    public String supporters;
    public int price;
    
    public Deal() {
        super();
    }
    
    public Deal(String deal, int image, String supporters, int price) {
        super();
        this.deal = deal;
        this.image = image;
        this.supporters = supporters;
        this.price = price;
    }
}