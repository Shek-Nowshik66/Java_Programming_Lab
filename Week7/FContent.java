import java.io.*;
import java.util.Scanner;

public class FContent {
	public static void main(String[] args) throws Exception {
		File f = new File("one.txt");
		Scanner s = new Scanner(f);
		int lCount = 0, wCount = 0, cCount = 0;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			lCount++;
			String words[] = line.split(" ");
			wCount += words.length;
			for(String word : words) {
				cCount += word.length();
			}
		}
		System.out.println("Line count is: " + lCount);
		System.out.println("Word count is: " + wCount);
		System.out.println("Character count is: " + cCount);
		s.close();
	}
}