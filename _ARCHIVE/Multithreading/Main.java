package _ARCHIVE.Multithreading;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        //threads can be created using Thread (by extending 'Thread' to make 'myThread' child class)
        // or Runnable (by implementing Runnable interface, to make myRunnable class)



        //create object out of the myThread subclass
        myThread thread1 = new myThread();

    //create object out of the myRunnable class (which implements the Runnable interface)
        myRunnable runnableInstance = new myRunnable();
        
        //we now supply this runnableInstance to make thread2
        Thread thread2 = new Thread(runnableInstance);
        

        //using Runnable to make thread is better because the instance of
        //runnable can also implement other interfaces to adopt more features
        //whereas with 
        //class myThread extends Thread;  its restricted to just have one parent
        //with interfaces , a child class can implement multiple interfaces

        thread1.start();
        thread1.join();
        thread2.start();

    }
}