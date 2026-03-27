package Inheritance;

public class Main {
    
    public static void main(String[] args) {

/* inheritance
a class (subclass, child class) acquires attributes and methods
of another class(superclass, parent class)
 */
        Car myCar = new Car();
        Cycle myCycle = new Cycle();

//inherited details
        myCar.go();  //using the parent method as it is
        myCar.stop();
System.err.println("car initial speed: "+myCar.initialSpeed);
System.err.println("car build: "+myCar.build);

        myCycle.go();  //method overriding, in myCycle class the go() method is overwritten with its own implementation
        myCycle.stop();
System.err.println("cycle initial speed: "+myCycle.initialSpeed);
System.err.println("cycle build: "+myCycle.build);




    }
}
