Java Lab Record

**WEEK 1: Introduction to Java Basics and Class Fundamentals**

**Q: Write a simple Java Program that prints "Hello World" to the console.**

**Procedure:**

**public class Hello**: Defines a universally accessible blueprint named Hello.

**public static main**: The standard starting execution point for any standalone Java application.

**String\[\] args**: A parameter array that holds text values passed into the program during startup.

**System.out.println()**: A built-in system command that routes text data to the standard console screen.

**Program:**

public class Hello {

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println("Hello World");

&nbsp; }

}

**Output:**

Hello World

**Inference:**

The identical task can be written as an alternative variant using an external text block, a character array, or the formatting variant System.out.printf(). For instance, invoking System.out.printf("%s\\n", "Hello World"); replaces standard text routing with structured string formatting.

**Q: Write a Java Program to perform addition of two using command line arguments.**

**Procedure:**

**class ClSum**: Allocates a default package-private blueprint class configuration.

**args\[0\], args\[1\]**: Array index pointers targeting strings provided via console execution.

**Integer.parseInt()**: A numerical conversion service that translates raw text strings into pure numeric int data.

**\+ Operator**: Serves a dual function of performing arithmetic addition and handling text concatenation.

**Program:**

class ClSum {

&nbsp; public static void main(String\[\] args) {

&nbsp; int a = Integer.parseInt(args\[0\]);

&nbsp; int b = Integer.parseInt(args\[1\]);

&nbsp; System.out.println("Addition of " + a + " and " + b + " is " + (a + b));

&nbsp; }

}

**Output:**

- Addition of 10 and 20 is 30
- Addition of 25 and 35 is 60

**Inference:**

Instead of using the raw primitive converter Integer.parseInt(), values can be extracted by utilizing the wrapper constructor utility Integer.valueOf(args\[i\]).intValue(). Alternatively, you can iterate dynamically over an arbitrary count of console arguments using an enhanced for-each loop scheme to accumulate a running total instead of hardcoded array indexes.

**Q: Write a Java Program to perform addition of two using Scanner class.**

**Procedure:**

**import java.util.Scanner**: References an external utility toolkit library designed for dissecting input.

**new Scanner(System.in)**: Allocates system memory for an input listening object bound to the standard keyboard.

**s.nextInt()**: An active scanner instruction that interprets the next layout block as a whole numeric integer.

**s.close()**: Shuts down the scanner tracking mechanism to prevent system resource allocation leaks.

**Program:**

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

**Output:**

- Enter a number: 6

Enter a number: 7

Addition of 6 and 7 is 13

- Enter a number: 42

Enter a number: 7

Addition of 42 and 7 is 49

**Inference:**

A higher-performance reading approach involves swapping the scanner utility out for a combination of BufferedReader and InputStreamReader. Utilizing new BufferedReader(new InputStreamReader(System.in)).readLine() fetches the entire line as a single string, which is then fragmented using a string tokenizer setup or split mechanisms before numeric calculation.

**Q: Write a Java Class to display default value of all primitive data types of JAVA.**

**Procedure:**

**static Variables**: Class-level states that exist independently of specific instances and automatically receive default values.

**int, short, byte, long**: Standard signed whole-number integer allocations initialized by default to 0.

**float, double**: Standard fractional floating-point data allocations initialized by default to 0.0.

**boolean**: A binary logic state container initialized by default to a false setting.

**Program:**

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

**Output:**

0 0.0 0.0 0 0 0 false

**Inference:**

An alternative verification route is to selectively extract default values from newly allocated arrays. Declaring an uninitialized single-element array block (e.g., new boolean\[1\]\[0\]) automatically populates structural elements with default values without requiring explicit static class fields.

**Q: Write a Java Program that displays the roots of a quadratic equation ax<sup>2</sup> + bx + c = 0. Calculate the discriminant D and basing on the value of D, describe the nature of the roots.**

**Procedure:**

**s.nextDouble()**: Reads and converts incoming character inputs directly into high-precision double values.

