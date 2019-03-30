package modularcodeTestPackage;

//Demonstrate a simple module-based application. 
// package appstart.mymodappdemo; 

// import appfuncs.simplefuncs.SimpleMathFuncs; 


public class MyModAppDemo1 { 
public static void main(String[] args) { 

 if(SimpleMathFuncs1.isFactor(2, 10)) 
   System.out.println("2 is a factor of 10");  

 System.out.println("Smallest factor common to both 35 and 105 is " + 
                    SimpleMathFuncs1.lcf(9, 4));  

 System.out.println("Largest factor common to both 35 and 105 is " + 
                    SimpleMathFuncs1.gcf(9, 21));  
 int c= 9; 
 int d = 27; 
 
 int min1 = c < d ? c : d; 
 System.out.println(min1/2);

} 
}