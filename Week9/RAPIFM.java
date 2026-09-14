import java.lang.reflect.*;

class Student {
	private final String name = "ABC";
	private final int rollNo = 106;
	private final int marks = 92;
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Marks: " + marks);
	}
}

public class RAPIFM {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		Class<?> c = s.getClass();
		System.out.println("Retrieving Fields:");
		Field[] field = c.getDeclaredFields();
		for(Field f : field) {
			System.out.println("Field Name: " + f.getName());
			System.out.println("Data Type: " + f.getType());
			System.out.println("Modifier: " + Modifier.toString(f.getModifiers()));		
		}
		Method m = c.getMethod("display");
		m.invoke(s);
	}
}