**if-else Construct**: A control-flow tracking structure evaluated to handle separate mathematical path criteria.

**Math.pow(b, 2)**: A native math function executing exponential squaring operations.

**Math.sqrt(d)**: A native math function computing numerical square roots.

**Program:**

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

**Output:**

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

**Inference:**

The operational logic can be enhanced by integrating Java Complex Data Type classes or writing a custom structural object to cleanly render imaginary coefficients. Instead of stopping execution with a text error output when dealing with negative values, complex numbers can be expressed as realPart + " + " + imaginaryPart + "i".

**Q: Write a Java Program to illustrate increment/decrement and bitwise operators.**

**Procedure:**

**++a, --b**: Pre-increment and pre-decrement operations that alter state immediately prior to expression valuation.

**&, |, ^**: Binary bitwise operations evaluating matching columns for logical intersection, union, and exclusive variance.

**\>>, <<**: Shift operations that physically slide internal bit arrays right (dividing by 2) or left (multiplying by 2).

**Program:**

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

**Output:**

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

**Inference:**

Standard shorthand mutations (e.g., a += 1) can alternate for regular increment/decrement tasks. For shifting, you can swap low-level bit operations for equivalent binary arithmetic transformations or rely on the explicit [Java BigInteger Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/math/BigInteger.html) framework methods like .shiftLeft() and .and() to manage structural transformations safely on large numbers.

**Q: Write a Java Program to take student name and roll no from command line.**

**Procedure:**

**class Studentdetails**: Declares a standard class structure to encapsulate the student profile logic.

**args\[0\]**: An array index pointing to the first user input string supplied during program execution, representing the roll number.

**args\[1\]**: An array index pointing to the second user input string supplied during program execution, representing the student's name.

**Program:**

class Studentdetails {

&nbsp; public static void main(String\[\] args) {

&nbsp; System.out.println("Roll no.: " + args\[0\]);

&nbsp; System.out.println("Name: " + args\[1\]);

&nbsp; }

}

**Output:**

Roll no.: 25335A0527

Name: Nowshik

**Inference:**

Instead of directly accessing the array elements by hardcoded indexes (which throws an error if arguments are missing), you can parse the input safely by checking the array size first. Alternatively, you can map the array to an interactive input streaming approach using java.util.Scanner to prompt the user step-by-step if no arguments are provided at launch.

**Q: Write a Java Program to print the number of arguments in command line.**

**Procedure:**

**public class ClLen**: Establishes a universally accessible class definition for the argument count program.

**args.length**: A built-in array property that automatically counts and stores the total number of items passed into the command line.

**int a**: A local numeric container variable used to store the retrieved count value.

**Program:**

public class ClLen {

&nbsp; public static void main(String\[\] args) {

&nbsp; int a = args.length;

&nbsp; System.out.println("Numbers of arguments in Command Line is " + a);

&nbsp; }

}

**Output:**

Numbers of arguments in Command Line is 2

**Inference:**

Instead of using the raw .length field property on the array, the arguments can be processed and counted by using the modern [Java Stream API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/math/BigInteger.html). Running java.util.Arrays.stream(args).count() produces the exact same numeric result using functional programming structures.

**WEEK 2: Control and Iteration Statements, Classes and Methods**

**Q: Write a Java Program to illustrate definition of class and creation of object with example.**

**Procedure:**

**int rollno; String name, dept;**: Defines instance fields within the class structure to describe the attributes of a student.

**Student s = new Student();**: Allocates memory in the system heap area to create a dynamic new instance (object) of the class.

**Dot (.) Operator**: A member access operator used to reference and assign values to individual fields inside the object.

**Program:**

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

**Output:**

Name is ABC bearing Roll Number 27 in Department CSE

**Inference:**

Rather than exposing internal properties directly to public modification using raw assignments, you can follow standard encapsulation design principles. This involves making the class fields private and exposing them through controlled public getter and setter methods.

**Q: Write a Java Program to illustrate class, object and method.**

**Procedure:**

