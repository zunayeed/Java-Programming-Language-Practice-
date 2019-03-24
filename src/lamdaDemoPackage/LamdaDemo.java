package lamdaDemoPackage;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNum;
		myNum = () -> 123.45;
	    // Call getValue(), which is overridden by the previously assigned 
	    // lambda expression. 
	    System.out.println("A fixed value: " + myNum.getValue()); 
	    // Here, a more complex expression is used. 
	    myNum = () -> Math.random() * 100; 
	 
	    // These call the lambda expression in the previous line. 
	    System.out.println("A random value: " + myNum.getValue()); 
	    System.out.println("Another random value: " + myNum.getValue()); 
	 
	    // A lambda expression must be compatible with the method 
	    // defined by the functional interface. Therefore, this won't work: 
	//  myNum = () -> "123.03"; // Error!
	}

}
