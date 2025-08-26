package Bronze_III;

import java.util.Scanner;

public class ex23080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		sc.nextLine();

		String A = sc.nextLine();

		for (int i = 0; i * K < A.length(); i++) {
			System.out.print(A.charAt(i * K));
		}
		
		sc.close();
	}

}
