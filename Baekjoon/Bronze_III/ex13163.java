package Bronze_III;

import java.util.Scanner;

public class ex13163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String A = sc.nextLine();
			String B = "god";
			String[] a = A.split(" ");

			for (int j = 1; j < a.length; j++) {
				B += a[j];
			}

			System.out.println(B);
		}

		sc.close();
	}

}
