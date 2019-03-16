package city;

public class Road {
	public static void main(String... incheck) {
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
		
		int x = 10, y = 5;
		boolean w = true, z = false;
		System.out.println(x);
		System.out.println(w);
		x = w ? y++ : y--;
		w = !z;
		System.out.println((x+y)+" "+(w ? 5 : 10));
		System.out.println(incheck.length);
	*/	
		int x, y, z;

		  x = 10;
		  y = 20;
		  z = 30;

		  // T T
		  // T F
		  // F T
		  // F F

		  //SET A
		  boolean a = (x < z) && (x == x);
		  boolean b = (x < z) && (x == z);
		  boolean c = (x == z) && (x < z);
		  boolean d = (x == z) && (x > z);
		  //SET B    
		  boolean aa = (x < z) & (x == x);
		  boolean bb = (x < z) & (x == z);
		  boolean cc = (x == z) & (x < z);
		  boolean dd = (x == z) & (x > z);
		System.out.println(d);
		System.out.println(dd );
		
		}
}
