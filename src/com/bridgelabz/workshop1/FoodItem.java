package com.bridgelabz.workshop1;
import java.util.ArrayList;
import java.util.Objects;

interface Iveg {
	
}
interface Inonveg {
	
}

public abstract class FoodItem {
	
	enum Taste {spicy , oily , crunchy, lightsugary };
	enum Category {MainCourse,Starters,Juices,Dessert};
	

	//Types types;
	Category category;
	Taste taste ;
	float price ;
	byte preparationTime;
	String name;
	
	@Override
	public String toString() {
		return "FoodItems [ category=" + category + ", taste=" + taste + ", price=" + price
				+ ", preparationTime=" + preparationTime + ", name=" + name + "]";
	}
		
	public abstract void printMainIngrediants();

	@Override
	public int hashCode() {
		return Objects.hash(category, name, preparationTime, price, taste);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		return category == other.category && Objects.equals(name, other.name)
				&& preparationTime == other.preparationTime
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && taste == other.taste;
	}
	

}

