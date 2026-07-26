**WEEK-1**

(Introduction to Java Basics and Class Fundamentals)

**Q1)** Write a simple Java Program that prints "Hello World" to the console.

**PROCEDURE:**

**public class Hello**: Defines a universally accessible blueprint named Hello.

**public static main**: The standard starting execution point for any standalone Java application.

**String\[\] args**: A parameter array that holds text values passed into the program during startup.

**System.out.println()**: A built-in system command that routes text data to the standard console screen.

**PROGRAM:**

public class Hello {

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println("Hello World");

&nbsp; }

}

**OUTPUT:**

Hello World

**INFERENCE:**

The identical task can be written as an alternative variant using an external text block, a character array, or the formatting variant System.out.printf(). For instance, invoking System.out.printf("%s\\n", "Hello World"); replaces standard text routing with structured string formatting.

**Q2)** Write a Java Program to perform addition of two using command line arguments.

**PROCEDURE:**

**class ClSum**: Allocates a default package-private blueprint class configuration.

**args\[0\], args\[1\]**: Array index pointers targeting strings provided via console execution.

**Integer.parseInt()**: A numerical conversion service that translates raw text strings into pure numeric int data.

**\+ Operator**: Serves a dual function of performing arithmetic addition and handling text concatenation.

**PROGRAM:**

class ClSum {

&nbsp; public static void main(String\[\] args) {

&nbsp; int a = Integer.parseInt(args\[0\]);

&nbsp; int b = Integer.parseInt(args\[1\]);

&nbsp; System.out.println("Addition of " + a + " and " + b + " is " + (a + b));

&nbsp; }

}

**OUTPUT:**

- Addition of 10 and 20 is 30
- Addition of 25 and 35 is 60

**INFERENCE:**

Instead of using the raw primitive converter Integer.parseInt(), values can be extracted by utilizing the wrapper constructor utility Integer.valueOf(args\[i\]).intValue(). Alternatively, you can iterate dynamically over an arbitrary count of console arguments using an enhanced for-each loop scheme to accumulate a running total instead of hardcoded array indexes.

**Q3)** Write a Java Program to perform addition of two using Scanner class.

**PROCEDURE:**

**import java.util.Scanner**: References an external utility toolkit library designed for dissecting input.

**new Scanner(System.in)**: Allocates system memory for an input listening object bound to the standard keyboard.

**s.nextInt()**: An active scanner instruction that interprets the next layout block as a whole numeric integer.

**s.close()**: Shuts down the scanner tracking mechanism to prevent system resource allocation leaks.

**PROGRAM:**

import java.util.Scanner;

public class Sum {

&nbsp; public static void main(String\[\] args) {

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter a number: ");

&nbsp; int a = s.nextInt();

&nbsp; System.out.print("Enter a number: ");

&nbsp; int b = s.nextInt();

&nbsp; System.out.println("Addition of " + a + " and " + b + " is " + (a + b));

&nbsp; s.close();

&nbsp; }

}

**OUTPUT:**

- Enter a number: 6

Enter a number: 7

Addition of 6 and 7 is 13

- Enter a number: 42

Enter a number: 7

Addition of 42 and 7 is 49

**INFERENCE:**

A higher-performance reading approach involves swapping the scanner utility out for a combination of BufferedReader and InputStreamReader. Utilizing new BufferedReader(new InputStreamReader(System.in)).readLine() fetches the entire line as a single string, which is then fragmented using a string tokenizer setup or split mechanisms before numeric calculation.

**Q4)** Write a Java Class to display default value of all primitive data types of JAVA.

**PROCEDURE:**

**static Variables**: Class-level states that exist independently of specific instances and automatically receive default values.

**int, short, byte, long**: Standard signed whole-number integer allocations initialized by default to 0.

**float, double**: Standard fractional floating-point data allocations initialized by default to 0.0.

**boolean**: A binary logic state container initialized by default to a false setting.

**PROGRAM:**

public class StaticDefVal {

&nbsp; static int a;

&nbsp; static float b;

&nbsp; static double c;

&nbsp; static long d;

&nbsp; static short e;

&nbsp; static byte f;

&nbsp; static boolean g;

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);

&nbsp; }

}

**OUTPUT:**

0 0.0 0.0 0 0 0 false

**INFERENCE:**

An alternative verification route is to selectively extract default values from newly allocated arrays. Declaring an uninitialized single-element array block (e.g., new boolean\[1\]\[0\]) automatically populates structural elements with default values without requiring explicit static class fields.

**Q5)** Write a Java Program that displays the roots of a quadratic equation ax<sup>2</sup> + bx + c = 0. Calculate the discriminant D and basing on the value of D, describe the nature of the roots.

**PROCEDURE:**

**s.nextDouble()**: Reads and converts incoming character inputs directly into high-precision double values.

**if-else Construct**: A control-flow tracking structure evaluated to handle separate mathematical path criteria.

**Math.pow(b, 2)**: A native math function executing exponential squaring operations.

**Math.sqrt(d)**: A native math function computing numerical square roots.

**PROGRAM:**

import java.util.Scanner;

public class QuadRoot {

&nbsp; public static void main(String\[\] args) {

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter x^2 co-efficient: ");

&nbsp; double a = s.nextDouble();

&nbsp; System.out.print("Enter x co-efficient: ");

&nbsp; double b = s.nextDouble();

&nbsp; System.out.print("Enter constant: ");

&nbsp; double c = s.nextDouble();

&nbsp; if(a == 0) {

&nbsp; System.out.print("x^2 co-efficient should not be empty");

&nbsp; s.close();

&nbsp; return;

&nbsp; }

&nbsp; double d = (Math.pow(b, 2) - (4 \* a \* c));

&nbsp; if(d > 0) {

&nbsp; double root1 = ((-b + Math.sqrt(d)) / (2 \* a));

&nbsp; double root2 = ((-b - Math.sqrt(d)) / (2 \* a));

&nbsp; System.out.println("Roots are real and distinct");

&nbsp; System.out.println("Root 1 is: " + root1);

&nbsp; System.out.println("Root 2 is: " + root2);

&nbsp; } else if(d == 0) {

&nbsp; double root = ((-b + Math.sqrt(d)) / (2 \* a));

&nbsp; System.out.println("Roots are real and same");

&nbsp; System.out.println("Root is: " + root);

&nbsp; } else {

&nbsp; System.out.println("The roots are complex and imaginary.");

&nbsp; }

&nbsp; s.close();

&nbsp; }

}

