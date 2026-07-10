/**
 * THE CONTRACT / THE BLUEPRINT
 * 
 * Mechanics:
 * - This acts as a strict communication protocol or a rulebook.
 * - Methods here are implicitly 'public' and 'abstract' (no body allowed).
 * - It defines the INTENT ("what" to do), leaving the EXECUTION ("how") to the classes.
 */
public interface Animal {
    void makeSound(); 
    void sleep();
    void eat();
}
