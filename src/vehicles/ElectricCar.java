package vehicles;

public class ElectricCar extends Car {
	
	public  String drive() { return "Driving electric car"; }
	public static void main(String[] wheels) {
	
		
		
	 Car car = new ElectricCar();
	 System.out.println("reference car and object electric car:  " + car.drive());
	 
	 Car car1 =  new Car();
	 System.out.println("    reference car and object car     :  "+car1.drive());
	 
	 Car car2 = (Car) new Automobile();
	 System.out.println(car2.drive());
	 
	 Automobile auto1 = new Automobile(); 
	 System.out.println(auto1.drive());
	 
	}

}
