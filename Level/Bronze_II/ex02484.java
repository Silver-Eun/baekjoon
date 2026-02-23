package Bronze_II;

import java.util.Scanner;

public class ex02484 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int j = 0; j < N; j++) {
			int[] count = new int[7];

			int num = sc.nextInt();
			
			count[num]++;

			for (int i = 1; i < 7; i++) {
				if (count[i] == 4)
					System.out.println(50000 + i * 5000);
				else if (count[i] == 3)
					System.out.println(10000 + i * 1000);
				else if (count[i] == 2)
					System.out.println(2000 + i * 500);
				else if (count[i] == 1)
					System.out.println(1000 + i * 100);
			}

		}
		sc.close();
	}

}
