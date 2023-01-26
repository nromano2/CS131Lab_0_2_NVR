/**
 * This class exists to create a square object with a given side length.
 * This class has methods to compute the area of that square, and to return and modify the side length of the square
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * CS131LAB_0_2_NVR
 * Spring 2023
 */

public class Square {
	private int side; // the integer side instance variable will be used to store the side length of the square
	
	/**
	 * The empty-argument default Square constructor initializes the side variable of the square object to have a length of 0
	 */
	public Square()
	{
		this.side=0;
	} //end constructor
	
	/**
	 * Square preferred constructor initializes the side variable of the square object to have a length based on the parameter value being passed in.
	 * @param side - integer value used to store the length of the side of the square
	 */
	public Square(int side)
	{
		this.side=side;
	}//end constructor
	
	/**
	 * The getArea method calculates and returns the area of the square.
	 * 
	 * @param area, a local double variable area is used to calculate the value of the area of a given square
	 * @return the local double variable area 
	 */
	public double getArea()
	{
		double area = Math.pow(side, 2);
		return area;
	}//end getArea
	
	/**
	 * Accessor method that returns the current value of side
	 * @return the current value of side
	 */
	public int getSide()
	{
		return side;
	}// end getSide
	
	/**
	 * Mutator method that modifies side to be set to a new value
	 * @param side, the new value of side to be set to
	 */
	public void setSide(int side)
	{
		this.side = side;
	}//end setSide

	public String toString()
	{
		double area  = Math.pow(side,2);
		return ("Side legnth: " + side + " unit(s)\n" + "Area of the Square: " +  area + " square unit(s)\n");
	}//end toString
}
