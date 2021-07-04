package com.bridgelabz.workshop1;
import java.util.Scanner;

import com.bridgelabz.workshop1.FoodItem.Category;
import com.bridgelabz.workshop1.FoodItem.Taste;

public class Main {
	
	FoodManager foodManager = new FoodManager();
	public static void main(String[] args) {
		Main main = new Main();
		
		Birayani birayani = new Birayani();
		Birayani birayani1 = new Birayani();
		birayani1.price = 100;
		birayani.printMainIngrediants();
		
		PavBhaji pavbhaji = new PavBhaji();
		pavbhaji.price = 60;
		pavbhaji.printMainIngrediants();
		
		MasalaDosa masalaDosa = new MasalaDosa();
		masalaDosa.price = 50;
		masalaDosa.printMainIngrediants();
		
		Juice juice = new Juice();
		juice.price = 40;
		juice.printMainIngrediants();
		
		main.foodManager.add(masalaDosa);
		main.foodManager.add(juice);
		main.foodManager.add(birayani);
		main.foodManager.add(birayani);
		main.foodManager.add(birayani1);
		main.foodManager.add(pavbhaji);
		main.foodManager.print();
		main.showUserOption();
	
		
	//	main.foodManager.delete(juice);
	//	System.out.println(main.foodManager.getFoodCount());
	//  
	///	System.out.println(main.foodManager.getFoodCount());
	
	//	main.foodManager.printAllVegItems();
	//	main.foodManager.printAllNonVegitems(); 
	}
	void showUserOption() {
		System.out.println("enter 1 to update the food items ");
		Scanner sc = new Scanner(System.in);
		int Item = sc.nextInt();	
	    switch (Item) {
	    case 1 : 
	    	updateFoodItems(foodManager);
	    	break;
	    default : 
	    	throw new IllegalArgumentException("Unexpected Value ");	
	    }
		
	}

	private void updateFoodItems(FoodManager foodManager) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Food Item to be Update ");
	    String Item = sc.next();
	    FoodItem foodItem = foodManager.getFoodItem(Item);
	    System.out.println(foodItem);
	    
	    
	    int parameter = 0;
        while (parameter != 5) {
            System.out.println("Enter 1-Taste \n 2-Prep Time, \n 3-name, \n 4-category");
            parameter = sc.nextInt();

            switch (parameter) {
                case 1:
                    updateTaste(foodItem);
                    break;
                case 2:
                    updatePrepTime(foodItem);
                    break;
                case 3:
                    updateName(foodItem);
                    break;
                case 4:
                    updateCategory(foodItem);
                    break;
            }
            System.out.println(foodItem);
        }
    }
	    
	   
	
	private void updateTaste(FoodItem FoodTaste) {
		System.out.println( "To change taste ");
		System.out.println("press 1 for oily");
    	System.out.println(" enter 2 for spicy");
    	System.out.println("enter 3 for crunchy");
    	System.out.println("enter 4 for lightsugary");
    	Scanner sc = new Scanner(System.in);
    	int taste = sc.nextInt();
    	
    	switch (taste) {
    	case 1 :
    		FoodTaste.taste = FoodItem.Taste.spicy;
    		break;
    	case 2 :
    		FoodTaste.taste = FoodItem.Taste.oily;
    		break;
    	case 3 :
    		FoodTaste.taste = FoodItem.Taste.crunchy;
    		break;
    	case 4 : 
    		FoodTaste.taste = FoodItem.Taste.lightsugary;
    		break;
    		default : 
    			System.out.println(" Please enter correct input");

    	}			
    	System.out.println(" Updated FoodItems " + " " + FoodTaste);
		
	}
	
	private void updatePrepTime(FoodItem foodItems) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time ");
        foodItems.preparationTime = sc.nextByte();
    }

    private void updateName(FoodItem foodItems) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        foodItems.name = sc.nextLine();
    }

    private void updateCategory(FoodItem foodItems) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from below ");
        System.out.println("1- MAINCOURSE 2-STARTERS 3-JUICES 4-DESSERT");
        System.out.print("Enter your choice : ");
        int category = sc.nextInt();
        switch (category) {
            case 1:
            	foodItems.category = FoodItem.Category.MainCourse;
            	break;
            case 2:
                foodItems.category = FoodItem.Category.Starters;
                break;
            case 3:
                foodItems.category = FoodItem.Category.Juices;
                break;
            case 4:
                foodItems.category = FoodItem.Category.Dessert;
            default:
                System.out.println("Enter right Category.");
        }
    }

}

			

  