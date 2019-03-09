package theater;

public class Movie extends Cinema {
	public Movie(String movie) {
		  super(movie); 
		  }
	public static void main(String[] showing) {
	System.out.print(new Movie("Another Trilogy"));
	}
}
