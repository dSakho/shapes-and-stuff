package geomtry;

import java.awt.Point;

public class Sphere extends Solid {

	private Point origin;
	private int radius;

	/**
	 * Constructs a unit sphere
	 */
	public Sphere() {	
		origin = new Point(0, 0);
		radius = 1;
	}

	public Sphere(Point p, int radius) {
		origin = p;
		this.radius = radius;
	}

	public double getVolume() {
		return (4/3) * java.util.Math.PI 
				* radius * radius * radius;
	}

	public double getSurface Area() {
		return 4 * radius * radius * radius;
	}

}