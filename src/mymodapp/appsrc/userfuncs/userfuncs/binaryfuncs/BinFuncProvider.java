//listing 12
// This interface defines the form of a service provider that 
// obtains BinaryFunc instances. 
package userfuncs.binaryfuncs; 
 
import userfuncs.binaryfuncs.BinaryFunc; 
 
public interface BinFuncProvider { 
 /*
 BinFuncProvider declares only one method, get( ), which is used to obtain an
instance of BinaryFunc. This interface must be implemented by a class that
wants to provide instances of BinaryFunc.
 */
  // Obtain a BinaryFunc. 
  public BinaryFunc get(); 
}
