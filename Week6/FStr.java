import java.io.FileOutputStream;
import java.io.IOException;

public class FStr {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("sample.txt");
		String msg = "Welcome to AJP Lab";
		fout.write(msg.getBytes());
		fout.close();
		System.out.println("Data Written successfully");
	}
}