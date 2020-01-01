package com.DataType.javapj;

public class FoodDescription {

	public static void main(String[] args) {

		Tomyam stirfry = new Tomyam();
		stirfry.setType("Stirfry food");
		stirfry.setName("Tomyam");
		stirfry.setCountryFrom("Asia");
		stirfry.setSpicyLevel(1);
		stirfry.setCalorie(100);
		stirfry.display();
		stirfry.displayFood();

		String[] stirfryFood = new String[4];
		stirfryFood[0] = "Chicken Tomyam";
		stirfryFood[1] = "Beef Tomyam";
		stirfryFood[2] = "Goat Tomyam";
		stirfryFood[3] = "Tofu Tomyam";

		System.out.println("Falvour of Tomyam:");
		for (String sf : stirfryFood) {
			System.out.println(sf);
		}
		System.out.println("\n");

		Fried fry = new Fried();
		fry.setType("Deep fry food");
		fry.setName("Fried");
		fry.setCountryFrom("USA");
		fry.setSpicyLevel(3);
		fry.setCalorie(200);
		fry.display();
		fry.displayFood();

		System.out.println("\n");

		Soup soup = new Soup();
		soup.setType("Boil with water food");
		soup.setName("Soup");
		soup.setCountryFrom("euro");
		soup.setSpicyLevel(2);
		soup.setCalorie(50);
		soup.display();
		soup.displayFood();

		System.out.println("\n");
		
		ChickenSoup cs = new ChickenSoup();
		cs.setName("Csoup");
		
		
		Food [] newFood = new Food[4];
		newFood[0] = stirfry;
		newFood[1] = soup;
		newFood[2] = fry;
		newFood[3] = cs;
		
		Food myFavFood = null;
		for(Food listFood : newFood) {
			//System.out.println("now serving: "+ listFood.getName());
			if(listFood.getName().equalsIgnoreCase("soupchicken") || listFood.getSpicyLevel() == 3) {
				myFavFood = listFood;
				break;
			}
		}
		if (myFavFood != null) {
			System.out.println("My favorite food is "+ myFavFood.getName());
			myFavFood.displayFood();
		}
	}

}
