package arrayOfObjects;

public class Main {
    
    public static void main(String[] args) {
        //creating objects out of Car class
        Car jag = new Car("Jaguar");
        Car rolls = new Car("Rolls");
        Car porsche = new Car("porsche");

        //creating an array that holds objects of Car type (data type)
        //Car[] myGarage = new Car[3]  & Car[0] = jag and so on .. or

        Car[] myGarage = {jag, rolls, porsche};

        System.err.println(myGarage[1].name);
        
    }
}
