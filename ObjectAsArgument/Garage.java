package ObjectAsArgument;
import java.util.ArrayList; 

public class Garage {
    
ArrayList<Car> parkingLane = new ArrayList<Car>();

//passing car object(instances) to method of Garage objects
    void park(Car someCar) {
        parkingLane.add(someCar);
        System.out.println(parkingLane);
        System.out.println(someCar.name+" is parked");
    }
}