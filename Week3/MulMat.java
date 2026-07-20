import java.util.Scanner;
class MulMat {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];
    for (int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++)
        a[i][j] = s.nextInt();
    }
    for (int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++)
        b[i][j] = s.nextInt();
    }
    for (int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++) {
        c[i][j] = 0;
        for(int k = 0; k < 2; k++)
          c[i][j] = a[i][j] + b[i][j];
      }
    }
    for (int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++)
        System.out.print(c[i][j] + (j == 2 - 1 ? "" : " "));
      System.out.println();
    }
    s.close();
  }
}