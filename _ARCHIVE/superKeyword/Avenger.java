package _ARCHIVE.superKeyword;

public class Avenger extends Person {
 
    String power;

    Avenger(String name, String favColor, String power) {
        // Passes the name, favColor up to the Person constructor
        //super for attributes
        super(name, favColor);


        this.power = power;
    }

    public String toString() {
        // super can also be used to refer to parent class's methods

        return super.toString() + "Power: "+this.power;
    }
}
