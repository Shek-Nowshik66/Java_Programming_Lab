import java.io.FileInputStream;
import java.io.IOException;

public class FRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("sample.txt");
		int ch = 0;
		while((ch = fin.read()) != -1)
			System.out.print((char)ch);
		fin.close();
	}
}