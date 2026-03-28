package _ARCHIVE.RollingCube;
import java.util.Random;


public class RandomGenerator {
//global variables = declared outside a method but within a class and is
//visible to all parts of the class

 //these variables are "global" and roll() method modifies them

    Random random;
    int num;

    RandomGenerator() {
        random = new Random();
        roll();
    }

    void roll() {
        num = random.nextInt(6)+1;
        System.out.println(num);
    }

    
}
