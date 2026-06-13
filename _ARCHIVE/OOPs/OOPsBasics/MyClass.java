public class MyClass { 
    public static void main(String args[]) { 
        // Create an object of MyClass to run our program
        MyClass program = new MyClass();
        program.runDemo(); 
    } 

    public void runDemo() { 
        // 1. Using the constructor with 3 inputs
        Student s1 = new Student(1, "Neil", 89.0f); 
        System.out.println("--- Student 1 ---");
        System.out.println("ID: " + s1.rollNo); 
        System.out.println("Name: " + s1.name); 
        System.out.println("Marks: " + s1.marks); 
        System.out.println();

        // 2. Using the empty constructor (uses default values)
        Student s2 = new Student(); 
        System.out.println("--- Student 2 ---");
        System.out.println("ID: " + s2.rollNo); 
        System.out.println("Name: " + s2.name); 
        System.out.println("Marks: " + s2.marks); 
        System.out.println();

        // 3. Using the constructor with all 4 inputs
        Student s3 = new Student(5, "Steele", 90.0f, true); 
        System.out.println("--- Student 3 ---");
        System.out.println("ID: " + s3.rollNo); 
        System.out.println("Name: " + s3.name); 
        System.out.println("Marks: " + s3.marks); 
        System.out.println("Fee Paid: " + s3.feePaid); 
    } 

    // Inner class representing a Student blueprint
    class Student { 
        int rollNo; 
        String name; 
        float marks; 
        boolean feePaid; 

        // Constructor 1: Takes 3 values
        Student(int rollNo, String name, float marks) { 
            this.rollNo = rollNo; 
            this.name = name; 
            this.marks = marks; 
        } 

        // Constructor 2: Takes no values and sets defaults
        Student() { 
            this(0, "Placeholder student", 100.0f); 
        } 

        // Constructor 3: Takes all 4 values
        Student(int rollNo, String name, float marks, boolean feePaid) { 
            this.rollNo = rollNo; 
            this.name = name; 
            this.marks = marks; 
            this.feePaid = feePaid; 
        } 
    } 
}
