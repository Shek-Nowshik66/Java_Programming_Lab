import java.util.*;

public class SToken {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter numbers with spaces: ");
		String gNum = s.nextLine();
		StringTokenizer obj = new StringTokenizer(gNum);
		int sum = 0;
		while(obj.hasMoreTokens()) {
			String a = obj.nextToken();
			sum += Integer.parseInt(a);
			System.out.print(a + " ");
		}
		System.out.println("\nSum: " + sum);
		s.close();
	}
}