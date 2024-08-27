package Bronze_III;

import java.util.Scanner;

public class ex05789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine(); // 개행 문자 소비

		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			char[] N = a.toCharArray();

			int NN = N.length / 2;

			if (N[NN - 1] == N[NN]) {
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}
		}

		sc.close();
	}
}
