package package_3;

import java.util.Arrays;

public class PrintArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[ ] numbers = {2, 3, 5, 7};    
			String[] nums = new String[] {"1","9","10"};
			System.out.println(Arrays.toString(nums));
			System.out.println(Arrays.toString(numbers));
			
			String[] os = new String[] {"Mac", "Linux", "Windows"}; 
			Arrays.sort(os);
			System.out.println(Arrays.binarySearch(os, "Mac"));
			
			char[][] ticTacToe = new char[3][3]; 
			ticTacToe[1][2] = 'X'; 
			ticTacToe[2][2] = 'x'; 
			ticTacToe[1][1] = 'X'; 
			System.out.println(Arrays.toString(ticTacToe));
			
	}

}
