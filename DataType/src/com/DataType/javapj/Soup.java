package com.DataType.javapj;

public class Soup extends Food{
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void display() {
		System.out.println("type of this food is :"+ this.type);
	}
}
