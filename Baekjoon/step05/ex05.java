package step05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int sum = 0;
		String S = sc.next();
		
		for (int i = 0; i < N; i++) {
			sum += S.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
