package Bronze_II;

import java.util.Scanner;

public class ex02028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			
			String n = Integer.toString(N);
			
			int k = n.length();
			
			if(N*N % Math.pow(10, k) == N)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		sc.close();
	}

}
