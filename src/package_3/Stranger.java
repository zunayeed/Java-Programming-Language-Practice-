package package_3;

public class Stranger {
	public static String getFullName(String firstName, String lastName) {
		try {
			System.out.println("before return");
		return firstName.toString() + " " + lastName.toString();
		}catch (NullPointerException npe) {
		System.out.print("Problem?");
		} finally {
			System.out.print("Finished!");
			} 
		
		return null;
		}
		public static void main(String[] things) {
		System.out.print(getFullName("Joyce","Hopper"));
		}
		
}
