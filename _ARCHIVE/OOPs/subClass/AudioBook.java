package _ARCHIVE.OOPs.subClass;

public class AudioBook extends Book{
// Inheritance: Extends Book to add 'runTime' and 'getRunTime()' logic

    private int runTime; //for how long this audio book was played

    //all super class attributes will be available in child class
    //once we do super(arg1, arg2,..)

    AudioBook(String title, String author, int runTime) {
        super(title, author, 0);
        this.runTime = runTime;
    }
    
    public int getRunTime() {
        return this.runTime;
    }
}