**OUTPUT:**

- Enter x^2 co-efficient: 2

Enter x co-efficient: 2

Enter constant: 4

The roots are complex and imaginary.

- Enter x^2 co-efficient: 2

Enter x co-efficient: -2

Enter constant: -4

Roots are real and distinct

Root 1 is: 2.0

Root 2 is: -1.0

**INFERENCE:**

The operational logic can be enhanced by integrating Java Complex Data Type classes or writing a custom structural object to cleanly render imaginary coefficients. Instead of stopping execution with a text error output when dealing with negative values, complex numbers can be expressed as realPart + " + " + imaginaryPart + "i".

**Q6)** Write a Java Program to illustrate increment/decrement and bitwise operators.

**PROCEDURE:**

**++a, --b**: Pre-increment and pre-decrement operations that alter state immediately prior to expression valuation.

**&, |, ^**: Binary bitwise operations evaluating matching columns for logical intersection, union, and exclusive variance.

**\>>, <<**: Shift operations that physically slide internal bit arrays right (dividing by 2) or left (multiplying by 2).

**PROGRAM:**

public class Oper {

&nbsp; public static void main(String\[\] args) {

&nbsp; int a = Integer.parseInt(args\[0\]);

&nbsp; int b = Integer.parseInt(args\[1\]);

&nbsp; System.out.println("Increment of " + a + " is " + ++a);

&nbsp; System.out.println("Decrement of " + b + " is " + --b);

&nbsp; System.out.println("Bitwise AND of " + a + " and " + b + " is " + (a & b));

&nbsp; System.out.println("Bitwise OR of " + a + " and " + b + " is " + (a | b));

&nbsp; System.out.println("Bitwise EX-OR of " + a + " and " + b + " is " + (a ^ b));

&nbsp; System.out.println("Bitwise Right Shift of " + a + " is " + (a >> 1));

&nbsp; System.out.println("Bitwise Left Shift of " + b + " is " + (b << 1));

&nbsp; }

}

**OUTPUT:**

- Increment of 2 is 3

Decrement of 3 is 2

Bitwise AND of 3 and 2 is 2

Bitwise OR of 3 and 2 is 3

Bitwise EX-OR of 3 and 2 is 1

Bitwise Right Shift of 3 is 1

Bitwise Left Shift of 2 is 4

- Increment of 4 is 5

Decrement of 5 is 4

Bitwise AND of 5 and 4 is 4

Bitwise OR of 5 and 4 is 5

Bitwise EX-OR of 5 and 4 is 1

Bitwise Right Shift of 5 is 2

Bitwise Left Shift of 4 is 8

**INFERENCE:**

Standard shorthand mutations (e.g., a += 1) can alternate for regular increment/decrement tasks. For shifting, you can swap low-level bit operations for equivalent binary arithmetic transformations or rely on the explicit Java.BigInteger Class framework methods like .shiftLeft() and .and() to manage structural transformations safely on large numbers.

**Q7)** Write a Java Program to take student name and roll no from command line.

**PROCEDURE:**

**class Studentdetails**: Declares a standard class structure to encapsulate the student profile logic.

**args\[0\]**: An array index pointing to the first user input string supplied during program execution, representing the roll number.

**args\[1\]**: An array index pointing to the second user input string supplied during program execution, representing the student's name.

**PROGRAM:**

class Studentdetails {

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println("Roll no.: " + args\[0\]);

&nbsp; System.out.println("Name: " + args\[1\]);

&nbsp; }

}

**OUTPUT:**

Roll no.: 25335A0527

Name: Nowshik

**INFERENCE:**

Instead of directly accessing the array elements by hardcoded indexes (which throws an error if arguments are missing), you can parse the input safely by checking the array size first. Alternatively, you can map the array to an interactive input streaming approach using java.util.Scanner to prompt the user step-by-step if no arguments are provided at launch.

**Q8)** Write a Java Program to print the number of arguments in command line.

**PROCEDURE:**

**public class ClLen**: Establishes a universally accessible class definition for the argument count program.

**args.length**: A built-in array property that automatically counts and stores the total number of items passed into the command line.

**int a**: A local numeric container variable used to store the retrieved count value.

**PROGRAM:**

public class ClLen {

&nbsp; public static void main(String\[\] args) {

&nbsp; int a = args.length;

&nbsp; System.out.println("Numbers of arguments in Command Line is " + a);

&nbsp; }

}

**OUTPUT:**

Numbers of arguments in Command Line is 2

**INFERENCE:**

Instead of using the raw .length field property on the array, the arguments can be processed and counted by using the modern Java.Stream API. Running java.util.Arrays.stream(args).count() produces the exact same numeric result using functional programming structures.

**WEEK-2**

(Control and Iteration Statements, Classes and Methods)

**Q1)** Write a Java Program to illustrate definition of class and creation of object with example.

**PROCEDURE:**

**int rollno; String name, dept;**: Defines instance fields within the class structure to describe the attributes of a student.

**Student s = new Student();**: Allocates memory in the system heap area to create a dynamic new instance (object) of the class.

**Dot (.) Operator**: A member access operator used to reference and assign values to individual fields inside the object.

**PROGRAM:**

public class Student {

&nbsp; int rollno;

&nbsp; String name, dept;

&nbsp; public static void main(String\[\] args) {

&nbsp; Student s = new Student();

&nbsp; s.rollno = 27;

&nbsp; s.name = "ABC";

&nbsp; s.dept = "CSE";

&nbsp; System.out.println("Name is " + s.name + " bearing Roll Number " + s.rollno + " in Department " + s.dept);

&nbsp; }

}

**OUTPUT:**

Name is ABC bearing Roll Number 27 in Department CSE

**INFERENCE:**

Rather than exposing internal properties directly to public modification using raw assignments, you can follow standard encapsulation design principles. This involves making the class fields private and exposing them through controlled public getter and setter methods.

**Q2)** Write a Java Program to illustrate class, object and method.

**PROCEDURE:**

**public void show()**: Declares an instance behavior method that does not return any data value (void).

**s.show()**: Invokes the object's specific internal block of code to run its instructions on the target instance.

