package geometry;

import java.awt.Point;

public class Square extends Rectangle {
	
	public Square() {
		// Creates a unit square
		super(new Point(0, 1), new Point(1, 0));
	}
	
	public Square(Point p) {
		// Takes coordinates of parameter p, and 
		// uses that to create a new point with
		// inverse parameters to satisfy square property
		super(p, new Point(p.y, p.x));
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}