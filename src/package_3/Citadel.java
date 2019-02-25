package package_3;

public class Citadel {
	public void openDrawbridge() throws RuntimeException { // q1
		
		try {
			throw new KnightAttackingException();
			} catch (Exception e) {
			throw new ClassCastException();
			} finally {
			try {
				throw new CastleUnderSiegeException();
			} catch (CastleUnderSiegeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // q2
			}
			}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Citadel().openDrawbridge(); // q3
	}

}
