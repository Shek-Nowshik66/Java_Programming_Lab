import java.util.Scanner;

public class Array12D {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[][] b = new int[2][2];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 5 int array values: ");
		for(int i = 0; i < 5; i++)
			a[i] = s.nextInt();
		System.out.print("Enter 2 X 2 matrix values: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++)
				b[i][j] = s.nextInt();
		}
		for(int i : a)
		  System.out.print(i + " ");
		System.out.println();
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
		s.close();
	}
}