public class MethodOverload {
	void sum(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
	}
	
	void sum(double a, double b) {
		System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
	}
	
	public static void main(String[] args) {
		MethodOverload obj = new MethodOverload();
		obj.sum(10, 20);
		obj.sum(20.5, 30.5);
	}
}