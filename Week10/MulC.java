public class MulC {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			int a = 6 / 0;
			System.out.println(a);
			int b = Integer.parseInt("ABC");
			System.out.println(b);
			int c[] = {10, 20, 30};
			System.out.println(c[5]);
		} catch(NullPointerException e) {
			System.out.println("Null has no length");
		} catch(ArithmeticException e) {
			System.out.println("Can't divide with 0");
		} catch(NumberFormatException e) {
			System.out.println("String can't be Number");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong Index");
		} catch(Exception e) {
			System.out.println("Other Exception");
		}
	}
}