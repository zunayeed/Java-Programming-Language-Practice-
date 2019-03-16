package city;

public class Road {
	public static void main(String... in) {
		/*
		int intersections = 100;
		int streets = 200;
		if (intersections < 150) {
		System.out.print("1");
		} else if (streets / intersections > 0) {
		System.out.print("2");
		} if (streets < 500)
		System.out.print("3");
		else
		System.out.print("4");
		*/
		int x = 10, y = 5;
		boolean w = true, z = false;
		System.out.println(x);
		System.out.println(w);
		x = w ? y++ : y--;
		w = !z;
		System.out.println((x+y)+" "+(w ? 5 : 10));
				
		}
}
