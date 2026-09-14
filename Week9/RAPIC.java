class Demo {}

public class RAPIC {
	public static void main(String[] args) throws Exception {
		Class<?> obj = Class.forName("week9.Demo");
		System.out.println(obj.getName());
		Class<?> obj1 = Demo.class;
		System.out.println(obj1.getName());
		Demo d = new Demo();
		Class<?> obj2 = d.getClass();
		System.out.println(obj2.getName());
	}
}