**PROGRAM:**

class Student1 {

&nbsp; int id;

&nbsp; String name, dept;

&nbsp; public void show() {

&nbsp; System.out.println("Name is " + name + " bearing ID " + id + " in Department " + dept);

&nbsp;

&nbsp; }

}

public class CMethod {

&nbsp; public static void main(String\[\] args) {

&nbsp; Student1 s = new Student1();

&nbsp; s.id = 27;

&nbsp; s.name = "ABC";

&nbsp; s.dept = "CSE";

&nbsp; s.show();

&nbsp; }

}

**OUTPUT:**

Name is ABC bearing ID 27 in Department CSE

**INFERENCE:**

You can replace standard message-printing methods by overriding the native public String toString() method inherited from Java's base Object class. This allows you to print the object state automatically when passing the object reference directly into System.out.println(s);.

**Q3)** Write a Java Program to illustrate class, object, method and constructor.

**PROCEDURE:**

**Box(double h, double w, double d)**: A parameterized constructor method that initializes an object automatically at the moment of its creation.

**this Reference**: Implied reference logic used to copy input argument values into the object's instance variable fields.

**new Box(2, 3, 4)**: Supplies custom initialization values directly to the constructor during memory allocation.

**PROGRAM:**

class Box {

&nbsp; double height, width, depth;

&nbsp; Box(double h, double w, double d) {

&nbsp; height = h;

&nbsp; width = w;

&nbsp; depth = d;

&nbsp; }

&nbsp; public void display() {

&nbsp; System.out.println("Cube of height " + height + " width " + width + " depth " + depth + " volume " + (height \* width \* depth));

&nbsp; }

}

public class ConstJava {

&nbsp; public static void main(String\[\] args) {

&nbsp; Box b = new Box(2, 3, 4);

&nbsp; b.display();

&nbsp; }

}

**OUTPUT:**

Cube of height 2.0 width 3.0 depth 4.0 volume 24.0

**INFERENCE:**

The setup can be modified by introducing constructor overloading. By writing a secondary parameterless default constructor Box() { this(1, 1, 1); }, the program can seamlessly initialize standard unit dimensions automatically whenever custom values are not provided.

**Q4)** Write a Java Program to illustrate selection statements.

**PROCEDURE:**

**if-else if-else**: A multi-way conditional structure that checks logical conditions sequentially from top to bottom.

**&& Operator**: A short-circuit logical evaluation tool requiring both checking expressions to be true.

**switch(day)**: A high-efficiency selection mechanism matching a variable expression against specific explicit constant literal values.

**break;**: A control statement used to immediately exit the active switch block context and prevent fall-through execution.

**PROGRAM:**

public class SelectStat {

&nbsp; public static void main(String\[\] args) {

&nbsp; int marks = 90;

&nbsp; String day = "Thu";

&nbsp; if (marks > 90 && marks <= 100) {

&nbsp; System.out.println("A");

&nbsp; } else if (marks > 75 && marks <= 90) {

&nbsp; System.out.println("B");

&nbsp; } else if (marks > 50 && marks <= 75) {

&nbsp; System.out.println("C");

&nbsp; } else if (marks > 25 && marks <= 50) {

&nbsp; System.out.println("D");

&nbsp; } else {

&nbsp; System.out.println("F");

&nbsp; }

&nbsp;

&nbsp; switch(day) {

&nbsp; case "Mon":

&nbsp; System.out.println("Monday");

&nbsp; break;

&nbsp; case "Tues":

&nbsp; System.out.println("Tuesday");

&nbsp; break;

&nbsp; case "Wed":

&nbsp; System.out.println("Wednesday");

&nbsp; break;

&nbsp; case "Thu":

&nbsp; System.out.println("Thursday");

&nbsp; break;

&nbsp; case "Fri":

&nbsp; System.out.println("Friday");

&nbsp; break;

&nbsp; case "Sat":

&nbsp; System.out.println("Saturday");

&nbsp; break;

&nbsp; case "Sun":

&nbsp; System.out.println("Sunday");

&nbsp; break;

&nbsp; default :

&nbsp; System.out.println("Not a day");

&nbsp; }

&nbsp; }

}

**OUTPUT:**

B

Thursday

**INFERENCE:**

The legacy switch block format can be upgraded into the modern structural Java Switch Expression syntax introduced in newer versions of Java. Using the arrow pattern (e.g., case "Mon" -> System.out.println("Monday");) completely removes the need for typing manual break; statements.

**Q5)** Write a Java Program to illustrate looping statements.

**PROCEDURE:**

**for(int a = 0; a < 5; a++)**: A counter-controlled loop that encapsulates initialization, condition checking, and step updates in one clean header line.

**while(i < 3)**: A condition-controlled entry loop that checks the validation rule _before_ running its code block.

**do { ... } while(j < 3)**: An exit-controlled loop structure guaranteed to execute its internal block at least once regardless of the starting condition.

**for(String k : args)**: An enhanced for-each iteration loop that loops over collection arrays sequentially without using raw numeric indices.

**PROGRAM:**

public class LoopStat {

&nbsp; public static void main(String\[\] args) {

&nbsp; int i = 0, j = 0;

&nbsp; for(int a = 0; a < 5; a++) {

&nbsp; System.out.print(a + " ");

&nbsp; }

&nbsp; System.out.println();

&nbsp; while(i < 3) {

&nbsp; System.out.print(i++ + " ");

&nbsp; }

&nbsp; System.out.println();

&nbsp; do {

&nbsp; System.out.print(j++ + " ");

&nbsp; } while(j < 3);

&nbsp; System.out.println();

&nbsp; for(String k : args) {

&nbsp; System.out.print(k + " ");

&nbsp; }

&nbsp; System.out.println();

&nbsp; }

}

**OUTPUT:**

0 1 2 3 4

0 1 2

0 1 2

**INFERENCE:**

Traditional control loops can be converted into functional sequences using recursion methods or the modern functional streaming API. For example, replacing a standard for loop iteration with java.util.stream.IntStream.range(0, 5).forEach(a -> System.out.print(a + " ")); executes iterative behavior using sleek, modern functional programming.

**WEEK-3**

**(**Arrays and Strings)

**Q1)** Write a Java Program to read and display array of integers using 1D and 2D.

