package _ARCHIVE.FileClass;
import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        
    File fileFinder = new File("FileClass/dummy.txt");
    // File fileFinder = new File("FileClass/dumm.txt");

    System.out.println("\n"+fileFinder.getPath());
    System.out.println("\n"+fileFinder.getAbsolutePath());

    if(fileFinder.exists()) System.out.println("\nFile exists");
    else System.out.println("\nFile doesn't exists"); 

    System.out.println("\n"+fileFinder.isFile() );

   


  }
}
