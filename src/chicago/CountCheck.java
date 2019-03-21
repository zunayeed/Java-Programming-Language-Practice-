package chicago;

public class CountCheck {
	public static void main(String[] args) {
		int count = 0;
		do {
			
			do {
			count++;
			} while (count < 2);
			break;
			} while (true);
			System.out.println(count);
			
			int singer = 0;
			while (singer > 0)
			System.out.println(singer++);
			
			boolean balloonInflated = false;
			System.out.println(!balloonInflated);
			do {
			if (!balloonInflated) {
			balloonInflated = true;
			System.out.print("inflate-");
			}
			} while (! balloonInflated);
			System.out.println("done");
	}

}
