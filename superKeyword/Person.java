package superKeyword;

public class Person {
    String name;
    String favColor;

    Person( String name, String favColor) {
        this.name = name;
        this.favColor = favColor;
    }

     public String toString() {
        return "Name: "+name+"\nColor: "+favColor+"\n";
    }
}
