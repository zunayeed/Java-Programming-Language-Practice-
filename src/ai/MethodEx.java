package ai;

public class MethodEx {
 public int Addition() {
	int i =10, j = 20; 
	int result = i+j; 
	System.out.println(i+j);
	return result; 
	
 }
 public int Subtraction() {
	 int i = 10, j = 5; 
	 int result = i-j; 
		System.out.println(i-j);
		return result;
 }
 public void Multiply() {
	 int Result = Addition() * Subtraction();
	 System.out.println(Result);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MethodEx M = new MethodEx();
  M.Addition();
  M.Subtraction();
  M.Multiply();
	}

}
