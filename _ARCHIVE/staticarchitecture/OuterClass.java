/**
 * VALIDATION POINT 4: The outermost class CANNOT be static.
 * There is no container outside of this class. It would make no sense to tell
 * Java "you can use me without instantiating my outer class" because there is none!
 */
public class OuterClass { 

    /**
     * VALIDATION POINT 1 & 3: Why is this class static?
     * It is static purely for EASE OF INSTANTIATION inside static contexts like main().
     * This nested class does NOT depend on a parent OuterClass instance to exist.
     */
    static class InnerClass { 
        
        // VALIDATION POINT 2: Variables inside a static class can be non-static.
        // This means 'name' is unique and specific to each instance we create.
        String name; 
        
        // VALIDATION POINT 2: Or they can be static.
        // This means 'company' will persist and be the exact same global value for all.
        static String company; 

        public InnerClass(String name, String company) { 
            this.name = name; 
            
            // This explicitly demonstrates that static data is shared/overwritten
            InnerClass.company = company; 
        } 
    } 

    /**
     * Because InnerClass is static, this static main method can directly 
     * instantiate it without creating an "new OuterClass()" object first.
     */
    public static void main(String[] args) { 
        // Instantiating InnerClass directly! No outer object required.
        InnerClass InnerOne = new InnerClass("Alice", "FaceBook"); 
        InnerClass InnerTwo = new InnerClass("Bob", "Meta"); 

        // Both print "Meta" because the static 'company' field was overwritten by Bob.
        // However, 'name' stays different because it is a non-static instance variable.
        System.out.println(InnerOne.name + " works @ " + InnerClass.company); 
        System.out.println(InnerTwo.name + " works @ " + InnerClass.company); 
    } 
}
