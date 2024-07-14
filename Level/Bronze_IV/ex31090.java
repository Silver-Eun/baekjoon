package Bronze_IV;

import java.util.Scanner;

public class ex31090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < T; i++) {
			if ((arr[i] + 1) % (arr[i] % 100) == 0)
				System.out.println("Good");
			else
				System.out.println("Bye");
		}
	}

}
