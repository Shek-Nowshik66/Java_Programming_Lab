import java.lang.reflect.Constructor;

class SConstructor {
    int rollNo;
    String name;
    public SConstructor() {
        rollNo = 66;
        name = "ABC";
    }
    public SConstructor(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class RAPICon {
    public static void main(String[] args) throws Exception {
			Class<?> c = SConstructor.class;
			System.out.println("Constructors");
			Constructor<?>[] con = c.getConstructors();
			for(Constructor<?> co : con) {
				System.out.println(co);
			}
			System.out.println("\nNO-ARGUMENT CONSTRUCTOR:");
			Constructor<?> con1 = c.getDeclaredConstructor();
			SConstructor s1 = (SConstructor) con1.newInstance();
			s1.display();
    }
}