package _ARCHIVE.DynamicPolymorphism;


public class Dog extends Animal {
    
    @Override
    public void speak() {
        System.out.println("Dog goes *bark*");
    }
}