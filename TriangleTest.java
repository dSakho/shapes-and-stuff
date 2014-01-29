package geometry;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle triangle = (Triangle) ShapeFactory.getShape("triangle");
		System.out.println("Triangle has base length - " + triangle.getBaseLength());
		triangle.displayStats();
		System.out.println(triangle);
		System.out.printf("%b %b %b", triangle.isEquilateral(),
				triangle.isIsosceles(), triangle.isScalene());
	}
}
