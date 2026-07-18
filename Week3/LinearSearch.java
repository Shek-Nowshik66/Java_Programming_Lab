import java.util.Scanner;

public class LinearSearch {
	int linearSearch(int arr[], int n, int k) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == k)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 5 elements to search: ");
		for(int i = 0; i < 5; i++)
			a[i] = s.nextInt();
		System.out.print("Enter the key: ");
		int k = s.nextInt();
		int res = obj.linearSearch(a, a.length, k);
		if(res == -1)
			System.out.println("Key Not Found " + res);
		else
			System.out.println("Key Found at index: " + res);
		s.close();
	}
}