**PROCEDURE:**

 **int\[\] a = new int\[5\]**: Allocates a fixed sequential block of memory in the system heap area to store 5 primitive integer values.

 **int\[\]\[\] b = new int\[2\]\[2\]**: Declares a two-dimensional grid array structure, functioning essentially as an array of array references to form a \\(2 \\times 2\\) matrix.

 **s.nextInt()**: An active scanner command that scans and parses the next available space-delimited text token from standard input into a primitive int value.

 **for-each loop**: An enhanced iteration loop structure used to cleanly traverse collection sequences or arrays without requiring manual tracking of numeric indexes.

**PROGRAM:**

import java.util.Scanner;

public class Array12D {

&nbsp; public static void main(String\[\] args) {

&nbsp; int\[\] a = new int\[5\];

&nbsp; int\[\]\[\] b = new int\[2\]\[2\];

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter 5 int array values: ");

&nbsp; for(int i = 0; i < 5; i++)

&nbsp; a\[i\] = s.nextInt();

&nbsp; System.out.print("Enter 2 X 2 matrix values: ");

&nbsp; for(int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; b\[i\]\[j\] = s.nextInt();

&nbsp; }

&nbsp; for(int i : a)

&nbsp; System.out.print(i + " ");

&nbsp; System.out.println();

&nbsp; for(int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; System.out.print(b\[i\]\[j\] + " ");

&nbsp; System.out.println();

&nbsp; }

&nbsp; s.close();

&nbsp; }

}

**OUTPUT:**

Enter 5 int array values: 1 2 3 4 5

Enter 2 X 2 matrix values: 1 2 3 4

1 2 3 4 5

1 2

3 4

**INFERENCE:**

Handle data dynamically using collection wrappers like **ArrayList** for linear dimensions and **ArrayList&lt;ArrayList&gt;** for grid matrix dimensions. Additionally, multi-dimensional array values can be formatted and printed cleanly in a single execution line by invoking the built-in utility method **Arrays.deepToString(b)** instead of writing nested traditional loops.

**Q2)** Write a Java Program to perform Method Overloading.

**PROCEDURE:**

 **Method Overloading**: A feature that allows a class to have more than one method having the same name, if their argument lists are different in type, number, or sequence.

 **void sum(int a, int b)**: A specific method signature designed to accept two 32-bit primitive integer values to compute their algebraic total.

 **void sum(double a, double b)**: A distinct overloaded method signature designed to accept high-precision 64-bit floating-point numbers.

 **Method Signature**: The combination of a method's name along with its specific type and order of parameters, which Java uses to bind polymorphic calls at compile time.

**PROGRAM:**

public class MethodOverload {

&nbsp; void sum(int a, int b) {

&nbsp; System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));

&nbsp; }

&nbsp;

&nbsp; void sum(double a, double b) {

&nbsp; System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));

&nbsp; }

&nbsp;

&nbsp; public static void main(String\[\] args) {

&nbsp; MethodOverload obj = new MethodOverload();

&nbsp; obj.sum(10, 20);

&nbsp; obj.sum(20.5, 30.5);

&nbsp; }

}

**OUTPUT:**

Addition of 10 and 20 is: 30

Addition of 20.5 and 30.5 is: 51.0

**INFERENCE:**

Instead of declaring distinct overloaded operations for each specific numeric type variance, you can optimize the architecture by employing **Java Generics bounded by Number fields ()**, or by utilizing **Varargs (variable-length argument lists)** via void sum(int... numbers). A variable-length argument approach lets a single method accept anywhere from zero to an arbitrary count of primitive values dynamically using internal array streaming options.

**Q3)** Write a Java Program to perform Constructor Overloading.

**PROCEDURE:**

 **Constructor Overloading**: The practice of declaring multiple initialization blocks within the same class blueprint, where each variant features a unique parameter signature to instantiate objects differently.

 **ConstructOverload()**: A parameterless default constructor block that initializes state variables to default values like null or zero during object birth.

 **ConstructOverload(String n, int i)**: A parameterized constructor structure that explicitly binds external argument data directly to class instance properties during allocation memory stages.

 **new Operator**: A keyword used to allocate instance memory on the system heap area and immediately hand over control to the matching class constructor.

**PROGRAM:**

public class ConstructOverload {

&nbsp; String name;

&nbsp; int id;

&nbsp; ConstructOverload() {

&nbsp; name = null;

&nbsp; id = 0;

&nbsp; }

&nbsp;

&nbsp; ConstructOverload(String n, int i) {

&nbsp; name = n;

&nbsp; id = i;

&nbsp; }

&nbsp;

&nbsp; void display() {

&nbsp; System.out.println("Name: " + name + " ID: " + id);

&nbsp; }

&nbsp; public static void main(String\[\] args) {

&nbsp; ConstructOverload obj = new ConstructOverload();

&nbsp; ConstructOverload obj1 = new ConstructOverload("ABC", 1);

&nbsp; obj.display();

&nbsp; obj1.display();

&nbsp; }

}

**OUTPUT:**

Name: null ID: 0

Name: ABC ID: 1

**INFERENCE:**

The construction sequence can be written more cleanly by implementing **Explicit Constructor Invocation** via the **this()** reference keyword to chain constructors together. For instance, writing ConstructOverload() { this("Unknown", -1); } eliminates duplication by passing default parameters straight to the parameterized structure, ensuring all property initialization routes flow predictably through a single master controller block.

**Q4)** Write a Java Program to illustrate Parameter Passing Techniques.

**PROCEDURE:**

 **Nested Loop (i and j)**: A control flow mechanism where the outer loop tracks total passes over the array dataset and the inner loop systematically compares adjacent neighbors.

 **if(arr\[j\] > arr\[j+1\])**: A relational conditional statement used to determine if two sequential memory elements are out of chronological order.

 **int temp**: A temporary local holding variable used to securely cache an integer value to prevent data overwrites during a value exchange step.

 **sa.sortArr(a, a.length)**: An explicit call invoking an object's custom method block while feeding the targeting reference array and its absolute size as constraints.

**PROGRAM:**

