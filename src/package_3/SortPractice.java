package package_3;
import java.util.*;
public class SortPractice {
	public static void main(String[] args) {
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		System.out.println(strings);
		for (String string : strings)
		System.out.print(string + " ");
		
		String[] nums = new String[] { "1", "9", "10" };
		Arrays.sort(nums);
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		String lion [] = new String[] {"lion"};
		String tiger [] = new String[1];
		String bear [] = new String[] {};
		String ohMy [] = new String[0] ;
		
		String[][] matrix = new String[1][2];
		matrix[0][0] = "Don't think you are, know you are."; // m1
		matrix[0][1] = "I'm trying to free your mind Neo"; // m2
		// matrix[1][0] = "Is all around you "; // m3
		matrix[1][1] = "Why oh why didn't I take the BLUE pill?"; // m4
		
		
	}

}
