package Bronze_IV;

import java.util.Scanner;

public class ex30979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N];
		int total = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		sc.close();

		if (T <= total)
			System.out.println("Padaeng_i Happy");
		else
			System.out.println("Padaeng_i Cry");
	}

}
