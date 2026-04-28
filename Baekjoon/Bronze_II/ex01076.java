package Bronze_II;

import java.util.Scanner;

public class ex01076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();

		int x = 0, y = 0, z = 0;

		String[] r = { "black", "brown", "red", "orange", "yellow",
				"green", "blue", "violet", "grey", "white" };

		for (int i = 0; i < r.length; i++) {
			if (r[i].equals(a))
				x = i;
			if (r[i].equals(b))
				y = i;
			if (r[i].equals(c))
				z = i;
		}

		long result = (x * 10L + y) * (long) Math.pow(10, z);

		System.out.println(result);

		sc.close();
	}

}
