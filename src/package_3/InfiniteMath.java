package package_3;
class Math {
public final double secret = 2;
}
class ComplexMath extends Math {
public final double secret = 4;
}
public class InfiniteMath extends ComplexMath {
public final double secret = 8;
public static void main(String[] numbers) {
Math math = new InfiniteMath();
ComplexMath  cmath = new InfiniteMath();
InfiniteMath imath = new InfiniteMath();
System.out.println(math.secret);
System.out.println(cmath.secret);
System.out.println(imath.secret);

}
}