package polymorphic_parameter_test;

/*    One of the most useful applications of polymorphism is the ability to pass instances of
a subclass or interface to a method. For example, you can defi ne a method that takes an
instance of an interface as a parameter. In this manner, any class that implements the interface
can be passed to the method. Since you’re casting from a subtype to a supertype, an
explicit cast is not required. This property is referred to as polymorphic parameters of a
method, and we demonstrate it in the following example: 
 * */
public class Reptile {
	public String getName() {
		return "Reptile";
		}
}
