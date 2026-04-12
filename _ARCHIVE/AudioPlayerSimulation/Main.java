package _ARCHIVE.AudioPlayerSimulation;

import java.util.Scanner;

public class Main {

    /* STEP 1: SHARED DATA 
    These "static" variables are the "bridge" between the two workers. 
    main and background functions */

     static boolean isPlaying = false;
     static int current = 0;
     static final int DURATION = 20;

     public static void main(String[] args) {
        
    /* STEP 2: STARTING THE SECOND WORKER (THREADING) ---  fyi-main function when executed by jvm, main() is a worker/main thread
    We create a new "audioThread" thread. 
    The Lambda "() -> simulateAudioEngine()" tells it exactly which method to run.
    Setting Daemon to 'true' ensures this background worker stops immediately when we quit main program.
    .start() "pushes" the worker into the background to start ticking, so even before user input the 
    worker is ready and on standby
     */    
        Thread audioThread = new Thread(() -> simulateAudioEngine());

        audioThread.setDaemon(true);
        audioThread.start();

        System.out.println("Console player ready");
        System.out.println("Commands: P-play, R-rewind to 0, S-pause, Q-quit");
        

// STEP 3: THE USER INTERFACE (MAIN THREAD) ---
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

//as long as user doesn't press q(to quit) main thread is running indefinitely

        while (!userInput.equalsIgnoreCase("Q")) {
            System.out.print("\n\n Enter Command: ");
            userInput = scanner.next();

            switch (userInput.toUpperCase()) {
                case "P":
                    isPlaying = true;
                    System.out.println("Audio now playing");
                    break;

                case "R":
                    current = 0;
                    System.out.println("rewound to 0");
                    break;

                case "S":
                    isPlaying = false;
                    System.out.println("Audio now paused");
        //even at paused, if we want to show the player will call updateVisuals(), in other switch cases updateVisuals will appear via the simulateAudioEngine() worker
                    updateVisuals(current, DURATION);

                    break;

                case "Q":
                    isPlaying = false; current = 0;
                    System.out.println("Audio player closed");
                    break;
                default:
                    System.out.println("!Invalid input, please enter any of P, Q, R, S");
            }
            
        }

        scanner.close();

     }


    /* STEP 4: BACKGROUND ENGINE 
    This method runs on the "audioThread" we created & NOT on the main thread.
    */

    private static void simulateAudioEngine() {

    /* Any method that pauses a thread can be "interrupted" by the system or 
    another thread. If this happens, Java throws an InterruptedException
    Since we are making it start and stop every second using Thread.sleep(1000),
    will enclose it in try (risky code)
    */
        try {

 /*  This loop runs forever in the background, so that this thread terminates when 
 main terminates and  in main we are handling all scenarios */
              while (true) {

            
    //if in main isPlaying was set true and current < Total time
                if(isPlaying && current < DURATION) {
                    current++;
                    updateVisuals(current, DURATION);
                }

    // Auto-stop at the end of the "audio"
                else if (current >= DURATION) {
                    isPlaying = false;
                    current = 0;
                    System.out.println("Finished playing audio, player closed");
                }               

/*  Thread.sleep(1000) makes this loop wait 1 second.
 Without this, the song would "finish" in a millisecond! */

                Thread.sleep(1000);
              }  


        }   catch (InterruptedException e) {
             // Silently stop if the thread is interrupted
             }
     }

/*  STEP 5: VISUALS 
This updates the progress bar without creating a new line. */


     private static void updateVisuals(int current, int duration) {

        int progress = current, pending = duration - current;

        String progSymbol = "", pendSymbol = "";

        for(int i = 0; i < progress; i++) {
            progSymbol += ">";
        }

        for(int i = 0; i < pending; i++) {
            pendSymbol += "-";
        }


    // lastly showing the visuals ..eg for 5 sec audio [>>> (3 done) -- (2 remaining)] 3s meaning 3 secs done
    //[>>>--]3s, Press keys to adjust 

    System.out.printf("\r[%s%s] %s secs, Press keys to adjust ", progSymbol, pendSymbol, current);

     }


}







