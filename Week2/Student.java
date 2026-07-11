public class Student {
	int rollno;
	String name, dept;
	public static void main(String[] args) {
		Student s = new Student();
		s.rollno = 27;
		s.name = "ABC";
		s.dept = "CSE";
		System.out.println("Name is " + s.name + " bearing Roll Number " + s.rollno + " in Department " + s.dept);
	}
}