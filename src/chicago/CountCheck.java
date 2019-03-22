package chicago;

import java.util.*;

public class CountCheck {
	public static void main(String[] args) {
		 /* 
		  * int count = 0;
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
			
			String letters = "";
			while (letters.length() != 10)
			letters+="ab";
			System.out.println(letters);
			
			int count = 10;
			List<Character> chars = new ArrayList<>();
			do {
				chars.add('a');
				for (Character x : chars) count -=1;
			}while (count > 0);
			System.out.println(chars.size());
			*/
		int k = 0;
		for (int i = 10; i > 0; i--) {
		while (i > 3) i -= 3;
		k += 1;
		}
		System.out.println(k);
			}
	}
			


