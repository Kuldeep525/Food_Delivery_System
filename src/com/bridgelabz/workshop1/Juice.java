package com.bridgelabz.workshop1;

import java.util.List;

import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;

public class Juice extends FoodItem implements Iveg{
	
	public  Juice() {
	///	types = Types.VEG;
		category = Category.Starters;
		taste  = Taste.oily;
		preparationTime = 15;
		name = " juice ";	
	}
	
	public void printMainIngrediants() {
		System.out.println(" apple ,orange");
	}

	

}
