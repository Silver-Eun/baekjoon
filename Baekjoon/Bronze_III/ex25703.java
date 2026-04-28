package Bronze_III;

import java.util.Scanner;

public class ex25703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println("int a;");
		System.out.println("int *ptr = &a;");

		if (1 < N) {
			System.out.println("int **ptr2 = &ptr;");
			if (2 < N) {

				for (int i = 2; i < N; i++) {
					System.out.println("int " + "*".repeat(i + 1) + "ptr" + (i + 1) + " = &ptr" + i + ";");
				}
			}
		}
		
		sc.close();
	}

}