**public void show()**: Declares an instance behavior method that does not return any data value (void).

**s.show()**: Invokes the object's specific internal block of code to run its instructions on the target instance.

**Program:**

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

**Output:**

Name is ABC bearing ID 27 in Department CSE

**Inference:**

You can replace standard message-printing methods by overriding the native public String toString() method inherited from Java's base Object class. This allows you to print the object state automatically when passing the object reference directly into System.out.println(s);.

**Q: Write a Java Program to illustrate class, object, method and constructor.**

**Procedure:**

**Box(double h, double w, double d)**: A parameterized constructor method that initializes an object automatically at the moment of its creation.

**this Reference**: Implied reference logic used to copy input argument values into the object's instance variable fields.

**new Box(2, 3, 4)**: Supplies custom initialization values directly to the constructor during memory allocation.

**Program:**

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

**Output:**

Cube of height 2.0 width 3.0 depth 4.0 volume 24.0

**Inference:**

The setup can be modified by introducing constructor overloading. By writing a secondary parameterless default constructor Box() { this(1, 1, 1); }, the program can seamlessly initialize standard unit dimensions automatically whenever custom values are not provided.

**Q: Write a Java Program to illustrate selection statements.**

**Procedure:**

**if-else if-else**: A multi-way conditional structure that checks logical conditions sequentially from top to bottom.

**&& Operator**: A short-circuit logical evaluation tool requiring both checking expressions to be true.

**switch(day)**: A high-efficiency selection mechanism matching a variable expression against specific explicit constant literal values.

**break;**: A control statement used to immediately exit the active switch block context and prevent fall-through execution.

**Program:**

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

**Output:**

B

Thursday

**Inference:**

The legacy switch block format can be upgraded into the modern structural Java Switch Expression syntax introduced in newer versions of Java. Using the arrow pattern (e.g., case "Mon" -> System.out.println("Monday");) completely removes the need for typing manual break; statements.

**Q: Write a Java Program to illustrate looping statements.**

**Procedure:**

**for(int a = 0; a < 5; a++)**: A counter-controlled loop that encapsulates initialization, condition checking, and step updates in one clean header line.

**while(i < 3)**: A condition-controlled entry loop that checks the validation rule _before_ running its code block.

**do { ... } while(j < 3)**: An exit-controlled loop structure guaranteed to execute its internal block at least once regardless of the starting condition.

**for(String k : args)**: An enhanced for-each iteration loop that loops over collection arrays sequentially without using raw numeric indices.

**Program:**

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

**Output:**

0 1 2 3 4

0 1 2

0 1 2

**Inference:**

Traditional control loops can be converted into functional sequences using recursion methods or the modern functional streaming API. For example, replacing a standard for loop iteration with java.util.stream.IntStream.range(0, 5).forEach(a -> System.out.print(a + " ")); executes iterative behavior using sleek, modern functional programming.

**WEEK 3: Arrays and Strings**

**Q: Write a Java Program to read and display array of integers using 1D and 2D.**

**Procedure:**

 **int\[\] a = new int\[5\]**: Allocates a fixed sequential block of memory in the system heap area to store 5 primitive integer values.

 **int\[\]\[\] b = new int\[2\]\[2\]**: Declares a two-dimensional grid array structure, functioning essentially as an array of array references to form a \\(2 \\times 2\\) matrix.

 **s.nextInt()**: An active scanner command that scans and parses the next available space-delimited text token from standard input into a primitive int value.

 **for-each loop**: An enhanced iteration loop structure used to cleanly traverse collection sequences or arrays without requiring manual tracking of numeric indexes.

**Program:**

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

**Output:**

Enter 5 int array values: 1 2 3 4 5

Enter 2 X 2 matrix values: 1 2 3 4

1 2 3 4 5

1 2

3 4

**Inference:**

Handle data dynamically using collection wrappers like **ArrayList** for linear dimensions and **ArrayList&lt;ArrayList&gt;** for grid matrix dimensions. Additionally, multi-dimensional array values can be formatted and printed cleanly in a single execution line by invoking the built-in utility method **Arrays.deepToString(b)** instead of writing nested traditional loops.

