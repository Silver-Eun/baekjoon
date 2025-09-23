package Bronze_III;

import java.util.Scanner;

public class ex26145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = N + M;

        long[] money = new long[total];

        long[] S = new long[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLong();
            money[i] = S[i];
        }

        long[][] T = new long[N][total];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < total; j++) {
                T[i][j] = sc.nextLong();
            }
        }

        for (int i = 0; i < N; i++) {
            long sumGive = 0;
            for (int j = 0; j < total; j++) {
                money[j] += T[i][j];
                sumGive += T[i][j];
            }
            money[i] -= sumGive;
        }

        for (int i = 0; i < total; i++) {
            System.out.print(money[i]);
            if (i != total - 1) System.out.print(" ");
        }
        System.out.println();

        sc.close();
	}

}
