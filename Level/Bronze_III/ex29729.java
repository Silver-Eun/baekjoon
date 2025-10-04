package Bronze_III;

import java.util.Scanner;

public class ex29729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();

		int total = N + M;
        int U = 0;
        
        for (int i = 0; i < total; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                if (U == S) S *= 2;
                U++;
            } else {
                U--;
            }
        }

        System.out.println(S);

		sc.close();
	}

}
