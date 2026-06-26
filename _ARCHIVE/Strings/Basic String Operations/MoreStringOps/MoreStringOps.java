public class MoreStringOps {
    public static void main(String s[]) {
        // String Instantiation: Forces a new object instance directly on the Java Heap Memory
        String strOne = new String("Maple Tree"); 

        // Substring Range Formulation: Indexing is inclusive of start, exclusive of end
        // "Maple" occupies indices 0 to 4. Index 5 is the space.
        String partOne = strOne.substring(0, 5);
        // "Tree" occupies indices 6 to 9. Index 10 is the exclusive upper boundary.
        String partTwo = strOne.substring(6, 10);
        System.out.println(partOne + " " + partTwo);
        System.out.println();
        
        // Method Chaining & String Immutability:
        // partOne is not altered. Instead, a new combined String reference is generated and assigned.
        String bothPart = partOne.concat(" ").concat(partTwo);
        System.out.println(bothPart);
        System.out.println();

        // Case Conversions: Generates distinct uppercase and lowercase string variants
        String lower = strOne.toLowerCase();
        String upper = strOne.toUpperCase();
                
        System.out.println(lower);
        System.out.println(upper);
    }
}
