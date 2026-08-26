import java.util.StringTokenizer;

public class DispSToken {
	public static void main(String[] args) {
		String s = "Welcome to AJP Lab";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
			System.out.print(st.nextToken() + " ");
	}
}