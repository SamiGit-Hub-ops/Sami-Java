package OOPs.Library;

class Main {
    public static void main(String[] args) {
/** Main Entry Point: Instantiates objects and tests library logic **/

        User user1 = new User("Tom", "2004-01-29");
        
        Book book = new Book("Treasure Island", "Robert Louis");

        user1.borrow(book);

        System.out.printf("Name: %s, DOB: %s, Age: %d \n", user1.getName(), user1.getDob(), user1.age());

        System.out.printf("%s borrowed %s\n", user1.getName(), user1.borrowedBooks());

/* on calling user1.borrowedBooks(), it triggers this.books.toString(). 
Since books is a List of Book instances, the List loops through 
each one and calls its specific toString() method to get the "title by author" format.
In short: user1.borrowedBooks() -> books.toString() -> Book.toString() (for each item). */

        
       } 
}