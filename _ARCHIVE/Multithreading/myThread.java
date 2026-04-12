package _ARCHIVE.Multithreading;

public class myThread extends Thread {
    
    @Override
    public void run() {
        
        for(int i = 0; i < 5; i++) {
            System.out.println("myThread instance running:"+i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("myThread instance ended");
    }
    
}
