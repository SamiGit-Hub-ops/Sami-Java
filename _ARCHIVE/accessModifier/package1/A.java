package _ARCHIVE.accessModifier.package1;

import _ARCHIVE.accessModifier.package2.*;

public class A {

    protected String prot = "protected access";

    private String priv = "private access";
    //its available within this class ONLY

    public static void main(String[] args) {
        
        A a = new A();

        System.out.println(a.priv);
        
    }
}
