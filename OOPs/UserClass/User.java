package OOPs.UserClass;
import java.time.Period;
import java.time.LocalDate;

public class User {
    public String name;
    public LocalDate dob;

    public int ageCal() {
        int age = Period.between(this.dob, LocalDate.now()).getYears();
        return age;
    }
}


