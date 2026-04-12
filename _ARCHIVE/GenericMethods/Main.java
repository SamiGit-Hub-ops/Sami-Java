package _ARCHIVE.GenericMethods;

public class Main {
    
    public static void main(String[] args) {
        
        
        Integer[] intArray = {1,2,3,4};
        String[] stringArray = {"S", "T", "R", "I", "N", "G"};
        Character[] charArray = {'C', 'H', 'A', 'R', 'A', 'C', 'T', 'E', 'R'};
        //displayArray(charArray);

        System.out.println(getFirst(intArray)); 
        System.out.println(getFirst(stringArray)); 
        System.out.println(getFirst(charArray)); 

    }  
    

        //generics
       public static <Thing> void displayArray(Thing[] array) {
            for(Thing x: array) {
                System.out.print(x+" ");
            }
         System.out.println();   
        
        }

       public static <Thing> Thing getFirst(Thing[] array)   {
        return array[0];
       }
        
}


 /*   Generics: Generics allow you to write a single class, interface, 
       or method that can work with different data types (like Integer, 
       String, or custom objects) while providing compile-time type safety
       
       Why use them?
        Type Safety: The compiler checks that you are using the correct type.
        No Casting: You don't need to write (String) myVariable everywhere.
        Code Reuse: You can write one "Box" class/method that holds any type. */

       
    
    // verbose way --
    /*
     public static void displayArray(Integer[] array) {
            for(Integer x: array) {
                System.out.println(x);
            }
         System.out.println();   
        }

    public static void displayArray(String[] array) {
            for(String x: array) {
                System.out.println(x);
            }
         System.out.println();   
        }

        */