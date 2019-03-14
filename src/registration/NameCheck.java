package registration;

public class NameCheck {
public static void main(String... data) {
String john = "john";
String jon = new String(john);
System.out.print((john ==jon)+" "+(john.equals(jon)));
}
}
