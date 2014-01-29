package geometry;

/**
 * 
 * @author d_sakho
 * 
 * Class that defines a Shape
 */
public abstract class Shape {
	/**
	 * 
	 * @return - the area of the shape
	 */
	public abstract double getArea();
	
	/**
	 * 
	 * @return - The runtime copy of the shape
	 * implemented
	 */
	public abstract Shape copy();
}
