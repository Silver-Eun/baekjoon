package Bronze_III;

import java.util.Scanner;

public class ex28289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();

		int s = 0;
		int e = 0;
		int ai = 0;
		int d = 0;

		for (int i = 0; i < P; i++) {
			int G = sc.nextInt();
			int C = sc.nextInt();
			int N = sc.nextInt();

			if (G == 1)
				d++;
			else if (C == 1 || C == 2)
				s++;
			else if (C == 3)
				e++;
			else if (C == 4)
				ai++;
		}

		System.out.println(s);
		System.out.println(e);
		System.out.println(ai);
		System.out.println(d);

		sc.close();
	}

}
