package _ARCHIVE.ObjectAsArgument;

public class Main {

     public static void main(String[] args) {
        
        Car bmw = new Car("BMW");
        Car rr = new Car("Rolls Royce");
        Car mas = new Car("Maserati");

        Garage myGarage = new Garage();

//passing car object(instances) to method of Garage object ie myGarage.park()
        myGarage.park(bmw);
        myGarage.park(rr);
        myGarage.park(mas);
     }
}