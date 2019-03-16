package mode;

public class Transportation {
	public static String travel(int distance) {
		return distance<1000 ? "dis" : "cis";
		}
		public static void main(String[] answer) {
		System.out.println(Transportation.travel(500));
		System.out.println(answer.length);
		}
}
