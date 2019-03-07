package sky;

public class Stars {
	private int inThe = 4;
	public   Stars() {
	super();
	}
	
	public Stars(int inThe) {
		this.inThe = inThe;
		}
	public short calculateDistance(double lat1, double lon1,
			double lat2, double lon2) {
		return new Byte((byte)6);
		
	}
		public static void main(String[] endless) {
		//System.out.print(new sky.Stars(2).inThe);
			Stars s = new Stars();
			System.out.println(s.calculateDistance(1.1,2.1,3.1,4.1));
		}
}
