package _ARCHIVE.accessModifier.package2;

//import accessModifier.package1.A;
import _ARCHIVE.accessModifier.package1.*; // so that we get grab everything from package1 (provided the proper access mod is there)

public class subOfA extends A {
    
/* public static void main(String[] args) {
        
        C c = new C();

        System.out.println(c.defaultMsg); 
        
        default (package-private) access, 
        we can access it from this class subOfA which is in same package.
        
    } */


/*     public static void main(String[] args) {

        subOfA  subClassA = new subOfA();
        
        System.out.println(subClassA.prot); 

protected  (class, package, subclass) access, 
we can access it from this class subOfA which is in different package, but 
is a subclass of A */


/*   public static void main(String[] args) {
        
        A a = new A();

        System.out.println(a.priv);
        
    }

    private access is only within that class and
    not visible in another class in same package, 
    different package or subclass */

        
    }

