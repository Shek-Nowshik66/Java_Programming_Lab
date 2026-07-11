import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.print("Enter a number: ");
        int b = s.nextInt();
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        s.close();
    }
}