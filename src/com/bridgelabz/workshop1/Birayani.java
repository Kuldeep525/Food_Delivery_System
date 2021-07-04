package com.bridgelabz.workshop1;


import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;


public class Birayani extends FoodItem implements Inonveg{
	
	public Birayani() {
	//	types = Types.VEG;
		category = Category.Starters;
		taste  = Taste.spicy;
		preparationTime = 20;	
		name = " biryani";
		
	}
	
	public void printMainIngrediants()	{
		System.out.println(" rice , curd ,masala");
	}

	
}
