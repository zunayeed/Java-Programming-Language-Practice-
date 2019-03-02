package city;

public class Street {
	public static void dancing() throws RuntimeException {
		try {
		throw new IllegalArgumentException();
		} catch (Error e) { // variable name e was missing
		System.out.print("Unable!");
		}
		}
		public static void main(String... count) throws RuntimeException {
		dancing();
		}
}
