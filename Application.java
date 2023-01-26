/**
 * This application runs code from the Square and ArrayFun class.
 * This application file instantiates anArray of square objects using the default constructor from the ArrayFun class,
 * then prints the areas of each square object within the array forwards and backwards based on the index position, 
 * and finally displays the sum of the areas of each square object.
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * CS131LAB_0_2_NVR
 * Spring 2023
 */
public class Application {
	
	public static void main(String[] args) {
		//initializing array with 6 elements and each element being a square object having side length matching its index position
		ArrayFun anArray = new ArrayFun();
		
		//Using the forward method within the ArrayFun Class to print the elements of anArray from the lowest index position to the highest
		System.out.println("Array elements printed from lowest index to highest: ");
		anArray.forward();
		
		//Using the backward method within the ArrayFun Class to print the elements of anArray from the highest index position to the lowest
		System.out.println("\nArray elements printed from highest index to lowest: ");
		anArray.backward();
		
		//using the sum method within the ArrayFun Class to display the sum of the areas of the square objects within anArray
		System.out.println();
		anArray.sum();
		
		
	}
}
