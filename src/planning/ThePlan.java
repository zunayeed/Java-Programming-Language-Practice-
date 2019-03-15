package planning;

public class ThePlan {
	public static void main(String[] args) {
		
	int plan = 1;
	//System.out.println(plan++);
	// plan = plan++; 
	plan = plan++ + --plan;
	//plan =  --plan;
	System.out.println(plan);// 2
	if(plan==1) {
	System.out.print("Plan A");
	} 
	 else System.out.print("Plan C");
	}
}

