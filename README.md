# Java_Programming_Lab Record

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