**Q: Write a Java Program to perform Method Overloading.**

**Procedure:**

 **Method Overloading**: A feature that allows a class to have more than one method having the same name, if their argument lists are different in type, number, or sequence.

 **void sum(int a, int b)**: A specific method signature designed to accept two 32-bit primitive integer values to compute their algebraic total.

 **void sum(double a, double b)**: A distinct overloaded method signature designed to accept high-precision 64-bit floating-point numbers.

 **Method Signature**: The combination of a method's name along with its specific type and order of parameters, which Java uses to bind polymorphic calls at compile time.

**Program:**

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

**Output:**

Addition of 10 and 20 is: 30

Addition of 20.5 and 30.5 is: 51.0

**Inference:**

Instead of declaring distinct overloaded operations for each specific numeric type variance, you can optimize the architecture by employing **Java Generics bounded by Number fields ()**, or by utilizing **Varargs (variable-length argument lists)** via void sum(int... numbers). A variable-length argument approach lets a single method accept anywhere from zero to an arbitrary count of primitive values dynamically using internal array streaming options.

**Q: Write a Java Program to perform Constructor Overloading.**

**Procedure:**

 **Constructor Overloading**: The practice of declaring multiple initialization blocks within the same class blueprint, where each variant features a unique parameter signature to instantiate objects differently.

 **ConstructOverload()**: A parameterless default constructor block that initializes state variables to default values like null or zero during object birth.

 **ConstructOverload(String n, int i)**: A parameterized constructor structure that explicitly binds external argument data directly to class instance properties during allocation memory stages.

 **new Operator**: A keyword used to allocate instance memory on the system heap area and immediately hand over control to the matching class constructor.

**Program:**

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

**Output:**

Name: null ID: 0

Name: ABC ID: 1

**Inference:**

The construction sequence can be written more cleanly by implementing **Explicit Constructor Invocation** via the **this()** reference keyword to chain constructors together. For instance, writing ConstructOverload() { this("Unknown", -1); } eliminates duplication by passing default parameters straight to the parameterized structure, ensuring all property initialization routes flow predictably through a single master controller block.

**Q: Write a Java Program to illustrate Parameter Passing Techniques.**

**Procedure:**

 **Nested Loop (i and j)**: A control flow mechanism where the outer loop tracks total passes over the array dataset and the inner loop systematically compares adjacent neighbors.

 **if(arr\[j\] > arr\[j+1\])**: A relational conditional statement used to determine if two sequential memory elements are out of chronological order.

 **int temp**: A temporary local holding variable used to securely cache an integer value to prevent data overwrites during a value exchange step.

 **sa.sortArr(a, a.length)**: An explicit call invoking an object's custom method block while feeding the targeting reference array and its absolute size as constraints.

**Program:**

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

**Output:**

Current invoking Object marks is higher: 95

New Marks is: 96

Marks: 96

**Inference:**

Java strictly implements **Pass-by-Value** for all execution arguments, meaning object method calls merely copy memory pointer addresses rather than the physical object block itself. To prevent unexpected data modifications to class structures inside foreign validation logic routines, parameters should be structured using **Immutable Classes** (such as utilizing the modern **record** keyword structure in newer Java versions). This prevents any unintended internal property modifications entirely across boundary calls.

**Q: Write a Java Program to sort given list of numbers.**

**Procedure:**

 **linearSearch() method**: A custom method block defined to systematically traverse an active collection array sequence from the zeroth position up to the final element marker.

 **if(arr\[i\] == k)**: An absolute equality checker tracking whether the current array memory slot exactly matches the user-specified query target.

 **return i**: An active return control statement that terminates the execution frame immediately and hands back the exact array index where the item resides.

 **return -1**: A standard fallback sentinel value passed back to signal to the main execution frame that the query key does not exist inside the array.

**Program:**

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

**Output:**

