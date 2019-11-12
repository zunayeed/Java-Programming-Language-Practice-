import java.io*; 
class Dog implements  Serializable
{
// process of writing state of an object to a file is called serialization
 int i = 10; 
 int j = 20; 
}


import java.io.*;
class SerializableDemo{
	public static void main(String [] args) throws Exception{
    Dog d1 = new Dog(); 

/* 
  Serialization: Process of saving state of an objcet to a file 
  process of converting from java supported form to network supported form 
  serialization: FOS and OOS 
  Deserialization: FIS and OIS

*/
 /*
  A file output stream is an output stream for writing data to a File or to a FileDescriptor
  FileOutputStream write binary data to file 
 */
  FileOutputStream fos = new FileOutputStream("abc.ser"); 


  // OOS take object and convert it into binary data
   ObjectOutputStream oos = new ObjectOutputStream(fos); 
   oos.writeObject(d1); // Write the specified object to the ObjectOutputStream.

// process of reading a state of an object form a file is called deserialization  
// FileInputstream read binary data from a  file 

   FileInputStream fis = new FileInputStream("abc.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Dog d2 = (Dog)ois.readObject(); 
   System.out.println(d2.i + "........." + d2.j);

}

}
