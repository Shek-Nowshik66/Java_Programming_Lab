package week2;

class Student1 {
	int id;
	String name, dept;
	public void show() {
		System.out.println("Name is " + name + " bearing ID " + id + " in Department " + dept);
		
	}
}

public class CMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.id = 27;
		s.name = "ABC";
		s.dept = "CSE";
		s.show();
	}

}
