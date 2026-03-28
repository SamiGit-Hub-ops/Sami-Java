package _ARCHIVE._ARCHIVE;

public class nestedForLoops {
    public static void main(String[] args) {
       for(int num = 1; num < 10; num++) {

            for(int mult = 0; mult < 11; mult++) {
                System.out.printf("%d x %d = %d \n", num, mult, num * mult);
            }
       }
    }
}
