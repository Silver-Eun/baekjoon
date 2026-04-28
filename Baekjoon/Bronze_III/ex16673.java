package Bronze_III;

import java.util.Scanner;

public class ex16673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String A = sc.nextLine();
		
		String[] B = A.split(" ");
		
		int C = Integer.valueOf(B[0]);
		int K = Integer.valueOf(B[1]);
		int P = Integer.valueOf(B[2]);
		
		int sum = 0;
		
		for(int i = 1; i <= C; i++) {
			sum += K*i + P*i*i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
