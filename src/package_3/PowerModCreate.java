package package_3;

	import java.util.*;
    import java.io.*;
	
	/* Implement pow(A, B) % C.
       In other words, given A, B and C, find (A^B)%C.     */
    
    
public class PowerModCreate {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in) ; 
		
		System.out.println(" Please enter  3 numbers a, b, c : ");
		  int a = in.nextInt(); 
		  System.out.println("You entered integer:a  "+ a ); 
		  
		  int b = in.nextInt(); 
		  System.out.println("You entered integer:b  " + b ); 
		  
		  int c = in.nextInt(); 
		  System.out.println("You entered integer:c  " + c ); 
		  
		  int counter ; 
		  int power_res =1; 
		  for(  counter = 1 ;  counter <= b ; counter++ ) {
			  power_res = a * counter;
		  }
		  
		  	System.out.println(power_res);
		  
	}

}
