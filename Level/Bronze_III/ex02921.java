package Bronze_III;

import java.util.Scanner;

public class ex02921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int sum = 0;

		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				sum += (i + j);
			}
		}

		System.out.println(sum);
	}
}
