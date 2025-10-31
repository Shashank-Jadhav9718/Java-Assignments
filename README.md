T.Y. B.Sc. (Computer Science) - Java Lab Assignments

This repository contains the solutions for the Java programming assignments (CSMJ353) from the T.Y. B.Sc. (Computer Science) Semester V lab course (CSMJ355)[cite: 8, 9, 10]. The assignments cover fundamental to advanced concepts in Object-Oriented Programming using Java.

Assignment 1: Java Tools and IDE, Simple Java Programs [cite: 87]

This assignment introduces the basic Java development environment, command-line tools, and fundamental programming constructs[cite: 89].

Key Concepts Covered:

Using Java tools like javac, java, jdb, and javadoc[cite: 91].

Using the javap disassembler to inspect class methods and bytecodes[cite: 358, 359].

Basic class creation, attributes, and methods[cite: 360, 361].

Constructors (default and parameterized) and the this keyword[cite: 362, 363].

Handling command-line arguments[cite: 365].

Multi-dimensional arrays (Matrices)[cite: 369].

Set A (Mandatory Tasks):

A: Use javap to view the methods of java.lang.Object, java.lang.String, and java.util.Scanner, and use javap -c to view the bytecodes of a compiled class[cite: 358, 359].

B: Create a Student class with attributes (name, rollNo, marks) and methods to input/display details and check if the student passed (marks > 40)[cite: 360, 361].

C: Define a MyNumber class with a private int, a default constructor (initializes to 0), and a parameterized constructor (uses this)[cite: 362, 363]. Write methods like isNegative, isPositive, isZero, isOdd, and isEven[cite: 364]. Pass a value from the command line to test these methods[cite: 365]. Also, provide javadoc comments for all constructors and methods[cite: 367].

D: Write a menu-driven program for matrix operations: Addition, Multiplication, and Transpose[cite: 368, 371, 373, 375].

Assignment 2: Array of Objects and Packages [cite: 409]

This assignment covers creating arrays of objects, using static members, and organizing classes into packages[cite: 410].

Key Concepts Covered:

Creating and managing arrays of objects[cite: 412].

Using static members (variables and methods) to track class-level data[cite: 728].

Creating user-defined packages using the package keyword[cite: 413, 729, 730].

Importing and using classes from other packages[cite: 414, 731].

Understanding Java's access modifiers (public, private, protected, default)[cite: 733, 734].

Set A (Mandatory Tasks):

A: Create an Employee class (id, name, deptname, salary) with default and parameterized constructors (using this)[cite: 726]. Add a static member to count the number of objects created and display the count after each object instantiation[cite: 727, 728].

B: Create two packages: SY (with class SYMarks) and TY (with class TYMarks)[cite: 729, 730]. Create a Student class that uses these packages to store marks for n students[cite: 731]. Calculate and display a grade for each student based on their marks[cite: 732].

C: Create a Customer class with four member variables, each having a different access modifier (public, private, protected, default)[cite: 733]. Test the accessibility of these variables from other classes in the same package and in a different package[cite: 734].

Assignment 3: Inheritance and Interfaces [cite: 748]

This assignment focuses on the core OOP principles of inheritance (code reuse) and abstraction (interfaces and abstract classes)[cite: 749].

Key Concepts Covered:

Multilevel inheritance using the extends keyword[cite: 1072].

Creating and using abstract classes and methods[cite: 751, 1074].

Subclassing abstract classes to provide concrete implementations[cite: 1075].

Defining interface contracts with methods and constants[cite: 752, 1076].

Implementing interfaces using the implements keyword[cite: 759, 1077].

Set A (Mandatory Tasks):

A: Implement multilevel inheritance: a Country class inherited from Continent, and a State class inherited from Country. Display the details for a place[cite: 1072, 1073].

B: Define an abstract class Staff (with protected id, name, and a parameterized constructor)[cite: 1074]. Create a subclass OfficeStaff that extends Staff and adds a department member. Create and display n objects of OfficeStaff[cite: 1075].

C: Define an interface "Operation" with methods area() and volume() and a constant PI[cite: 1076]. Create a Cylinder class (with radius, height) that implements this interface and calculates its area and volume[cite: 1077].

D: Create a Product class (id, name, cost, quantity) with a parameterized constructor[cite: 1078]. When displaying product details, give a 10% discount if the cost is over 1000 rs[cite: 1079]. Also, display a count of the total objects created[cite: 1080].

Assignment 4: Exception Handling and File Handling [cite: 1103]

This assignment deals with building robust applications by managing runtime errors using Java's exception handling mechanism and performing file I/O operations[cite: 1104].

Key Concepts Covered:

Creating and throwing user-defined exceptions[cite: 1105, 1477].

Using try-catch blocks to handle exceptions[cite: 1109].

File I/O: Reading from a text file using character streams (e.g., FileReader)[cite: 1106, 1478].

File I/O: Writing to a text file[cite: 1479, 1481].

String and content manipulation from files[cite: 1478].

Set A (Mandatory Tasks):

A: Define a Patient class (name, age, oxy_level, HRCT_report)[cite: 1476]. Throw a user-defined exception "Patient is Covid Positive (+) and Need to Hospitalized" if the oxygen level is < 95 or the HRCT report is > 10[cite: 1477].

B: Read a text file "sample.txt" and display its contents in two ways: 1) in reverse order and 2) with the case changed to all upper case[cite: 1478].

C: Accept
