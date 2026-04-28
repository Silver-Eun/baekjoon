package Bronze_III;

import java.util.Scanner;

public class ex02991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);
		int C = Integer.parseInt(a[2]);
		int D = Integer.parseInt(a[3]);

		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			int P = Integer.parseInt(sc.next());

			int dog1 = P % (A + B);
			int dog2 = P % (C + D);

			if (dog1 <= A && dog1 != 0) {
				cnt++;
			}
			if (dog2 <= C && dog2 != 0) {
				cnt++;
			}
			System.out.println(cnt);
		}
		
		sc.close();

	}

}
