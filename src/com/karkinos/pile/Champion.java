package com.karkinos.pile;

import java.util.Date;

// Object class for a champion
public class Champion {
	private int id = 0;
	private int rank = 0;
	private String name = "";
	private String location = "";
	private Date memberSince = new Date();
	private int championedDeals = 0;
	
	public Champion() {
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int i) {
		this.id = i;
	}
	
	public int getRank() {
		return this.rank;
	}
	public void setRank(int i) {
		this.rank = i;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name = s;
	}
	
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String s) {
		this.location = s;
	}
	
	public int getChampionedDeals() {
		return this.championedDeals;
	}
	public void setChampionedDeals(int i) {
		this.championedDeals = i;
	}
}
