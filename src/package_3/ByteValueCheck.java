package package_3;

public class ByteValueCheck {

	public static void main(String[] args) {
		Integer integer = new Integer(67); 
		System.out.println(integer.byteValue());
		
/* java does to allow calling method on primitive so this code will not compile*/
		int i =  new Integer(4); 
		System.out.println(i.byteValue());
	}

}
