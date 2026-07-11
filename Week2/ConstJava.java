class Box {
	double height, width, depth;
	Box(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}
	public void display() {
		System.out.println("Cube of height " + height + " width " + width + " depth " + depth + " volume " + (height * width * depth));
	}
}

public class ConstJava {
	public static void main(String[] args) {
		Box b = new Box(2, 3, 4);
		b.display();
	}
}