import java.util.ArrayList;

public class ArrLst {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("ABC");
		obj.add("DEF");
		obj.add("GHI");
		System.out.println("Names: " + obj);
		System.out.println("Size is: " + obj.size());
		obj.set(1, "XYZ");
		System.out.println("Updated Names: " + obj);
		System.out.println("Element at index 2: " + obj.get(2));
		obj.remove(0);
		System.out.println("New Names: " + obj);
		System.out.println("New size After deletion: " + obj.size());
		System.out.println("Name 'GHI' is present: " + obj.contains("GHI"));
		obj.clear();
		System.out.println("Is ArrayList Empty: " + obj.isEmpty());
	}
}