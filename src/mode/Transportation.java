package mode;

public class Transportation {
	public static String travel(int distance) {
		return distance<1000 ? "train" : 12;
		}
		public static void main(String[] answer) {
		System.out.print(Transportation.travel(500));
		}
}
