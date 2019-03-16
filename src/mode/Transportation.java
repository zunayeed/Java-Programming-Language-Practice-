package mode;

public class Transportation {
	public static String travel(int distance) {
		return distance<1000 ? "dis" : "cis";
		}
		public static void main(String[] answer) {
		System.out.println(Transportation.travel(500));
		System.out.println(answer.length);
		int characters = 5;
		int story = 3;
		double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1;
		System.out.println(movieRating);
		
		}
}
