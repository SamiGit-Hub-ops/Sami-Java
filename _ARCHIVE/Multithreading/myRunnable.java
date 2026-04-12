package _ARCHIVE.Multithreading;

public class myRunnable implements Runnable{

        @Override
        public void run() {
        
        for(int i = 0; i < 5; i++) {
            System.out.println("myRunnable instance running:"+i);
            try {

                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("myRunnable instance ended");
    }
    
    
}