public class ParamPassTech {

&nbsp; int marks;

&nbsp; ParamPassTech(int m) {

&nbsp; marks = m;

&nbsp; }

&nbsp;

&nbsp; void display() {

&nbsp; System.out.println("Marks: " + marks);

&nbsp; }

&nbsp;

&nbsp; void compare(ParamPassTech p) {

&nbsp; if(this.marks < p.marks) {

&nbsp; System.out.println("Object p marks is higher: " + p.marks);

&nbsp; } else if(this.marks > p.marks) {

&nbsp; System.out.println("Current invoking Object marks is higher: " + this.marks);

&nbsp; } else

&nbsp; System.out.println("Both Current Invoking object and p object marks is same: " + this.marks);

&nbsp; }

&nbsp;

&nbsp; void updateMarks(int m) {

&nbsp; marks = m;

&nbsp; System.out.println("New Marks is: " + marks);

&nbsp; }

&nbsp;

&nbsp; public static void main(String\[\] args) {

&nbsp; ParamPassTech p1 = new ParamPassTech(95);

&nbsp; ParamPassTech p2 = new ParamPassTech(90);

&nbsp; p1.compare(p2);

&nbsp; p1.updateMarks(96);

&nbsp; p1.display();

&nbsp; }

}

**OUTPUT:**

Current invoking Object marks is higher: 95

New Marks is: 96

Marks: 96

**INFERENCE:**

Java strictly implements **Pass-by-Value** for all execution arguments, meaning object method calls merely copy memory pointer addresses rather than the physical object block itself. To prevent unexpected data modifications to class structures inside foreign validation logic routines, parameters should be structured using **Immutable Classes** (such as utilizing the modern **record** keyword structure in newer Java versions). This prevents any unintended internal property modifications entirely across boundary calls.

**Q5)** Write a Java Program to sort given list of numbers.

**PROCEDURE:**

 **linearSearch() method**: A custom method block defined to systematically traverse an active collection array sequence from the zeroth position up to the final element marker.

 **if(arr\[i\] == k)**: An absolute equality checker tracking whether the current array memory slot exactly matches the user-specified query target.

 **return i**: An active return control statement that terminates the execution frame immediately and hands back the exact array index where the item resides.

 **return -1**: A standard fallback sentinel value passed back to signal to the main execution frame that the query key does not exist inside the array.

**PROGRAM:**

import java.util.Scanner;

public class SortArray {

&nbsp; void sortArr(int arr\[\], int n) {

&nbsp; for(int i = 0; i < n - 1; i++) {

&nbsp; for(int j = 0; j < n - i - 1; j++) {

&nbsp; if(arr\[j\] > arr\[j+1\]) {

&nbsp; int temp = arr\[j+1\];

&nbsp; arr\[j+1\] = arr\[j\];

&nbsp; arr\[j\] = temp;

&nbsp; }

&nbsp; }

&nbsp; }

&nbsp; }

&nbsp; public static void main(String\[\] args) {

&nbsp; SortArray sa = new SortArray();

&nbsp; int a\[\] = new int\[5\];

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter 5 elements to sort: ");

&nbsp; for(int i = 0; i < 5; i++)

&nbsp; a\[i\] = s.nextInt();

&nbsp; sa.sortArr(a, a.length);

&nbsp; for(int b: a)

&nbsp; System.out.print(b + " ");

&nbsp; s.close();

&nbsp; }

}

**OUTPUT:**

Enter 5 elements to sort: 5 4 3 2 1

1 2 3 4 5

**INFERENCE:**

Instead of using manual, nested sorting loops which incur an average time complexity of \\(\\mathcal{O}(n^2)\\), standard arrays can be sorted instantly by calling the built-in utility method **Arrays.sort(a)**. For processing high-volume datasets or utilizing parallel computing architectures, the sorting pipeline can be optimized by migrating to a **Arrays.parallelSort(a)** command, which divides the array into sub-blocks for concurrent sorting using the ForkJoin framework.

**Q6**) Write a Java Program to search for an element using linear search.

**PROCEDURE:**

 **int c\[\]\[\] = new int\[2\]\[2\]**: Allocates heap space for an empty target \\(2 \\times 2\\) grid matrix structure used specifically to receive resultant computation metrics.

 **Matrix Traversal loops**: Two distinct levels of nested tracking loops where index pointer i targets rows and index pointer j maps column offsets.

 **c\[i\]\[j\] = a\[i\]\[j\] + b\[i\]\[j\]**: An expression that extracts matching matrix grid slots simultaneously, adds their primitive scalar data values, and saves the output to the target structure.

 **j == 2 - 1 ? "" : " "**: A inline ternary conditional statement used to check for the final row coordinate block to format trailing spacer layout outputs cleanly.

**PROGRAM:**

import java.util.Scanner;

public class LinearSearch {

&nbsp; int linearSearch(int arr\[\], int n, int k) {

&nbsp; for(int i = 0; i < n; i++) {

&nbsp; if(arr\[i\] == k)

&nbsp; return i;

&nbsp; }

&nbsp; return -1;

&nbsp; }

&nbsp; public static void main(String\[\] args) {

&nbsp; LinearSearch obj = new LinearSearch();

&nbsp; int a\[\] = new int\[5\];

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter 5 elements to search: ");

&nbsp; for(int i = 0; i < 5; i++)

&nbsp; a\[i\] = s.nextInt();

&nbsp; System.out.print("Enter the key: ");

&nbsp; int k = s.nextInt();

&nbsp; int res = obj.linearSearch(a, a.length, k);

&nbsp; if(res == -1)

&nbsp; System.out.println("Key Not Found " + res);

&nbsp; else

&nbsp; System.out.println("Key Found at index: " + res);

&nbsp; s.close();

&nbsp; }

}

**Output:**

Enter 5 elements to search: 5 2 4 1 3

Enter the key: 4

Key Found at index: 2

**INFERENCE:**

Linear search requires a costly traversal time of \\(\\mathcal{O}(n)\\). If the incoming integer dataset is already sorted, performance can be heavily optimized by utilizing a **Binary Search** approach via **Arrays.binarySearch(a, k)**, which shrinks the search territory exponentially in \\(\\mathcal{O}(\\log n)\\) time. Alternatively, you can convert the data structure into a functional abstraction by deploying Java Streams: **IntStream.range(0, a.length).filter(i -> a\[i\] == k).findFirst().orElse(-1)**.

**Q7)** Write a Java Program to perform addition of two matrices.

