package geometry;

public class ShapeFactoryTest {
	public static void main(String[] args) {
		System.out.println("Using the Shape Factory to "
				+ "produce different shapes:");
		System.out.println("Triangle - " + ShapeFactory.getShape("triangle"));
		System.out.println("Rectangle - " + ShapeFactory.getShape("rectangle"));
		System.out.println("Circle - " + ShapeFactory.getShape("circle"));
		System.out.println("Square - " + ShapeFactory.getShape("square"));
	}
}
