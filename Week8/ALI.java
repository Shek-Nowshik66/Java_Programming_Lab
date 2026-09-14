import java.util.ArrayList;
import java.util.Iterator;

public class ALI {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("ABC");
		obj.add("DEF");
		obj.add("GHI");
		System.out.println("Names: " + obj);
		Iterator<String> itr = obj.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println("Name is: " + name);
			if(name.equals("GHI"))
				itr.remove();
		}
		System.out.println("New Names: " + obj);
	}
}