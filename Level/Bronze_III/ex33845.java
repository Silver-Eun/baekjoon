package Bronze_III;

import java.util.Scanner;

public class ex33845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

		for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            boolean exists = false;

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == c) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                System.out.print(c);
            }
        }

		sc.close();
	}

}
