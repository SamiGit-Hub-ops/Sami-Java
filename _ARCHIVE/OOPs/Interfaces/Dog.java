package WIP.Interfaces;

/**
 * CONCRETE IMPLEMENTATION B
 * 
 * Mechanics:
 * - Fulfills the exact same contract as Cat, but executes entirely unique logic inside the bodies.
 */
public class Dog implements Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks!!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps!!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats!!");
    }
}
