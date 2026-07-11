public class SelectStat {
	public static void main(String[] args) {
		int marks = 90;
		String day = "Thu";
		if (marks > 90 && marks <= 100) {
			System.out.println("A");
		} else if (marks > 75 && marks <= 90) {
			System.out.println("B");
		} else if (marks > 50 && marks <= 75) {
			System.out.println("C");
		} else if (marks > 50 && marks <= 25) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		switch(day) {
		case "Mon":
			System.out.println("Monday");
			break;
		case "Tues":
			System.out.println("Tuesday");
			break;
		case "Wed":
			System.out.println("Wesday");
			break;
		case "Thu":
			System.out.println("Thursday");
			break;
		case "Fri":
			System.out.println("Friday");
			break;
		case "Sat":
			System.out.println("Saturday");
			break;
		case "Sun":
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Not a day");
		}
	}
}