package Bronze_III;

import java.util.Scanner;

public class ex02783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		String[] A = sc.nextLine().split(" ");
		int X = Integer.parseInt(A[0]);
		int Y = Integer.parseInt(A[1]);

		double min = (1000.0 * X) / Y;
		double price = 0;

		int N = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < N; i++) {
			String[] B = sc.nextLine().split(" ");
			X = Integer.parseInt(B[0]);
			Y = Integer.parseInt(B[1]);
			
			price = (1000.0 * X) / Y;

			if (price < min)
				min = price;
		}

		sc.close();

		System.out.printf("%.2f", min);
	}

}
