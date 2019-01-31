package package_3;
/* this program implements the power function  iteration from 1 */
public class PowerFunction {

	public static void main(String[] args) {
		int base = 5 ; 
		int exponent = 2;
		int result = base ;
		for(int i = 1; i< exponent; i++) {
			result = result * base ; 
		}
		System.out.println(result);
		
	}

}
