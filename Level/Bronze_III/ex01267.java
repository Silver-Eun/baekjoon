package Bronze_III;

import java.util.Scanner;

public class ex01267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String A = sc.nextLine();
		String[] arr = A.split(" ");
		int Y = 0;
		int M = 0;

		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(arr[i]);
			// 영식요금제
			Y += (a / 30 + 1) * 10;
			// 민식요금제
			M += (a / 60 + 1) * 15;
		}
		if (Y < M) {
			System.out.println("Y " + Y);
		} else if (M < Y) {
			System.out.println("M " + M);
		} else {
			System.out.println("Y M " + Y);
		}
		
		sc.close();
	}

}
