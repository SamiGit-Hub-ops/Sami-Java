public class StaticBlock { 
    // 1. Static variables: Shared by all objects of this class
    static int a, b; 

    // 2. Static initializer block: Runs ONLY ONCE when the class is loaded
    static { 
        a = 5; 
        b = 2 * a; // b becomes 10
        System.out.println("I will be printed once"); 
    } 

    public static void main(String[] args) { 
        // 3. Create the first object
        StaticBlock myBlockOne = new StaticBlock(); 
        System.out.println(myBlockOne.a); // Prints 5
        System.out.println(myBlockOne.b); // Prints 10
        System.out.println(); 

        // 4. Change the value of static variable 'b' using the first object
        myBlockOne.b += myBlockOne.b; // 10 + 10 = 20
        System.out.println(myBlockOne.b); // Prints 20
        System.out.println(); 

        // 5. Create a second object
        StaticBlock myBlockTwo = new StaticBlock(); 
        System.out.println(myBlockTwo.a); // Prints 5
        
        // Because 'b' is static, the change made by myBlockOne affects myBlockTwo too!
        System.out.println(myBlockTwo.b); // Prints 20 (not 10)
        System.out.println(); 

        // 6. Accessing static variables directly without any object
        System.out.println("Referencing same variables without objects as these are static"); 
        System.out.println(a); // Prints 5
        System.out.println(b); // Prints 20
    } 
}
