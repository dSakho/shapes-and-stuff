package geometry;

import java.awt.Point;
import java.util.Arrays;

public class ShapeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome! Let's make a few shapes\n");
		System.out.println("An array of circles!");
		Circle[] circles = new Circle[3];
		
		circles[0] = new Circle();	// Create unit circle
		circles[1] = new Circle(new Point(1, 1), 5);
		circles[2] = new Circle(3, 4, 10);
		
		System.out.println(Arrays.deepToString(circles));
		
		System.out.println("We love angles! Let's create a few!\n");
		
		Angle[] angles = new Angle[3];
		angles[0] = new Angle(90);
		angles[1] = new Angle(45);
		angles[2] = new Angle(157);
		
		System.out.println("Is Angle 1 a right angle? " + angles[0].isRight() 
						+ "\nIs Angle 2 an obtuse angle? " + angles[1].isObtuse()
						+ "\nIs Angle 3 an obtuse angle? " + angles[2].isObtuse());
		
		
		System.out.println("Triangle!");
		Point pA, pB, pC;
		pA = new Point(0, 0);
		pB = new Point(10, 0);
		pC = new Point(5, 10);
		
		Triangle triangle = new Triangle(pA, pB, pC);
		
		System.out.println("Is the triangle an isosceles triange? " + triangle.isIsosceles());
		System.out.println(triangle.toString());
		triangle.displayStats();
	}
}
