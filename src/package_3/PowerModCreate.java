package package_3;

	import java.util.*;
    import java.io.*;
	
	/* Implement pow(A, B) % C.
       In other words, given A, B and C, find (A^B)%C.     */
    
    
public class PowerModCreate {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in) ; 
		
		System.out.println(" Please enter  3 numbers a, b, c : ");
		  int base = in.nextInt(); 
		  System.out.println("You entered integer:a  "+ base ); 
		  
		  int exponent = in.nextInt(); 
		  System.out.println("You entered integer:b  " + exponent ); 
		  
		  int divisor = in.nextInt(); 
		  System.out.println("You entered integer:c  " + divisor ); 
		 /* iteration starts from Zero  */ 
		  int result = 1 ;
			for(int i = 0; i< exponent; i++) {
				result = result * base ; 
			}
			System.out.println(result);
		  
	}

}
