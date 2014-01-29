package geometry;

import java.awt.Point;

public class Rectangle extends Polygon {

	// Upper left and Lower right Point bounds
	Point UL = null, LR = null;
	
	protected int length, width;
	
	protected final static int numberOfSides = 4;
	
	public Rectangle() {
		this(new Point(0, 5), new Point(5, 0));
	}
	
	public Rectangle(Point UL, Point LR) {
		this.UL = UL;
		this.LR = LR;
	}
	
	protected int getLength() {
		return Math.abs(LR.x - UL.x);
	}
	
	protected int getWidth() {
		return Math.abs(UL.y - LR.y);
	}
	
	protected LineSegment getDiagonal() {
		LineSegment diagonal = new LineSegment(UL, LR);
		return diagonal;
	}

	@Override
	public double getArea() {
		return getLength() * getWidth();
	}

	@Override
	public float getPerimeter() {
		return (2 * getLength()) + (2 * getWidth());
	}
	
	@Override
	public Rectangle copy() {
		return this;
	}
	
	protected static int getNumberOfSides() {
		return numberOfSides;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle r = (Rectangle) obj;
		return (r.getArea() == this.getArea())
				&& (r.getPerimeter() == this.getPerimeter());
	}
	
	@Override
	public int hashCode() {
		Double aArea = getArea();
		Float pPerimeter = getPerimeter();
		
		return aArea.hashCode() * pPerimeter.hashCode();
	}
	
	@Override
	public String toString() {
		return String.format("Area: %.2f Perimeter: %.2f", 
				getArea(), getPerimeter());
	}
}