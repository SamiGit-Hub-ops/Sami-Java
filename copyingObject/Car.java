package copyingObject;


public class Car {

 private String brand;
 private String type;
 private int year;

 //constructor
 // making constructor also public, so it can be used outside the Encapsulation package.
 public Car(String brand, String type, int year) {
    this.setBrand(brand);
    this.setType(type);
    this.setYear(year);

 }

 //copying via overloaded constructor

 public Car(Car X) {
    this.copy(X);
 }

 //copying via method
 //public copy method to copy -> car2.copy(car1)  copy contents of car1 to car2

 public void copy(Car A) { 
    this.setBrand(A.getBrand());
    this.setType(A.getType());
    this.setYear(A.getYear());

 }


 //public setters -> instances can use these to set/update values for their private fields
 public void setBrand(String brand) {
    this.brand = brand;
 }

 public void setType(String type) {
    this.type = type;
 }

 public void setYear(int year) {
    this.year = year;
 }

 //public getters -> instances can use these to read/fetch values of their private fields

 public String getBrand() {
    return this.brand;
 }

 public String getType() {
    return this.type;
 }

 public int getYear() {
    return this.year;
 }

 public String getAll() {
   //the caller of this method would need to use System.out.print and wont directly return to console like toString()
   //also when you pass an object into System.out.println(myCar), Java automatically looks for a toString() method and calls it for you.
   // and if we have a custom defined/overwritten toString() method that gets called on top of obj
   // another way to define getAll() is to make it void and do a system.out instead of return
   return "\nBrand: "+this.brand+"\nType: "+this.type+"\nYear: "+this.year;
 }


}

