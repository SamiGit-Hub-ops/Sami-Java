package WIP.Interfaces;

public class Main {
    
    /**
     * THE REUSABLE HELPER METHODS (THE "STAGING AREAS")
     * 
     * Architecture & Mechanics:
     * - Trick Revealed: Dynamic Method Binding (Polymorphism) happens *regardless* of these helpers.
     * - So why do we use them? These methods serve as a central staging ground to wrap up operations.
     * - They treat incoming arguments strictly as the generic 'Animal' type. This prevents code 
     *   duplication (avoiding copy-pasting code sequences for 50 different individual animals).
     */
    public static void makeSoundHelper(Animal animal) {
        animal.makeSound(); 
    }

    public static void eatHelper(Animal animal) {
        animal.eat();
    }

    public static void sleepHelper(Animal animal) {
        animal.sleep();
    }

    public static void main(String[] args) {
        
        /*
         * TRICK 1: Programming to an Interface (Decoupled Reference)
         * 
         * Left Side (Compile-Time Type): Animal 
         * - Acts as a filter. Tells the IDE/Compiler what methods we are legally allowed to call.
         * 
         * Right Side (Runtime Type): Dog / Cat
         * - Represents the actual living object allocated in the computer's memory.
         */
        Animal animalOne = new Dog(); 
        Animal animalTwo = new Cat(); 

        /*
         * TRICK 2: Exploiting Helpers via Polymorphic Staging
         * - We pass different specialist objects into the exact same staging method.
         * - Dynamic Polymorphism runs under the hood, detecting the specific instance 
         *   at runtime and routing execution to the correct class method.
         */
        eatHelper(animalOne);
        sleepHelper(animalOne);
        
        eatHelper(animalTwo);
        sleepHelper(animalTwo);

        /*
         * TRICK 3: Bypassing the Contract for Specialist Behavior
         * - If we did 'animalTwo.jump();', it would crash at compile time because the 'Animal' 
         *   reference filter doesn't contain a 'jump' rule.
         * - By declaring the compile-time type explicitly as 'Cat', we gain full visibility 
         *   into the Cat-exclusive domain.
         */
        Cat cat = new Cat();
        cat.jump(); 
    }
}
