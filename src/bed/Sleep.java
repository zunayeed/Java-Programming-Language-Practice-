		package bed;
		public class Sleep {
		public static void snore()   {
		try {
		String sheep[] = new String[3];
		System.out.print(sheep[3]);
		} catch (RuntimeException e) {
		System.out.print("Awake!");
		} finally {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // x1
		}
		}
		public static void main(String... sheep) { // x2
		new Sleep().snore(); // x3
		}
		}