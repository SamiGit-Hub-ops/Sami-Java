package _ARCHIVE.staticModifier;

public class Friend {
    String name;
    static int numberOfFriends;
    
    /* static - a modifier, a single copy of a variable/ method is created and shared
    The class owns the static member, static member can be used by Class.staticMember
    without instantiating class objects, we can however make instance (obj) &
    do  obj.staticMember
     */

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void friendsMade() {
        System.out.println( "Friends created so far: "+numberOfFriends );
    }
}
