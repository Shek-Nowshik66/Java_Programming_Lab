import java.util.Scanner;
public class QuadRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x^2 co-efficient: ");
        double a = s.nextDouble();
        System.out.print("Enter x co-efficient: ");
        double b = s.nextDouble();
        System.out.print("Enter constant: ");
        double c = s.nextDouble();
        if(a == 0) {
            System.out.print("x^2 co-efficient should not be empty");
            s.close();
            return;
        }
        double d = (Math.pow(b, 2) - (4 * a * c));
        if(d > 0) {
            double root1 = ((-b + Math.sqrt(d)) / (2 * a));
            double root2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 is: " + root1);
            System.out.println("Root 2 is: " + root2);
        } else if(d == 0) {
            double root = ((-b + Math.sqrt(d)) / (2 * a));
            System.out.println("Roots are real and same");
            System.out.println("Root is: " + root);
        } else {
            System.out.println("The roots are complex and imaginary.");
        }
        s.close();
    }
}
