package com.bridgelabz.workshop1;

import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;

public class PavBhaji extends FoodItem implements Iveg{
	
	   public  PavBhaji() {
	//	types = Types.VEG;
		category = Category.MainCourse;
		taste  = Taste.oily;
		preparationTime = 15;
		name = " pavbhaji";
}
	   public void printMainIngrediants() {
			System.out.println(" pav,potato,vegetables");
		}

}