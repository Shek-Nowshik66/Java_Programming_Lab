import java.util.Random;

public class Rclass {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("Random Integer: " + r.nextInt());
		System.out.println("Random Integer less than 100: " + r.nextInt(100));
		System.out.println("Random Double: " + r.nextDouble());
		System.out.println("Random Double less than 50: " + r.nextDouble(50));
		System.out.println("Random Float: " + r.nextFloat());
		System.out.println("Random Boolean: " + r.nextBoolean());
	}
}