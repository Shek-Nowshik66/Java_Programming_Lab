import java.util.*;

public class ALIREN {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		Iterator<Integer> itr = obj.iterator();
		while(itr.hasNext()) {
			int a = itr.next();
			if((a & 1) == 1)
				itr.remove();
			else
			  System.out.println(a);
		}
		System.out.println("New Numbers: " + obj);
	}
}