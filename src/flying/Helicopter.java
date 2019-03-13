package flying;

class Rotorcraft {
protected final int height = 5;
int fly() {return 0;};
}
public class Helicopter extends Rotorcraft {
private int height = 10;
public  int fly() {
return super.height;
}
public static void main(String[] unused) {
Helicopter h = (Helicopter)new Rotorcraft();
System.out.print(h.fly());
}
}