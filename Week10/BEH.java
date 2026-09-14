import java.io.*;

public class BEH {
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
			String str = "ABC";
			System.out.println(str.charAt(5));
			FileInputStream f = new FileInputStream("one.txt");
			System.out.println(f.read());
			f.close();
		} catch(NullPointerException e) {
			System.out.println("Null has no length");
		} catch(ArithmeticException e) {
			System.out.println("Can't divide with 0");
		} catch(NumberFormatException e) {
			System.out.println("String can't be Number");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong Index");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Wrong Index");
		} catch(FileNotFoundException e) {
			System.out.println("No File Found");
		} catch(Exception e) {
			System.out.println("Other Exception");
		}
	}
}