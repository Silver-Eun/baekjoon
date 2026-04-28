package Bronze_II;

import java.util.Scanner;

public class ex01362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int scenario = 1;

		while (true) {
			int o = sc.nextInt();
			int w = sc.nextInt();
			sc.nextLine();

			if (o == 0 && w == 0)
				break;

			boolean dead = false;

			while (true) {
				String a = sc.nextLine();
				String[] A = a.split(" ");

				if (A[0].equals("#"))
					break;
				if (dead)
					continue;

				int n = Integer.parseInt(A[1]);

				if (A[0].equals("E"))
					w -= n;
				else if (A[0].equals("F"))
					w += n;

				if (w <= 0)
					dead = true;
			}

			System.out.print(scenario + " ");

			if (w <= 0)
				System.out.println("RIP");
			else if (o * 0.5 < w && w < o * 2)
				System.out.println(":-)");
			else
				System.out.println(":-(");

			scenario++;
		}

		sc.close();
	}

}