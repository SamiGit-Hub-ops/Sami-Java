package _ARCHIVE.GenericClasses;

public class Main {
    
    public static void main(String[] args) {
        
        GenericClass<Integer> myInt = new GenericClass<>(1);
        GenericClass<Character> myChar = new GenericClass<>('c');
        GenericClass<String> myStr = new GenericClass<>("String");

        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());

    }
    
}

