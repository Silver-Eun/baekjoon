package Bronze_III;

import java.util.Scanner;

public class ex02953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			int sum = 0;
			String[] a = sc.nextLine().split(" ");

			for (int j = 0; j < 4; j++) {
				sum += Integer.parseInt(a[j]);
			}

			if (max < sum) {
				max = sum;
				cnt = (i + 1);
			}
		}

		sc.close();

		System.out.println(cnt + " " + max);
	}

}
