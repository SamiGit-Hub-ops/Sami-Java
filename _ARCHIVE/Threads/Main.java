package _ARCHIVE.Threads;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
    
    //count
        //int activeThreads = Thread.activeCount();
        //System.out.println(activeThreads); //1  (which is running this main method)

    //name
        //String activeThreadName = Thread.currentThread().getName();
        //System.out.println(activeThreadName); //main

    //change name
        //Thread.currentThread().setName("mainThread");
        
        //String newName = Thread.currentThread().getName();
        
        //System.out.println(newName); //mainThread

    //priority
        //      1         -      10
        // lowest priority    highest priority

        //System.out.println( Thread.currentThread().getPriority() ); //5 defualt priority for main

        //Thread.currentThread().setPriority(9);

        //System.out.println( Thread.currentThread().getPriority() );  //9

    //alive
        //System.out.println( Thread.currentThread().isAlive());

    //sleep
/*         for(int i = 3; i > 0; i--) {
            System.out.printf("For loop ends in %d \n", i);
            Thread.sleep(1000); //when using sleep we need to use InterruptedExceptionJava or surround with try/catch
        }
    
        System.out.println( "Print me after last sec"); */

        myThread thread2 = new myThread();
        
       //alive by default 
       System.out.println(  thread2.isAlive() ); // false
       //thread that we create like thread2 is not alive,
       // we have to start it only then its alive.
       // Even doing  thread2.run() does not start the thread, that run function gets executed
       
       //run
       //thread2.run();  // run default beahviour , but if we override it will perform the new behaviour which we define
    
  
       //start
       //thread2.start(); // This starts the thread2 also runs the run method without we calling it explicitly
       //System.out.println(  thread2.isAlive() ); // true

       
        
    }
}
