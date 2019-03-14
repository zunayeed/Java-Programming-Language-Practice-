package package_3;

public class CheckOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meal = 5;
		int tip = 2;
		int total = meal + (meal>6 ? ++tip : --tip);
		System.out.println(tip);
		System.out.println(total);
	}

}
