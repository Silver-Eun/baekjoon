package Bronze_III;

import java.util.Scanner;

public class ex30822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		String S = sc.nextLine();

		int u = 0;
		int o = 0;
		int s = 0;
		int p = 0;
		int c = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'u')
				u++;
			if (S.charAt(i) == 'o')
				o++;
			if (S.charAt(i) == 's')
				s++;
			if (S.charAt(i) == 'p')
				p++;
			if (S.charAt(i) == 'c')
				c++;
		}

		int result = Math.min(u, Math.min(o, Math.min(s, Math.min(p, c))));
		System.out.println(result);

		sc.close();
	}

}
