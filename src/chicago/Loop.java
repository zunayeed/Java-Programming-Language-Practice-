package chicago;

public class Loop {
	private static int count;
	private static String[] stops = new String[] { "Washington",
	"Monroe", "Jackson", "LaSalle" };
	public static void main(String[] args) {
		System.out.println("value of count is "+count);
		System.out.println("Length of Array:    "+ stops.length);
		
	while (count < stops.length) {
		System.out.println(count);
	if (stops[count++].length() < 8) {
	break;
	}
	System.out.println("after if statement:  "+ count);
	}
	System.out.println("this is the last count: "+count);
	}
}
