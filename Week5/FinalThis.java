final class Square {
	final int s = 4;
	final void area() {
		System.out.println("Area: " + (this.s * this.s));
	}
}

public class FinalThis {
	public static void main(String[] args) {
		Square s = new Square();
		s.area();
	}
}