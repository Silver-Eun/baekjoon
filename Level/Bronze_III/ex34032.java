package Bronze_III;

import java.util.Scanner;

public class ex34032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String S = sc.nextLine();

		int g = 0;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'O')
				g++;
		}

		if (N <= g * 2)
			System.out.println("Yes");
		else
			System.out.println("No");

		sc.close();
	}

}
