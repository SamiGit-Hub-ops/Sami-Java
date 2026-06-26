// import Scanner to read user input
import java.util.Scanner;

public class AreaCalculator {
    // Encapsulation: private variable restricts direct access from external classes
    // Static Context: assigned global memory area, shared across all methods
    private static float pi = 3.142f;

    // Volume of a Sphere
    // Explicit Division: (4.0f / 3.0f) forces floating-point precision math instead of integer truncation
    private static float sphere(float radius) {
        return (4.0f / 3.0f) * pi * radius * radius * radius;
    }

    // Volume of a Cube
    private static float cube(float length) {
        return length * length * length;
    }

    // Volume of a Cuboid
    private static float cuboid(float l, float w, float h) {
        return l * w * h;
    }
   
    // Area of a Circle
    private static float circle(float radius) {
        return pi * radius * radius;
    }

    // Area of a Square
    private static float square(float len) {
        return len * len;
    }

    // Area of a Rectangle
    private static float rectangle(float len, float bred) {
        return len * bred;
    }

    public static void main(String s[]) {
        System.out.println("Welcome to the area calculator!");
        
        // Console I/O processing setup linked to the standard system input stream
        Scanner scanner = new Scanner(System.in);
                
        // Control Flow: infinite active runtime loop for unbroken execution
        while(true) {
            System.out.println("\nEnter 1 for circle\n" +
            "Enter 2 for square\n" +
            "Enter 3 for rectangle\n" +
            "Any other key to exit\n" );
            
            // Exception Handling: Try-Catch prevents runtime crashes from bad data or dead streams
            try {
                // Wrapper Classes & Type Parsing: converting text string segments directly to primitive ints
                int input = Integer.parseInt(scanner.nextLine());

                // Control Flow: nested conditional filtering structures mapping menu selections
                if(input == 1) {
                    System.out.println("Enter the radius of the circle");
                    float radius = Float.parseFloat(scanner.nextLine());
                    System.out.println("area of circle " + circle(radius));
                }
                else if(input == 2) {
                    System.out.println("Enter the length of the side of square");
                    float len = Float.parseFloat(scanner.nextLine());
                    System.out.println("area of square " + square(len));
                } 
                else if(input == 3) {
                    System.out.println("Enter the length of the rectangle");
                    float length = Float.parseFloat(scanner.nextLine());

                    System.out.println("Enter the breadth of the rectangle");
                    float breadth = Float.parseFloat(scanner.nextLine());

                    System.out.println("area of rectangle " + rectangle(length, breadth));
                }
                else {
                    System.out.println("User ended program");
                    break; // Exits loop cleanly, heading directly to external scanner.close()
                }
            } 
            // Multi-Catch Block intercepting parsing failures, missing terminal tokens, or closed stream actions
            catch (NumberFormatException | java.util.NoSuchElementException | IllegalStateException e) {
                System.out.println("Program terminated cleanly due to exit command, invalid characters, or closed input.");
                break; // Exits loop cleanly, heading directly to external scanner.close()
            }
        }
        
        // Single Point of Disposal: Keeping this outside the loop safely handles all program exit doors 
        // Resource Lifecycle Management: clean closure of input streams to prevent OS memory leaks
        scanner.close();
    }
}
