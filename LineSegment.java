package geometry;

import java.awt.Point;

public class LineSegment {
	
	Point a = null, b = null;
	
	LineSegment(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	public float getLength() {
		float length;
		int x, y;
		x = (b.x - a.x);
		y = (b.y - a.y);
		
		length = (float) Math.sqrt((x * x) + (y * y));
		return length;
	}
	
	public Point getMidPoint() {
		int x, y;
		x = (int) (0.5 * (a.x + b.x));
		y = (int) (0.5 * (a.y + b.y));
		return new Point(x, y);
	}
	
	public float getSlope() throws IllegalDenominatorException {
		
		if (b.x == a.y)
			throw new IllegalDenominatorException("Denominator cannot equal 0");
		
		float m = (b.y - a.y) / (b.x - a.x);
		return m;
	}
	
	public float getInverseSlope() throws IllegalDenominatorException {
		return (-(1/getSlope()));
	}
	
	public static boolean isPerpendicular(LineSegment a, LineSegment b) throws IllegalDenominatorException {
		return a.getSlope() == b.getInverseSlope();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof LineSegment)) 
			return false;
		LineSegment l = (LineSegment) obj;
		return l.a == this.a &&
				l.b == this.b;
	}
	
	public String toString() {
		return String.format("[[%d,%d] - [%d,%d]]", a.x, a.y, b.x, b.y);
	}

}