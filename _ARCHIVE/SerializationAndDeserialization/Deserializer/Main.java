package _ARCHIVE.SerializationAndDeserialization.Deserializer;
import java.io.*;
import _ARCHIVE.SerializationAndDeserialization.*;

public class Main {
    /*
    Steps to Deserialize
    1. Declare object(same as in serialization), do not instantiate
    2. Your class should implement Serializable interface, add import java.io.Serializable    
    3. FileInputStream fileIn = new FileInputStream("path");
    4. ObjectInputStream in = new ObjectInputStream(fileIn);
    5. user = (User)  in.readObject();
    6. in.close();    fileIn.close();

*/

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        User user = null;
        FileInputStream fileIn = new FileInputStream("/workspaces/Sami-Java/userInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("User object state loaded back");
        
        //fields declared as transient are not serialized and are ignored
        System.out.println(user.password);  //will show as null and not the actual password

        System.out.println(user.name);
        user.sayHello();
    }
}
