public class GenClass <T> {
	T name;
	void setName(T n) {
		name = n;
	}
	
	T getName() {
		return name;
	}
	
	public static void main(String[] args) {
		GenClass<String> g = new GenClass<>();
		g.setName("ABC");
		System.out.println("Name: " + g.getName());
	}
}