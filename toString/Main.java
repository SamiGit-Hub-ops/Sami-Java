package toString;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        
/* Without a Custom Definition for toString() (Default)
Explicit (newCar.toString()): 
Returns the memory address (e.g., DiceRoller@15db9742).
Implicit (System.out.print(newCar)): 
Java automatically calls the default method
 and prints that same memory address. */

/* With a Custom Definition (Override)
Explicit (newCar.toString()): Returns the specific 
String you wrote in your method (e.g., "car details message").

Implicit (System.out.print(newCar)): Java automatically 
finds your custom method and prints your formatted data 
instead of the address. */



System.out.println(newCar.toString());
System.out.println(newCar);


    }
}
