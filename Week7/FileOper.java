import java.io.*;
import java.util.Scanner;

public class FileOper {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String fn = s.nextLine();
		File f = new File(fn);
		if(f.exists())
			System.out.println("File already exists");
		else {
			if(f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File could not be created");
		}
		System.out.println("Can write file: " + f.canWrite());
		System.out.println("Can read file: " + f.canRead());
		System.out.println("File: " + f.getName());
		System.out.println("File absolute path: " + f.getAbsolutePath());
		System.out.println("File length in bytes: " + f.length());
		s.close();
	}
}