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
	}

}
