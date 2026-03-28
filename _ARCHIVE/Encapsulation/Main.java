package _ARCHIVE.Encapsulation;

public class Main {
    
    public static void main(String[] args) {
        
        Car bmw = new Car("BMW", "Hatchback", 2023);
        Car audi = new Car("Audi", "Truck", 2025);

        audi.setType("SUV");
        audi.setYear(2025);

        //System.out.println( audi.getBrand()+"\n"+audi.getType()+"\n"+audi.getYear() );

        System.out.println(audi.toString());
    }
}