Enter 5 elements to sort: 5 4 3 2 1

1 2 3 4 5

**Inference:**

Instead of using manual, nested sorting loops which incur an average time complexity of \\(\\mathcal{O}(n^2)\\), standard arrays can be sorted instantly by calling the built-in utility method **Arrays.sort(a)**. For processing high-volume datasets or utilizing parallel computing architectures, the sorting pipeline can be optimized by migrating to a **Arrays.parallelSort(a)** command, which divides the array into sub-blocks for concurrent sorting using the ForkJoin framework.

**Q: Write a Java Program to search for an element using linear search.**

**Procedure:**

 **int c\[\]\[\] = new int\[2\]\[2\]**: Allocates heap space for an empty target \\(2 \\times 2\\) grid matrix structure used specifically to receive resultant computation metrics.

 **Matrix Traversal loops**: Two distinct levels of nested tracking loops where index pointer i targets rows and index pointer j maps column offsets.

 **c\[i\]\[j\] = a\[i\]\[j\] + b\[i\]\[j\]**: An expression that extracts matching matrix grid slots simultaneously, adds their primitive scalar data values, and saves the output to the target structure.

 **j == 2 - 1 ? "" : " "**: A inline ternary conditional statement used to check for the final row coordinate block to format trailing spacer layout outputs cleanly.

**Program:**

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

**Inference:**

Linear search requires a costly traversal time of \\(\\mathcal{O}(n)\\). If the incoming integer dataset is already sorted, performance can be heavily optimized by utilizing a **Binary Search** approach via **Arrays.binarySearch(a, k)**, which shrinks the search territory exponentially in \\(\\mathcal{O}(\\log n)\\) time. Alternatively, you can convert the data structure into a functional abstraction by deploying Java Streams: **IntStream.range(0, a.length).filter(i -> a\[i\] == k).findFirst().orElse(-1)**.

**Q: Write a Java Program to perform addition of two matrices.**

**Procedure:**

 **c\[i\]\[j\] = 0**: A foundational cleanup step executed inside the loop initialization block to guarantee accumulator index values start fresh at baseline zero.

 **for(int k=0; k<2; k++)**: An independent inner dot-product tracker tracking parallel shifts across row columns of Matrix A alongside column rows of Matrix B.

 **c\[i\]\[j\] += a\[i\]\[k\] \* b\[k\]\[j\]**: An assignment expression that calculates dot product transformations by accumulating scaled matrix coordinate pairs.

**Program:**

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

**Output:**

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

**Inference:**

Instead of manually processing matching slots inside basic primitives using traditional nested loop tracking paths, complex multi-dimensional mathematical equations are better handled by utilizing **Apache Commons Math** or **EJML (Efficient Java Matrix Library)**. Utilizing these external library wrappers simplifies matrix addition down to a clean, single-line expression: **RealMatrix c = a.add(b);**.

**Q: Write a Java Program to print multiplication of two matrices.**

**Procedure:**

 **void compare(ParamPassTech p)**: A method layout signature indicating **Call-by-Reference / Object Passing**, where a reference variable pointing to an object is handed over.

 **this.marks**: An instance pointer variable used to refer explicitly to the data fields belonging to the current instance invoking the execution sequence.

 **p.marks**: A dot-notation member field access instruction utilized to extract instance data stored directly inside the incoming foreign object parameter.

 **void updateMarks(int m)**: A basic primitive method block modeling traditional **Call-by-Value / Pass-by-Value**, where a completely independent duplicate value clone copy is received.

**Program:**

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

**Output:**

1 2 3 4

1 2 3 4

2 4

6 8

**Inference:**

Manual matrix multiplication scripts run at a high computational cost of \\(\\mathcal{O}(n^3)\\). To achieve enhanced throughput, calculations can be updated using parallel streaming pathways or external math frameworks like **ND4J (N-Dimensional Arrays for Java)**. These platforms optimize operational overhead by translating structural math routines directly into optimized vector processing instructions (BLAS/LAPACK) executed straight on native hardware layers.