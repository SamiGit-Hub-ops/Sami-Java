package copyingObject;

public class Main {
    
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Hatchback", 2023);
        Car car2 = new Car("Audi", "Truck", 2025);

        //copying using the extra constructor that takes Car obj
        //Car car2 = new Car(car1);

        System.out.println("\n Before copying");

        //different memory references
        System.out.println(car1);
        System.out.println(car2);

        //different data for attributes
        System.out.println(car1.getAll()+"\n"+car2.getAll());        
        
        //copying using copy method
        car2.copy(car1);

         
        System.out.println("\n After copying");

        //different memory references
        System.out.println(car1);
        System.out.println(car2);
 
        //same data for attributes
        System.out.println(car1.getAll()+"\n"+car2.getAll());
       
    }
}
