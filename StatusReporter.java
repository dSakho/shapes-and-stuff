package geometry;

import java.awt.Point;

public class StatusReporter {

	private interface ShapeInterface {}
	public boolean safe;
	
	public static Shape getDescriptiveContent(final Shape shape, final String shapeName) {
		// Local class DescriptiveShape that extends the Shape class
		// This class isn't available outside of the function getDescriptiveContent()
		class DescriptiveShape extends Shape implements ShapeInterface {
			
			String name;
			DescriptiveShape(String descStr) {
				name = descStr;
			}
			@Override
			public String toString() {
				return name + 
						" has properties of:\n" + shape;
			}
			@Override
			public double getArea() {
				return shape.getArea();
			}
			@Override
			public Shape copy() {
				return shape;
			}
		}
		return new DescriptiveShape(shapeName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape descriptiveCircle = StatusReporter.getDescriptiveContent(
											new Circle(1, 1, 5), "First Circle");
		System.out.println(descriptiveCircle);
		
		final Shape unitCircle = new Circle(0,0,1);
		System.out.println(StatusReporter.getDescriptiveContent(unitCircle, "Unit Circle"));
		
		System.out.println(StatusReporter.getDescriptiveContent(
						new Triangle(new Point(2,2), new Point(3,3), new Point(4,4)), "Basic Triangle"));
		
		Shape rectangle = new Rectangle(new Point(5,10), new Point(10,5));
		String rectString = "Default Rectangle";
		System.out.println();
		System.out.println(StatusReporter.getDescriptiveContent(rectangle, rectString));
	}
}
