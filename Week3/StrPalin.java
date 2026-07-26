import java.util.Scanner;

public class StrPalin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = s.next().toLowerCase();
		String newStr = "";
		for(int i = (str.length() - 1); i >= 0; i--) {
			newStr += str.charAt(i);
		}
		if(str.equals(newStr)) {
			System.out.println("Given String is Palindrome " + str);
		} else {
			System.out.println("Given String is not Palindrome " + str);
		}
		s.close();
	}
}