package geometry;

public class ShapeFactory {
	
	// private constructor to prevent instantiation
	private ShapeFactory() {};
	
	public static Shape getShape(String sourceType) {
		Shape shape = null;
		switch(sourceType.toLowerCase()) {
			case "circle":
				shape = new Circle();
				break;
			case "rectangle":
				shape = new Rectangle();
				break;
			case "square":
				shape = new Square();
				break;
			case "triangle":
				shape = new Triangle();
				break;
		}
		return shape;
	}
}
