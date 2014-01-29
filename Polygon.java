package geometry;

/**
 * 
 * @author d_sakho
 * This abstract class defines the property of
 * a polygon (i.e. a shape that consists of three
 * or more sides on a 2D plane
 */
public abstract class Polygon extends Shape {
	
	/**
	 *  
	 * @return - Returns the perimeter of the shape
	 */
	public abstract float getPerimeter();
}
