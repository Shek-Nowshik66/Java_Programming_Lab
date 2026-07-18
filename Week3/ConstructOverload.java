public class ConstructOverload {
	String name;
	int id;
	ConstructOverload() {
		name = null;
		id = 0;
	}
	
	ConstructOverload(String n, int i) {
		name = n;
		id = i;
	}
	
	void display() {
		System.out.println("Name: " + name + " ID: " + id);
	}

	public static void main(String[] args) {
		ConstructOverload obj = new ConstructOverload();
		ConstructOverload obj1 = new ConstructOverload("ABC", 1);
		obj.display();
		obj1.display();
	}
}