**PROCEDURE**:

 **c\[i\]\[j\] = 0**: A foundational cleanup step executed inside the loop initialization block to guarantee accumulator index values start fresh at baseline zero.

 **for(int k=0; k<2; k++)**: An independent inner dot-product tracker tracking parallel shifts across row columns of Matrix A alongside column rows of Matrix B.

 **c\[i\]\[j\] += a\[i\]\[k\] \* b\[k\]\[j\]**: An assignment expression that calculates dot product transformations by accumulating scaled matrix coordinate pairs.

**PROGRAM:**

import java.util.Scanner;

class AddMat {

&nbsp; public static void main(String\[\] args) {

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; int a\[\]\[\] = new int\[2\]\[2\];

&nbsp; int b\[\]\[\] = new int\[2\]\[2\];

&nbsp; int c\[\]\[\] = new int\[2\]\[2\];

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; a\[i\]\[j\] = s.nextInt();

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; b\[i\]\[j\] = s.nextInt();

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; c\[i\]\[j\] = a\[i\]\[j\] + b\[i\]\[j\];

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; System.out.print(c\[i\]\[j\] + (j == 2 - 1 ? "" : " "));

&nbsp; System.out.println();

&nbsp; }

&nbsp; s.close();

&nbsp; }

}

**OUTPUT**:

1

2

3

4

5

6

7

8

6 8

10 12

**INFERENCE**:

Instead of manually processing matching slots inside basic primitives using traditional nested loop tracking paths, complex multi-dimensional mathematical equations are better handled by utilizing **Apache Commons Math** or **EJML (Efficient Java Matrix Library)**. Utilizing these external library wrappers simplifies matrix addition down to a clean, single-line expression: **RealMatrix c = a.add(b);**.

**Q8)** Write a Java Program to print multiplication of two matrices.

**PROCEDURE:**

 **void compare(ParamPassTech p)**: A method layout signature indicating **Call-by-Reference / Object Passing**, where a reference variable pointing to an object is handed over.

 **this.marks**: An instance pointer variable used to refer explicitly to the data fields belonging to the current instance invoking the execution sequence.

 **p.marks**: A dot-notation member field access instruction utilized to extract instance data stored directly inside the incoming foreign object parameter.

 **void updateMarks(int m)**: A basic primitive method block modeling traditional **Call-by-Value / Pass-by-Value**, where a completely independent duplicate value clone copy is received.

**PROGRAM:**

import java.util.Scanner;

class MulMat {

&nbsp; public static void main(String\[\] args) {

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; int a\[\]\[\] = new int\[2\]\[2\];

&nbsp; int b\[\]\[\] = new int\[2\]\[2\];

&nbsp; int c\[\]\[\] = new int\[2\]\[2\];

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; a\[i\]\[j\] = s.nextInt();

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; b\[i\]\[j\] = s.nextInt();

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++) {

&nbsp; c\[i\]\[j\] = 0;

&nbsp; for(int k = 0; k < 2; k++)

&nbsp; c\[i\]\[j\] = a\[i\]\[j\] + b\[i\]\[j\];

&nbsp; }

&nbsp; }

&nbsp; for (int i = 0; i < 2; i++) {

&nbsp; for(int j = 0; j < 2; j++)

&nbsp; System.out.print(c\[i\]\[j\] + (j == 2 - 1 ? "" : " "));

&nbsp; System.out.println();

&nbsp; }

&nbsp; s.close();

&nbsp; }

}

**OUTPUT**:

1 2 3 4

1 2 3 4

2 4

6 8

**INFERENCE**:

Manual matrix multiplication scripts run at a high computational cost of \\(\\mathcal{O}(n^3)\\). To achieve enhanced throughput, calculations can be updated using parallel streaming pathways or external math frameworks like **ND4J (N-Dimensional Arrays for Java)**. These platforms optimize operational overhead by translating structural math routines directly into optimized vector processing instructions (BLAS/LAPACK) executed straight on native hardware layers.

**Q9)** Write a Java Program to check the string palindrome property.

**PROCEDURE:**

** Scanner(System.in):** Instantiates a utility object that captures raw characters typed into the standard computer keyboard context.

** str.toLowerCase():** Converts all alphabetical characters inside the string instance into lowercase to ensure case-insensitive text comparisons.

** str.charAt(i):** Retrieves a single, specific 16-bit Unicode character located at a designated index offset within the string.

** str.equals(newStr):** Performs a structural content comparison checking if two distinct string object sequences contain identical character arrangements.

**PROGRAM:**

import java.util.Scanner;

public class StrPalin {

&nbsp; public static void main(String\[\] args) {

&nbsp; Scanner s = new Scanner(System.in);

&nbsp; System.out.print("Enter a String: ");

&nbsp; String str = s.next().toLowerCase();

&nbsp; String newStr = "";

&nbsp; for(int i = (str.length() - 1); i >= 0; i--) {

&nbsp; newStr += str.charAt(i);

&nbsp; }

&nbsp; if(str.equals(newStr)) {

&nbsp; System.out.println("Given String is Palindrome " + str);

&nbsp; } else {

&nbsp; System.out.println("Given String is not Palindrome " + str);

&nbsp; }

&nbsp; s.close();

&nbsp; }

}

**OUTPUT:**

Enter a String: Madam

Given String is Palindrome madam

**INFERENCE:**

Using a manual for loop reversal step is to leverage the built-in mutable string utility classes. You can pass the original string into a StringBuilder or StringBuffer, call its native reversing mechanics, and compare it directly to the source text using an expression like: str.equals(new StringBuilder(str).reverse().toString()).

**Q10)** Write a Java Program to illustrate String handling methods (charAt(), compareTo(), equals(), indexOf(), lastIndexOf(), substring(), toUpperCase(), toLowerCase(), concat(), equals(), equalsIgnoreCase(), startsWith(), endsWith(), contains()).

**PROCEDURE:**

 **s1.length()**: Returns the absolute count of 16-bit characters present within the targeted immutable string instance.

 **s1.substring(1, 5)**: Extracts a specific string segment starting from a defined initial index position up to a designated terminal index boundaries.

 **s1.indexOf("o")**: Scans text from the left boundary and returns the initial index location of a specific target character or substring pattern.

 **s1.contains("ell")**: Evaluates whether a precise sequence of characters exists inside a targeted string variable, returning a boolean state.

**PROGRAM:**

