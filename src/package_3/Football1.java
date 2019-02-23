package package_3;

public class Football1 {

	public static void main(String[] officials) {
		// TODO Auto-generated method stub
		
		try {
			System.out.print('A');
			throw new RuntimeException("Out of bounds!");
			} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');
			// throw t;
			} finally {
			System.out.print('C');
			}

	}

}
