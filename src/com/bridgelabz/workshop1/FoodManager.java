package com.bridgelabz.workshop1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;

public class FoodManager {
	Set< FoodItem> foodList = new HashSet();
	
	
	public void add(FoodItem fooditems) {
		foodList.add(fooditems);
	}
	
	void print() {
		 for( FoodItem element : foodList) {
			System.out.println(element);
	
		}
	}	
	
	void delete(FoodItem fooditems) {
		foodList.remove(fooditems);
   }
	
	 int getFoodCount() {
		return foodList.size();
	
   }
	 
	 FoodItem getFoodItem(String name) {
		 Iterator iterator = foodList.iterator();
		 for(FoodItem element : foodList) {
			 if (iterator.hasNext()) {
				 FoodItem fooditem = (FoodItem) iterator.next();
				 if(fooditem.name.equals(name)) {
					 return fooditem;
				 }
			 }
			 
		 }
		 return null;
		 
	 }
	
	 void printAllVegItems() {
		 for(FoodItem element : foodList){
			 if(element instanceof Iveg) {
				 System.out.println(element);
			 }
		 }	 
	 }
	 
	 void printAllNonVegitems() {
		 for(FoodItem element : foodList) {
			 if(element instanceof Iveg) {
				 System.out.println(element);
			 }
		 
		 }
	 }
}


