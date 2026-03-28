package _ARCHIVE.OOPs.UserClass;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Jon";
        user1.dob = LocalDate.parse("1990-01-01");
/*         this is "lexical" and strictly tied to the instance. 
        It always refers to the specific object currently running the code. 
        In Java, you cannot use this inside a static method because a 
        static method doesn't belong to an object—it belongs to the class. */

        System.out.println(user1.name);
        System.out.println(user1.dob);
        System.out.println(user1.ageCal());
    }
    
}

