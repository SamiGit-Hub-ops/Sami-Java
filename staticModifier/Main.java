package staticModifier;

public class Main {
    
    public static void main(String[] args) {
        
        Friend friendOne = new Friend("John");
        Friend friendTwo = new Friend("Tim");


//static member can be used by Object.staticMember
//System.out.println(friendOne.numberOfFriends);

/* Static Access Best Practice: Use ClassName.staticField instead of 
instance.staticField to avoid implying instance-specific behavior & improve readability.
Gotcha: While both ways compile and run identically 
(since static fields are class-level), instance.staticField access can 
confuse anyone reading the code */


    //static member can be used by Class.staticMember, best practice
    // System.out.println(Friend.numberOfFriends);


    //static method

    Friend.friendsMade();
    }
}
