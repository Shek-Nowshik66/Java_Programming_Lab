public class LoopStat {
	public static void main(String[] args) {
		int i = 0, j = 0;
		for(int a = 0; a < 5; a++) {
			System.out.print(a + " ");
		}
		System.out.println();

		while(i < 3) {
			System.out.print(i++ + " ");
		}
		System.out.println();

		do {
			System.out.print(j++ + " ");
		} while(j < 3);
		System.out.println();

		for(String k : args) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}