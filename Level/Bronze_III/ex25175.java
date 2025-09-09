package Bronze_III;

import java.util.Scanner;

public class ex25175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String[] B = A.split(" ");
		
		int N = Integer.valueOf(B[0]);
		int M = Integer.valueOf(B[1]);
		int K = Integer.valueOf(B[2]);
		
		int next = (M + K - 3) % N;
		
        if (next <= 0) next += N;

        System.out.println(next);
		
		sc.close();
	}

}
