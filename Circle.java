/**
 * @author d_sakho
 * Circle class 
 */

package geometry;

import java.awt.Point;
import static java.lang.Math.PI;

public class Circle extends Shape {
	
	Point origin = null;
	int radius;
	
	/* 
	 * Default constructor that creates 
	 * a unit circle at the origin
	 */
	public Circle() {
		this(0, 0, 1);
	}
	
	public Circle(Point p, int radius) {
		this(p.x, p.y, radius);
	}
	
	public Circle(int x, int y, int radius) {
		origin = new Point(x, y);
		setRadius(radius);
	}
	
	public void setOrigin(Point p) {
		this.origin.setLocation(p.getX(), p.getY());
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Point getOrigin() { 
		return origin;
	}
	
	public int getRadius() {
		return radius;
	}
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
	
	@Override
	public Circle copy() {
		return this;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Circle))
			return false;
		Circle c = (Circle) obj;
		return c.getRadius() == this.getRadius();
	}
	
	@Override
	public int hashCode() {
		return origin.hashCode() ^ radius;
	}
	
	public String toString() {
		return String.format("Origin: (%d, %d) Radius: %d Area:"
				+ " %.2f",  origin.x, origin.y, getRadius(), getArea());
	}
} // End Circle class definition