package InterfacesDemo;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Crocodile croc = new Crocodile();
        Deer deer = new Deer();

        fish.flee();
        deer.flee();

        croc.hunt();
        fish.hunt();

    }
}
