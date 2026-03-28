package _ARCHIVE.Polymorphism;

public class Main {

    public static void main(String[] args) {
 
// Even though they are different objects, they all "identify" as Vehicles.
    Car car = new Car();
    Plane plane = new Plane();
    Cycle cycle = new Cycle();

    Vehicle[] racers = {car, plane, cycle};

// Polymorphism: many forms, ability of an object to identify as more than one type
//car identify as car and vehicle, same for plane & cycle

// We can now loop through them and call go() 
// without knowing exactly which one is which!
    for(Vehicle r: racers) {
       r.go();
    }
    
/* 
Polymorphism allows objects of different classes to be treated as a common type.
The Array: You can store a Car and a Plane in the same Vehicle[] array because of polymorphism.
Dynamic Method Binding: When the loop runs r.go(), Java "figures out" at runtime which 
version of go() to run. It doesn't just call a generic vehicle method; it finds the specific one we wrote.

 */

  } 

}