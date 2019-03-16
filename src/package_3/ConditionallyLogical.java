package package_3;

public class ConditionallyLogical {
public static void main(String... data) {
	System.out.println(data.length);
//	System.out.println(data[0]);
if(data.length>=1
&& (data[0].equals("sound") || data[0].equals ("logic"))
&& data.length<2) {
System.out.print(data[0]);
}
}
}
