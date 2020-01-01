package com.DataType.javapj;

public class Fooda {

	public static void main(String[] args) {

		Fried perkadel = new Fried();
		perkadel.setName("Perkadel");
		perkadel.setCalorie(100);
		perkadel.setCountryFrom("Indonesia");
		perkadel.setSpicyLevel(0);
		perkadel.setType("fried-food");
		
		
		Fried risoles = new Fried();
		risoles.setName("Risoles");
		risoles.setCalorie(400);
		risoles.setCountryFrom("Indonesia");
		risoles.setSpicyLevel(2);
		risoles.setType("fried-food");
		
		
		Food [] indoneisanFood = new Food[2];
		indoneisanFood [0] = perkadel;
		indoneisanFood [1] = risoles;
		
		Food myFav = null; //by default is null
		for (Food food : indoneisanFood) {
			if (food.getName().equalsIgnoreCase("risoles") || food.getCalorie() == 100) {
				myFav = food;
				break;
			}
		}
		
		if (myFav != null) {
			System.out.println(myFav.getName());
			System.out.println(myFav.getCalorie());
			System.out.println(myFav.getCountryFrom());
			System.out.println(myFav.getSpicyLevel());
		}
		
		
		
		
		
		
	}

}
