package Bronze_III;

import java.util.Scanner;

public class ex18883 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int M = Integer.valueOf(B[1]);

		StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(i * M + j + 1);
                if (j != M - 1) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        
        sc.close();
	}

}
