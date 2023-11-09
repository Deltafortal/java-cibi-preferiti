package org.lessons.java.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		
		// Variables
		
		String[] favourite_food = { "Carbonara", "Seppie", "Pizza", "Lasagna", "Tortellini", "Udon"};
		
		
		
		// Size
		
		int list_size = favourite_food.length;
		
		System.out.println("La lista comprende: " + list_size + " portate");
		
		
		
		
		// Top
		System.out.println("la portata al primo posto è: " + favourite_food[0]);
		
		// Bottom
		System.out.println("la portata all'ultimo posto è: " + favourite_food[list_size - 1]);
		
		
		// Middle
		if(list_size % 2 == 0) {
			
			System.out.println("Le due portate al centro della lista sono: " 
					+ favourite_food[(list_size / 2) - 1]
					+ " e "
					+ favourite_food[list_size / 2]);
			
		} else {
			
			System.out.println("la portata al centro della lista è: " + favourite_food[list_size / 2]);
			
		}
	}

}
