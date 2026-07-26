public class StrBufferMethod {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("AJP");
		System.out.println("Original String: " + s);
		System.out.println("Modified String: " + s.append(" class"));
		System.out.println("New String: " + s.insert(1, "d"));
		System.out.println("After deleting 'd': " + s.delete(1, 2));
		System.out.println("Replaced String: " + s.replace(4, s.capacity(), "lab"));
		System.out.println("Reversed String: " + s.reverse());
	}
}