import java.util.Arrays;

public class SortStr {
	public static void main(String[] args) {
		String[] strs = {"AJP", "Lab"};
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(strs));
		Arrays.sort(strs);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(strs));
	}
}