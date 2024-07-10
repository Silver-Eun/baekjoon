package Bronze_IV;

import java.util.Scanner;

public class ex28352 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();
		Long a = (long)1;
		
		for (int i = 1; i <= N; i++) {
			a *= i;
		}
		
		sc.close();
		
		long week = a / (7 * 24 * 60 * 60);

		System.out.println(week);
	}

}
