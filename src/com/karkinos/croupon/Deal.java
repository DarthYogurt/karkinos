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
    
    private int getId() {
    	return this.id;
    }
    private void setId(int i) {
    	this.id = i;
    }
    
    private int getImage() {
    	return this.image;
    }
    private void setImage(int i) {
    	this.image = i;
    }
    
    private String getTitle() {
    	return this.title;
    }
    private void setTitle(String s) {
    	this.title = s;
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
    
    private float getRegularPrice() {
    	return this.regularPrice;
    }
    private void setRegularPrice(float i) {
    	this.regularPrice = i;
    }
    
    private float getDiscountPrice() {
    	return this.discountPrice;
    }
    private void setDiscountPrice(float i) {
    	this.discountPrice = i;
    }
 
    private float getMsrp() {
    	return this.msrp;
    }
    private void setMsrp(float f) {
    	this.msrp = f;
    }
    
    private float getLowestMarketPrice() {
    	return this.lowestMarketPrice;
    }
    private void setLowestMarketPrice(float f) {
    	this.lowestMarketPrice = f;
    }
    
    private int getRank() {
    	return this.rank;
    }
    private void setRank(int i) {
    	this.rank = i;
    }
    
    private int getVotes() {
    	return this.votes;
    }
    private void setVotes(int i) {
    	this.votes = i;
    }
    
    private int getCategoryId() {
    	return this.categoryId;
    }
    private void setCategoryId(int i) {
    	this.categoryId = i;
    }
    
    private int getChampionId() {
    	return this.championId;
    }
    private void setChampionId(int i) {
    	this.championId = i;
    }
    
    private String getQa() {
    	return this.qa;
    }
    private void setQa(String s) {
    	this.qa = s;
    }

    private String getComments() {
    	return this.comments;
    }
    private void setComments(String s) {
    	this.comments = s;
    }

    private String getWebUrls() {
    	return this.webUrls;
    }
    private void setWebUrls(String s) {
    	this.webUrls = s;
    }
}