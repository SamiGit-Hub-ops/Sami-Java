import java.io.File;

public class DatabaseManager {

    // 1. A private static variable to hold our single instance
    private static DatabaseManager instance;

    // 2. A private constructor so nobody else can type "new DatabaseManager()"
    private DatabaseManager() {
        System.out.println("-> Connecting to the Database (This should happen ONLY ONCE!)");
    }

    // 3. A public static method to give global access to the instance
    // "synchronized" makes it safe if multiple threads ask for it at once
    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    // A simple method to simulate work
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    // --- TEST THE SINGLETON ---
    public static void main(String[] args) {
        System.out.println("--- Starting Project ---");

        // Try to get two managers
        DatabaseManager db1 = DatabaseManager.getInstance();
        DatabaseManager db2 = DatabaseManager.getInstance();

        // Prove they are the exact same instance in memory
        System.out.println("\nAre db1 and db2 the exact same object? " + (db1 == db2)); // True

        System.out.println("\n--- Testing Queries ---");
        db1.executeQuery("SELECT * FROM users");
        db2.executeQuery("UPDATE orders SET status = 'shipped'");
    }
}
