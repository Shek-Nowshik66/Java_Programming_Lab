package week2;

public class Student {

	int rollno;
	String name, dept;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.rollno = 27;
		s.name = "ABC";
		s.dept = "CSE";
		System.out.println("Name is " + s.name + " bearing Roll Number " + s.rollno + " in Department " + s.dept);
	}

}
