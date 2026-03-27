package Inheritance;

//super class
public class Vehicle {
    double initialSpeed = 0.0;
    String build = "custom build";

    void go() {
        System.err.println("The vehicle is moving");
    }

    void stop() {
    System.err.println("The vehicle is stopped");
    }
}
