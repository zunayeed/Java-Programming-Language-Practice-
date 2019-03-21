package package_3;
import java.util.*;
public class Copier {
	public static void main(String... original) {
		List<String> drinks = Arrays.asList("can", "cup");
		System.out.println(drinks.size());
		for (int container = drinks.size() - 1; container >= 0; container--)
		System.out.print(drinks.get(container) + ",");
		
		List<String> bottles = Arrays.asList("glass", "plastic");
		for (int type = 0; type < bottles.size();) {
		System.out.print(bottles.get(type) + ",");
		break;
		}
		System.out.println("end");
		
		String letters = "";
		while (letters.length() != 2)
		letters+="a";
		System.out.println(letters);
		
	}
		
		
		}
	
	
