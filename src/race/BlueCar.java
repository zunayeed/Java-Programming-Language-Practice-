package race;

abstract class Car {
static { System.out.print("1"); }  // static initializer first
public Car(String name) {    // constructors third
super();
System.out.print("2");
}
{ System.out.print("3"); //instance intializers second }
}

public class BlueCar extends Car {
{ System.out.print("4"); }
public BlueCar() {
super("blue");
System.out.print("5");
}
public static void main(String[] gears) {
new BlueCar();
}
}