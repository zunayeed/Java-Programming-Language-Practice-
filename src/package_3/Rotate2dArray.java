package package_3;
/* rotate a 2D matrix by 90 degree */
public class Rotate2dArray {

	public static void main(String[] args) {
	//	int[][] mArray = new int[4][2];
		 
		/*
		for(int i = 0; i <mArray.length; i++) {
			  for( int j =0; j < mArray[i].length; j++)
				  System.out.println(mArray[i][j]+ " ");		  
		  }
		*/
		//  System.out.println(Arrays.deepToString(mArray));
		
		int[ ] numbers = {2, 3, 5, 7};    
		for (int print: numbers) {
		   System.out.println(print); 
		}
		
		int[][] array2d = {{1, 2, 3}, {4, 5, 6}};
		for (int[] array : array2d) {
		    for (int element : array) {
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}
	}

}
