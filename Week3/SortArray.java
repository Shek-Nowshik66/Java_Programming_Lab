import java.util.Scanner;

public class SortArray {
	void sortArr(int arr[], int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		SortArray sa = new SortArray();
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 5 elements to sort: ");
		for(int i = 0; i < 5; i++)
			a[i] = s.nextInt();
		sa.sortArr(a, a.length);
		for(int b: a)
			System.out.print(b + " ");
		s.close();
	}
}