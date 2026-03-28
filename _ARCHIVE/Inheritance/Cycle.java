package _ARCHIVE.Inheritance;

//sub class

public class Cycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;


    @Override
    void go() {
        System.err.println("I am riding the bicycle");
    }
}
