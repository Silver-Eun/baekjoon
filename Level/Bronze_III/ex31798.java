package Bronze_III;

import java.util.Scanner;

public class ex31798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == 0) {
			System.out.println(c * c - b);
		} else if (b == 0) {
			System.out.println(c * c - a);
		} else {
			int sum = a + b;
			int root = (int) Math.sqrt(sum);
			System.out.println(root);
		}

		sc.close();
	}

}