public class StrMethod {

&nbsp; public static void main(String\[\] args) {

&nbsp; String s1 = "Hello", s2 = "Hello World";

&nbsp; System.out.println("Given String: " + s1);

&nbsp; System.out.println("String Length: " + s1.length());

&nbsp; System.out.println("Substring of " + s1 + " is " + s1.substring(1, 5));

&nbsp; System.out.println("UpperCase String: " + s1.toUpperCase());

&nbsp; System.out.println("LowerCase String: " + s1.toLowerCase());

&nbsp; System.out.println("'o' String Index: " + s1.indexOf("o"));

&nbsp; System.out.println("'o' String Last Index: " + s1.lastIndexOf("o"));

&nbsp; System.out.println("Concat ' World' to the String: " + s1.concat(" World"));

&nbsp; System.out.println("Is Same Strings: " + s1.equals(s2));

&nbsp; System.out.println("Is Same Strings: " + s1.equalsIgnoreCase(s2));

&nbsp; System.out.println("Compare two Strings: " + s1.compareTo(s2));

&nbsp; System.out.println("String startswith 'H': " + s1.startsWith("H"));

&nbsp; System.out.println("String endswith 'H': " + s1.endsWith("e"));

&nbsp; System.out.println("String contains 'ell': " + s1.contains("ell"));

&nbsp; }

}

**OUTPUT:**

Given String: Hello

String Length: 5

Substring of Hello is ello

UpperCase String: HELLO

LowerCase String: hello

'o' String Index: 4

'o' String Last Index: 4

Concat ' World' to the String: Hello

Is Same Strings: false

Is Same Strings: false

Compare two Strings: -6

String startswith 'H': true

String endswith 'H': false

String contains 'ell': true

**INFERENCE:**

When your applications demand heavy, repetitive text manipulations, swapping immutable String methods for StringBuilder operations mitigates memory thrashing. Additionally, complex string validations-such as verifying prefixes, matching suffix variants, or extracting matching fragments-can be written cleanly and robustly by employing the modern java.util.regex.Pattern (Regular Expressions) framework.

**WEEK-4**

(Static Members, String Buffer and Inheritance)

**Q1)** Write a Java Program to illustrate static variable, static method, and static block.

**PROCEDURE:**

- **static String staticVar**: Allocates a single class-level memory space shared among all generated instances, loaded automatically when the virtual machine starts.
- **static { ... }**: An explicit static initialization block that fires automatically exactly once when the hosting class archetype is initialized in memory.
- **{ ... }**: An instance initialization block that executes automatically right before a class constructor is invoked during object birth.
- **static void display()**: Establishes a class-wide behavior pattern that can be accessed globally without creating a concrete object instance first.

**PROGRAM:**

public class StaticKWord {

&nbsp; static String staticVar = svMethod();

&nbsp; String instVar = ivMethod();

&nbsp; static {

&nbsp; System.out.println("2)Static block called");

&nbsp; }

&nbsp; {

&nbsp; System.out.println("5)Instance block called");

&nbsp; }

&nbsp; static String svMethod() {

&nbsp; System.out.println("1)Static Variable initialized");

&nbsp; return "staticVar";

&nbsp; }

&nbsp; String ivMethod() {

&nbsp; System.out.println("4)Instance Variable initialized");

&nbsp; return "instanceVar";

&nbsp; }

&nbsp; static void display() {

&nbsp; System.out.println("7)Static Method");

&nbsp; }

&nbsp; StaticKWord() {

&nbsp; System.out.println("6)Constructor called");

&nbsp; }

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println("3)Main method called");

&nbsp; StaticKWord obj = new StaticKWord();

&nbsp; StaticKWord.display();

&nbsp; }

}

**OUTPUT:**

1)Static Variable initialized

2)Static block called

3)Main method called

4)Instance Variable initialized

5)Instance block called

6)Constructor called

7)Static Method

**INFERENCE:**

Instead of polluting a basic class blueprint with disorganized static fields and hardcoded execution blocks, shared global constants should be encapsulated using a structured enum (Enumeration Type). For configurations where you need to guarantee that only a single instance of a controller class ever coordinates system-wide operations, you can implement the formal Singleton Design Pattern.

**Q2)** Write a Java Program to sort an array of strings.

**PROCEDURE:**

 **String\[\] strs**: Allocates a linear container structure inside memory designed specifically to hold reference pointer addresses pointing to immutable string objects.

 **Arrays.toString(strs)**: Converts an array structure into a cleanly formatted, readable text string enclosed in square brackets for simple console output.

 **Arrays.sort(strs)**: Invokes an optimized, built-in sorting method that rearranges elements sequentially based on their natural lexicographical order.

**PROGRAM:**

import java.util.Arrays;

public class SortStr {

&nbsp; public static void main(String\[\] args) {

&nbsp; String\[\] strs = {"AJP", "Lab"};

&nbsp; System.out.println("Original Array:");

&nbsp; System.out.println(Arrays.toString(strs));

&nbsp; Arrays.sort(strs);

&nbsp; System.out.println("Sorted Array:");

&nbsp; System.out.println(Arrays.toString(strs));

&nbsp; }

}

**OUTPUT:**

Original Array:

\[AJP, Lab\]

Sorted Array:

\[AJP, Lab\]

**INFERENCE:**

Instead of mutating the original array using legacy utility commands, string lists can be sorted functionally using the Java Streams API by invoking Arrays.stream(strs).sorted().toArray(String\[\]::new). Furthermore, if you need to sort strings based on custom rules rather than standard alphabetical rules (such as arranging items by text length), you can pass a custom sorting rule via an explicit lambda implementation: Arrays.sort(strs, (s1, s2) -> Integer.compare(s1.length(), s2.length())).

**Q3)** Write a Java Program to illustrate five String Buffer handling methods.

**PROCEDURE:**

 **StringBuffer**: Instantiates a thread-safe, mutable sequence of characters that can be updated repeatedly without spawning intermediate object trash.

 **s.append(" class")**: Modifies the internal character store by joining a new sequence directly onto the terminal end of the existing text.

 **s.insert(1, "d")**: Inserts a specified data block or character string into a precise index offset without overriding neighboring contents.

 **s.delete(1, 2)**: Removes a specified slice of data from the mutable string container across designated start and end index boundary markers.

