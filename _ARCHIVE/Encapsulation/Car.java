/* encapsulation is the practice of bundling data (variables) &
(methods) that operate on that data into a single unit (a class) 
while hiding the internal details from the outside world.

To achieve encapsulation::
Private Fields: Declare class variables as private

Public Methods: Provide public getter and setter methods to view and modify the variables 

Not strictly necassary but we can instead directly use setters 
inside Constructor, rather than doing this.myValue = myValue;
*/

package _ARCHIVE.Encapsulation;

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

 //public getter to get all i.e., toString

 @Override
 public String toString() {
    return "\nbrand is "+this.brand+"\ntype is "+this.type+"\nyear is "+this.year;
 }


}
