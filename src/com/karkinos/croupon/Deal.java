package com.karkinos.croupon;

// Object class for each individual deal
public class Deal {
	public int id = 0;
	public int image = 0;
	public String title = "";
	public String description = "";
    public int currentSupporters = 0;
    public int maxSupporters = 0;
    public float regularPrice = 0;
    public float discountPrice = 0;
    public float msrp = 0;
    public float lowestMarketPrice = 0;
    public int rank = 0;
    public int votes = 0;
    public int categoryId = 0;
    public int championId = 0;
    public String qa = "";
    public String comments = "";
    public String webUrls = "";
    // date/time dealEnding
    
    public Deal() {
    }
    
    public int getId() {
    	return this.id;
    }
    public void setId(int i) {
    	this.id = i;
    }
    
    public int getImage() {
    	return this.image;
    }
    public void setImage(int i) {
    	this.image = i;
    }
    
    public String getTitle() {
    	return this.title;
    }
    public void setTitle(String s) {
    	this.title = s;
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
 
    public float getMsrp() {
    	return this.msrp;
    }
    public void setMsrp(float f) {
    	this.msrp = f;
    }
    
    public float getLowestMarketPrice() {
    	return this.lowestMarketPrice;
    }
    public void setLowestMarketPrice(float f) {
    	this.lowestMarketPrice = f;
    }
    
    public int getRank() {
    	return this.rank;
    }
    public void setRank(int i) {
    	this.rank = i;
    }
    
    public int getVotes() {
    	return this.votes;
    }
    public void setVotes(int i) {
    	this.votes = i;
    }
    
    public int getCategoryId() {
    	return this.categoryId;
    }
    public void setCategoryId(int i) {
    	this.categoryId = i;
    }
    
    public int getChampionId() {
    	return this.championId;
    }
    public void setChampionId(int i) {
    	this.championId = i;
    }
    
    public String getQa() {
    	return this.qa;
    }
    public void setQa(String s) {
    	this.qa = s;
    }

    public String getComments() {
    	return this.comments;
    }
    public void setComments(String s) {
    	this.comments = s;
    }

    public String getWebUrls() {
    	return this.webUrls;
    }
    public void setWebUrls(String s) {
    	this.webUrls = s;
    }
}