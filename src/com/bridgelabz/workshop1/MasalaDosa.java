package com.bridgelabz.workshop1;

import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;

public class MasalaDosa extends FoodItem implements Iveg{
	
	   public  MasalaDosa() {
	//	types = Types.VEG;
		category = Category.MainCourse;
		taste  = Taste.crunchy;
		preparationTime = 15;
		name = " masaladosa";
	}
	   public void printMainIngrediants() {
			System.out.println(" sambar ,dosa ");
		}

    


}
