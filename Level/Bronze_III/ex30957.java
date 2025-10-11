package Bronze_III;

import java.util.Scanner;

public class ex30957 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int B = 0;
		int S = 0;
		int A = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B')
				B++;
			else if (s.charAt(i) == 'S')
				S++;
			else if (s.charAt(i) == 'A')
				A++;
		}

		if (B == S && S == A) {
            System.out.println("SCU");
        } else {
            int max = Math.max(B, Math.max(S, A));
            if (B == max) System.out.print("B");
            if (S == max) System.out.print("S");
            if (A == max) System.out.print("A");
        }

		sc.close();
	}
}
