package Bronze_III;

import java.util.Scanner;

public class ex17201 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String s = sc.next();

		int[] array = new int[2 * N];
		for (int i = 0; i < 2 * N; i++) {
			array[i] = s.charAt(i) - '0';
		}

		boolean connected = true;
		for (int i = 0; i < N - 1; i++) {
			if (array[2 * i + 1] == array[2 * (i + 1)]) {
				connected = false;
				break;
			}
		}

		System.out.println(connected ? "Yes" : "No");
		
		sc.close();
	}

}
