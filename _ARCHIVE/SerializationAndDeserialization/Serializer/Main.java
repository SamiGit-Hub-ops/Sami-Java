package _ARCHIVE.SerializationAndDeserialization.Serializer;
import _ARCHIVE.SerializationAndDeserialization.*;

import java.io.*;

/* To serialize an object in Java (save its state to a file), 
follow these 4 brief steps:
1 Implement Serializable: Make your class implement the java.io.Serializable 
    interface (this is a "marker" interface, so no methods are required).
2 Create a File Stream: Initialize a FileOutputStream to specify where the 
file will be saved.
3 Create an Object Stream: Wrap the file stream in an ObjectOutputStream.
4 Write and Close: Use the writeObject(objectName) method to save the object,
 then close the streams.  */

public class Main {
    
    public static void main(String[] args) throws IOException{
        User user1 = new User();

        user1.name = "Dom";
        user1.password = "12345";

        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user1);

        out.close();
        fileOut.close();

        System.out.println("Object state saved in file");
    }
}
