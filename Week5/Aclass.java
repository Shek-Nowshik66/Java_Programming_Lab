abstract class Student {
	public abstract void show();
}

public class Aclass extends Student{
	@Override
	public void show() {
		System.out.println("Abstract method called intialized");
	}

	public static void main(String[] args) {
		Aclass a = new Aclass();
		a.show();
	}
}