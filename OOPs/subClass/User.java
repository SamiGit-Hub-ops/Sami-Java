package OOPs.subClass;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {

    //attributes
    private String name;
    private LocalDate dob;
    private ArrayList<Book> books = new ArrayList<>();


    // constructor
    User(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
    }

    //methods
    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob.toString();
    }

    public int age() {
        int age = Period.between(this.dob, LocalDate.now()).getYears();
        return age;
    }
    
    public void borrow(Book book) {
        this.books.add(book);
    }

    public String borrowedBooks() {
        return this.books.toString();
        
    }

    
}
