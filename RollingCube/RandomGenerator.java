package RollingCube;
import java.util.Random;


public class RandomGenerator {
 //these variables are "global" and roll() method modifies them

    Random random = new Random();
    int num = 0;

    void roll() {
        num = random.nextInt(6)+1;
        System.out.println(num);
    }

    
}
