package geometry;

import java.awt.Point;

public class Triangle extends Polygon {
	
	protected final static int numberOfSides = 3;
	
	Point a = null, b = null, c = null;
	LineSegment lineA = null, lineB = null, 
				lineC = null, baseSegment = null;
	Angle angleA = null, angleB = null, angleC = null;
	int height;
	
	// Default Constructor
	Triangle() {
		this(new Point(1, 2), new Point(4, 2),
			new Point(3, 8));
	}
	
	/**
	 * Constructor to create triangle from 3
	 * points.  The height of the triangle is
	 * set from finding the Point with the lowest
	 * Y value and subtracting that from the Point
	 * with the highest Y value
	 * @param a - Point a
	 * @param b - Point b
	 * @param c - Point c
	 */
	Triangle(Point a, Point b, Point c) {
		setPoints(a, b, c);
		setLineSegments(a, b, c);
		try {
			setAngles(lineA, lineB, lineC);
			setHeight(getHighestPoint().y - getLowestPoint().y);
			
			LineSegment heightSegment = new LineSegment
							(new Point(getHighestPoint()), new Point(getLowestPoint())); 
				setBase(heightSegment);
		} catch (IllegalDenominatorException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Point getHighestPoint() {
		if (a.y > b.y) {
			if (b.y > c.y) {
				return a;
			} else
				return c;
		} else if (b.y > c.y) {
			if (c.y > a.y) {
				return b;
			} else
				return a;
		} else
			return c;
	}
	
	private Point getLowestPoint() {
		if (a.y < b.y) {
			if (b.y < c.y) {
				return a;
			} else
				return c;
		} else if (b.y < c.y) {
			if (c.y < a.y) {
				return b;
			} else
				return a;
		} else
			return c;
	}
	
	private void setBase(LineSegment segment) throws IllegalDenominatorException {
		if (LineSegment.isPerpendicular(lineA, segment) == true)
			baseSegment = lineA;
		else if (LineSegment.isPerpendicular(lineB, segment) == true)
			baseSegment = lineB;
		else
			baseSegment = lineC;	
	}
	
	private void setPoints(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private void setLineSegments(Point a, Point b, Point c) {
		lineA = new LineSegment(a, b);
		lineB = new LineSegment(b, c);
		lineC = new LineSegment(c, a);
	}
	
	private void setAngles(LineSegment a, LineSegment b, LineSegment c) throws IllegalDenominatorException {
		angleA = new Angle(a, b);
		angleB = new Angle(b, c);
		angleC = new Angle(c, a);
	}
	
	protected void setHeight(int height) {
		this.height = height;
	}
	
	protected int getHeight() {
		return height;
	}
	
	public boolean isIsosceles() {
		return (lineA.equals(lineB) && angleA.equals(angleB))
			|| (lineB.equals(lineC)) && angleB.equals(angleC)
			|| (lineC.equals(lineA)) && angleC.equals(angleA);
	}
	
	protected boolean isEquilateral() {
		return (lineA.equals(lineB) && lineB.equals(lineC))
				&& (angleA.equals(angleB) && angleB.equals(angleC));
	}
	
	protected boolean isScalene() {
		return !isEquilateral();
	}

	protected float getBaseLength() {
		
		LineSegment baseSegment = new LineSegment(a, b);
		return baseSegment.getLength();
	}
	
	@Override
	public double getArea() {
		return 0.5 * getBaseLength() * getHeight();
	}

	@Override
	public float getPerimeter() {
		return lineA.getLength() + lineB.getLength() + lineC.getLength();
	}
	
	@Override
	public Triangle copy() {
		return this;
	}
	
	protected void displayStats() {
		System.out.println("Triangle has Points: " +
				a.toString() + ", " + b.toString() 
				+ ", " + c.toString());
		System.out.println("Angles: " + angleA.toString() +
				", " + angleB.toString() + ", " + angleC.toString());
		System.out.println("Line Segments: " + lineA.toString() + 
				", " + lineB.toString() + ", " + lineC.toString());
	}
	
	public String toString() {
		return String.format("Height: %d Area: %.2f Perimeter: %.2f", 
				getHeight(), getArea(), getPerimeter());
	}
}