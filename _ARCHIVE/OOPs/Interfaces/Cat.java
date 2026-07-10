package WIP.Interfaces;

/**
 * CONCRETE IMPLEMENTATION A
 * 
 * Mechanics:
 * - By signing the contract ('implements Animal'), Cat MUST override and define all 3 methods.
 * - If a single interface method is left unimplemented, the Java compiler will flag an error.
 */
public class Cat implements Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Cat says meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps!!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats!!");
    }

    /**
     * SPECIALIST SUBCLASS METHOD
     * 
     * Mechanics:
     * - This method is unique to Cat and is NOT part of the global Animal contract.
     * - Trick: If a variable uses an 'Animal' reference type, the compiler will act as a 
     *   security filter and block access to this method. To invoke it, the variable's
     *   compile-time type must explicitly be 'Cat'.
     */
    public void jump() {
        System.out.println("Cat Jumps like Cat!!");
    }
}
