package package_3;

public class Oxygen extends Element {
	public int getSymbol() { return 8; } // g2
	public void printData() {
	try {
	System.out.print(getSymbol());
	} catch(Exception e ) 
	{ // g3
	System.out.print("Unable to read data");
	}
	}
}
