package _ARCHIVE.DynamicPolymorphism;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Animal someAnimal;
        //just yet, we dont know if someAnimal is a cat or a dog..?

        //dynamic polymorphism, based on user input(or otherwise) polymorphism kicks in at runtime

        //we could use Scanner and then close it at the end or , a cleaner way is to 
        // use Scanner line inside try, which automatically closes the resource

       try( Scanner sc = new Scanner(System.in) ) {

        System.out.println("\n Enter 1 for dog, 2 for cat");

        int userInput = sc.nextInt();

        if(userInput == 1) {
            someAnimal = new Dog();
            someAnimal.speak();
        }

        else if(userInput == 2) {
            someAnimal = new Cat();
            someAnimal.speak();
        }

        else {
            someAnimal = new Animal();
            someAnimal.speak();
        }
    }

 }

}
