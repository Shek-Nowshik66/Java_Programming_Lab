import java.io.*;
import java.util.*;

public class LinePrint {
	public static void main(String[] args) throws Exception {
    File f = new File("one.txt");
    Scanner s = new Scanner(f);
    int c = 1;
    while(s.hasNextLine()) {
      String l = s.nextLine();
      System.out.println(c++ + ") " + l);
    }
    s.close();
	}
}