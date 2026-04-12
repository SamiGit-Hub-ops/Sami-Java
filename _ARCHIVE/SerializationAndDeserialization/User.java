package _ARCHIVE.SerializationAndDeserialization;

import java.io.Serializable;

public class User implements Serializable{
    
    public String name;
    
    //fields declared as transient are not serialized 
    // and are ignored, if tried to accessed will show as null
    public transient String password; 

    public void sayHello() {
        System.out.println("Hello "+name);
    }
}
