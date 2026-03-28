package _ARCHIVE.InterfacesDemo;

public class Fish implements Prey, Predator {
    
    @Override
    public void hunt() {
        System.out.println("Bigger fish hunting smaller ones");
    }

    @Override
    public void flee() {
        System.out.println("Smaller fish fleeing from bigger ones");
    }
}
