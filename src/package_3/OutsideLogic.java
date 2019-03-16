package package_3;

public class OutsideLogic {
	public static void main(String... weather) {
		System.out.print(weather[0]!=null
		&& weather[0].equals("sunny")
		&& !false
		? "Go Outside" : "Stay Inside");
		}
}
