public class StringDemo {
    public static void main(String[] args) {
        String LiteralOne = "hello";
        String LiteralTwo = "hello";
        System.out.println(LiteralOne == LiteralTwo); //1 true- same value,same memory reference in string pool

        LiteralTwo = "wow";
        //"hello" in the string pool is intact but now LiteralTwo is now pointing to new literal "wow"
        System.out.println(LiteralTwo);  //2 wow

        System.out.println(LiteralOne == LiteralTwo); //3 false- different items at different memory reference in string pool
        System.out.println();
        

        String ObjectOne = new String("hello");
        String ObjectTwo = new String("hello");
        String ObjectThree = new String("hEllO");

        
        System.out.println();
        System.out.println(ObjectOne == ObjectTwo); //4 false - different objects
        System.out.println(ObjectOne.equals(ObjectTwo)); //5 true - different objects, but same value so true
        System.out.println(ObjectOne.equalsIgnoreCase(ObjectThree)); //6 true - different objects, but same value so true (ignoring case)

    }
}
