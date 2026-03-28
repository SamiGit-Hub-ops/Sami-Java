package _ARCHIVE.OOPs.Library;

public class Book {

    private String title;
    private String author;
    //constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}