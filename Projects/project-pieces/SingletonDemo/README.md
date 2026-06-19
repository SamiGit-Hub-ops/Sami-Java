# Java Singleton Database Manager

This project shows how a **Singleton Class** works in Java to manage a single database controller safely.

## How It Works
By making the constructor `private`, we stop other classes from making copies. The `getInstance()` method makes sure everyone shares the exact same instance in memory.

## How to Run
1. Open your terminal in this folder.
2. Compile the code: `javac DatabaseManager.java`
3. Run the code: `java DatabaseManager`
