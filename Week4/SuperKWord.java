class A {
	int a;
	A(int a) {
		this.a = a;
	}
	public void show() { System.out.println(a); }
}

class B extends A {
	int a, b;
	
	B(int a, int b, int c) {
		super(a);
		this.a = b;
		this.b = c;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(a + " " + b);
	}
}

public class SuperKWord {
	public static void main(String[] args) {
		B obj = new B(10, 20, 30);
		obj.show();
	}
}