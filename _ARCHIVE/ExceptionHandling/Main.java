package _ARCHIVE.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {

        //exception: an event that occurs during execution of program, that disrupts the normal flow of instructions/steps
        //eg: arithmetic exception -> dividy by zero

        // ways to handle any disruption gracefully is called exception handling(  try{..} catch {...})

        Scanner sc = new Scanner(System.in);  // its accessing Scanner resource, (not any risky code), so we can add outside try


        //try
        try {
            //risky code in try
        System.out.println("Enter numerator");
        int numerator = sc.nextInt();

        System.out.println("Enter denominator");
        int denominator = sc.nextInt();

        System.out.println("result of division: "+numerator/denominator);
        }


        //catch
        /* good practice to catch specific exception (in our case like ArithmeticException, 
        InputMismatchException), we can additionally add a catch all exception to be on safer side */

        catch(ArithmeticException ae) {
            System.out.println("Cannot divide by zero: "+ae.getMessage());
        }

        catch(InputMismatchException imm) {
            System.out.println("Invalid number entered: "+imm.getMessage());
        }

        catch(Exception e) {
            System.out.println("Invalid input please try again: "+e.getMessage());
        }


        //finally
        finally {
            //finally block always  executes whether we catch an exception or not
            //it make sense to clear off any connections or close out resources like scanner, files, i/o   here
            //closing scanner will work here but scanner should be outside the try

            sc.close();
            System.out.println("Program completed"); 
        }




/* In Java, you cannot simply write catch(e) like you do in JavaScript because 
Java is statically typed and requires an explicit type for the catch variable.
But its only fair that we still should be able to catch exception even if we dont know the
type(whether its ArithmeticException or NullPointerException, or so on)
so we can achieve through  
catch (Exception e) { 
    This catches ALMOST everything, just like JS catch(e) 
   } */


    } //end of psvm


}