**PROGRAM:**

public class StrBufferMethod {

&nbsp; public static void main(String\[\] args) {

&nbsp; StringBuffer s = new StringBuffer("AJP");

&nbsp; System.out.println("Original String: " + s);

&nbsp; System.out.println("Modified String: " + s.append(" class"));

&nbsp; System.out.println("New String: " + s.insert(1, "d"));

&nbsp; System.out.println("After deleting 'd': " + s.delete(1, 2));

&nbsp; System.out.println("Replaced String: " + s.replace(4, s.capacity(), "lab"));

&nbsp; System.out.println("Reversed String: " + s.reverse());

&nbsp; }

}

**OUTPUT:**

Original String: AJP

Modified String: AJP class

New String: AdJP class

After deleting 'd': AJP class

Replaced String: AJP lab

Reversed String: bal PJA

**INFERENCE:**

Because StringBuffer includes internal tracking synchronization to ensure absolute thread safety across multi-threaded applications, it carries a small operational overhead. For standard single-threaded environments, you can achieve better performance by swapping it out for StringBuilder, which shares an identical API but runs faster because it avoids synchronization locks.

**Q4)** Write a Java Program to illustrate Inheritance, Member access, Types of Inheritance, Forms of Inheritance.

**PROCEDURE:**

 **extends A**: Implements single class inheritance, declaring that child class B inherits fields and foundational behaviors from parent blueprint A.

 **abstract class E**: Defines an uninstantiable base architectural class template that serves solely to force child classes to implement its missing layout parts.

 **interface F**: Declares a fully abstract type structure that outlines required method capabilities that any implementing concrete class must satisfy.

 **implements F**: A class binding contract signaling that the targeting structure will explicitly flesh out the behaviors outlined within specified interface files.

**PROGRAM:**

class A {

&nbsp; int a = 10;

&nbsp; public void showA() { System.out.println(a);}

}

class B extends A {

&nbsp; int b = 20;

&nbsp; public void showB() { System.out.println(b);}

}

class C extends B {

&nbsp; int c = 30;

&nbsp; public void showC() { System.out.println(c);}

}

class D extends B {

&nbsp; int d = 40;

&nbsp; public void showD() { System.out.println(d);}

}

abstract class E {

&nbsp; int e = 50;

&nbsp; abstract void showE();

}

interface F {

&nbsp; void showE();

}

class G extends E implements F {

&nbsp; @Override

&nbsp; public void showE() {

&nbsp; System.out.println(e);

&nbsp; }

}

public class InheritanceExample {

&nbsp; public static void main(String\[\] args) {

&nbsp; C c = new C();

&nbsp; c.showA();

&nbsp; c.showB();

&nbsp; c.showC();

&nbsp; D d = new D();

&nbsp; d.showA();

&nbsp; d.showB();

&nbsp; d.showD();

&nbsp; G g = new G();

&nbsp; g.showE();

&nbsp; }

}

**OUTPUT:**

10

20

30

10

20

40

50

**INFERENCE:**

To avoid deep, brittle inheritance hierarchies (C extends B extends A) that make your code fragile and hard to modify, you should prioritize Composition over Inheritance. This design paradigm builds systems by passing smaller, focused component interfaces into objects dynamically, combining lightweight strategies via dependency injection rather than locking classes into rigid, hardcoded ancestral relationships.

**Q5)** Write a Java Program to illustrate the uses of Super key word.

**PROCEDURE:**

 **this.a = b**: An absolute instance reference command targeting a class field belonging directly to the current class context to prevent variable shadowing errors.

 **super(a)**: A mandatory constructor forwarding call that executes the initialization constructor sequence of the parent class before processing child logic.

 **@Override**: A compiler instruction confirming that a method is intentionally overriding an inherited parent structure.

 **super.show()**: Invokes the original behavioral implementation defined up in the ancestral class hierarchy, bypassing local overriding behaviors.

**PROGRAM:**

class A {

&nbsp; int a;

&nbsp; A(int a) {

&nbsp; this.a = a;

&nbsp; }

&nbsp; public void show() { System.out.println(a); }

}

class B extends A {

&nbsp; int a, b;

&nbsp;

&nbsp; B(int a, int b, int c) {

&nbsp; super(a);

&nbsp; this.a = b;

&nbsp; this.b = c;

&nbsp; }

&nbsp; @Override

&nbsp; public void show() {

&nbsp; super.show();

&nbsp; System.out.println(a + " " + b);

&nbsp; }

}

public class SuperKWord {

&nbsp; public static void main(String\[\] args) {

&nbsp; B obj = new B(10, 20, 30);

&nbsp; obj.show();

&nbsp; }

}

**OUTPUT:**

10

20 30

**INFERENCE:**

Instead of resolving field name conflicts across parent and child scopes by scattering manual super keywords throughout your methods, you should follow standard encapsulation practices by marking class states as private. By restricting access to data fields and exposing them strictly through polymorphic getter or setter behaviors, you minimize field shadowing conflicts and eliminate the need to bypass child logic using low-level member referencing words.

**Q6)** Write a Java Program to illustrate Method Overriding.

**PROCEDURE:**

- **class Student:** Defines a base class with a display() method to be overridden.
- **class MethodOverride extends Student:** Declares a child class that inherits from the Student class.
- **@Override public void display():** Annotates and defines a method in the child class that provides a specific implementation of the parent class's display() method.
- **MethodOverride obj = new MethodOverride():** Creates an instance of the child class. Polymorphism ensures that the overridden version of the method is called.

**PROGRAM:**

class Student {

&nbsp; int a = 10;

&nbsp; public void display() {

&nbsp; System.out.println(a);

&nbsp; }

}

class MethodOverride extends Student {

&nbsp; @Override

&nbsp; public void display() {

&nbsp; System.out.println(a);

&nbsp; }

&nbsp; public static void main(String\[\] args) {

&nbsp; MethodOverride obj = new MethodOverride();

&nbsp; obj.display();

&nbsp; }

}

**OUTPUT:**

10

**INFERENCE:**

The provided program demonstrates simple method overriding. A more robust approach involves using abstract classes or interfaces to define contracts for behaviors. For instance, you could define an abstract display() method in the Student class, forcing any concrete subclass to provide a specific implementation. This ensures that all subclasses have the required behavior but can implement it in their own way.