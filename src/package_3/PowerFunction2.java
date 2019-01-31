package package_3;
/* this program implements the power function  iteration from 0 */
public class PowerFunction2 {

	public static void main(String[] args) {
		int base = 5 ; 
		int exponent = 3;
		int result = 1 ;
		for(int i = 0; i< exponent; i++) {
			result = result * base ; 
		}
		System.out.println(result);
		
	}

}
