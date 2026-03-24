package OOPs.subClass;

class Main {
    public static void main(String[] args) {      

        //child class - AudioBook
        AudioBook Dracula = new AudioBook("Dracula", "Bram Stroker", 30000);

        System.out.printf("Audio book runtime: %d \n", Dracula.getRunTime());
        System.out.println( Dracula.toString() );

        //child class - EBook
        EBook PandP  = new EBook("Pride and Prejudice", "Jane Austen", 450, "PDF");

        System.out.printf("\nEbook format: %s \n", PandP.getFormat());
        System.out.println( PandP.toString() );

       } 
}
