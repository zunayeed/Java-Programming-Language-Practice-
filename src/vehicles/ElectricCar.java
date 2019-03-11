package vehicles;
// exploring polymorphism 
public class ElectricCar extends Car {
	
	public  String drive() { return "Driving electric car"; }
	public static void main(String[] wheels) {
	
	 Car car = new ElectricCar();
	 System.out.println( car.drive());
	 
	 Automobile auto1 =  new Car(); // parent reference and child object
	 System.out.println(auto1.drive());
	 
	 Automobile auto2 =  new ElectricCar(); // grand-parent reference and grand-son object
	 System.out.println(auto2.drive());
	 
	 ElectricCar electric = (ElectricCar) new Car(); // child reference and parent object will not work
	 System.out.println(electric.drive());
	 
	 Automobile auto3 =  new Automobile();
	 System.out.println(auto3.drive());	 	  
	}
}
