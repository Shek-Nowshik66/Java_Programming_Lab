public class ParamPassTech {
	int marks;
	ParamPassTech(int m) {
		marks = m;
	}
	
	void display() {
		System.out.println("Marks: " + marks);
	}
	
	void compare(ParamPassTech p) {
		if(this.marks < p.marks) {
			System.out.println("Object p marks is higher: " + p.marks);
		} else if(this.marks > p.marks) {
			System.out.println("Current invoking Object marks is higher: " + this.marks);
		} else
			System.out.println("Both Current Invoking object and p object marks is same: " + this.marks);
	}
	
	void updateMarks(int m) {
		marks = m;
		System.out.println("New Marks is: " + marks);
	}
	
	public static void main(String[] args) {
		ParamPassTech p1 = new ParamPassTech(95);
		ParamPassTech p2 = new ParamPassTech(90);
		p1.compare(p2);
		p1.updateMarks(96);
		p1.display();
	}
}
