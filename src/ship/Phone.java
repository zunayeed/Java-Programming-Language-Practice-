package ship;

public class Phone {
	private int size;
	public Phone(int size) {this.size=size;}
	public static void sendHome(Phone p, int newSize) {
	p = new Phone(newSize);
	System.out.println(p.size);
	p.size = 4;
	System.out.println(p.size);
	}
	public static final void main(String... params) {
	final Phone phone = new Phone(3);
	sendHome(phone,7);
	System.out.print(phone.size);
	//  System.out.println(p.size); will not compile 
	
	}

}
