package Bronze_II;

import java.util.Scanner;

public class ex04583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine();

			if (s.equals("#"))
				break;

			StringBuilder result = new StringBuilder();
			boolean valid = true;

			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);

				if (c == 'b')
					result.append('d');
				else if (c == 'd')
					result.append('b');
				else if (c == 'p')
					result.append('q');
				else if (c == 'q')
					result.append('p');
				else if (c == 'i' || c == 'o' || c == 'v' || c == 'w' || c == 'x')
					result.append(c);
				else {
					valid = false;
					break;
				}
			}

			if (valid)
				System.out.println(result);
			else
				System.out.println("INVALID");
		}

		sc.close();
	}
	
}
