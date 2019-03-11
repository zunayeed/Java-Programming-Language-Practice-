package shapes;

public abstract class IsoscelesRightTriangle extends RightTriangle {
	public String getDescription() { return "irt"; }
	public static void main(String[] edges) {
	final Triangle shape = new IsoscelesRightTriangle(); // g3
	System.out.print(shape.getDescription());
	}
}
