package slopes;

public class Ski {
	private int age = 18;
	private static void slalom(Ski racer, int[] speed, String name) {
	racer.age = 18;
	name = "Wendy";
	speed = new int[1];
	speed[0] = 11;
	racer = null;
	}
	public static void main(String... mountain) {
	final Ski mySkier = new Ski();
	mySkier.age = 16;
	final int[] mySpeed = new int[1];
	final String myName = "Rosie";
	System.out.println(slalom(mySkier,mySpeed,myName));
	}

}
