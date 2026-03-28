package InterfacesDemo;

public class Deer implements Prey {
    
    @Override
    public void flee() {
        System.out.println("Deer is fleeing from the hunters");
    }
}
