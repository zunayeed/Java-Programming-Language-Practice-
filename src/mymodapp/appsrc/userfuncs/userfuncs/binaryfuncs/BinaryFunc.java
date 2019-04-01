// listing 11
/*
Two service-related interfaces are needed. One specifies the form of an action,
and the other specifies the form of the provider of that action. Both go in the
binaryfuncs directory, and both are in the userfuncs.binaryfuncs package.
The first, called BinaryFunc, declares the form of a binary function.

*/
// This interface defines a function that takes two int 
// arguments and returns an int result. Thus, it can 
// describe any binary operation on two ints that 
// returns an int. 
 
package userfuncs.binaryfuncs; 
 
public interface BinaryFunc { 
  // Obtain the name of the function. 
  public String getName(); 
 
  // This is the function to perform. It will be 
  // provided by specific implementations. 
  public int func(int a, int b); 
}