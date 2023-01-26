/**
 * 
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * Project Name: CS131LAB_0_2_NVR
 * Semester Term: Spring 2023
 */
public class ArrayFun {
	private Square[] myArray; //private array whose elements consists of square objects
	
	/**
	 * The empty-argument ArrayFun default constructor initializes myArray which consists of 6 elements of Square objects.
	 * The 6 Square object elements within myArray, have a side length that is equal to their index position within the array
	 */
	public ArrayFun()
	{
		myArray = new Square[6];
		
		for(int i = 0; i < myArray.length; i++)
		{
			myArray[i] = new Square(i);
		}
	}//end constructor
	
	/**
	 * The preferred ArrayFun constructor initializes myArray which contains square objects.
	 * The number of elements within the ArrayFun array is determined by the value passed in the parameter list.
	 * The number Square object elements within myArray, have a side length that is equal to their index position within the array.
	 */
	public ArrayFun(int numElements)
	{
		myArray = new Square[numElements];
		
		for(int i = 0; i < myArray.length; i++)
		{
			myArray[i] = new Square(i);
		}
		
	}//end constructor
	
	/**
	 * The forward method consists of a for loop that iterates through myArray from the first element to the last
	 * In iterating through the array, the forward method prints each Squares side length and area.
	 */
	public void forward()
	{
		for(int i =0; i< myArray.length; i++)
		{
			System.out.println("Area of a sqaure with a side length of " + myArray[i].getSide() + ": " + myArray[i].getArea() + " units squared");
		}
	}//end forward
	
	/**
	 * The backward method consists a for loop that iterates through myArray from the last element to the first
	 * In iterating through the array, the backward method prints the side length and area of each square object.
	 */
	public void backward()
	{
		for(int i = (myArray.length - 1); i >= 0; i--)
		{
			System.out.println("Area of a sqaure with a side length of " +  myArray[i].getSide() + ": " + myArray[i].getArea() + " units squared");
		}
		
	}//end backward
	
	/**
	 * The sum method consists a for loop that iterates through myArray and adds each elements area to the areaSum variable
	 * @param areaSum, a double local variable initialized to zero and is used to store the sum of the areas of the square elements within myArray
	 */
	public void sum()
	{
		double areaSum = 0d;
		
		for(int i =0; i< myArray.length; i++)
		{
			areaSum += myArray[i].getArea();		
		}
		
		System.out.println("Sum of the areas of the squares within the array: " + areaSum);
	}//end sum
	
	/**
	 * The getArrayItem accessor method returns the area of the square of a specified index position within the array
	 * @param index - integer value that represents an index within myArray
	 * @return the area of the square object within myArray at a specified index position
	 */
	public double getArrayItem(int index)
	{
		return myArray[index].getArea();
	}//end getArrayItem
	
	/**
	 * The setArrayItem modifier method accepts an integer index value and a instance of a Square object.
	 * The setArrayItem stores the new Square object at the specified index position
	 * @param index - stores the value of the index position within myArray
	 * @param s - is a instantiation of the Square class to create a new Square object at the specified index position
	 */
	public void setArrayItem(int index, Square s)
	{
		myArray[index] = s;
	}//end setArrayItem
	
	
}
