import java.util.Random;

public class DiceRoller {
//local variable = declared inside a method, visible only to that method

//using constructor, passing arguments to the roll()
//here there are no global variables only local variables

    DiceRoller() {
        Random random = new Random();
        int num = 0;
        roll(random, num);
    }

    void roll(Random random, int n) {
        n = random.nextInt(6)+1;
        System.out.println(n);
    }

}
