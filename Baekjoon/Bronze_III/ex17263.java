package Bronze_III;

import java.util.Scanner;

public class ex17263 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.nextLine();
		
		String A = sc.nextLine();
		
		String[] B = A.split(" ");
		
		int[] C = new int[B.length];
		
		for(int i = 0; i < B.length; i++) {
			C[i] = Integer.valueOf(B[i]);
		}
		
		int max = C[0];
		
		for(int i = 0; i < C.length; i++) {
			if(C[i] > max)
				max = C[i];
		}
		
		System.out.println(max);
		
		sc.close();
	}

}
