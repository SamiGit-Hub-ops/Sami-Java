package _ARCHIVE.superKeyword;

public class Main {
    
    public static void main(String[] args) {
        
        //Avengers
        Avenger cap = new Avenger("Captain America", "Blue", "Strength");
        Avenger hulk = new Avenger("Hulk", "Green", "Super Strength");
        Avenger ironman = new Avenger("Iron Man", "Red", "Billionare");
        Avenger thor = new Avenger("Thor", "Ash", "Lightning");

        System.out.println(cap.toString());


        //person
        Person fury = new Person("Nick fury", "black");

        System.out.println("\n"+fury.toString());
    }
}
