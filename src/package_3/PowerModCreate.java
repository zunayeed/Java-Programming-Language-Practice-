package package_3;

	import java.util.*;
    import java.io.*;
	
	/* Implement pow(A, B) % C.
       In other words, given A, B and C, find (A^B)%C.     */
    
    
public class PowerModCreate {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in) ; 
		
		System.out.println("Please enter  3 numbers base , exponent , divisor :");
		  int base = in.nextInt(); 
		  System.out.println("You entered integer: base  "+ base ); 
		  
		  int exponent = in.nextInt(); 
		  System.out.println("You entered integer: exponent  " + exponent ); 
		  
		  int divisor = in.nextInt(); 
		  System.out.println("You entered integer: divisor " + divisor ); 
		 /* iteration starts from Zero  */ 
		  int result = 1 ;
			for(int i = 0; i< exponent; i++) {
				result = result * base ; 
			}
			System.out.println("	Power function is :  "+ result);
		  
			int powerMod = result - (result/divisor)*divisor ; 
			System.out.println("	Power Modulus function is   "+ powerMod);	
			
	}

}
