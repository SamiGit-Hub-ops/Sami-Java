# Java Packages
A package in Java is a namespace mechanism used to group logically related classes, interfaces, enumerations, and annotations.
It maps directly to the physical directory structure of the file system.
---
## 1 Technical Architecture
Java requires a strict one-to-one mapping between the package name and the directory path on disk. Periods (`.`) in the package name represent directory separators.

### File System Hierarchy

* **`src/`** (Source Root)
  * **`com/`** 
    * **`dev/`** 
      * 📄 `
      * Main.java
  ` (Belongs to package `com.dev`)
      * **`calculations/`** (Subfolder mapping to a sub-package)
        * 📄 `Calculator.java` (Belongs to package `com.dev.calculations`)

---

## 2. Declaration and Usage Workflow

This flowchart illustrates how a package is established in a file and subsequently accessed by an external class.
    A[Create Source File] 
    A --> B[Declare Package at Line 1<br>Example: package com.dev.calculations;]
    B --> C[Create External Class in Separate Folder]
    C --> D{Select Access Method}
    D --> E[Targeted Import<br>Example: import com.dev.calculations.Calculator;]
    D --> F[Mass Import<br>Example: import com.dev.calculations.*;]
    D --> G[Direct Inline Call<br>Example: com.dev.calculations.Calculator calc = ...]

## 3. Concrete Examples
### Package Declaration Example
A file named `Calculator.java` stored in the directory path `src/com/dev/calculations/` must state this exact namespace at the very top:
* `package com.dev.calculations;`

### Targeted Import Example
If a file inside `src/com/dev/` needs to use the `Calculator` class, it must reference the external location before declaring its own class layout:
* `import com.dev.calculations.Calculator;`

### Wildcard Import Example
If you want to import every class inside the calculations folder at once without specifying individual names:
* `import com.dev.calculations.*;`

### Fully Qualified Name Example
If you want to use a class without writing an import statement at the top of the file, you must specify the entire path directly where you create the object:
* `com.dev.calculations.Calculator calc = new com.dev.calculations.Calculator();`

## 4. Key Functional Benefits
* **Name Collision Resolution:** Allows you to use identical class names in the same project without errors. For example, `java.util.Date` and `java.sql.Date` coexist because their package namespaces are unique.
* **Access Control Boundaries:** Java uses packages to hide or reveal code. If you do not assign an access modifier (like `public` or `private`) to a variable or method, it defaults to **package-private**, meaning only files inside that exact same package folder can see it.

## 5. Mandatory Coding Rules
* **Reverse Domain Naming:** Package names always start with a reversed internet domain to ensure global uniqueness (e.g., `com.companyname.projectname`).
* **Strict Casing:** Package names must be entirely lowercase (`com.dev.calculations`). Mixed casing causes compilation errors on case-sensitive operating systems.
* **No Recursive Wildcards:** Writing `import com.dev.*;` only loads the classes directly inside the `dev` folder. It does not look deeper into sub-packages like `com.dev.calculations`. Sub-packages must always be imported separately.
