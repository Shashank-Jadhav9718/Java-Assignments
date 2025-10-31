# T.Y. B.Sc. (Computer Science) - Java Lab Assignments

This repository contains the solutions for the Java programming assignments (CSMJ353) from the T.Y. B.Sc. (Computer Science) [cite_start]Semester V lab course (CSMJ355) at Nowrosjee Wadia College[cite: 4, 8, 9, 10]. The assignments cover fundamental to advanced concepts in Object-Oriented Programming using Java.

---

## [cite_start]Assignment 1: Java Tools and IDE, Simple Java Programs [cite: 87, 88]

[cite_start]This assignment serves as an introduction to the Java development environment, command-line tools, and basic programming constructs like classes, control statements, and arrays[cite: 90, 93].

### Key Concepts Covered:
* [cite_start]**Java Tools:** Using `javac` (compiler) [cite: 100] [cite_start]and `java` (runtime)[cite: 103].
* [cite_start]**`javap` Utility:** Using the Java disassembler (`javap`) to view the methods of classes like `java.lang.Object`, `java.lang.String`, and `java.util.Scanner` [cite: 358][cite_start], and using the `-c` option to view the bytecodes of a compiled class[cite: 359].
* [cite_start]**Class and Object:** Creating a basic `Student` class with attributes (name, rollNo, marks) and methods (input, display, and pass/fail check)[cite: 360, 361].
* [cite_start]**Constructors and `this`:** Defining a `MyNumber` class with a default constructor (initializes to 0) and a parameterized constructor that uses the `this` keyword[cite: 362, 363].
* [cite_start]**Methods:** Implementing methods to check number properties (`isNegative`, `isPositive`, `isZero`, `isOdd`, `isEven`)[cite: 364].
* [cite_start]**Command-Line Arguments:** Passing values from the command line to the program and converting string arguments to integers[cite: 365].
* [cite_start]**`javadoc`:** Writing `javadoc` comments for constructors and methods and generating the HTML help file[cite: 91, 367].
* [cite_start]**Multi-dimensional Arrays:** Creating a menu-driven program to perform matrix operations (Addition, Multiplication, Transpose) on 2D arrays[cite: 368, 369, 371, 373, 375].

---

## [cite_start]Assignment 2: Array of Objects and Packages [cite: 409]

[cite_start]This assignment builds on the basics by introducing arrays of objects, static members for class-level data, and the creation and use of custom packages to organize code[cite: 411, 412, 413].

### Key Concepts Covered:
* [cite_start]**Constructors and `this`:** Creating an `Employee` class with default and parameterized constructors, using `this` to initialize instance variables[cite: 726].
* [cite_start]**`static` Members:** Using a `static` variable to keep a count of objects created and a `static` method to display the count[cite: 727, 728].
* [cite_start]**Array of Objects:** Creating multiple `Employee` objects and demonstrating the object count[cite: 727].
* [cite_start]**Creating Packages:** Creating a package "SY" containing an `SYMarks` class and a package "TY" containing a `TYMarks` class[cite: 729, 730].
* [cite_start]**Using Packages:** Writing a `Student` class that imports and uses the classes from the `SY` and `TY` packages to store marks and calculate a final grade[cite: 731, 732].
* [cite_start]**Access Modifiers:** Defining a `Customer` class with `public`, `private`, `protected`, and `default` member variables and testing their accessibility from other classes within the same package and in a different package[cite: 733, 734].

---

## [cite_start]Assignment 3: Inheritance and Interfaces [cite: 748]

[cite_start]This assignment focuses on the core OOP principles of inheritance and abstraction, using `extends` for multilevel inheritance, creating `abstract` classes, and defining contracts with `interfaces`[cite: 750, 751, 752].

### Key Concepts Covered:
* [cite_start]**Multilevel Inheritance:** Implementing an inheritance chain where `Country` is inherited from `Continent`, and `State` is inherited from `Country`[cite: 1072].
* **Abstract Classes:** Defining an `abstract` class `Staff` with protected members and a parameterized constructor. [cite_start]This class cannot be instantiated directly[cite: 1074].
* **Subclassing:** Creating a concrete subclass `OfficeStaff` that extends `Staff` and adds its own members (e.g., `department`). [cite_start]An array of `n` `OfficeStaff` objects is created and their details displayed[cite: 1075].
* [cite_start]**Interfaces:** Defining an `interface` named "Operation" that includes abstract methods (`area()`, `volume()`) and a constant (`PI`)[cite: 1076].
* [cite_start]**Implementing Interfaces:** Creating a class `Cylinder` with members `radius` and `height` that `implements` the `Operation` interface by providing concrete definitions for its `area()` and `volume()` methods[cite: 1077].
* [cite_start]**Practical Application:** Creating a `Product` class and using its objects to calculate discounts based on product cost, while also tracking the total number of `Product` objects created[cite: 1078, 1079, 1080].

---

## [cite_start]Assignment 4: Exception Handling and File Handling [cite: 1103]

[cite_start]This assignment deals with building robust applications by managing runtime errors through exception handling and by performing I/O operations with the file system[cite: 1104, 1105, 1106].

### Key Concepts Covered:
* [cite_start]**User-Defined Exceptions:** Creating a custom exception class by extending `Exception`[cite: 1189, 1477].
* [cite_start]**`throw` Keyword:** Defining a `Patient` class and throwing a user-defined "Patient is Covid Positive (+)" exception if the `patient_oxy_level` is less than 95% or the `patient_HRCT_report` is greater than 10[cite: 1476, 1477].
* [cite_start]**File Reading (Character Streams):** Using `FileReader` and `BufferedReader` to read the contents of a text file named "sample.txt"[cite: 1331, 1478].
* **File Content Manipulation:**
    * [cite_start]Displaying the contents of the file in reverse order[cite: 1478].
    * [cite_start]Displaying the original contents of the file in all upper case[cite: 1478].
* [cite_start]**File Copying:** Writing a program to accept two filenames, copy the contents of the first file (containing book names and authors) to the second file, and append the comment 'end of file' to the newly created second file[cite: 1479, 1480, 1481].
