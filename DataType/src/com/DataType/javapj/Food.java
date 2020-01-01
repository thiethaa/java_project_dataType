package com.DataType.javapj;

public class Food {

	private String countryFrom;
	private int spicyLevel;
	private int calorie;
	private String name;
	
	public String getCountryFrom() {
		return countryFrom;
	}
	
	public void setCountryFrom (String countryFrom) {
		this.countryFrom = countryFrom;
	}
	
	public Integer getSpicyLevel() {
		return spicyLevel;
	}
	
	public void setSpicyLevel(Integer spicyLevel) {
		this.spicyLevel = spicyLevel;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayFood() {
		System.out.println(this.name +" this food came from: "+ this.countryFrom +", "+ "Spicy Level is :"+ this.spicyLevel +" and contains: "+ this.calorie+" kkal");
	}
	
}
