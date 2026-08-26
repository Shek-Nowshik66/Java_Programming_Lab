import java.util.Scanner;

public class FreqCoun {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = s.nextLine();
		String Wcount[] = str.split(" ");
		System.out.println("Words count: " + Wcount.length);
		s.close();
	}
}