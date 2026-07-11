public class Oper {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Increment of " + a + " is " + ++a);
        System.out.println("Decrement of " + b + " is " + --b);
        System.out.println("Bitwise AND of " + a + " and " + b + " is " + (a & b));
        System.out.println("Bitwise OR of " + a + " and " + b + " is " + (a | b));
        System.out.println("Bitwise EX-OR of " + a + " and " + b + " is " + (a ^ b));
        System.out.println("Bitwise Right Shift of " + a + " is " + (a >> 1));
        System.out.println("Bitwise Left Shift of " + b +  " is " + (b << 1));
    }
}