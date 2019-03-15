package voting;

public class Election {
	public void calculateResult(Integer candidateA, Integer candidateB) {
		 boolean process = candidateA == null || candidateA.intValue() < 10;
		 // System.out.println(candidateA);
		 int value = candidateA + candidateB;
		 System.out.print( value);
	 }
	public static void main(String[] unused) {
	 new Election().calculateResult(25,203);
	}
	
}
