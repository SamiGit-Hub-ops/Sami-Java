package _ARCHIVE.OOPs.subClass;

public class EBook extends Book{
// Inheritance: Extends Book to add 'format' , getFormat() and we can also set up 'download()' logic

    private String format; //format is it .txt, .pdf,....

    //all super class attributes will be available in child class
    //once we do super(arg1, arg2,..)

    EBook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }
    
    public String getFormat() {
        return this.format;
    }
}
