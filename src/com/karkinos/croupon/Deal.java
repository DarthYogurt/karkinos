package com.karkinos.croupon;

public class Deal {
	public String deal;
	public int image;
    public String supporters;
    public String price;
    
    public Deal() {
        super();
    }
    
    public Deal(String d, int i, String s, String p) {
        super();
        this.deal = d;
        this.image = i;
        this.supporters = s;
        this.price = p;
    }
}