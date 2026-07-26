public class StaticKWord {
	static String staticVar = svMethod();
	String instVar = ivMethod();
	static {
		System.out.println("2)Static block called");
	}
	{
		System.out.println("5)Instance block called");
	}
	static String svMethod() {
		System.out.println("1)Static Variable initialized");
		return "staticVar";
	}
	String ivMethod() {
		System.out.println("4)Instance Variable initialized");
		return "instanceVar";
	}
	static void display() {
		System.out.println("7)Static Method");
	}
	StaticKWord() {
		System.out.println("6)Constructor called");
	}
	public static void main(String[] args) {
		System.out.println("3)Main method called");
		StaticKWord obj = new StaticKWord();
		StaticKWord.display();
	}
}