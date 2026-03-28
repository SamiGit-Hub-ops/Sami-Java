package _ARCHIVE.OOPs.subClass;

public class Book {
// Parent Class: Base attributes for all book types
    private String title;
    private String author;
    private int pageCount;

    //constructor
    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;

    }

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}

