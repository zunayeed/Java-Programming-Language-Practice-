package lamdaDemoPackage;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNum;
		myNum = () -> 123.45;
	    // Call getValue(), which is overridden by the previously assigned 
	    // lambda expression. 
	    System.out.println("A fixed value: " + myNum.getValue()); 
	 
	}

}
