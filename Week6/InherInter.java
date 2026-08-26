interface A {
	void show();
}

interface B extends A {
	void display();
}

public class InherInter implements B {
	@Override
	public void show() {
		System.out.println("Show");
	}
	@Override
	public void display() {
		System.out.println("Display");
	}
	public static void main(String[] args) {
		InherInter obj = new InherInter();
		obj.show();
		obj.display();
	}
}